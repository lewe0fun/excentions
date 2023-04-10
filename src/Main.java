import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        parseStringPrint("132а");//NumberFormatException
        System.out.println(getStringLength(null));//NullPointerException
        writeFile("file.txt");//IOException
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {10, 21, 32, 42, 53, 63, 74, 84, 93};
        System.out.println(Arrays.toString(arrDiv(arr2, arr1)));
    }

    //№1
    public static void writeFile(String str) {
        try {
            FileWriter fileWriter = new FileWriter(str);
            fileWriter.close();
            fileWriter.write("qwerty");
        } catch (IOException e) {
            System.out.println("Файл отсутствует");
        }
    }

    public static int getStringLength(String str) {
        try {
            return str.length();
        } catch (NullPointerException e) {
            System.out.println("Нет строки");
        }
        return -1;
    }

    public static void parseStringPrint(String str) {
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("Не числовая строка");
        }
    }

    //№2
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//NullPointerException
            for (int j = 0; j < 5; j++) {//ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);//NumberFormatException
                sum += val;
            }
        }
        return sum;
    }

    //№3
    public static int[] arrDiff(int[] arr1, int[] arr2) {
        if (arr1 != null && arr2 != null) {
            int[] result = new int[arr1.length];
            try {
                for (int i = 0; i < arr1.length; i++)
                    result[i] = arr1[i] - arr2[i];
                return result;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Массивы разной длинны");
            }
        }
        return null;
    }

    //#4
    public static int[] arrDiv(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) { throw new RuntimeException("Нет одного или несколько массивов");}
        if(arr1.length!=arr2.length){throw new RuntimeException("массивы не равны");}
            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++)
                result[i] = arr1[i] / arr2[i];
            return result;


    }
}
