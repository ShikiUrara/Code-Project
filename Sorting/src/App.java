// import 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

import java.awt.EventQueue;
import javax.swing.JFrame;

// function
public class App {

    // Quick sort
    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
    the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
    to left of pivot and all greater elements to right
    of pivot */
    static int partition(int[] arr, int low, int high)
    {
        
        // pivot
        int pivot = arr[high];
        
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {
                
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
            arr[] --> Array to be sorted,
            low --> Starting index,
            high --> Ending index
    */
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
            
        System.out.println();
    }







    // Sap xep chon
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        // Chạy n - 1 bước
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            // Tìm phần tử nhỏ nhất trong mãng
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Phương thức hiển thị mãng đã sắp xếp
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    

    // function main
    public static void main(String[] args) throws Exception {
        App ob = new App();

        // Đọc file
        File file = new File("Sorting/src/Data.txt");
        Scanner scanner = new Scanner(file);
        int n, i = 0;
        n = scanner.nextInt();
        System.out.println("Số lượng element của mảng: " + n);
        int[] array = new int[n];
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            array[i] = temp;
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        // ob.sort(array);
        // System.out.println("Sorted array by selection sort");
        // ob.printArray(array);
        quickSort(array, 0, n - 1);
        System.out.println("Sorted array by Quick sort: ");
        printArray(array, n);



        // Close
        scanner.close();
    }
}
