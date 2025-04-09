import java.util.*;

public class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet() { // inside the constructor, which means each time you create a new object of
                             // RandomizedSet, it will have its own separate map and list.
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int index = map.get(val);
        Collections.swap(list, index, list.size() - 1);
        int swapval = list.get(index);
        map.put(swapval, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random rd = new Random();
        int n = rd.nextInt(list.size());
        return list.get(n);
    }
}
