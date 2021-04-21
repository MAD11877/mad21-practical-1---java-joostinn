import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    System.out.print("Number of Integers: ");
    int number = in.nextInt();
    int[] intArray= new int[number] ;
    for(int i = 0; i < number; i++)
    {
      System.out.print("Enter: ");
      numberArray[i] = in.nextInt();        
    }
    int maxNumber = 0;
    int maxAppearances = 0;
    for(a = 0; a < intArray.size(); a++)
    {
      int count = 0;
      for(b = 0 ; b < intArray.size(); b++)
      {
          if(intArray[a] == intArray[b])
          {
            count += 1;
          }
      }
      if(count > maxAppearances)
      {
        maxNumber = intArray[a] ;
        maxAppearances = count;
      }
    }

    System.out.println("Mode : " + maxNumber);
    
  
  }
}
