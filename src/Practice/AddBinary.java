package Practice;

class AddBinary {
    static String add(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int res = 0;
        int bitMax = (a.length() + b.length()) / 2;

        for (int i = 1; i <= bitMax; i++) {

            int mask = 1 << (i - 1);
            int tempFirst = first & mask;
            int tempSecond = second & mask;

            if (tempFirst == 1 && tempSecond == 1) {
                res = res << 1;
                res = res | 1;

            }else if (tempFirst ==1 || tempSecond == 1) {
                res = res | 1;
                res = res << 1;
            }else {

            }

        }


        return String.valueOf(res);

    }
}