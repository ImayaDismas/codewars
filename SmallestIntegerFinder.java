import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
          if(smallest > numbers[i]) { 
            smallest = numbers[i];
          } 
        }
        return smallest;
    }
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        System.out.println(actual);
    }
}