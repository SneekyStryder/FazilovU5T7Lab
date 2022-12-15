public class Employee {
    private String firstName; private String lastName;
    private static int recentIdNum = 100; private static int numHired = 0;
    private int idNum;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        recentIdNum++;
        idNum = recentIdNum;
        numHired++;
    }

    public static int getRecentIdNum() {
        return recentIdNum;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int getIdNum() {
        return idNum;
    }

    public static int getNumHired() {
        return numHired;
    }

    public String employeeInfo() {
        return "Employee's full name: " + fullName() + "\nEmployee's ID: " + idNum;
    }

    public static String classInfo() {
        return "Most recent ID assigned: " + recentIdNum + "\nTotal employees hired: " + numHired;
    }
}
