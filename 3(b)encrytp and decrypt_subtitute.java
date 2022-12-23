import java.io.*;
import java.util.*;
public class SubstitutionCipher {
public static void main(String[] args) throws IOException {
String str = "hello world";
String a = "abcdefghijklmnopqrstuvwxyz ";
String b = "zyxwvutsrqponmlkjihgfedcba ";

String encrypt = "";
String decrypt = "";
char c;
for(int i=0;i<str.length();i++)
{c = str.charAt(i);
int j = a.indexOf(c);
encrypt = encrypt+b.charAt(j);
}
System.out.println("The encrypted data is: " +encrypt);
for(int i=0;i<str.length();i++)
{
c = encrypt.charAt(i);
int j = a.indexOf(c);
decrypt = decrypt+b.charAt(j);
}
System.out.println("The decrypted data is: " +decrypt);
}
}