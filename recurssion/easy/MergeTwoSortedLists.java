package recurssion.easy;

// class ListNode {
//     int val;
//     ListNode next;

//     // Constructors
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

// public class MergeTwoSortedLists {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if (list1 == null) return list2;
//         if (list2 == null) return list1;

//         if (list1.val <= list2.val) {
//             list1.next = mergeTwoLists(list1.next, list2);
//             return list1;
//         } else {
//             list2.next = mergeTwoLists(list1, list2.next);
//             return list2;
//         }
//     }
//     public static void main(String[] args) {
//         MergeTwoSortedLists solution = new MergeTwoSortedLists();

//         // Creating first linked list: 1 -> 2 -> 4
//         ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

//         // Creating second linked list: 1 -> 3 -> 4
//         ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

//         // Merging the lists
//         ListNode mergedList = solution.mergeTwoLists(list1, list2);

//         // Printing the merged list
//         while (mergedList != null) {
//             System.out.print(mergedList.val + " -> ");
//             mergedList = mergedList.next;
//         }
//         System.out.println("null");
//     }
// }

// Definition for singly-linked list

class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {  // ✅ Ensure this class is public
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Creating first linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Creating second linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merging the lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Printing the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}


