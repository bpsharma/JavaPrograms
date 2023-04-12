/*
WAP to input mobile number from a user and validate it
1.	Length must be 10
2.	All characters must be digits
*/
import java.util.Scanner;
public class ValidateMobile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean valid=true;
        System.out.print("Enter mobile number : ");
        String mobile=sc.next();
        if(mobile.length()==10){
            for(int i=0;i<mobile.length();i++){
                char ch=mobile.charAt(i);
                if(!(ch>='0' && ch<='9')){
                    valid=false;
                    break;
                }
            }
        }else{
            valid=false;
        }
        if(valid)
            System.out.println("Mobile is a valid");
        else
            System.out.println("Invalid Mobile Number");
    }
}
