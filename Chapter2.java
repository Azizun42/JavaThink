/*

  This program belong to excercise Chapter 2
  
*/
public class Chapter2{
    public static void main(String[] args) {
      //Declare Variable
        int date,year;
        String day,mounth;
      
      //initialize variable
        day = "Wednesday";
        mounth = "June";
        date = 2;
        year = 2021;
      
      //Display 
      //System.out.printf("%s, %s %2d, %2d", day, mounth, date, year);

      //Display in any format
      System.out.printf("American format: %s, %s %02d, %2d\n", day, mounth, date, year);
      System.out.printf("European format: %s %02d %s %2d", day, date, mounth, year);


    
    }

}