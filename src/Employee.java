public class Employee {
    String name;
    int age;
    int id;
    String gender;
    String department;
    String jobtitle;

    public void employeename(String name){
        this.name = name;
    }
    public void employeeage(int employeeage){
        age = employeeage;
    }
    public void employeid(int employeeid){
        id = employeeid;
    }
    public void employeegender(String gender){
        this.gender = gender;
    }
    public void employeedepartment(String department){
        this.department = department;
    }
    public void employeejobtitle(String jobtitle){
        this.jobtitle = jobtitle;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getid(){
        return id;
    }
    public String getgender(){
        return gender;
    }
    public String getdepartment(){
        return department;
    }
    public String getjobtitle(){
        return jobtitle;
    }

    public Employee(String name, String gender, String departmernt, String jobtitle, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id++;
        this.gender = gender;
        this.department = departmernt;
        this.jobtitle = jobtitle;
    }

    public void EmployeeDetails(){
        System.out.println("Employee ID: " + this.id + " Name: " + this.name + " Age: " + this.age + " Gender: " + this.gender + " Department: " + this.department + " Job title: " + this.jobtitle);
    }
}
