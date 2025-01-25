import java.util.Scanner;
public class Demo034{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("Given number is zero");
        }
        else if(number%2==0){
            System.out.println("Given number is even");
        }
        else if(number != 0){
            System.out.println("Given number is odd");
        }
        else{
            System.out.println("Give valid number");
        }

    }
}