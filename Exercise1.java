public class Main {

    public static void main(String[] args) {

        String FirstWord = "privet";
        int leng1 = FirstWord.length();
        String SecondWord = "Privet";
        int leng2 = SecondWord.length();

        if (FirstWord.equals(SecondWord)) {
            System.out.println("Excellent! Words are the same.");

        } else if (FirstWord.equalsIgnoreCase(SecondWord)) {
            System.out.println("OK. Words are almost the same.");

        } else if (leng1 == leng2) {
            System.out.println("Well, at least they are of the same length.");

        } else System.out.println("So bad! Try it again.");
    }
}

