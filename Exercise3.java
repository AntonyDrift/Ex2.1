public class Main {

    public static void main(String[] args) {
        int year = 1992;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Yes. " + year + " is a leap-year.");
        } else System.out.println("No. " + year + " is not a leap-year.");
    }
}
