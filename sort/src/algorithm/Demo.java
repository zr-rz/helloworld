package algorithm;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.left = node2;
        node1.right = node3;
        printNum(node1);
    }

    static void printNum(Node root) {
        if (root == null) {
            return;
        }
//        System.out.print("先" + root.val + ", ");
        printNum(root.left);
//        System.out.print("中" + root.val + ", ");
        printNum(root.right);
        System.out.print("后" + root.val + ", ");
    }


}
