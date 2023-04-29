package ArrayListBasic;
import java.util.*;

public class ArrayListJava {
    public static void main(String [] args){
        ArrayList <String>  studentName = new ArrayList<>();
        studentName.add("Mike");
        studentName.add("David");
        studentName.add("steve");
        studentName.add("Tom");
        studentName.add("Kevin");

        studentName.forEach(System.out::println);
        System.out.println("--------------");

        //typical for loop:
        for(int i = 0; i < studentName.size(); i++){
            System.out.println(studentName.get(i));
        }
        System.out.println("--------------");
        // for each loop:
        for(String s: studentName){
            System.out.println(s);
        }
        System.out.println("--------------");
        //JDK 8 -> stream with lambda
        studentName.stream().forEach(name -> System.out.println(name));

        System.out.println("--------------");
        //iterator
        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");


        // removeIf() method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers.removeIf(num ->num %2 == 0);
        System.out.println(numbers);

        System.out.println("--------------");

        // find the single value in List
        ArrayList<String> nameList = new ArrayList<>
                (Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa","Tom"));
        System.out.println(nameList);
        nameList.retainAll(Collections.singleton("Tom"));
        System.out.println(nameList);

        //SubList in ArrayList
        ArrayList<Integer> number1= new ArrayList<>
                (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        ArrayList<Integer> subList = new ArrayList<>(number1.subList(2, 6));
        System.out.println(subList);

        // ArrayList to Array
        ArrayList<String> newList = new ArrayList<>
                (Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Robert"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        //traverse a ArrayList to Array
        for(Object o : arr){
            System.out.println((String)o);
        }
    }
}
