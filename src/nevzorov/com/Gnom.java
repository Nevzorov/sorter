package nevzorov.com;

import java.util.ArrayList;
import java.util.List;

public class Gnom implements ISorter {
    public static List<String> sortList(List<String> inputList) {
        String [] sortList = new String[inputList.size()];
        for(int i = 0; i < inputList.size(); i++){
            sortList[i] = inputList.get(i);
        }
        int i = 1;
        int j = 2;
        while (i < sortList.length) {
            if (sortList[i - 1].toCharArray()[0] <= sortList[i].toCharArray()[0]) {
                i = j;
                j++;
            } else {
                String tmp = sortList[i];
                sortList[i] = sortList[i - 1];
                sortList[i - 1] = tmp;
            }
            i--;
            if (i == 0) {
                i = j;
                j = j + 1;
            }
        }
        List <String> sortedList = new ArrayList<>();
        for(i = 0; i < sortList.length; i++){
            sortedList.add (sortList[i]);
        }
        return sortedList;
    }
}
