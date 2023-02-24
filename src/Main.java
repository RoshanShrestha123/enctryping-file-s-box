import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Provide the file name>> ");
        Encrypt encrypt = new Encrypt();
//        Scanner input = new Scanner(System.in);
//        String inputPath = input.nextLine();
        Path file_path = Paths.get("src/random.txt");
        Path new_file_path = Paths.get("src/secure.txt");

        try {
            byte[] fileBytes = Files.readAllBytes(file_path);
            System.out.println(">>>>>Before encryption");
            for (byte byt : fileBytes) {
                System.out.print(byt + " ");
            }

            encrypt.enc(fileBytes);
            System.out.println("\n>>>>>After encryption");
            for (byte byt : fileBytes) {
                System.out.print(byt + " ");
            }


            Files.write(new_file_path, fileBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}