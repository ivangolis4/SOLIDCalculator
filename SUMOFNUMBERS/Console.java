import java.util.*;
public class Console implements InputOutput{
    Scanner Scanner;

    public Console(){
        Scanner = new Scanner(System.in);
    }

    @Override
    public int getInput() {
       System.out.print("Enter a number(Enter negative to stop): ");
       return Scanner.nextInt();
    }

    @Override
    public void setSum(int result) {
       System.out.println("The sum of all number is: " + result);
    }
    
}
