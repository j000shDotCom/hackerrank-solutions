    static void levelOrder(Node root) {
        Collection<Node> nodes = Collections.singleton(root);
        levelOrderRec(nodes);
    }

    static void levelOrderRec(Collection<Node> nodes) {
        if (nodes == null || nodes.isEmpty())
            return;
        Collection<Node> nextNodes = new ArrayList<>();
        for (Node n : nodes) {
            if (n == null)
                continue;
            System.out.print(n.data + " ");
            nextNodes.add(n.left);
            nextNodes.add(n.right);
        }
        levelOrderRec(nextNodes);
    }
