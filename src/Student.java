public class Student extends Person{
    private String studentId;
    private String studentClass;
    public Student(String studentId, String studentClass, String studentName, int age){
        super(studentName, age);
        this.studentId = studentId;
        this.studentClass = studentClass;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getStudentClass(){
        return studentClass;
    }
    @Override
    public void getDetails() {
        System.out.printf("Id: %s, Name: %s, Age: %s, Class: %s", studentId, super.getName(), super.getAge(), studentClass);
    }
}
