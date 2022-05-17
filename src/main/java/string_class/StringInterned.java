package string_class;

public class StringInterned {

    public static void main(String[] args) {
        String str1 = "I need more coffee";
        String str2 = new String("I need more coffee");
        System.out.println(str1 == str2);

        String str3 = str2.intern();
        System.out.println(str1 == str3);

        StringBuffer sbf = new StringBuffer();
    }
}
