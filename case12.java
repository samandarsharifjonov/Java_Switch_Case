import java.util.Scanner;

public class case12 {






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        switch (n) {
            case 1 -> {

                double r = scanner.nextDouble();
                double d = 2 * r;
                double l = 2 * Math.PI * r;
                double s = Math.PI * r * r;
                System.out.println("D = " + d);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
            }
            case 2 -> {
                System.out.print("D = ");
                double d = scanner.nextDouble();
                double r = d / 2;
                double l = 2 * Math.PI * r;
                double s = Math.PI * r * r;
                System.out.println("R = " + r);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
            }
            case 3 -> {
                System.out.print("L = ");
                double l = scanner.nextDouble();
                double r = l / (2 * Math.PI);
                double d = 2 * r;
                double s = Math.PI * r * r;
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("S = " + s);
            }
            case 4 -> {
                System.out.print("S = ");
                double s = scanner.nextDouble();
                double r = Math.sqrt(s / Math.PI);
                double d = 2 * r;
                double l = Math.PI * 2 * r;
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("L = " + l);
            }
            default -> System.out.println("Xato");
        }
    }
}
