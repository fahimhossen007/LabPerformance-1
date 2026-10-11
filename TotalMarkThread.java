public class TotalMarkThread extends Thread {
    Student[] students;

    public TotalMarkThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        System.out.println("\n--- Total Marks ---");

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    students[i].name + ": " + students[i].getTotal()
            );
        }
    }
}
