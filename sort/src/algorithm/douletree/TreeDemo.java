package algorithm.douletree;

public class TreeDemo {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        System.out.print(isValidBST(treeNode));
    }
    public static int preVal = Integer.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean isBstLeft = isValidBST(root.left);
        if (!isBstLeft) {
            return false;
        }
        if (root.val <= preVal) {
            return false;
        } else {
            preVal = root.val;
        }
        return isValidBST(root.right);
    }
}
