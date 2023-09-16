



import java.util.Scanner;

public class case10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char Y = in.next(".").charAt(0);
        int K = in.nextInt();
        switch(K){
            case 0:
                break;
            case 1:
                switch(Y){
                    case 's':
                        Y = 'g';
                        break;
                    case 'j':
                        Y = 'q';
                        break;
                    case 'q':
                        Y = 's';
                        break;
                    case 'g':
                        Y = 'j';
                        break;
                    default:
                        System.out.print("yo'nalish xato");
                }
                break;
            case 2:
                switch(Y) {
                    case 's':
                        Y = 'q';
                        break;
                    case 'j':
                        Y = 'g';
                        break;
                    case 'q':
                        Y = 'j';
                        break;
                    case 'g':
                        Y = 's';
                        break;
                    default:
                        System.out.print("yo'nalish xato");
                }
                break;
            default:
                System.out.print("komanda xato");
        }
        System.out.print(Y);
    }
}