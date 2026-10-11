public class Student {
    int id;
    String name;
    Department department;
    double mark1, mark2, mark3;

    public Student(int id, String name, Department department,
                   double mark1, double mark2, double mark3) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double getTotal() {
        return mark1 + mark2 + mark3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 85) return "A";
        else if (avg >= 80) return "B+";
        else if (avg >= 75) return "B";
        else if (avg >= 70) return "C+";
        else if (avg >= 65) return "C";
        else if (avg >= 60) return "D+";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public double getGradePoint() {
        switch (getGrade()) {
            case "A+": return 4.00;
            case "A": return 3.75;
            case "B+": return 3.50;
            case "B": return 3.25;
            case "C+": return 3.00;
            case "C": return 2.75;
            case "D+": return 2.50;
            case "D": return 2.25;
            default: return 0.00;
        }
    }

    public void display() {
        System.out.println("ID: " + id
                + ", Name: " + name
                + ", Department: " + department
                + ", Marks: " + mark1 + ", " + mark2 + ", " + mark3);
    }
}