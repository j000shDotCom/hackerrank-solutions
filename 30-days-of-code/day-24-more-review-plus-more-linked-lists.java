    public static Node removeDuplicates(Node head) {
        if(head == null)
            return head;
        Node curr = head;
        Node next = curr.next;
        while (curr.next != null) {
            if (curr.data == next.data) {
                next = next.next;
            } else {
                curr.next = next;
                curr = next;
                next = curr.next;
            }
        }
        return head;
    }
