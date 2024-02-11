package priority;

import java.util.ArrayList;
import java.util.TreeMap;

public class MinMaxPriorityQueueImpl<T> implements MinMaxPriorityQueue<T> {

    private final TreeMap<Integer, ArrayList<T>> map;

    public MinMaxPriorityQueueImpl() {
        map = new TreeMap<>();
    }

    @Override
    public void add(T item, int priority) {
        if (!map.containsKey(priority)) {
            map.put(priority, new ArrayList<>());
        }
        map.get(priority).add(item);
    }

    @Override
    public T minPriorityItem() {
        if (map.size() == 0) {
            return null;
        }
        Integer firstKey = map.firstKey();
        T result = map.get(firstKey).remove(0);
        if (map.get(firstKey).size() == 0) {
            map.remove(firstKey);
        }
        return result;
    }

    @Override
    public T maxPriorityItem() {
        if (map.size() == 0) {
            return null;
        }
        Integer lastKey = map.lastKey();
        T result = map.get(lastKey).remove(map.get(lastKey).size() - 1);
        if (map.get(lastKey).size() == 0) {
            map.remove(lastKey);
        }
        return result;
    }

}
