import javax.xml.bind.DatatypeConverter;

public class Main {

    public static void main(String[] args) {

        byte RGB[] = {(byte) 255, (byte) 255, (byte) 255};
        System.out.print("Your colour is: ");
        System.out.print(DatatypeConverter.printHexBinary(RGB));

    }
}
