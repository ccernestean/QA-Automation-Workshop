import java.util.Scanner;
public class Organization {
    static int employeecount = 0;
    public static void AddEmployee(){
        System.out.println("-----------------------------");
        System.out.println("Add new employee.");
        Employee test = new Employee();
        System.out.println("Enter employee name: ");
        Scanner name1 = new Scanner(System.in);
        String name0 = name1.nextLine();
        test.Employee(name0);
        System.out.println("Enter employee age: ");
        Scanner age1 = new Scanner(System.in);
        int age0 = Integer.parseInt(age1.nextLine());
        test.employeeage(age0);
        System.out.println("Enter employee gender: ");
        Scanner gender1 = new Scanner(System.in);
        String gender0 = gender1.nextLine();
        test.employeegender(gender0);
        System.out.println("Enter employee department: ");
        Scanner department1 = new Scanner(System.in);
        String department0 = department1.nextLine();
        test.employeedepartment(department0);
        System.out.println("Enter employee job title: ");
        Scanner jobtitle1 = new Scanner(System.in);
        String jobtitle0 = jobtitle1.nextLine();
        test.employeejobtitle(jobtitle0);
        System.out.println("ID:" + test.getid() + " Name:" + test.getname() + " Age:" + test.getage() + " Gender:" + test.getgender() + " Department:" + test.getdepartment() + " Job title:" + test.getjobtitle());
    }

    public static void ListEmployees(){
        System.out.println("-----------------------------");
        System.out.println("These are the employees:");
        //Employee test;
        //System.out.println("ID:" + test.getid() + " Name:" + test.getname() + " Age:"+ test.getage() + " Gender:" + test.getgender() + " Department:" + test.getdepartment() + " Job title:" + test.getjobtitle());
        /*for (int i = 0; i < employeecount; i++) {
            System.out.println("ID:" + test.getid() + " Name:" + test.getname() + " Age:"+ test.getage() + " Gender:" + test.getgender() + " Department:" + test.getdepartment() + " Job title:" + test.getjobtitle());
        /}*/
    }
    public static void UpdateEmployee(){

    }
    public static void DeleteEmployee(){

    }
    static void Actions(){
        boolean run = true;
        while (run == true) {
            System.out.println("-----------------------------");
            System.out.println("Choose the operation you want to perform: ");
            System.out.println("1 - Add a new employee.");
            System.out.println("2 - Update existing employee data.");
            System.out.println("3 - Delete existing employee data.");
            System.out.println("4 - List employees.");
            System.out.println("9 - Exit");
            Scanner input1 = new Scanner(System.in);
            int input0 = Integer.parseInt(input1.nextLine());
            switch (input0) {
                case 1:
                    employeecount++;
                    AddEmployee();
                    break;
                case 2:
                    UpdateEmployee();
                    break;
                case 3:
                    DeleteEmployee();
                    break;
                case 4:
                    ListEmployees();
                    break;
                case 9:
                    run = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        //Actions();
    }
}