import java.util.LinkedList;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        LinkedList<String>  waitinglist=new LinkedList<>();
        int ch;
        Scanner s=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("1 add your data");
            System.out.println("2 show the registration number waiting list students  ");
            System.out.println("3 exit");

            System.out.println("enter your choice ");
            ch=s.nextInt();
            if (ch==1){
                System.out.println("enter your registration number ");
                String reg=sc.nextLine();
                waitinglist.add(reg);
            }
            else if (ch==2) {
                System.out.println("students are in waiting "+waitinglist);
            } else if (ch==3) {
                System.out.println("goodby ");
            }
            else {
                System.out.println("invalid input ");
            }
        }while (ch!=3);
    }
}