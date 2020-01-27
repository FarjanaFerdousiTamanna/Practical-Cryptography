import java.security.MessageDigest;
import java.io.*;

public class MD5andSHA1HashValue {
    public static void main(String args[]) {
      

        String practicalCryptography = "Practical Cryptography";
        String fullName = "Farjana Ferdousi Tamanna";
        

        try {
          
            byte practicalCryptographyBytes[] = practicalCryptography.getBytes();
            byte fullNameBytes[] = fullName.getBytes();
            
            
            //SHA1
            
            MessageDigest messageDigestSHA1_PC = MessageDigest.getInstance("SHA1"); //pc=Practical Cryptography
            MessageDigest messageDigestSHA1_FN = MessageDigest.getInstance("SHA1"); //FN=Full Name
            
            byte digestSHA1_PC[] = messageDigestSHA1_PC.digest();
            byte digestSHA1_FN[] = messageDigestSHA1_FN.digest();
            
            messageDigestSHA1_PC.update(practicalCryptographyBytes);
            messageDigestSHA1_FN.update(fullNameBytes);
            
            
            System.out.println("Output_of_SHA1_PC: ");
            for (byte b : digestSHA1_PC) System.out.format("%02x", b);
            System.out.println("");

            System.out.println("Output_of_SHA1_FN: ");
            for (byte b : digestSHA1_FN) System.out.format("%02x", b);
            System.out.println("");
            
            
            //MD5

            MessageDigest messageDigestMD5_PC = MessageDigest.getInstance("MD5");
            MessageDigest messageDigestMD5_FN = MessageDigest.getInstance("MD5");
            
            byte digestMD5_PC[] = messageDigestMD5_PC.digest();
            byte digestMD5_FN[] = messageDigestMD5_FN.digest();

            messageDigestMD5_PC.update(practicalCryptographyBytes);
            messageDigestMD5_FN.update(fullNameBytes);

            System.out.println("Output_of_MD5_PC: ");
            for (byte b : digestMD5_PC) System.out.format("%02x", b);
            System.out.println("");
            
            System.out.println("Output_of_MD5_FN: ");
            for (byte b : digestMD5_FN) System.out.format("%02x", b);
            System.out.println("");
            
            
        }   catch (Exception e) {
            System.out.println(e);
        }
    }
}
