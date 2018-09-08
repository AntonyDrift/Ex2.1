public class Main {

    public static void main(String[] args) {

        int day = 29;
        int month = 2;
        int year = 1999;
        String c = chooseMonth(day, month, year);

        if (year <= 0 || day <= 0 || month <= 0 || month > 12) {
            System.out.println("Wrong date! Try again");
            return;
        }

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && (month == 2 && day <= 29)) {

            System.out.println("This year a leap!" + "\n" + day + c + year);
            return;
        }

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && (month == 2 && day > 29)) {
            System.out.println("Wrong date! Try again");
            return;
        }

        if ((month == 2) && day <= 28) {

            System.out.println(day + c + year);
            return;

        } else if ((month == 2) && day > 28) {

            System.out.println("Wrong date! Try again");
            return;

        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
            System.out.println(day + c + year);
            return;

        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Wrong date! Try again");
            return;

        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
            System.out.println(day + c + year);
            return;

        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            System.out.println("Wrong date! Try again");
            return;
        }

    }

    static public String chooseMonth(int dd, int mm, int yy) {
        String resultMonth = new String();
        switch (mm) {
            case 1:
                resultMonth = " January ";
                break;
            case 2:
                resultMonth = " February ";
                break;
            case 3:
                resultMonth = " March ";
                break;
            case 4:
                resultMonth = " April ";
                break;
            case 5:
                resultMonth = " May ";
                break;
            case 6:
                resultMonth = " June ";
                break;
            case 7:
                resultMonth = " July ";
                break;
            case 8:
                resultMonth = " August ";
                break;
            case 9:
                resultMonth = " September ";
                break;
            case 10:
                resultMonth = " October ";
                break;
            case 11:
                resultMonth = " November ";
                break;
            case 12:
                resultMonth = " December ";
                break;
        }
        return resultMonth;
    }
}
