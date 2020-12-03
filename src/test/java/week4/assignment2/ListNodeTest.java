package week4.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void create() {
        ListNode listNode = new ListNode(1);
        ListNode addNode = new ListNode(2);
        listNode.add(listNode,  addNode, 1);

        assertEquals(listNode.getNext(), addNode);
    }

}