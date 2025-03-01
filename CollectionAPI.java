package OOPS;
import java.util.*;
public class CollectionAPI {
    public static void main(String[] args) {
        /*
         * ArrayList
         */
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums);
        /*
         * Set
         */
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        Iterator<Integer> values = set.iterator();
        while(values.hasNext()) System.out.println(values.next());
    }
}
