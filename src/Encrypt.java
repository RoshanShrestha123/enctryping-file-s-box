import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
   void  enc(byte[] original_bytes) throws NoSuchAlgorithmException {
       KeyGenerator _keyGenerator = KeyGenerator.getInstance("AES");
       _keyGenerator.init(128);
       SecretKey _SK = _keyGenerator.generateKey();

       byte[] keys = _SK.getEncoded();
       System.out.println("\n Encryption Key ");
       for (byte i : keys) {
           System.out.print(i + "| ");
       }

        byte[] parsedBytes= original_bytes;

       // TODO: TO make Lookup table for the s-box
        for (int i = 0; i < parsedBytes.length; i++){
            parsedBytes[i] = (byte) (original_bytes[i] + keys[0]);
        }
    }
}
