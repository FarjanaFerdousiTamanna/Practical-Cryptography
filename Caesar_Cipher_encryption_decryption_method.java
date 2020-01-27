//A Java Program to illustrate Caesar Cipher Technique
class Caesar{
 // Encrypts text using a shift od s
 public static StringBuffer encrypt(String text, int s) {
  StringBuffer result= new StringBuffer();
  char ch;
  for (int i=0; i<text.length(); i++) {
   if (Character.isUpperCase(text.charAt(i)))
    ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
   else
    ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);

   result.append(ch);
   
  }
  return result;
 }

 public static StringBuffer decrypt(String text, int s) {
  StringBuffer result= new StringBuffer();
  char ch;
  for (int i=0; i<text.length(); i++) {
   if (Character.isUpperCase(text.charAt(i)))
    ch = (char)(((int)text.charAt(i) - s - 65) % 26 + 65);
   else
    ch = (char)(((int)text.charAt(i) - s - 97) % 26 + 97);

   result.append(ch);
   
  }
  return result;
 }
 // Driver code encryption
 public static void main(String[] args) {
  String text_encrypt = "Hello Tamanna";
  int s = 5;
  System.out.println("Text : " + text_encrypt);
  System.out.println("Shift : " + s);
  System.out.println("Cipher: " + encrypt(text_encrypt, s));
  
  
 // Driver code decryption 
  String text_decrypt = "MjqqtYfrfssf";
  int s2 = 5;
  System.out.println("Text : " + text_decrypt);
  System.out.println("Shift : " + s2);
  System.out.println("Cipher: " + decrypt(text_decrypt, s2));
 }
}