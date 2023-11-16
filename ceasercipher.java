import java.util.*;
import java.util.Scanner;
public class ceasercipher
{
public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
public static String encrypt(String plaintext,int shiftkey)
{
    plaintext=plaintext.toLowerCase();
    String ciphertext="";
    for(int i=0;i<plaintext.length();i++)
    {
    int charposition=ALPHABET.indexOf(plaintext.charAt(i));
    int keyval=(shiftkey+charposition)%26;
    char replaceval=ALPHABET.charAt(keyval);
    ciphertext+=replaceval;
}
return ciphertext;
}
public static String decrypt(String ciphertext,int shiftkey)
{
    ciphertext=ciphertext.toLowerCase();
    String plaintext="";
    for(int i=0;i<ciphertext.length();i++)
    {
    int charposition=ALPHABET.indexOf(ciphertext.charAt(i));
    int keyval=(charposition-shiftkey)%26;
    if(keyval<0)
    {
        keyval=ALPHABET.length()+keyval;
    }
    char replaceval=ALPHABET.charAt(keyval);
    plaintext+=replaceval;
}
return plaintext;
}

public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter plaintext for encryption");
    String message=new String();
    message=s.next();
    System.out.println("enter key");
    int shiftkey=s.nextInt();

    System.out.println("encrypted message:ciphertext="+encrypt(message,shiftkey));
    System.out.println("decrypted message:plaintext="+decrypt(encrypt(message,shiftkey),shiftkey));

}
}
