    public static Node removeDuplicates(Node head) {
        if (head == null)
            return head;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
