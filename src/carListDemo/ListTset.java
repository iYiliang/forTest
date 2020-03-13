package carListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListTset {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
//        System.out.println(list.size());
//        System.out.println(list.get(2));
        System.out.println(list.get(2).equals("22"));

    }
}