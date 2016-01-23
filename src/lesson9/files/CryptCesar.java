package lesson9.files;

import java.util.ArrayList;
import java.util.List;

public class CryptCesar {
    List<Character> alphabet = new ArrayList<>();
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

    public String encrypt(String text, int m, int k) {
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        if (greatestCommonDivider(n, m) != 1) {// check relative simplicity n m
            return null;
        }

        StringBuilder cryptogramm = new StringBuilder();
        // block of encoding data
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index * m + k) % n;
            cryptogramm.append(alphabet.get(index));
        }
        return cryptogramm.toString();
    }

    public String decrypt(String text, int m, int k) {
        int n = alphabet.size();
        m = m % k;
        k = k % n;
        int reversedM = -1;
        //find reversed m
        for (int i = 0; i < n; i++) {
            if ((i * m) % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();
        // block of decoding data
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (((index - k) * reversedM) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();

    }

    //algorithm for finding the greatest common divider
    private static int greatestCommonDivider(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}

