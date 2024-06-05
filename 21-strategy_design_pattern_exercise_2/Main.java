import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        Crypter aes = new AESCrypt();
        Crypter des = new DESCrypt();

        Algorithm algorithm1 = new Algorithm(aes);
        Algorithm algorithm2 = new Algorithm(des);
    }
}
