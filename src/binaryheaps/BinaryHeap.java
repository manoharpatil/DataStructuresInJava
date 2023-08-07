package binaryheaps;

class BinaryHeap {
    public static void main(String[] args) {

        BinaryHeap obj = new BinaryHeap();

        int[] arr = {10, 20, 40, 30, 80, 60, 50};

        System.out.println("The Array Elements Are: ");
        obj.print(arr, arr.length);

        System.out.println("Constructing Heap...");
        obj.buildHeap(arr, arr.length - 1);

        System.out.println("The Array Elements Are: ");
        obj.print(arr, arr.length);
    }

    public void buildHeap(int[] arr, int size) {
        int i = size / 2;
        for (; i >= 0; i--)
            heapify(arr, i, size);
    }

    public void heapify(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = left + 1;
        int max = index;

        if (left <= size && arr[left] > arr[max])
            max = left;

        if (right <= size && arr[right] > arr[max])
            max = right;

        if (index != max) {
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;
            heapify(arr, max, size);
        }
    }

    public void print(int[] arr, int size) {

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

