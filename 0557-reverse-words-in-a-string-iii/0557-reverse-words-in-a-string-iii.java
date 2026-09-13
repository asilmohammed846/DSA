
class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder(s);

        int start = 0;

        for (int i = 0; i <= sb.length(); i++) {

            if (i == sb.length() || sb.charAt(i) == ' ') {

                int front = start;
                int back = i - 1;

                while (front < back) {

                    char temp = sb.charAt(front);
                    sb.setCharAt(front, sb.charAt(back));
                    sb.setCharAt(back, temp);

                    front++;
                    back--;
                }

                start = i + 1;
            }
        }

        return sb.toString();
    }
}

