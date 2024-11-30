package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    public void preOrderTraversal(BinaryNode node){

        if(node == null){
            return ;
        }
        System.out.print(node.data + " " );

        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(BinaryNode root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }

    public void inOrderTraversal(BinaryNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void levelOrderTraversal(BinaryNode root){
        Queue<BinaryNode> queue = new LinkedList<>();
           queue.add(root);
           queue.add(null);
           while (!queue.isEmpty()){
               BinaryNode currentNode = queue.remove();
               if(currentNode == null){
                   System.out.println();
                   if(queue.isEmpty()){
                        break;
                   } else {
                       queue.add(null);
                   }
               } else {
                   System.out.print(currentNode.data + " ");
                   if(currentNode.left != null){
                       queue.add(currentNode.left);
                   }
                   if(currentNode.right != null){
                       queue.add(currentNode.right);
                   }
               }
           }


    }

    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.data = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.data = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.data = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.data = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.data = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.data = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.data = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.data = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.data = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N4.left = N8;
        N4.right = N9;
        N3.left = N6;
        N3.right = N7;
        binaryTreeLL.root = N1;
        //binaryTreeLL.preOrderTraversal(binaryTreeLL.root);
        //binaryTreeLL.inOrderTraversal(binaryTreeLL.root);
        //binaryTreeLL.postOrderTraversal(binaryTreeLL.root);
        binaryTreeLL.levelOrderTraversal(binaryTreeLL.root);
    }


}

