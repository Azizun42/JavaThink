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

        //Calling method for print out
        printAmerican("Wednesday", 17, "June", 2021);

    }
    
}
