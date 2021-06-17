import java.util.Scanner;

public class Ex4p1 {

    public static void printAmerican(String day, int date, String mounth, int year) {
        System.out.print(day);
        System.out.print(", ");
        System.out.print(mounth);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.print(year);
    }

    public static void main(String[] args) {
        
        //Create variable 
        int date, year;
        String day, mounth;

        //Input information from user
        Scanner in = new Scanner(System.in);
        System.out.print("Input your information [Day] : ");
        day = in.nextLine();
        System.out.print("Input your information [Date] : ");
        date = in.nextInt();
        in.nextLine();
        System.out.print("Input your information [Mount] : ");
        mounth = in.nextLine();
        System.out.print("Input your information  [Year] : ");
        year = in.nextInt();

        //Calling method for print out
        printAmerican(day, date, mounth, year);

    }
    
}
