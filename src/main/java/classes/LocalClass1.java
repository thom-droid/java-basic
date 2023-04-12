package classes;

public class LocalClass1 {

    static String regex = "[^0-9]";
    private int id;

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        int numberLen = 10;

        class PhoneNumber {
            String formattedNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regex, "");
                if (currentNumber.length() == numberLen) {
                    formattedNumber = currentNumber;
                } else {
                    formattedNumber = null;
                }
            }

            public String getNumber() {
                return formattedNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        if (myNumber1.getNumber() == null)
            System.out.println("First Number is Null");
        else
            System.out.println("First number : " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second Number is null");
        else
            System.out.println("Second number : " + myNumber2.getNumber());
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
