public class DepartmentGradeCountThread extends Thread {
    Student[] students;

    public DepartmentGradeCountThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        String[] grades = {
                "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"
        };

        System.out.println("\n--- Department-wise Grade Count ---");

        for (Department dept : Department.values()) {
            System.out.println("\nDepartment: " + dept);

            for (int j = 0; j < grades.length; j++) {
                int count = 0;

                for (int i = 0; i < students.length; i++) {
                    if (students[i].department == dept &&
                            students[i].getGrade().equals(grades[j])) {
                        count++;
                    }
                }

                System.out.println(grades[j] + ": " + count);
            }
        }
    }
}