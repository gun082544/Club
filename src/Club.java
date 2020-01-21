
import java.util.Scanner;

public class Club {

    Student student[];
    String clubName;
    String subClubName;
    int count;
    Scanner input = new Scanner(System.in);

    public Club() {
    }

    public Club(String clubName, String subClubName, int num) {
        student = new Student[num];
        this.clubName = clubName;
        this.subClubName = subClubName;
    }

    public void addStudent(String name, String lastname, long id, String faculty) {
        if (this.count < student.length) {
            student[count++] = new Student(name, lastname, id, faculty);
            return;
        }
        System.out.println("Already Full !!!");
    }

    public void EditInfo(long searchId) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].getStudentId() == searchId) {
                System.out.print("New Name :");
                String newName = input.nextLine();
                System.out.print("New LastName :");
                String newNLastName = input.nextLine();
                System.out.print("New Faculity :");
                String newFaculity = input.nextLine();
                student[i].setStudentName(newName);
                student[i].setStudentLastName(newNLastName);
                student[i].setFaculty(newFaculity);
                return;
            }
        }

    }

    public void showList() {
        System.out.println("Result :");
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                continue;
            } else {
                System.out.println(student[i]);
            }
        }
    }

    public void DeleteMember(long formId) {
        for (int i = 0; i < student.length; i++) {
            if(student[i].getStudentId() != formId){
                break;
            }
            else if (student[i].getStudentId() == formId) {
                student[i] = null;
            }
        }
        int k = 0;
        Student temp[] = new Student[student.length];
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                temp[k++] = student[i];
            }
            break;
        }
        student = temp;

    }
}
