package SetCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcepts {
    public static void main(String [] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Alpha");
        hs.add("testing");
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Alpha");
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains("testing"));
        System.out.println("--------------");
        for(String s: hs){
            System.out.println(s);
        }
        System.out.println("--------------");
        Iterator<String > it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");
        hs.remove("beta");
        System.out.println(hs);

        System.out.println("--------------");
        HashSet<Integer> first = new HashSet<>();
        first.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 8, 9, 10}));

        HashSet<Integer> second = new HashSet<>();
        second.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 6, 7, 9}));

        System.out.println("--------------");

        //get the union
        HashSet<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);
        System.out.println("--------------");

        //get the Intersection
        HashSet<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        System.out.println("--------------");
        //get the differences
        HashSet<Integer> diff = new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);
    }
}
