package Madara;

public class BST {
    protected int timer = 2;
    protected int n = (int) 1e6;
    protected int[] values = new int[n];
    protected int[] left = new int[n];
    protected int[] right = new int[n];
    protected int[] keys = new int[n];

    int search(int key){
        return search(1, key, left, right, values, keys);
    }
    public int search (int start, int key, int[] left, int[] right, int[] values, int[] keys) {
        if (keys[start] == key) {
            return values[start];
        }
        if (keys[start] > key) {
            if (left[start] == 0) return -1;
            return search(left[start], key, left, right, values, keys);
        }
        if (keys[start] < key) {
            if (right[start] == 0) return -1;
            return search(right[start], key, left, right, values, keys);
        }
        return -1;
    }


    void insert(int key, int val){
        insert(1, key, val, keys, values, left, right, timer);
        timer++;
    }
    public void insert(int start, int key, int val, int[] keys, int[] values, int[] left, int[] right, int timer){
        if (keys[start] == 0) {
            keys[start] = key;
            values[start] = val;
            return;
        }
        if (keys[start] > key) {
            if (left[start] == 0) {
                left[start] = timer;
                keys[left[start]] = key;
                values[left[start]] = val;
                return;
            }
            insert(left[start], key, val, keys, values, left, right, timer);
        }
        else if (keys[start] < key) {
            if (right[start] == 0) {
                right[start] = timer;
                keys[right[start]] = key;
                values[right[start]] = val;
                return;
            }
            insert(right[start], key, val, keys, values, left, right, timer);
        }
    }


    int getMin(){
        return getMin(1, left, right, values);
    }
    public int getMin(int start, int[] left, int[] right, int[] values) {
        if (left[start] == 0) return values[start];
        else return getMin(left[start], left, right, values);
    }


    int getMax(){
        return getMax(1, left, right, values);
    }
    public int getMax(int start, int[] left, int[] right, int [] values) {
        if (right[start] == 0) return values[start];
        else return getMax(right[start], left, right, values);
    }

}
