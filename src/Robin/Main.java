package Robin;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int size = sc.nextInt();
        int[] mas = new int[size];

        for(int i = 0; i < size; i++){
            mas[i] = sc.nextInt();
        }

        Functions fun = new Functions();
        // код работает с условием, что массив отсортированный
        System.out.println(fun.firstIndexOf(mas, size, 8));
        System.out.println(fun.secondIndexOf(mas, size, 8));
        System.out.println(fun.lastIndexOf(mas, size, 12));
        System.out.println(fun.has(mas, size, 23));
        System.out.println(fun.hasTriple(mas, size, 67));



    }
}
