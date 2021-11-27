
package quick_sort;

/**
 *
 * @author fuad
 */
public class Quick_Sort {

  static int partition(int array[], int low, int high) {
   
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }
    public static void main(String[] args) {
        int numbers[] = {15, 2, 13, 4, 8, 10, 50, 40};
        Quick_Sort obj = new Quick_Sort();
        obj.quickSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array in Ascending Order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}