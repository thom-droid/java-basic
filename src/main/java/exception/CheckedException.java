package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) throws SomeException {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        checkedExceptionWithThrows(name);
        checkedExceptionWithTryCatch(name);
    }

    public static void checkedExceptionWithThrows(String name) throws SomeException {
        SomeClass someClass = new SomeClass(name);
        System.out.println("with Throws : " + someClass.getName());
    }

    public static void checkedExceptionWithTryCatch(String name) {
        try {
            SomeClass someClass = new SomeClass(name);
            System.out.println("with try catch : " + someClass.getName());
        } catch (SomeException someException) {
            System.out.println("no no no");
        }
    }
}
