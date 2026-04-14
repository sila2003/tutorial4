public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName,
                  double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    public boolean isAutomationTester() {
        return automationTester;
    }

    public int getScenarioCount() {
        return scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        double bonus = automationTester ? 1500 : 500;
        return getBaseSalary() + bonus + (scenarioCount * 10);
    }

    @Override
    public String introduceYourself() {
        return "Hello, I am tester " + getFirstName() + " " + getLastName()
                + ". Automation tester: " + automationTester + ".";
    }

    public void runTestingReport() {
        System.out.println(getFirstName() + " prepared " + scenarioCount + " test scenarios.");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", automationTester=" + automationTester +
                ", scenarioCount=" + scenarioCount +
                '}';
    }
}