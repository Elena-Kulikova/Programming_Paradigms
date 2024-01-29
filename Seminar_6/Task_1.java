// Написать программу на любом языке в любой парадигме для
// бинарного поиска. На вход подаётся целочисленный массив и
// число. На выходе - индекс элемента или -1, в случае если искомого
// элемента нет в массиве.


package Programming_Paradigms.Seminar_6;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(binarySearch(array,12));
    }

    public static int binarySearch(int[] array, int searchNumber) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int halfIndex = array.length / 2;
        while (rightIndex != leftIndex) {
            if (searchNumber == array[halfIndex]) {
                return halfIndex;
            } else if (searchNumber > array[halfIndex]) {
                leftIndex = halfIndex;
                halfIndex = leftIndex + (rightIndex - leftIndex ) / 2 + 1;
            } else {
                rightIndex = halfIndex;
                halfIndex = leftIndex + (rightIndex - leftIndex) / 2;
            }
        }
        return -1;
    }
}