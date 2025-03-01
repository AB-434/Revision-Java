package OOPS;
import java.util.*;
import java.util.stream.Stream;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,6,3,8);
        /*
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int res = s3.reduce(0,(c,e) -> c+e);
        //s3.forEach(n -> System.out.println(n));
         */
        int res = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e)->c+e);
        /* .sorted() to sort */
        System.out.println(res);

        int size = 10000;
        List<Integer> arr = new ArrayList<>(size);

        Random ran = new Random();
        for(int i=1;i<=size;i++){
            arr.add(ran.nextInt(100));
        }

        int sum1 = arr.stream()
                        .map(i -> i*2)
                        .reduce(0,(c,e)->c+e);

        long startSeq1 = System.currentTimeMillis();
        int sum2 = arr.stream()
                        .map(i -> {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){
                                
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endSeq1 = System.currentTimeMillis();

        long startSeq2 = System.currentTimeMillis();
        int sum3 = arr.parallelStream()
                        .map(i -> {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){

                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endSeq2 = System.currentTimeMillis();

        System.out.println(sum1 + " " + sum2 + " " + sum3);
        System.out.println(endSeq1 - startSeq1);
        System.out.println(endSeq2 - startSeq2);
    }
}