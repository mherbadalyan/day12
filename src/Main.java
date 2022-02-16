import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0, 1, 0, 0, 0, 3, 0, 0, 5, 0};

        System.out.println("Enter array size.");
        printEvenIndexValues(scanner.nextInt());

        System.out.println("Enter array size.");
        printElementsWithEvenValue(scanner.nextInt());

        printPositiveValuesOfArray();

        printLargerElements();

        printAdjacentElements(array);

        printLargestElement(array);

        printSmallestPositiveElement(array);

        printNumOfDifferentElenents(array);

        reversePrintArray(array);

        printReversedArray(array);

        printRearengedArray(array);

        cycleAndPrintArray(array);

        swapMinMaxAndPrintArray(array);

        removeElementInIndexAndPrint(array, 3);

        printElementsWithNoDuplicate(array);

        moveZeroesToRight(array);
    }

    /**
     * task1
     * initializing array with size 'size' and printing elements with even number of index
     *
     * @param size
     */
    private static void printEvenIndexValues(int size) {
        int[] array = new int[size];
        for (int i = 0, value = 10; i < size; i++, value += 5) {
            array[i] = value;
        }
        for (int i = 0; i < size; i++) {
            if ((i & 1) == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * task2
     * initializing array with size 'size' and printing elements with even value
     *
     * @param size
     */
    private static void printElementsWithEvenValue(int size) {
        int[] array = new int[size];
        for (int i = 0, value = 3; i < size; i++, value += 3) {
            array[i] = value;
        }
        for (int i = 0; i < size; i++) {
            if ((array[i] & 1) == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * task3
     * initializing array and printing elements with positive value
     */
    private static void printPositiveValuesOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element of array.");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * task4
     * printing array values that are larger then the previous element
     */
    private static void printLargerElements() {
        int[] array = {5, 4, 8, 65, 8, 100, -10, 98};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println(array[i + 1] + " ");
            }
        }
    }

    /**
     * task5
     * printing all pairs of given array that have same sign
     *
     * @param array
     */
    private static void printAdjacentElements(int[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0, j = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > 0) {
                if (j != 0) {
                    if (Arrays.toString(array).contains(array[i] + " " + array[i + 1])) continue;
                    newArray[j] = array[i] + " " + array[i + 1];
                    j++;
                } else {
                    newArray[j] = array[i] + " " + array[i + 1];
                    j++;
                }
            }
        }
        for (String s : newArray) {
            if (s == null) {
                break;
            }
            System.out.print(s + " , ");
        }
    }

    /**
     * task6
     * printing value and index of max element of given array
     *
     * @param array
     */
    private static void printLargestElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.print("Max value = " + max + "\nIndex = " + maxIndex);
    }

    /**
     * task7
     * Printing smallest positive element of given array
     *
     * @param array
     */
    private static void printSmallestPositiveElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min && array[i] > 0) {
                min = array[i];
            }
        }
        System.out.print("Min value = " + min);
    }

    /**
     * task8
     * printing number of different elements in given non-descending ordered array
     *
     * @param array
     */
    private static void printNumOfDifferentElenents(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) continue;
            count++;
        }
        System.out.println("Number of different elements is " + count);
    }

    /**
     * task9
     * Printing the elements of the given list in reverse order without changing the list itself.
     *
     * @param array
     */
    private static void reversePrintArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * task10
     * reversing and printing given array
     *
     * @param array
     */
    private static void printReversedArray(int[] array) {
        for (int i = 0, temp; i <= array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * task11
     * Rearranging and printing the adjacent elements of the array.
     * If there is an odd number of elements, then the last element remains in its place.
     *
     * @param array
     */
    private static void printRearengedArray(int[] array) {
        int size = ((array.length & 1) == 1 ? array.length - 1 : array.length);
        for (int i = 0, temp; i < size - 1; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /**
     * task12
     * Cycle the elements of the array to the right 1 position and print it
     *
     * @param array
     */
    private static void cycleAndPrintArray(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /**
     * task13
     * In the array that all items are different. Swapping and printing the minimum and maximum elements of this list.
     *
     * @param array
     */
    private static void swapMinMaxAndPrintArray(int[] array) {
        int min = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }
        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /**
     * task14
     * deleting element in index 'index' and moving elements from right to left
     *
     * @param array
     * @param index
     */
    private static void removeElementInIndexAndPrint(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /**
     * task15
     * finding and printing that elements in given array that have not duplicates
     *
     * @param array
     */
    private static void printElementsWithNoDuplicate(int[] array) {
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) System.out.print(array[i] + " ");
        }
    }

    /**
     * task16
     * moving zeroes in given array to end of array and print array
     * @param array
     */
    private static void moveZeroesToRight(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) continue;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == 0) {
                    continue;
                }
                array[i] = array[j];
                array[j] = 0;
                break;
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
