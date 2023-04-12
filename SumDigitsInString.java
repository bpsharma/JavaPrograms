/*
WAP to input a string and print sum of digits present in that string
e.g. Input “1234ABC$%#@” Output 10
 */
import java.util.Scanner;
public class SumDigitsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                sum=sum+ch-'0';
            }
        }
        System.out.println("Sum of digits is "+sum);
    }
}
