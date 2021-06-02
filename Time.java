/*
    This program belong to  Exercise 2.3
*/
public class Time {
    public static void main(String[] args) {
        
        //Declare Variable
        int hour,minute,secondP,secondR;
        int secondPerDay;
        double percent;
        
        //Assign value
        hour = 22;
        minute = 30;
        
        //Calculate second since midnight and Display
        secondP = (22*60*60) + (30*60);
        System.out.print("Second since midnight: ");
        System.out.println(secondP);

        //Calculate second remaining of the day and Display
        secondPerDay = 24*60*60;
        secondR = secondPerDay - secondP;
        System.out.print("Second since midnight: ");
        System.out.println(secondR);

        //Percentage of the day has passed
        percent = (double)secondP / (double)secondPerDay;
        percent = percent * 100;
        System.out.print("Percent: ");
        System.out.println(percent);



    }
    
}
