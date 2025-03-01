package OOPS;
import java.util.*;
class Student implements Comparable<Student>{
    int age;
    String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int compareTo(Student s){
        if(this.age > s.age) return 1;
        else return -1;
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        /*
         * Comparator
         */
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)  return 1;
                else return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(29);
        nums.add(34);
        nums.add(42);
        nums.add(57);
        Collections.sort(nums,com);
        System.out.println(nums);

        Comparator<String> c = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length() > j.length())  return 1;
                else return -1;
            }
        };
        List<String> arr = new ArrayList<>();
        arr.add("Arnaw");
        arr.add("Ketan");
        arr.add("Harry");
        arr.add("Jagruthi");
        arr.add("Naina");
        Collections.sort(arr,c);
        System.out.println(arr);

        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age)  return 1;
                else return -1;
            }
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21,"Arnaw"));
        studs.add(new Student(20,"Ketan"));
        studs.add(new Student(22,"Harry"));
        Collections.sort(studs);
        for(Student s : studs) System.out.println(s);
    }
}