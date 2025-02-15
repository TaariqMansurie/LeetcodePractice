/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Definition for singly-linked list.
// Definition for singly-linked list.
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Method to deserialize a string to a linked list
    public static ListNode deserialize(String data) {
        if (data.equals("[]")) {
            return null; // Empty list
        }

        // Remove brackets and split the string by commas
        String[] values = data.replace("[", "").replace("]", "").split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Build the linked list from the string values
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }

        return dummy.next;
    }

    // Method to serialize a linked list to a string
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: If the list is empty or has only one node, return head
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Adjust the current node's pointers
        head.next.next = head; // Point the next node's next back to the current node
        head.next = null; // Detach the current node

        return newHead; // Return the new head of the reversed list
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Deserialize input to create linked list
        String input = "[1,2,3,4,5]"; // Input list in string format
        ListNode head = ListNode.deserialize(input);

        // Reverse the linked list
        ListNode reversed = solution.reverseList(head);

        // Serialize output to string
        String output = reversed.serialize();
        System.out.println("Reversed List: " + output);
    }
}




