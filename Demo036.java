import java.util.Scanner;
public class Demo036{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 =sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 =sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 =sc.nextInt();

        if(num1<num2 &&num3<num2){
            System.out.println(num2+" is greater than the other numbers");
        }
        else if(num1>num2){
            System.out.println(num1+" is greater than the "+num2);
        }
        else{
            System.out.println("Given number are equal");
        }
    }
}