import org.junit.Before;
import org.junit.Test;
import priority.MinMaxPriorityQueue;
import priority.MinMaxPriorityQueueImpl;

import static org.junit.Assert.assertEquals;

public class MinMaxPriorityQueueTest {
    private MinMaxPriorityQueue<Integer> minMaxPriorityQueue;

    @Before
    public void setUp() {
        minMaxPriorityQueue = new MinMaxPriorityQueueImpl<>();
    }

    @Test
    public void testGetItems() {
        minMaxPriorityQueue.add(101, 3);
        minMaxPriorityQueue.add(102, 3);
        minMaxPriorityQueue.add(100, 3);
        minMaxPriorityQueue.add(10, 2);
        assertEquals((Integer) 10, minMaxPriorityQueue.minPriorityItem());
        assertEquals((Integer) 100, minMaxPriorityQueue.maxPriorityItem());
        assertEquals((Integer) 101, minMaxPriorityQueue.minPriorityItem());
    }

}
