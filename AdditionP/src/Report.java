import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Report {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        Sdata Data= new Sdata();
        System.out.println("Enter Your Name");
        Data.Name= S.next();
                System.out.println("Enter Your ID");
        Data.Id=S.nextByte();
                System.out.println("Enter Your Gender");
        Data.Gender=S.next().charAt(0);
                System.out.println("Enter Your Age");
        Data.Age=S.nextInt();
                System.out.println("Enter Your CGPA");
        Data.CGPA=S.nextFloat();
                System.out.println("Enter Your Mobile Number");
        Data.Mobile=S.nextLong();
                System.out.println("Enter Your Total Marks");
        Data.Marks=S.nextShort();
                System.out.println("Enter True if Eligible/False if not");
        Data.Eligible=S.nextBoolean();
        System.out.println(" ");
        System.out.println("Preview the Student Details Enterd");
        System.out.println(" ");
        // System.out.println(
        // Data.Name+Data.Id+Data.Gender+Data.CGPA+Data.Marks+Data.Mobile+ Data.Eligible
        // );
        System.out.println(Data.Name);
         System.out.println(Data.Age);
         System.out.println(Data.Gender);
        System.out.println(Data.Id);
        System.out.println(Data.Mobile);
        System.out.println(Data.CGPA);
        System.out.println(Data.Marks);
        System.out.println(Data.Eligible);


    }
    
}
