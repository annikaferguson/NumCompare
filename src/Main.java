import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double input1 = 0;
        double input2 = 0;

        System.out.println("Enter two numbers: ");
        input1 = in.nextDouble();
        input2 = in.nextDouble();

        if(input1 == input2)
        {
            System.out.println("The two numbers are equal!");
        }
        else if(input1 >= input2)
        {
            System.out.println(input1 + " is greater than " + input2);
        }
        else if(input1 <= input2)
        {
            System.out.println(input1 + " is less than " + input2);
        }
    }
}