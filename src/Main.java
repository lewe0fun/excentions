import java.io.*;

public class Main {
    public static void main(String[] args){
        //Задание 1
        // System.out.println(getFloat());

        //Задание 2
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int d = 0;
            double catchedRes1 = arr[8] / d;
            if (catchedRes1 == Double.POSITIVE_INFINITY || catchedRes1 == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
    //Задание 3
    public static void main2(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (ArithmeticException ex) {
            System.out.println("Деление на ноль");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." +ex);
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static float getFloat() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String value;
        Float result = null;
        do {
            try {
                value = bufferedReader.readLine();
                if (value == null) {
                    throw new NullPointerException();
                }
                try {
                    if (value.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("пустые строки вводить нельзя");
                }
                result = Float.parseFloat(value);
            } catch (IOException e) {
                System.out.println("Ошибка ввода вывода ");
            } catch (NumberFormatException e) {
                System.out.println("Пресутсвуют не числовые символы ");
            } catch (NullPointerException e) {
                System.out.println("Пустая строка");
            }

        } while (result == null);

        return result;
    }
}