import java.util.Scanner;
public class case7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float n;
        int m;


        n = in.nextFloat();


        m = in.nextInt();

        switch (m) {
            case 1 : System.out.print(n); break;
            case 2 : System.out.print(n / 100000); break;
            case 3 : System.out.println(n / 1000); break;
            case 4 : System.out.println(n * 1000); break;
            case 5 : System.out.print(n * 100); break;
        }


    }

}
