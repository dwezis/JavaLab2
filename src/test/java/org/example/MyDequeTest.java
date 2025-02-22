package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyDequeTest {

    @Test
    public void testAddFirstAndPollFirst() {
        MyDeque<Integer> deque = new MyDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        assertEquals(2, deque.pollFirst());
        assertEquals(1, deque.pollFirst());
    }

    @Test
    public void testAddLastAndPollLast() {
        MyDeque<Integer> deque = new MyDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        assertEquals(2, deque.pollLast());
        assertEquals(1, deque.pollLast());
    }

    @Test
    public void testSize() {
        MyDeque<Integer> deque = new MyDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        assertEquals(2, deque.size());
    }

    @Test
    public void testIsEmpty() {
        MyDeque<Integer> deque = new MyDeque<>();
        assertTrue(deque.isEmpty());
        deque.addFirst(1);
        assertFalse(deque.isEmpty());
    }

    @Test
    public void testContains() {
        MyDeque<Integer> deque = new MyDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        assertTrue(deque.contains(1));
        assertFalse(deque.contains(3));
    }
}