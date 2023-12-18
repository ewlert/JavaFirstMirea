package ru.mirea.task28.opt3;

import java.util.HashMap;
import java.util.Map;

public class RealNumberHashTable {
    public static void main(String[] args) {
        Map<RealNumber, String> hashtable = new HashMap<>();

        RealNumber key1 = new RealNumber(3.14);
        RealNumber key2 = new RealNumber(2.71);
        RealNumber key3 = new RealNumber(1.618);

        hashtable.put(key1, "Value 1");
        hashtable.put(key2, "Value 2");
        hashtable.put(key3, "Value 3");

        System.out.println(hashtable.get(key1)); // Output: Value 1
        System.out.println(hashtable.get(key2)); // Output: Value 2
        System.out.println(hashtable.get(key3)); // Output: Value 3
    }
}

class RealNumber {
    private double value;

    public RealNumber(double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealNumber other = (RealNumber) obj;
        return Double.compare(this.value, other.value) == 0;
    }
}
