package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertIntoBinaryTree(root, key);
    }
    public Node insertIntoBinaryTree(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
            root.left = insertIntoBinaryTree(root.left, key);
        } else if (key > root.data ) {
            root.right = insertIntoBinaryTree(root.right, key);
        }
        return root;
    }

    public void showOrder(){
        inOrderShow(root);
    }
    public void inOrderShow(Node root){
        if(root != null){
            inOrderShow(root.left);
            System.out.println(root.data);
            inOrderShow(root.right);
        }
    }

    public void showPath(int data){
        List<Integer> path = new ArrayList<>();
        givePathOrder(root,data, path );
    }

    public void givePathOrder(Node root, int data, List<Integer> path){
        if(root == null){
            System.out.println("Number not found");
        }

        assert root != null;
        path.add(root.data);

        if(root.data == data){
            for(int i: path){
                System.out.print(i + " ");
            }
            System.out.println();
        } else if (root.data< data) {
            givePathOrder(root.right, data, path);
        }

        else{
            givePathOrder(root.left, data, path);
        }

        path.remove(path.size()-1);

    }

    public static void main(String[] args){
        BinarySearchTree newTree = new BinarySearchTree();
        newTree.insert(4);
        newTree.insert(2);
        newTree.insert(6);
        newTree.insert(1);
        newTree.insert(3);
        newTree.insert(5);
        newTree.insert(7);

        newTree.showOrder();

        System.out.println("-------------");

        newTree.showPath(7);
    }
}
