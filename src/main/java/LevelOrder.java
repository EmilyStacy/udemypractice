import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);
        levelOrder(root);
        //System.out.println(levelOrder(root));
        /*

        1
        2   3
        45  67
         */
    }

    //private static void levelOrder(Node root) {
        private static void levelOrder(Node root) {
        StringBuffer temp_result = new StringBuffer();
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        //deliminator and force return
        q.add(null);

        while(!q.isEmpty()){
            //first in first out
            Node curr = q.poll();
            //starting a new layer
            if(curr == null) {
                if(!q.isEmpty()) {
                    q.add(null);
                    temp_result.append("$");
                    //System.out.println();
                }
            }else{
                if(curr.left !=null){
                    q.add(curr.left);
                }

                if(curr.right !=null){
                    q.add(curr.right);
                }

                //System.out.println(curr.data + " ");
                temp_result.append(String.valueOf(curr.data));

            }
        }
            System.out.println(temp_result);

    }
}
