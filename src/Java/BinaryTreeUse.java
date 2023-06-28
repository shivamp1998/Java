package Java;

import java.util.*;

public class BinaryTreeUse {

    public static void print(BinaryTreeNode<Integer> root) {
        if (root != null) {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }

    public static int NumberOfLeafs(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return NumberOfLeafs(root.left) + NumberOfLeafs(root.right);
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean balancedTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            return false;
        boolean isLeftBalanced = balancedTree(root.left);
        boolean isRightBalanced = balancedTree(root.right);
        return isLeftBalanced && isRightBalanced;
    }

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		if(root == null) return null;
		if(root.data == data) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(data);
			return ans;
		}
		ArrayList<Integer> left = getPath(root.left, data);
		if(left != null) {
			left.add(root.data);
			return left;
		}
		ArrayList<Integer> right = getPath(root.right, data);
		if(right != null) {
			right.add(root.data);
			return right;
		}
		return null;

	}

    public static BalancedImproved imporvedBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BalancedImproved ans = new BalancedImproved(0, true);
            return ans;
        }
        BalancedImproved left = imporvedBalanced(root.left);
        BalancedImproved right = imporvedBalanced(root.right);
        int height = 1 + Math.max(left.height, right.height);
        boolean isBal = true;
        if (Math.abs(left.height - right.height) > 1) {
            isBal = false;
        }
        if (!left.isbalanced || !right.isbalanced) {
            isBal = false;
        }
        BalancedImproved ans = new BalancedImproved(height, isBal);
        return ans;

    }

    public static BinaryTreeNode<Integer> postHelper(int postOrder[], int [] inOrder, int i, int j, int k, int l) {
        if(i > j) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[j]); 
        int inStartLeft = 0, inStartRight = 0;
        int inEndLeft = 0, inEndRight = 0;
        int postStartLeft = 0 , postStartRight = 0;
        int postEndLeft = 0, postEndRight = 0;
        root.left = postHelper(postOrder, inOrder, postStartLeft, postEndLeft, inStartLeft, inEndLeft);
        root.right = postHelper(postOrder, inOrder, postStartRight, postEndRight, inStartRight, inEndRight);

        return null;
    }

    public static BinaryTreeNode<Integer> buildTreePost(int[] postOrder, int[] inOrder) {
		//Your code goes here
        return null;
	}

    public static BinaryTreeNode<Integer> helper(int[] preOrder, int[] inOrder, int i, int j, int start) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[start]);
        if(i > j) {
            return root;
        }
        int index = -1;
        int count = 1;
        for(int p=i; i<=j; i++) {
            if(preOrder[start] == inOrder[p]){
                index = p;
                break;
            }
            count++;
        }

        
        return null;
    }   

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = helper(preOrder, inOrder, 0, inOrder.length - 1, 0);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInput() {
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(sc.nextInt());
        
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> node = q.poll();
            int leftChild = sc.nextInt();
            int rightChild = sc.nextInt();
            if (leftChild != -1) {
                node.left = new BinaryTreeNode<Integer>(leftChild);
                q.add(node.left);
            }
            if (rightChild != -1) {
                node.right = new BinaryTreeNode<Integer>(rightChild);
                q.add(node.right);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) return;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        System.out.println(root.data);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size > 0) {
                BinaryTreeNode<Integer> front = q.poll();
                if(front.left != null) {
                    System.out.print(front.left.data + " ");
                    q.add(front.left);
                }
                if(front.right != null) {
                    System.out.print(front.right.data + " ");
                    q.add(front.right);  
                }
                size--; 
            }
            System.out.println();
        }
		
	}


    public static BinaryTreeNode<Integer> takeInputBad() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1){
            sc.close();
            return null;
        }
        BinaryTreeNode<Integer> rootData = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> left = takeInputBad();
        BinaryTreeNode<Integer> right = takeInputBad();
        rootData.left = left;
        rootData.right = right;
        sc.close();
        return rootData;
    }

    public static void main(String... args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // root.left = rootLeft;
        // root.right = rootRight;
        // BinaryTreeNode<Integer> twoRootRight = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> twoRootLeft = new BinaryTreeNode<>(5);
        // rootLeft.right = twoRootRight;
        // rootRight.left = twoRootLeft;
        // print(root);

        BinaryTreeNode<Integer> root = takeInput();
        printLevelWise(root);
    }
}
