package Patterns;

//Space and Star Pattern
//Left Half Pyramid
public class pat1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
//            space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
//            star
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
