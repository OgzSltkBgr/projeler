import java.util.Arrays;
import java.util.Random;

public class Q04_CreateMethodWithArray {
    public static void main(String[] args) {
        //    ||This Part Should be in Main Method||
        //
        //     -Create an array of size 5, assign some random values from 0 to 10
        //     -(use random class and for loop to assign values)
        //
        //
        //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
        //
        //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
        //     -2-Create a method that prints the sum of an array
        //     -3-Create a method that prints the max element of an array
        //
        //    P.S: Return type should be void because we are not returning anything just printing

        Random sayı = new Random();
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sayı.nextInt(10);//array in elemanlarina 0 -10 arasi sayi atamasi yapar
        }
        System.out.println(Arrays.toString(arr));

        printArray(arr);
        sumOfArray(arr);
        maxValueOfArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Arrayin elemanları toplamı =" + sum);
    }

    public static void maxValueOfArray(int[] arr) {
        int maxDeger = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            maxDeger=Math.max(arr[i],maxDeger);
        }
        System.out.println("Array in elemanlarından max değere sahip plan eleman :"+maxDeger);
    }
}
