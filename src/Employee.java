public class Employee {
    String name;
    int age;
    int id = 0;
    String gender;
    String department;
    String jobtitle;

    void employeename(String name) {
        this.name = name;
    }

    void employeeage(int employeeage) {
        this.age = employeeage;
    }

    void employeid(int employeeid) {
        this.id = employeeid;
    }

    void employeegender(String gender) {
        this.gender = gender;
    }

    void employeedepartment(String department) {
        this.department = department;
    }

    void employeejobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public int getid() {
        return this.id;
    }

    public String getgender() {
        return this.gender;
    }

    public String getdepartment() {
        return this.department;
    }

    public String getjobtitle() {
        return this.jobtitle;
    }

    void Employee(String name) {
        this.name = name;
        this.age = this.age;
        this.id = this.id++;
        this.gender = this.gender;
        this.department = this.department;
        this.jobtitle = this.jobtitle;
    }
}
