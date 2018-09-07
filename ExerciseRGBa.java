public class Main {

    public static void main(String[] args) {

        byte red = (byte) 255;
        byte green = (byte) 255;
        byte blue = (byte) 255;

        System.out.print("Your colour is: ");
        int convertationRed = (red<<24)>>>24;
        System.out.print(Integer.toHexString(convertationRed));
        int convertationGreen = (green<<24)>>>24;
        System.out.print(Integer.toHexString(convertationGreen));
        int convertationBlue = (blue<<24)>>>24;
        System.out.print(Integer.toHexString(convertationBlue));
    }
}
