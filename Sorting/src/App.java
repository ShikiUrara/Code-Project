import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class App {
    // Java program for implementation of Selection Sort
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

    public static void main(String[] args) throws Exception {
        App ob = new App();

        // Đọc file
        File file = new File("Data.txt");
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
        ob.sort(array);
        System.out.println("Sorted array by selection sort");
        ob.printArray(array);


        // GUI - Giao diện đồ họa
        // Container
        JFrame f = new JFrame("Sorting");
        // Xử lý bố cục 
        f.setLayout(new FlowLayout());
        // Tạo và thêm các thành phần
        JLabel hello = new JLabel("Hello World");
        JButton btPress = new JButton("Press here");
        f.getContentPane().add(hello);
        f.getContentPane().add(btPress);
        // Xử lý nút đóng chương trình
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Hiển thị 
        f.pack();
        f.setSize(1080, 720);
        f.setVisible(true);
    }
}
