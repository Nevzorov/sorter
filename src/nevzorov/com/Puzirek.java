package nevzorov.com;

import java.util.ArrayList;
import java.util.List;

public class Puzirek implements ISorter {
    public static List<String> sortList(List<String> inputList) {
        String [] sortList = new String[inputList.size()];
        for(int i = 0; i < inputList.size(); i++){
            sortList[i] = inputList.get(i);
        }
        for(int i =  sortList.length-1; i > 0; i--) {
            for(int j = 0 ; j < i ; j++){
                if( sortList[j].toCharArray()[0] > sortList[j+1].toCharArray()[0]) {
                    String tmp = sortList[j];
                    sortList[j] = sortList[j+1];
                    sortList[j+1] = tmp;
                }
            }
        }
        List <String> sortedList = new ArrayList<>();
        for(int i = 0; i < sortList.length; i++){
            sortedList.add (sortList[i]);
        }
        return sortedList;
    }
}
