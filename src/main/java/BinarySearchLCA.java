//from Nick White youtube
    class Node1
    {
        int data;
        Node left;
        Node right;
        Node1(int item){
            data = item;
            left = right = null;
        }
    }

    class BinaryTree1 {
        Node root;

        Node lookForLca(Node node, int n1, int n2) {
            if (node == null) {
                return null;
            }
            if (node.data > n1 && node.data > n2) {
                return lookForLca(node.left, n1, n2);
            }

            if (node.data < n1 && node.data < n2) {
                return lookForLca(node.right, n1, n2);
            }
            return node;
        }


        public static void main(String[] args) {
            BinaryTree1 tree = new BinaryTree1();
            tree.root = new Node(20);
            tree.root.left = new Node(8);
            tree.root.right = new Node(22);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(12);
            tree.root.left.right.left = new Node(10);
            tree.root.left.right.right = new Node(14);

            int n1 = 10, n2 = 14;
            Node t = tree.lookForLca(tree.root, n1, n2);
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
//           int n1 = 14;
//            int n2 = 8;
//            Node t = tree.lookForLca(tree.root, n1, n2);
//            System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
//            int n1 = 10;
//            int n2 = 22;
//            Node t = tree.lookForLca(tree.root, n1, n2);
//            System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        }
    }
