package Patterns;

//Star and Space Pattern.
//Reverse Left Half Pyramid.
public class pat2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            Space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
//            Star
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}