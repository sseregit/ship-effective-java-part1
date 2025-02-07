package jang.effective.java.chapter02.item13;

public class HashTable implements Cloneable {

    private Entry[] buckets = new Entry[10];

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public void add(Object key, Object value) {
            this.next = new Entry(key, value, null);
        }

//        public Entry deepCopy() {
//            return new Entry(key, value, next == null ? null : next.deepCopy());
//        }

        public Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }
    }

//    // shallow copy
//    @Override
//    public HashTable clone() {
//        HashTable result = null;
//        try {
//            result = (HashTable) super.clone();
//            result.buckets = this.buckets.clone();
//            return result;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    // deep copy
    @Override
    public HashTable clone() {
        HashTable result = null;
        try {
            result = (HashTable) super.clone();
            result.buckets = new Entry[this.buckets.length];
            for (int i = 0; i < this.buckets.length; i++) {
                if (buckets[i] != null) {
                    result.buckets[i] = this.buckets[i].deepCopy();
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        Entry entry = new Entry(new Object(), new Object(), null);
        hashTable.buckets[0] = entry;
        HashTable clone = hashTable.clone();
        System.out.println(hashTable.buckets[0] == entry);
        System.out.println(hashTable.buckets[0] == clone.buckets[0]);
    }
}
