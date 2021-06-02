/*
    This program belong to  Exercise 2.3
*/
public class Time {
    public static void main(String[] args) {
        
        //Declare Variable
        int hour,minute,second;
        int secondPerDay;
        
        //Assign value
        hour = 22;
        minute = 30;
        
        //Calculate second since midnight and Display
        second = (22*60*60) + (30*60);
        System.out.print("Second since midnight: ");
        System.out.println(second);

        //Calculate second remaining of the day and Display
        secondPerDay = 24*60*60;
        second = secondPerDay - second;
        System.out.print("Second since midnight: ");
        System.out.println(second);

        //



    }
    
}
