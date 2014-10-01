/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nitroluke
 */
public class BinaryTree {

    public Node root = null;

    public void Tree() {
//        root = new Node(0, "dummy");
    }

    public void insert(int data, String otherData) {
        Node localRoot = root;
        Node treeNode = new Node(data, otherData);

        if (root == null) {
            root = treeNode;
        } else if (root.data == treeNode.data) {

        } else {
            while (true) {
                if (treeNode.data < localRoot.data) {
                    if (localRoot.left == null) {
                        localRoot.left = treeNode;
                        break;
                    } else {
                        localRoot = localRoot.left;
                    }
                } else {
                    if (localRoot.right == null) {
                        localRoot.right = treeNode;
                        break;
                    } else {
                        localRoot = localRoot.right;
                    }
                }

            }
        }
    }
    
    public void Delete(Node nodeToDelete){
        if(root == null){
        }
        else if(nodeToDelete.left == null && nodeToDelete.right == null){ // no children
            nodeToDelete = null;
        }
        else if((nodeToDelete.left == null && nodeToDelete.right != null) || (nodeToDelete.right == null && nodeToDelete.left != null)){  // one child
            
        }
        else if(nodeToDelete.left != null && nodeToDelete.right != null){ // two children
            
        }
    }

        public boolean lookup(int data) {
        return (lookup(root, data));
    }

    private boolean lookup(Node node, int data) {
        if (node == null) {
            return (false);
        }
        if (data == node.data) {
            return true;
        } else if (data < node.data) {
            return (lookup(node.left, data));
        } else {
            return (lookup(node.right, data));
        }
    }
    
    public void InOrder(Node localRoot) {
        if (localRoot != null) {
            InOrder(localRoot.left);
            System.out.println(localRoot.toString());
            InOrder(localRoot.right);

        }
    }

    public void PostOrder(Node localRoot) {
        if (localRoot != null) {
            PostOrder(localRoot.left);
            PostOrder(localRoot.right);
            System.out.println(localRoot.toString());

        }
    }

    public void PreOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.toString());
            PreOrder(localRoot.left);
            PreOrder(localRoot.right);

        }
    }
}
