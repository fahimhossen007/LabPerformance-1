public class Main {
    public static void main(String[] args) throws InterruptedException {

        Student[] students = {
                new Student(101, "Rahim", Department.CSE, 95, 92, 93),
                new Student(102, "Karim", Department.CSE, 86, 87, 88),
                new Student(103, "Ayesha", Department.BBA, 81, 82, 83),
                new Student(104, "Nila", Department.BBA, 74, 76, 75),
                new Student(105, "Hasan", Department.EEE, 65, 67, 68),
                new Student(106, "Mim", Department.EEE, 45, 48, 50)
        };

        System.out.println("Student Information");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        TotalMarkThread t1 = new TotalMarkThread(students);
        AverageMarkThread t2 = new AverageMarkThread(students);
        DepartmentGradeCountThread t3 =
                new DepartmentGradeCountThread(students);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Result processing complete.");
    }
}