package lesson9.files;

import java.util.ArrayList;
import java.util.List;

//En(x) = x + n mod 26
//Dn(x) = x - n mod 26
//x = letter; n = shift of letter
public class CesarMyRealization {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String codedAlphabet = "bvgqkmnadzcwseoyfjxhtlpuir BVGQKMNADZCWSEOYFJXHTLPUIR";

    public String encrypt(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            encodedText.append(codedAlphabet.charAt(index));
        }
        return encodedText.toString();
    }

    public String decrypt(String text) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = codedAlphabet.indexOf(c);
            decodedText.append(alphabet.charAt(index));
        }
        return decodedText.toString();
    }

}
