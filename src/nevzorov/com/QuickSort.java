package nevzorov.com;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements ISorter {
    private String[] sortList;
    private int len;

    public List<String> sortList(List<String> inputList) {
        sortList = new String[inputList.size()];
        for(int i = 0; i < inputList.size(); i++){
            sortList[i] = inputList.get(i);
        }
        len = sortList.length;
        quickSort();
        List <String> sortedList = new ArrayList<>();
        for(int i = 0; i < sortList.length; i++){
            sortedList.add (sortList[i]);
        }
        return sortedList;
    }
    public void quickSort() {
        recQuickSort(0, len - 1);
    }
    public void recQuickSort(int left, int right) {
        if (right - left <= 0){ // if size <= 1 already sorted
            return;
        }else{ // size is 2 or larger
            String pivot = sortList[right]; // rightmost item
            // partition range
            int partition = partitionData(left, right, pivot);
            recQuickSort(left, partition - 1); // sort left side
            recQuickSort(partition + 1, right); // sort right side
        }
    }

    public int partitionData(int left, int right, String pivot) {
        int leftPtr = left - 1; // left (after ++)
        int rightPtr = right; // right-1 (after --)
        while (true) { // find bigger item
            while (sortList[++leftPtr].toCharArray()[0] < pivot.toCharArray()[0]){
                ;
            }
            // find smaller item
            while (rightPtr > 0 && sortList[--rightPtr].toCharArray()[0] > pivot.toCharArray()[0]){
                ;
            }
            if (leftPtr >= rightPtr){ // if pointers cross, partition done
                break;
            }else{
                swap(leftPtr, rightPtr);
            }

        }
        swap(leftPtr, right); // restore pivot and return pivot location
        return leftPtr;
    }

    public void swap(int d1, int d2) {
        String temp = sortList[d1];
        sortList[d1] = sortList[d2];
        sortList[d2] = temp;
    }
}
