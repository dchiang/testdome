import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < list.length; i++){
          int complement = sum - list[i];
          if(complements.containsKey(complement)){
            return new int[]{i, complements.get(complement)};
          } else {
            complements.put(list[i],i);
          }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}