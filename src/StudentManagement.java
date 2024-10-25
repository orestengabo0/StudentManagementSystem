import java.util.ArrayList;

public class StudentManagement implements Manageable, Displayable {
    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudent(String studentId) {
        for(Student student : students){
            if(student.getStudentId().equals(studentId))
                return student;
        }
        return null;
    }

    @Override
    public void updateStudent(String studentId, String studentName, int studentAge, String studentClass) {
        Student student = findStudent(studentId);
        if(student != null){
            student.setName(studentName);
            student.setAge(studentAge);
            student.setStudentClass(studentClass);
        }
    }
    @Override
    public void deleteStudent(String studentId) {
        Student student = findStudent(studentId);
        if(student != null){
            students.remove(student);
            System.out.println("Student deleted successfully.");
        }else {
            System.out.println("Student not found.");
        }
    }
    @Override
    public void displayAllStudents() {
        for (Student student : students){
            if(students.isEmpty())
                System.out.println("No student found.");
            else {
                System.out.println("List of students: ");
                System.out.println("__________________________________________________");
                System.out.println();
                student.getDetails();
                System.out.println();
            }
        }
    }
}
