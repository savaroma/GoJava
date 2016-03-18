package Practice;

import java.util.LinkedList;

public class UnixPath {
    public static String simplify(String input) {
        LinkedList<String> path = new LinkedList<>();
        StringBuilder wordBuffer = new StringBuilder();
        int size = input.length();

        for (int i = 0; i < size; i++) {
            char letter = input.charAt(i);

            if (letter == '/') {
                String word = wordBuffer.toString();

                if ("..".equals(word)) {
                    if (!path.isEmpty()) {
                        path.pop();
                    }
                } else if (".".equals(word) || word.length() == 0) {

                } else {
                    path.push(word);
                }

                wordBuffer = new StringBuilder();
            } else if ('.' == letter) {

            } else {
                wordBuffer.append(letter);
            }
        }
        String word = wordBuffer.toString();
        if (word.length() > 0 && ".".equals(word) || !"..".equals(word) || !"/.".equals(word)) {
            path.push(word);
        }

        StringBuilder result = new StringBuilder();

        while (!path.isEmpty()) {
            String fileName = path.removeLast();
            result.append("/");
            result.append(fileName);
        }
        if (result.length() == 0) {
            result.append("/");
        }

        if ((result.charAt(result.length() - 1) == '/') && (input != "//") && (input != "/.")) {
            result.setLength(result.length() - 1);
        }
            return result.toString();
    }
}