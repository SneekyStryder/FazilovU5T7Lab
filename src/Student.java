public class Student {
    private static int totalPointsEarned = 0; private static int greatestPoints = 0;
    private String name;
    private int numPoints = 0;

    public Student(String name) {
        this.name = name;
    }

    public void addPoints(int points) {
        numPoints += points;
        totalPointsEarned += points;
        if (numPoints > greatestPoints) {
            greatestPoints = numPoints;
        }
    }

    public String studentInfo() {
        return "Student: " + name + "\nPoints: " + numPoints;
    }

    public static int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }
}
