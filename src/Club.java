public class Club {
    Student student[];
    String clubName;
    String subClubName;
    int count;

    public Club(String clubName, String subClubName,int num) {
        Student[] student = new Student[num];
        this.clubName = clubName;
        this.subClubName = subClubName;
    }
    void addStudent(String name,String lastname,int id,String faculty){
        if(this.count<=student.length){
            student[count++] = new Student(name,lastname,id,faculty);
        }
    }
    
}
