package Trees;

public class Count {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree{
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int countNode(Node root){
            if(root ==  null){
                return 0;
            }
            int left = countNode(root.left);
            int right = countNode(root.right);
            return left + right + 1;
        }

        public static int sumNode(Node root){
            if(root == null){
                return 0;
            }
            int left = sumNode(root.left);
            int right = sumNode(root.right);
            return left + right + root.data;

        }
    }

        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree tree = new Binarytree();
            Node root = tree.buildTree(nodes);

            System.out.println(tree.countNode(root));
            System.out.println(tree.sumNode(root));
        }
}
