import java.util.Scanner;

public class main {
     
	 public static void main(String[] args) {
        double doubleRandomNumber = Math.random() * 1000;
        System.out.println("doubleRandomNumber = " + doubleRandomNumber);
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("randomNumber = " + randomNumber);
    }
}
