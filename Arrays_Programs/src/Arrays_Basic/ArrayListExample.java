package Arrays_Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // Integer is wrapper class( we cant use primitives here).
        // internally size is fixed
        // say arraylist fills by some amount
        // it will create a new array list of double the size
        // Old elements are copied in new one and old one is deleted
        list.add(67);
        list.add(78);
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(5);

//        System.out.println(list.contains(346));

        System.out.println(list);
        list.set(0,99);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)); //pass index here list of index syntax will not work here
        }
    }
}
