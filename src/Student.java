
public class Student {
    private String StudentName;
    private String StudentLastName;
    private long StudentId;
    private String Faculty;
    
    public Student(String name,String lastname,long id,String faculty){
        if(id == this.StudentId){
            System.out.println("We already have this dude.Nothing Happend");
        }else
        this.Faculty = faculty;
        this.StudentId = id;
        this.StudentLastName = lastname;
        this.StudentName = name;
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setStudentLastName(String StudentLastName) {
        this.StudentLastName = StudentLastName;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }
    
    @Override
    public String toString() {
        StringBuilder Stu = new StringBuilder();
        Stu.append("[ID: "+StudentId);
        Stu.append(" ,Name: "+StudentName+" "+StudentLastName);
        Stu.append(" ,Faculity : "+Faculty+" ]");
        return Stu.toString();
    }
    
    
}