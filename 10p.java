import java.util.Vector;

class Employee {
    private int emp_id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int emp_id, String name, String designation, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and setters
    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        // Creating a vector to hold Employee objects
        Vector<Employee> EmpList = new Vector<>();

        // Inserting at least one object for each category
        EmpList.add(new Employee(101, "John", "Manager", 5000.0));
        EmpList.add(new Employee(102, "Alice", "Secretary", 3000.0));
        EmpList.add(new Employee(103, "Bob", "Clerk", 2000.0));

        // Searching an employee by emp_id
        int searchId = 102;
        boolean found = false;
        for (Employee emp : EmpList) {
            if (emp.getEmp_id() == searchId) {
                System.out.println("Employee found:");
                emp.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Adding an employee at a specific position
        Employee newEmployee = new Employee(104, "Eva", "Clerk", 2500.0);
        EmpList.add(1, newEmployee);

        // Deleting an employee record
        int deleteId = 101;
        for (int i = 0; i < EmpList.size(); i++) {
            if (EmpList.get(i).getEmp_id() == deleteId) {
                EmpList.remove(i);
                System.out.println("Employee with ID " + deleteId + " deleted successfully.");
                break;
            }
        }

        // Showing the detailed information of all categories of employees
        System.out.println("Detailed information of all employees:");
        for (Employee emp : EmpList) {
            emp.displayInfo();
        }
    }
}
