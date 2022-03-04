/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package start;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author time0
 */
public class QuickSort {

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
    
    
    // Tao Gui
    public static void initGui() {
        
        // Tao menu 
        menu = new JMenu("Set");

        
        JFrame frame = new JFrame("Mô Phỏng Giải Thuật Sắp Xếp");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }
    

    // Driver Code
    public static void main(String[] args)
    {
        try {
            
            // Tao mang va doc file
            int[] array = new int[10];
            File file = new File("C:\\Users\\time0\\OneDrive\\Desktop\\Web\\NetBeans\\Sort\\src\\main\\java\\start\\Data.txt");
            Scanner scanner = new Scanner(file);
            int length = scanner.nextInt();

            int i=0;
            while(scanner.hasNextInt()){
                array[i]= scanner.nextInt();
//                System.out.println(array[i]);
                i++;
            }
            System.out.print("Ket thuc mang\n");
            
            // Lay day so Ramdom
            Random rd = new Random(); // creating Random object
            int[] arrrd = new int[5];
            for (int a = 0; a < arrrd.length; a++)
            {
               arrrd[a] = rd.nextInt(100); // storing random integers in an array
               System.out.print(arrrd[a]+" "); // printing each array element
            }
            System.out.print("\nEnd\n");
            int lengt=arrrd.length;
            quickSort(arrrd, 0, (arrrd.length-1));
            printArray(arrrd, arrrd.length);
            
            
            
            // Chay Gui
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    initGui();
                }
            });

            
            

        }
        catch(Exception e) {
            System.out.print("Loi doc file");
        }

    }
}
