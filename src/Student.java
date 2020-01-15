
public class Student {
    private String StudentName;
    private String StudentLastName;
    private int StudentId;
    private String Faculty;
    
    public Student(String name,String lastname,int id,String faculty){
        if(id == this.StudentId){
            System.out.println("We already have this dude.Nothing Happend");
        }else
        this.Faculty = faculty;
        this.StudentId = id;
        this.StudentLastName = lastname;
        this.StudentName = name;
    }
}