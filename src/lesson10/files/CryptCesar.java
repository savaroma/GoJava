package lesson10.files;

import java.util.ArrayList;
import java.util.List;

public class CryptCesar {
    private List<Character> alphabet = new ArrayList<>();
    private final static char[] PUNCTUATION = {' ', '.', ',', ';', ':', '!', '?', '-', '_'};

    CryptCesar() {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        for (char c = 'А'; c <= 'Я'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }

    public String encrypt(String text, int shift) {
        int n = alphabet.size();
        if (shift > n) {
            shift = shift % n;
        }

        StringBuilder cryptogram = new StringBuilder();
        // block of encoding data
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index + shift) % n;
            cryptogram.append(alphabet.get(index));
        }
        return cryptogram.toString();
    }

    public String decrypt(String text, int shift) {
        int n = alphabet.size();
        shift = shift % n;
        int reversedM = -1;
        //find reversed m
        for (int i = 0; i < n; i++) {
            if (i % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();
        // block of decoding data
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (((index - shift) * reversedM) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();

    }
}

