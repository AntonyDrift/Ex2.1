import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        String numb = sc.next();
        int num = Integer.parseInt(numb);
        switch (num) {
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println(num + " Рублей!");
                break;
            default:
                switch (num % 10) {

                    case 1:
                        System.out.println(num + " Рубль!");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(num + " Рубля!");
                        break;
                    default:
                        System.out.println(num + " Рублей!");
                }
        }
    }
}
