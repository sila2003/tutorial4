public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName,
                     double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public int getRepositoryCount() {
        return repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() + (repositoryCount * 200);
    }

    @Override
    public String introduceYourself() {
        return "Hi, I am developer " + getFirstName() + " " + getLastName()
                + ". My main language is " + mainLanguage + ".";
    }

    public void printTechnologies() {
        System.out.println(getFirstName() + " uses " + mainLanguage + " and works on "
                + repositoryCount + " repositories.");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", mainLanguage='" + mainLanguage + '\'' +
                ", repositoryCount=" + repositoryCount +
                '}';
    }
}