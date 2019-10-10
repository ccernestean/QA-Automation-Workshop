import java.util.Scanner;

public class Organization {

    public void main(){
        actions();
        switch (actions(input0))
    }
    public String actions(){
        System.out.println("Choose the operation you want to perform: ");
        System.out.println("1 - Add a new employee.");
        System.out.println("2 - Update existing employee data.");
        System.out.println("3 - Delete existing employee data.");
        System.out.println("4 - List employees.");
        Scanner input1 = new Scanner(System.in);
        String input0 = input1.nextLine();
        return input0;
    }
}
