import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания: 1, 2, 0 - выход.");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Задание 1. Разница между минимальным и максимальным элементами");
                int[] arr = new int[5];
                int razn = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                System.out.println("Заполните массив (5 элементов)");
                for (int i = 0; i < 5; i++) {
                    System.out.print(i + ": ");
                    arr[i] = scanner.nextInt();

                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }

                }
                razn = max - min;
                System.out.println(Arrays.toString(arr));
                System.out.print("Разница между максимальным и минимальным элементами: " + razn);
                break;
            case 2:
                System.out.println("Задание 2. Максимальный и минимальный элементы квадратной матрицы");
                int[][] arry = new int[3][4];
                System.out.println("Заполните массив (3*3 элементов)");
                int[][] sortedArray = new int[3][23];
                for (int i = 0; i < arry.length; i++) {
                    for (int j = 0; j < arry[i].length; j++) {
                        System.out.print(i + ", " + j + ": ");
                        arry[i][j] = scanner.nextInt();
                        sortedArray[i][j] = arry[i][j];
                    }
                    Arrays.sort(sortedArray[i]);
                }
                int[] maxArray = new int[sortedArray.length];
                for (int i = 0; i < sortedArray.length; i++) {
                    maxArray[i] = sortedArray[i][sortedArray[i].length - 1];
                }
                int[] minArray = new int[sortedArray.length];
                for (int i =0; i<sortedArray.length;i++){
                    minArray[i]=sortedArray[i][0];
                }
                Arrays.sort(minArray);
                //System.out.print(Arrays.toString(minArray));
                int Min = minArray[0];
                Arrays.sort(maxArray);
                int Max = maxArray[maxArray.length - 1];
                int minSum = Max;
                int minI=-1;
                int minJ=-1;
                for (int i=0; i<arry.length;i++){
                    int [] b =arry[i];
                    for(int j =0; j<b.length; j++){
                        if (b[j]==Min){
                            if(i+j<minSum){
                                minSum=i+j;
                                minJ=j;
                                minI=i;
                            }
                        }
                    }
                }
                int maxSum = 0;
                int maxI = 0;
                int maxJ = 0;
                for (int i = 0; i < arry.length; i++) {
                    int[] a = arry[i];
                    for (int j = a.length - 1; j >= 0; j--) {
                        if (a[j] == Max) {
                            if (i + j > maxSum) {
                                maxSum = i + j;
                                maxI = i;
                                maxJ = j;
                                break;
                            }
                        }
                    }
                }
                System.out.printf("Максимальный элемент: [%d][%d]: %d%n", maxI, maxJ, Max);
                System.out.printf("Минимальный элемент: [%d][%d]: %d%n", minI, minJ, Min);
                break;
            case 0:
                break;
            default:
                System.out.println("Неверный номер задания.");
                break;
        }
    }
}