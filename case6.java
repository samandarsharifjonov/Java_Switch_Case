import java.util.Scanner;

public class case6 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double a = scanner.nextDouble();
        int tanla = scanner.nextInt();



        switch (tanla){

            case 1:
                System.out.println(a/10);
                break;
            case 2 :
                System.out.println(a*1000);
                break;
            case 3:
                System.out.println(a);
                break;

            case 4 :
                System.out.println(a/1000);
                break;
            case 5 :
                System.out.println(a/100);
                break;





        }

    }

}
