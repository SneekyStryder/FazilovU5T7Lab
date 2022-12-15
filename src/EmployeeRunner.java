public class EmployeeRunner {
    public static void main(String[] args) {
        // 1. create an Employee object named employee1 with a
        // first name of "Jim" and last name "Mason";
        // call the employeeInfo() method and classInfo() methods
        // and print the returned strings
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.classInfo());


        // 2. call the getter methods for both static variables
        // (most recent ID and employee count) and print their
        //  values
        System.out.println(Employee.getRecentIdNum() + "\n" + Employee.getNumHired());



        // 3. create a second Employee object named employee2 with
        // first name of "Amy" and last name "Adams";
        // call the employeeInfo() method and classInfo() methods
        // and print the returned strings
        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo() + "\n" + Employee.classInfo());




        // 4. create a third Employee object named employee3
        // with a first name of "Bob" and last name "Ross", then
        // create a fourth Employee named employee4 with a first
        // name of "Cindy" and last name "Nox";
        // call the employeeInfo() method on each object,
        // print those strings, then call the classInfo() method
        // once and print the returned string
        Employee employee3 = new Employee("Bob", "Ross");
        Employee employee4 = new Employee("Cindy", "Nox");
        System.out.println(employee3.employeeInfo() + "\n" + employee4.employeeInfo());
        System.out.println(Employee.classInfo());

        // 5. print out employee1's info and employee2's info;
        // note their data hasn't changed.
        System.out.println(employee1.employeeInfo() + "\n" + employee2.employeeInfo());


        // 6. call the getter methods for both static variables
        // and print their values; they should be 104 and 4
        System.out.println(Employee.getRecentIdNum() + "\n" + Employee.getNumHired());
    }
}
