import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        System.out.println(list.contains(654));
        System.out.println(list);
        list.set(0,88);
        list.remove(2);
        System.out.println(list);

        //get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));// pass index here
        }

      //  System.out.println(list);

    }
}
