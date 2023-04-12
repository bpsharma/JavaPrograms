/*
WAP to input a string and check it to be palindrome.
 */
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int i,j,mid;
        boolean mismatch=false;
        mid=s.length()/2;
        for(i=0,j=s.length()-1;i<mid;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                mismatch=true;
                break;
            }
        }
        if(mismatch)
            System.out.println(s+" is not a palindrome");
        else
            System.out.println(s+" is a palindrome");
    }
}
