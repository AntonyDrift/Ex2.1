import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        String numb = sc.next();
        int num = Integer.parseInt(numb);
        if (num == 11 || num == 12 || num == 13 || num == 14) {
            System.out.println(num + " Рублей!");
        } else if (num % 10 == 1) {
            System.out.println(num + " Рубль!");
        } else if (num % 10 == 2 || num % 10 == 3 || num % 10 == 4) {
            System.out.println(num + " Рубля!");
        } else
            System.out.println(num + " Рублей!");
    }
}



