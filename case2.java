import java.util.Scanner;

public class case2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        switch (n){

            case 1:
                System.out.println("yomon");
                break;
            case 2:
                System.out.println("qoniqarsiz");
                break;
            case 3:
                System.out.println("qoniqarli");
                break;
            case 4: System.out.println("yaxshi");
                break;

            case 5:
                System.out.println("a'lo");
                break;

            default:
                System.out.println("xato");
                break;



        }

    }

}
