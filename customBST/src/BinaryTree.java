public class BinaryTree {
    Node root = null;
    Node pointer = null;

    // go by brute force for crating of methods okk
    // make each case in copy, where it fails, and how i m gonna solve it ok

    protected void add(int data){

        if(pointer == null) root.val = data;
        else{
            if(root.val > data){
                root.left = (null) ?  new Node(data) : add()
            }
        }
    }



}

// for that shit we need root for real yaa na

//wtf is that can't i make it public otherwise have to declare it in its own class
class Node{
    int val;
    Node left;
    Node rigth;

    Node(int data){
        this.val = data;
    }
}