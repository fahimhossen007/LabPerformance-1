public class AverageMarkThread extends Thread {
    Student[] students;

    public AverageMarkThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        System.out.println("\n--- Average, Grade and Grade Point ---");

        for (int i = 0; i < students.length; i++) {
            System.out.printf(
                    "%s | Average: %.2f | Grade: %s | Grade Point: %.2f%n",
                    students[i].name,
                    students[i].getAverage(),
                    students[i].getGrade(),
                    students[i].getGradePoint()
            );
        }
    }
}