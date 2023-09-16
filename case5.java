import java.util.Scanner;

public class case5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // System.out.println(" 1 Qo'shish \n 2 ko'paytirish \n 3 ayirish \n 4 bo'lish ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        switch (n){

            case 1:
                System.out.println((a+b));
                break;
            case 2:
                System.out.println((a-b));
                break;
            case 3:
                System.out.println((a/b));
            break;

            case 4:
                System.out.println((a*b));
                break;



        }
    }
}
