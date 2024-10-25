public class Student extends Person{
    private String studentId;
    private String studentClass;
    public Student(String studentId, String studentName, int age, String studentClass){
        super(studentName, age);
        this.studentId = studentId;
        this.studentClass = studentClass;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentClass(String studentClass){
        this.studentClass = studentClass;
    }
    public String getStudentClass(){
        return studentClass;
    }
    @Override
    public void getDetails() {
        System.out.printf("Id: %s, Name: %s, Age: %s, Class: %s", studentId, super.getName(), super.getAge(), studentClass);
    }
}
