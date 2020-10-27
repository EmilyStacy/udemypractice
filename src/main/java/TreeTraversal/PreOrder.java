package TreeTraversal;

public class PreOrder {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
/*
preOrder: root left right
inorder: left root right
post order: left right root


 */
        static TreeNode buildTree(int[]preorder, int[]inorder){
            return helper(0,0,inorder.length-1,preorder,inorder);
        }

        static TreeNode helper(int preStart, int inStart, int inEnd, int[]preorder, int[]inorder){
            if(preStart > preorder.length-1 || inStart > inEnd){
                return null;
            }
            //get the first index as the root
            TreeNode root = new TreeNode(preorder[preStart]);
            //set left and right node for the root by the inorder array
            //index in inorder
            int inIndex = 0;
            for(int i = inStart; i <= inEnd; i++){
                if(root.data ==inorder[i]){
                   //where the root is in the inorder array
                    inIndex =i;
                }
            }
            root.left = helper(preStart+1, inStart,inIndex-1,preorder,inorder);
           /*
           preStart = 0
           inIndex = 1
           inStart = 0
           inIndex and inStart can be the left sub tree in inorder array
            */
            root.right = helper(preStart+inIndex-inStart+1, inStart,inEnd,preorder,inorder);


            return root;
        }

        public static void main(String[] args) {
            //int[]preorder = {3,9,20,15,7};
            int[]inorder = {4,2,5,1,6,3};
            int []preorder = {1,2,4,5,3,6};
            /*
            1
            2  3
            4  5 6
             */
            //int[]inorder = {9,3,15,20,7};
            buildTree(preorder,inorder);
            /*
            3
            9 20
              15 7
             */
        }
    }
}
