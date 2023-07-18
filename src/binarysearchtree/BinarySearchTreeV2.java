package binarysearchtree;

// Search a Node in Binary Search Tree

class NodeV2 {
    int key;
    NodeV3 left;
    NodeV3 right;

    NodeV2(int val) {
        key = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTreeV2 {

    NodeV3 root;

    public static void main(String[] args) {

        BinarySearchTreeV3 bst = new BinarySearchTreeV3();

        System.out.println("Inserting Element: " + 100);
        bst.root = bst.insert(bst.root, 100);
        System.out.println("Inserting Element: " + 50);
        bst.root = bst.insert(bst.root, 50);
        System.out.println("Inserting Element: " + 150);
        bst.root = bst.insert(bst.root, 150);
        System.out.println("Inserting Element: " + 125);
        bst.root = bst.insert(bst.root, 125);
        System.out.println("Inserting Element: " + 165);
        bst.root = bst.insert(bst.root, 165);
        System.out.println("Inserting Element: " + 25);
        bst.root = bst.insert(bst.root, 25);

        System.out.println("Inorder Traversal of Above BST: ");
        bst.inorder(bst.root);

        System.out.println("\nSearching Element: " + 50);
        if (bst.search(bst.root, 150))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Searching Element: " + 500);
        if (bst.search(bst.root, 500))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");
    }

    public NodeV3 insert(NodeV3 root, int val) {

        // Prepare a new node
        if (root == null)
            return new NodeV3(val);
        else if (root.key < val)
            root.right = insert(root.right, val);
        else if (root.key > val)
            root.left = insert(root.left, val);

        return root;
    }

    public void inorder(NodeV3 root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public boolean search(NodeV3 root, int key) {
        // Check if tree is empty
        if (root == null)
            return false;

        // Check if root has the key
        if (root.key == key)
            return true;

        // Check if key is present in right subtree
        if (root.key < key)
            return search(root.right, key);
        else
            // Check if key is present in left subtree
            return search(root.left, key);
    }
}
