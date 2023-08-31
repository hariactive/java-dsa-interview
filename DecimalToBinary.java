public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 15;
        System.out.println("Binary representation of " + decimalNumber + " is: " + convertToBinary(decimalNumber));
    }

    static String convertToBinary(int decimalNumber) {
      
        if (decimalNumber == 0) {
            return "0";
        } else if (decimalNumber == 1) {
            return "1";
        } else {
            return convertToBinary(decimalNumber / 2) + (decimalNumber % 2);
        }
    }
}
