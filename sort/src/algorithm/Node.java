package algorithm;

import java.util.Objects;

public class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
