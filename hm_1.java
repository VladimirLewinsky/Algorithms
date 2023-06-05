package algoritmulessons;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hm_1 {
    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };
        
        sort(arr);
        printArray1(arr);
        System.out.println("\n");;
        System.out.println(Arrays.toString(arr));

    }
    //создаем кучу
    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightCHild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightCHild < heapSize && array[rightCHild] > array[largest])
            largest = rightCHild;
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
    //  переменная для вывода массива
    private static void printArray1(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
            
        }

    }
}
