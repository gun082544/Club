
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        int num;
        do{
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
            if(num==1){
//                Scanner form = new Scanner(System.in);
//                String name = form.nextLine();
//                String subClubName = form.nextLine();
//                int numMem 
                Club s1 = new Club("name","subClubName",20);
                
            }
            if(num==6){
                return;
            }
        }while(num<=6);
}
}
