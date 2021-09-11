import java.util.LinkedList;
import java.util.*;

public class LinkedListDeleteAlternate {
    public static void main(String[] args) {
        Linked h = new Linked();
        Node head = null;
        head = h.insert(6,head);
        head = h.insert(5,head);
        head = h.insert(4,head);
        head = h.insert(3,head);
        head = h.insert(2,head);
        head = h.insert(1,head);

        head = h.deleteAlternateNode(head);
        h.printList(head);
    }
    public Node deleteAlternateNode(Node node){
        if(node==null || node.next=null){
            return node;
        }
        Node head = node;
        while(node != null && node.next != null){
            node.next = node.next.next;
            node = node.next;
        }
        return head; 
    }
}