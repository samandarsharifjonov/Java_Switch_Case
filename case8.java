import java.util.Scanner;

public class case8 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int m = scanner.nextInt();


        switch (m) {

            case 1, 3, 5, 7, 8, 10, 12 -> {

                if (d <= 31 && m == 1) {

                    System.out.println(d + "-yanvar");

                } else if (d <= 31 && m == 3) {

                    System.out.println(d + "-mart");

                } else if (d <= 31 && m == 5) {

                    System.out.println(d + "-may");

                } else if (d <= 31 && m == 7) {

                    System.out.println(d + "-Iyul");

                } else if (d <= 31 && m == 8) {

                    System.out.println(d + "-avgust");

                } else if (d <= 31 && m == 10) {

                    System.out.println(d + "-oktabr");
                } else if (d <= 31 && m == 12) {

                    System.out.println(d + "-dekabr");
                }

            }

        }
    }
}