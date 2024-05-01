import java.util.*;

public class ZohoQuestion {
    public static void main(String[] args) {
      
      int[] array = new int[] {16,11,2,31,4,3,9};
      List<Integer> odd = new ArrayList<Integer>();
      List<Integer> even = new ArrayList<Integer> ();
      
      for(int i=0;i<array.length;i++)
      {
        if(i%2 == 0)
          odd.add(array[i]);
        else
          even.add(array[i]);
      }
      
      Collections.sort(odd);
      Collections.sort(even);
      int[] output = new  int[array.length];
      int evenIndex = 0;
      int oddIndex = odd.size() - 1;
      
      for(int i=0;i<output.length;i++)
      {
        if(i%2==0)
        {
          output[i] = odd.get(oddIndex--);
        //   oddIndex--;
        }
        else{
          output[i] = even.get(evenIndex++);
        //   evenIndex++;
        }
      }
      
      System.out.println(Arrays.toString(output));
      

    
    }
}