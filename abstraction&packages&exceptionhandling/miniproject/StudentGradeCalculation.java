// StudentGradeCalculation.java

// Bean class
class Student {
    private String name;
    private int[] marks;
    private String grade;

    public Student() {}

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int[] getMarks() { return marks; }
    public void setMarks(int[] marks) { this.marks = marks; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

// Exception classes
class NullMarksArrayException extends Exception {
    @Override
    public String toString() { return "mark array is null"; }
}

class NullNameException extends Exception {
    @Override
    public String toString() { return "name is null"; }
}

class NullStudentObjectException extends Exception {
    @Override
    public String toString() { return "object is null"; }
}

// Service class
class StudentReport {
    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        if (marks == null) return "F";

        for (int m : marks) {
            if (m < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }

        int sum = 0;
        for (int m : marks) sum += m;

        String grade;
        if (sum < 150) grade = "C";
        else if (sum < 200) grade = "B";
        else if (sum < 250) grade = "A";
        else grade = "A+";

        studentObject.setGrade(grade);
        return grade;
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) throw new NullStudentObjectException();
        if (s.getName() == null) throw new NullNameException();
        if (s.getMarks() == null) throw new NullMarksArrayException();
        return "VALID";
    }
}

class StudentService {
    public int findNumberOfNullMarksArray(Student[] s) {
        int c = 0;
        if (s != null) {
            for (Student st : s) {
                if (st != null && st.getMarks() == null) c++;
            }
        }
        return c;
    }

    public int findNumberOfNullName(Student[] s) {
        int c = 0;
        if (s != null) {
            for (Student st : s) {
                if (st != null && st.getName() == null) c++;
            }
        }
        return c;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int c = 0;
        if (s != null) {
            for (Student st : s) {
                if (st == null) c++;
            }
        }
        return c;
    }
}

// Main class
public class StudentGradeCalculation {
    static Student[] data = new Student[4];

    public StudentGradeCalculation() {
        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        new StudentGradeCalculation();
        StudentReport report = new StudentReport();

        for (Student s : data) {
            try {
                String status = report.validate(s);
                if (status.equals("VALID")) {
                    System.out.println("Grade: " + report.findGrades(s));
                }
            } catch (Exception e) {
                System.out.println(e);
                if (s != null) {
                    System.out.println("Grade: " + report.findGrades(s));
                }
            }
        }

        StudentService service = new StudentService();
        System.out.println("Number of objects with null marks array: " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of objects with null name: " + service.findNumberOfNullName(data));
        System.out.println("Number of null objects: " + service.findNumberOfNullObjects(data));
    }
}
