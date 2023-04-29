package HashMapBasic;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapStudentInfo {
    public static void main(String [] args){
        HashMap<Integer, String> studentInfo = new HashMap<>();
        studentInfo.put(101, "Naveen Raddy");
        studentInfo.put(102, "18014");
        studentInfo.put(103, "Noida Sec- 8");
        studentInfo.put(104, "Camputer");
        studentInfo.put(105, "78");
        studentInfo.put(106, "Delhi University");

        System.out.println(studentInfo);

        Iterator<Integer> it = studentInfo.keySet().iterator();

        while(it.hasNext()){
            int  key = it.next();
            String value = studentInfo.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        System.out.println(studentInfo.values());
        System.out.println(studentInfo.keySet());



    }

}
