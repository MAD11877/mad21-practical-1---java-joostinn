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
    int number = in.nextInt();
    ArrayList<Integer> intList = new ArrayList<>();
    int intMost = 0;
    int most = 0;
    for(int i = 0; i<number;i++){
      int integers = in.nextInt();
      intList.add(integers);
      int occurence = 0;
      for(int j = 0; j < intList.size();j++){
        if (intList.get(i) == integers){
          occurence++;
        }
      }
      if (occurence > most){
        most = occurence;
        intMost = integers;
      }
    }
    System.out.println(intMost);
     
    
  
  }
}
