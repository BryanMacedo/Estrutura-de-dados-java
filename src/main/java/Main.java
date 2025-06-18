import java.util.*;

public class Main {
    public static void main(String[] args) {
        //map set list queue

        List<String> list = new ArrayList<>();
        list.add("Bryan");
        list.add("Macedo");
        list.add("Bryan");
        list.add("Soares");

        System.out.println("List: " + list);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Bryan");
        stringSet.add("Macedo");
        stringSet.add("Soares");
        stringSet.add("Bryan");

        System.out.println("Set: " + stringSet);

        Map<String, String> map = new HashMap<>();

        map.put("name", "Bryan");
        map.put("username", "soma");

        System.out.println(map.get("username"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Bryan");
        queue.add("Simone");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}




















