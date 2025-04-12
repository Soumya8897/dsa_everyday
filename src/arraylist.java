import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        //Syntax
         ArrayList<Integer> list =new ArrayList<>(10);
         list.add(67);
        list.add(68);
        list.add(69);

//        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        //size is fixed internally bu when the size
        // is filled by some amount it is creating a new arraylist of
        // double size and the elements in the old list are copied into the new one
        //old one is deleted afterwards.
    }
}
