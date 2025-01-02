public class find_greater {
    public static void main (String[] args){
        int num1 = 10, num2 = 25;
        int greatest = num1;
        if (num2 > greatest){
            greatest = num2; 
        }
        System.out.println("The greatest number is: " + greatest);

    }
}