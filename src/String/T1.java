package String;

//Program to reverse a string by using StringBuilder.

public class T1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char FrontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front, BackChar);
            sb.setCharAt(back, FrontChar);
        }
        System.out.println(sb);
    }
}
