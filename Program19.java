// Create an abstract class that represents a general real-world thing (for example Payment, Employee, Vehicle, or Shape).
// Put one in it that is the same for all children (for example printReceipt()).
// Create at least three child classes. Each one must give its own body to the abstract method.
// In main, store all the objects in one array of the parent type and call the methods using a loop.
// Put one common field and one in it (for example pay(), calculateSalary(), or start()).

abstract class Employee {

    String company = "Mahendra company";

    abstract void calculateSalary();

    void printReceipt() {
        System.out.println("Company Name: " + company);
    }
}

class Manager extends Employee {

    void calculateSalary() {
        System.out.println("Manager Salary = Rs. 50000");
    }
}

class Developer extends Employee {

    void calculateSalary() {
        System.out.println("Developer Salary = Rs. 40000");
    }
}


class Driver extends Employee {
    void calculateSalary() {
        System.out.println("Driver Salary = Rs. 30000");
    }
}

public class Program19 {

    public static void main(String[] args) {
        Employee employees[] = new Employee[3];
        employees[0] = new Manager();
        employees[1] = new Developer();
        employees[2] = new Driver();

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\nEmployee " + (i + 1));
            employees[i].printReceipt();
            employees[i].calculateSalary();
        }
    }
}
