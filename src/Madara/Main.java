package Madara;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main{
    public static Scanner sc = new Scanner(System.in);

    // Implementation of QuickSort
    /*
   public static void quickSort(int sz, int[] mas, int l, int r){
        int i = l, j = r, x;
        int m = (l + r) / 2;
        x = mas[m];

        while ( i <= j) {
            while (mas[i] < x) i++;
            while (mas[j] > x) j--;
            if (i <= j) {
                int v = mas[i];
                mas[i] = mas[j];
                mas[j] = v;
                i++;
                j--;
            }
        }

        if(i < r){
            quickSort(sz, mas, i, r);
        }
        if(j > l){
            quickSort(sz, mas, l, j);
        }
    }


    public static void main(String[] args) {
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        for(int i = 0; i < sz; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(sz, arr, 0, sz - 1);

        for(int i = 0; i < sz; i++){
            System.out.print(arr[i] + " ");
        }
    }

    */



    // Implementation of MergeSort
    /*
    public static void MergeSort(int sz, int[] mas, int l, int r){
        if (l == r ) return;
        else{
            int m = (l + r) / 2;
            MergeSort(sz, mas, l, m);
            MergeSort(sz, mas, m + 1, r);
            int[] arr = new int[r - l + 1];
            int i = l, j = m  +1;
            int cur = 0;
            while(cur < (r - l + 1)){
                if (i > m){
                    arr[cur] = mas[j];
                    j++;
                    cur++;
                    continue;
                }
                if(j > r){
                    arr[cur] = mas[i];
                    i++;
                    cur++;
                    continue;
                }
                if(mas[i] >= mas[j]){
                    arr[cur] = mas[j];
                    j++;
                    cur++;
                    continue;
                }
                else{
                    arr[cur] = mas[i];
                    i++;
                    cur++;
                    continue;
                }
            }
            for(i = 0; i < r - l + 1; i++){
                mas[i + l] = arr[i];
            }

        }
    }



    public static void main(String[] args) {
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        for(int i = 0; i < sz; i++){
            arr[i] = sc.nextInt();
        }
        MergeSort(sz, arr, 0, sz - 1);
        for(int i = 0; i < sz; i++){
            System.out.print(arr[i] + " ");
        }
    }
    */



    // Implementation of HashTable

    public static void main(String[] args) {

        MyHash<String, Integer> map = new MyHash<>();
        map.put("this", 1);
        map.put("coder", 2);
        map.put("this", 4);
        map.put("hi", 5);
        System.out.println(map.get("this"));
        map.remove("this");
        map.put("this", 3);
        System.out.println(map.get("this"));
        System.out.println(map.contains((3)));
        System.out.println(map.getKey(3));
    }




    // Implementation of BST
    // this implementation has some limits, but the functional of the main methods is okay
    /*
    public static void main(String[] args) {
        BST bst = new BST();

        int query = sc.nextInt();
        for(int i = 0; i < query; i++){
            int type = sc.nextInt();
            if(type == 1){
                int key = sc.nextInt();
                System.out.println(bst.search(key));
            }
            if (type == 2){
                int key = sc.nextInt();
                int val = sc.nextInt();
                bst.insert(key, val);
                //timer++;
            }
            if (type == 3){
                System.out.println(bst.getMax());
            }
            if (type == 4){
                System.out.println(bst.getMin());
            }
        }
    }
    */

}


