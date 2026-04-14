import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("Project: " + projectName);
        System.out.println("Team members:");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Monthly cost: " + employee.calculateMonthlyCost());
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculateMonthlyCost();
        }
        return total;
    }

    public Employee findById(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public void printDevelopers() {
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                System.out.println(employee);
            }
        }
    }

    public void printAutomationTesters() {
        for (Employee employee : employees) {
            if (employee instanceof Tester) {
                Tester tester = (Tester) employee;
                if (tester.isAutomationTester()) {
                    System.out.println(tester);
                }
            }
        }
    }
}