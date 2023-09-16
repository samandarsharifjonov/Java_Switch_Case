import java.util.Scanner;

public class case15 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n, m;

        n = scanner.nextInt();
        m = scanner.nextInt();


        if ( 6 <= n && n <= 14){

            switch (n){

                case 6: System.out.print("Olti "); break;
                case 7: System.out.print("Yetti "); break;
                case 8: System.out.print("Sakkiz "); break;
                case 9: System.out.print("To'qqiz "); break;
                case 10: System.out.print("O'n "); break;
                case 11: System.out.print("Valet "); break;
                case 12: System.out.print("Dama "); break;
                case 13: System.out.print("Qirol "); break;
                case 14: System.out.print("Tuz "); break;


            }

        }  if ( 1 <= m && m <= 4){


            switch (m){


                case 1: System.out.print("g'isht"); break;
                case 2: System.out.print("olma "); break;
                case 3: System.out.print("chillak"); break;
                case 4: System.out.print("qarg'a"); break;



            }



        }








    }
}
