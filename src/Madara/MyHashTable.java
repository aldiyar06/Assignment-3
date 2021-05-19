package Madara;

import java.util.ArrayList;
import java.util.Objects;

class HashNode<K, V> {
    K key;
    V value;

    int hashCode;
    HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

class MyHash<K, V> {
    private ArrayList<HashNode<K, V> > bucketArray;

    public MyHash() {
        bucketArray = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            bucketArray.add(null);
    }

    private int hashCode (K key) {
        return Objects.hashCode(key);
    }

    private int hash(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % 10;
        if (index < 0) {
            index = -1 * index;
        }
        return index;
    }

    public void put(K key, V value) {
        int index = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucketArray.get(index);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(index, newNode);
    }

    public V get(K key) {
        int index = hash(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        HashNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key) && hashCode == head.hashCode) {
                break;
            }
            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;

        if (prev != null) {
            prev.next = head.next;
        }
        else
            bucketArray.set(index, head.next);
        return head.value;
    }

    public boolean contains(V value) {
        for (int index = 0; index < 10; index++) {
            HashNode<K, V> head = bucketArray.get(index);
            while (head != null) {
                if (head.value == value) return true;
                head = head.next;
            }
        }
        return false;
    }

    public K getKey(V value) {
        for (int index = 0; index < 10; index++) {
            HashNode<K, V> head = bucketArray.get(index);
            while (head != null) {
                if (head.value == value) return head.key;
                head = head.next;
            }
        }
        return null;
    }








}