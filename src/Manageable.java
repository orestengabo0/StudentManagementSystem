public interface Manageable {
    void addStudent(Student student);
    Student findStudent(String studentId);
    void updateStudent(String studentId, String studentName, int studentAge, String studentClass);
    void deleteStudent(String studentId);
}
