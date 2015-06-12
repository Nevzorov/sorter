package nevzorov.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List inputList = new ArrayList<String>();
            inputList.add("Vasya");
            inputList.add("Kolya");
            inputList.add("Fedya");
            inputList.add("Misha");
            inputList.add("Ivan");
            inputList.add("Anton");
            inputList = new QuickSort().sortList(inputList);
        for(int i = 0 ; i < inputList.size(); i++) {
            System.out.println(String.valueOf(inputList.get(i)));
        }
    }
}
