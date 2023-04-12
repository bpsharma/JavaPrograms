/*
WAP to input a string and print the count of alphabets, digits and special characters in that string.
*/
import java.util.Scanner;
public class CharacaterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int a=0,d=0,sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
                a++;
            else if(ch>='0' && ch<='9')
                d++;
            else
                sp++;
        }
        System.out.println("Alphabets "+a);
        System.out.println("Digits "+ d);
        System.out.println("Special Characters "+sp);
    }
}
