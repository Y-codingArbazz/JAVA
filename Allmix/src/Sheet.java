import java.util.Scanner;

public class Sheet {
    public static void main(String[] args) {
        Selements E=new Selements();
        Scanner S=new Scanner(System.in);
        System.out.println("Enter your Name");
        E.Name=S.next();
        System.out.println("Enter your Id");
        E.Id=S.nextByte();
        System.out.println("Enter your Physics Marks");
        E.Physics=S.nextInt();
        System.out.println("Enter your Maths Marks");
        E.Maths=S.nextInt();
        System.out.println("Enter your Chemistry Marks");
        E.Chemistry=S.nextInt();
        System.out.println("Enter your Biology Marks");
        E.Biology=S.nextInt();
        System.out.println("Enter your English Marks");
        E.English=S.nextInt();
        System.out.println(" ");
        System.out.println("Student Name: "+E.Name);
        System.out.println("Student Id: "+E.Id);
        
        if (E.Physics<35 || E.Maths<35 || E.Chemistry<35 || E.Biology<35 || E.English<35) {
            E.Grade='F';
            System.out.println("You Have Failed the Exam");
            System.out.println("F");
            return;

        }
        int D=E.Maths+E.Physics+E.Chemistry+E.Biology+E.English;
        System.out.println("Total Marks: "+D+" i.e- "+D/5+"%" );
        
        if (D>=450&&D<=500){
            E.Grade='A';
            System.out.println("Congratulations! You Have Passed the Exam");
        }
        else if (D>=350 && D<450) {
            E.Grade='B';
            System.out.println("Congratulations! You Have Passed the Exam");
        }
        else if (D>=250 && D<350) {
            E.Grade='C';
            System.out.println("Next time you wont Pass! Study Harder");
        }
        else{
            E.Grade='F';
            System.out.println("You Have Failed the Exam");
        }
        

        if (E.Grade=='A'){
            System.out.println("You Got A Grade");
        }
        else if (E.Grade=='B'){
            System.out.println("You Got B Grade");
        }
        else if (E.Grade=='C'){
            System.out.println("You Got C Grade");
        }
        else{
            System.out.println("You Got F Grade");
        
            
        };
    }
}


       
        
    

