public class TreeNodeNumber {

    public TreeNode root;

    public TreeNodeNumber(int[] a) {
        for (int i : a) {
            add(i);
        }
    }

    public static class TreeNode {
        TreeNode left;
        int number;
        TreeNode right;

        TreeNode(TreeNode left, int number, TreeNode right) {
            this.left = left;
            this.right = right;
            this.number = number;
        }
    }

    public void add(int item) {
        if (root == null) {
            root = new TreeNode(null, item, null);
            return;
        } else {
            TreeNode node = root;
            while (node != null) {
                if (item < node.number) {
                    if (node.left == null) {
                        node.left = new TreeNode(null, item, null);
                        break;
                    }
                    node = node.left;
                } else {
                    if (node.right == null) {
                        node.right = new TreeNode(null, item, null);
                        break;
                    }
                    node = node.right;
                }
            }
        }
    }

    public boolean search(int element) {
        TreeNode current = root;

        while (current != null) {
            if (element < current.number) {
                current = current.left;
            } else if (element > current.number) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }
}