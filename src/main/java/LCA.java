
     class Node {
        int data;
        Node left;
        Node right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }


    class BinaryTree
    {
        Node root;
        Node findLCA(int n1, int n2){
            return findLCA(root, n1, n2);
        }
        Node findLCA(Node node, int n1, int n2){
            //base case
            if(node == null){
                return null;
            }
            //breaking point when the node reaches n1 or n2
            if(node.data == n1 || node.data==n2){
                return node;
            }

            Node left_LCA = findLCA(node.left, n1,n2);
            System.out.printf("Left_LCA now is ",left_LCA==null?"null":left_LCA.data);
            Node right_LCA = findLCA(node.right, n1,n2);
            System.out.printf("Right_LCA now is ",right_LCA==null?"null":right_LCA.data);

            //breaking point when LCA has both left and right nodes
            if(left_LCA !=null && right_LCA!=null){
                return node;
            }

            return (left_LCA !=null)?left_LCA:right_LCA;
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root= new Node(3);
            tree.root.left = new Node(6);
            tree.root.right = new Node(8);
            tree.root.left.left = new Node(2);
            tree.root.left.right = new Node(11);
            tree.root.right.right = new Node(13);
            tree.root.right.right.right = new Node(7);
            tree.root.left.right.left = new Node(9);
            tree.root.left.right.right = new Node(5);
            System.out.println(tree.findLCA(2,8).data);
            //System.out.println(tree.findLCA(2,5).data);
            //System.out.println(tree.findLCA(9,5).data);
            //System.out.println(tree.findLCA(8,7).data);
            //System.out.println(tree.findLCA(9,3).data);
        }

    }
    //https://www.youtube.com/watch?v=13m9ZCB8gjw




