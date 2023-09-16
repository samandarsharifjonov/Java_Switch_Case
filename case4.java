import java.util.Scanner;

public class case4 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){


            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            case 10:
                System.out.println("31 kun bor");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 kun bor");
                break;

            case 2:
                System.out.println("28 yoki 29 kun bor");
                break;






        }

    }

}
