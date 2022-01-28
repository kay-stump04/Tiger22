import java.util.Arrays;

public class Camping {
    public static void main(String[] args) {
    
      // dogNames array here
      
      String[] dogNames = new String[3];
      dogNames[0]="Baby";
      dogNames[1]="Harlow";
      dogNames[2]="Hudson";


      
      // babyGrowls array here and call countBabyGrowls Method
      int[] babyGrowls = new int[43];
      int growlCount = countBabyGrowls(babyGrowls);
      System.out.println(dogNames[0] + "growled " + growlCount + "times!");

       
      // harlowNaps array here and call increaseNap Method as well as minHarlowNaps and maxHarlowNaps Methods
      double[] harlowNaps = {1.5, .75, 2.25, .5, 3, .25};
      double napMax = maxHarlowNaps(harlowNaps);

      
      // holdHudson array here and call sumHudsonHold Method
      
      System.out.println(Arrays.toString(dogNames));
      System.out.println(dogNames[1] + " napped Minimum: " + " Maximum: " + napMax);
      // Println statements here
      /* Should output
      Baby growled 43 times!
      Harlow napped Minimum: 0.5 Maximum: 3.25
      Hudson was held 6 times!
      */

      


    } //end of main method
    
    // countBabyGrowls static method here
    public static int countBabyGrowls(int[] arrayCount) {
      for (int i = 0; i < arrayCount.length; i++) {
        arrayCount[i] = 1;
      }

      int count = 0;
      for (int num: arrayCount) {
        count = count + arrayCount[num];
      }
        return count;
    }






    
    // increaseNap static method here
    



    
    // minHarlowNaps static method here     
    







    
    // maxHarlowNaps static method here    
    public static double maxHarlowNaps(double[] arrayNap) {
      double max = arrayNap[0];
      for (double num: arrayNap) {
        if (num > max) {
          max = num;
        }
      }
      return max;
    }





    
    
    // sumHudsonHold static method here  
    





    
}