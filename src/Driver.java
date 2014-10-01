/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author nitroluke
 */
public class Driver {
    
     public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // TODO code application logic here
//        Node node4 = new Node(4,"fourth Node");
//        Node node2 = new Node(2,"second Node");
//        Node node1 = new Node(1,"first Node");
//        Node node3 = new Node(3,"third Node");
//        Node node8 = new Node(8,"eigth Node");
//        Node node5 = new Node(5,"fifth Node");
//        Node node6 = new Node(6,"sixth Node");
//        Node node7 = new Node(7,"seventh Node");
        
        
        tree.insert(5, " Node 5");  // getting anull pointer exception
        tree.insert(3, " Node 3");
        tree.insert(8, " Node 8");
        tree.insert(1, " Node 1");
        tree.insert(7, " Node 7");
        tree.insert(4, " Node 4");
        tree.insert(2, " Node 2");
        tree.insert(6, " Node 6");
        
        System.out.println("The InOrder Traversal is ");
        tree.InOrder(tree.root);
         System.out.println("");
        System.out.println("The Post order Traversal is ");
        tree.PostOrder(tree.root);
         System.out.println("");
        System.out.println("The PreOrder Traversal is ");
        tree.PreOrder(tree.root);
         System.out.println("");
    }
    
    
}
