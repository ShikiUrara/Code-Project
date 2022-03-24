import java.util.Random;

public class Sort {
    
    public void printArr(int[]  arr) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
    
    public void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) 
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr, j, j+1);
            }
    }

    public void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int indexMin = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[indexMin]>arr[j])
                    indexMin = j;
            swap(arr, i, indexMin);
        }
    }
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                // swap(arr, j+1, j);
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void heapSort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            // int swap = arr[i];
            // arr[i] = arr[largest];
            // arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

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
    public void quickSort(int[] arr, int low, int high)
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

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        
        for(int i=0; i<arr.length; i++) 
            arr[i] = random.nextInt(20);
            
        System.out.println("Hello, let's learn sort");
        Sort sort = new Sort();
        sort.printArr(arr);
        // sort.bubbleSort(arr);
        // sort.selectionSort(arr);
        // sort.insertionSort(arr);
        // sort.heapSort(arr);
        sort.quickSort(arr, 0, arr.length-1);
        sort.printArr(arr);
    }
}



    

