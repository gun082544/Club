
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        int num;
        Club club = new Club();
        do {
            Scanner form = new Scanner(System.in);
            System.out.println("<<MainMenu>>");
            System.out.println("1.New Club");
            System.out.println("2.Membership Subscribe");
            System.out.println("3.Edit Membership Information");
            System.out.println("4.Membership Unsubscribe");
            System.out.println("5. List Members");
            System.out.println("6. Exit");
            System.out.print("Enter Your Menu [1‐6]:");
            Scanner Sc = new Scanner(System.in);
            num = Sc.nextInt();
            System.out.println("");
            switch (num) {
                case 1:
                    System.out.print("Club Name : ");
                    String name = form.nextLine();
                    System.out.print("Club Sub Name : ");
                    String subClubName = form.nextLine();
                    System.out.print("Amount of Maximum MemberClub : ");
                    int Amount = form.nextInt();
                    club = new Club(name, subClubName, Amount);
                    break;
                case 2:
                    if(club.getCount() == club.getStudent().length){
                        System.out.println("Already Full !!!");
                        System.out.println("");
                        break;
                    }
                    System.out.print("Name :");
                    String nameStudent = form.nextLine();
                    System.out.print("last Name :");
                    String nameLastname = form.nextLine();
                    System.out.print("Faculity : ");
                    String faculity = form.nextLine();
                    System.out.print("ID : ");
                    long id = form.nextLong();
                    club.addStudent(nameStudent,nameLastname,id,faculity);
                    break;
                case 3:
                    System.out.print("What's your student ID : ");
                    long searchId  = form.nextLong();
                    club.EditInfo(searchId);
                    break;
                case 4:
                    club.showList();
                    System.out.print("Form ID did you want to unsubscribe : ");
                    long formId  = form.nextLong();
                    club.DeleteMember(formId);
                    break;
                case 5:
                    club.showList();
                    break;
                case 6:
                    return;
            }
        } while (num != 6);
    }

}
