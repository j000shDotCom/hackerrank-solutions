    static Node next;
    public static Node insert(Node head, int data)
    {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            next = head;
        } else {
            next.next = n;
            next = n;
        }
        return head;
    }
