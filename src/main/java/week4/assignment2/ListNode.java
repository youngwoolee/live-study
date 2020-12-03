package week4.assignment2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if(position <= 0 ) {
            System.out.println("Invalid position");
            return null;
        }

        ListNode before = null;
        ListNode current = head;

        while(position-- > 0) {
            before = current;
            current = current.next;
        }

        before.next = nodeToAdd;
        nodeToAdd.next = current;
        return nodeToAdd;



    }


}
