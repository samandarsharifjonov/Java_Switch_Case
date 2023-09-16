import java.util.Scanner;

public class case9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kun = scanner.nextInt();
        int oy = scanner.nextInt();
        if (oy > 12){
            System.out.println("Bunday oy yo'q");
        } else if ( kun > 31){
            System.out.println("Bunday sana yo'q");
        }
        if ( kun ==28 && oy == 2 || kun == 29){
            switch (oy){
                case 2:
                    System.out.println(1);
                    System.out.println(oy+1);
                    break;
            }
        } else if (kun > 1 && kun <= 28 && oy == 2) {
            switch (oy) {
                case 2:
                    System.out.println(kun+1);
                    System.out.println(2);
                    break;
            }
        }
         if ( oy == 12 && kun == 31) {
            switch (oy) {
                case 12:
                    System.out.println(1);
                    System.out.println(1);
                    break;

            }
        }
        if (kun >= 1 && kun <= 30) {
            switch (oy) {
                case 1:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 3:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 5:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 7:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 8:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 10:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
            }
        }
        if (kun >= 1 && kun <= 30) {
            switch (oy) {
                case 4:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 6:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 9:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
                case 11:
                    System.out.println(kun + 1);
                    System.out.println(oy + 1);
                    break;
            }
        }
        if (oy == 12 && kun <=30) {
            switch (oy) {
                case 12:
                    System.out.println(kun+1);
                    System.out.println(12);
                    break;
            }
        }
        }
    }






























