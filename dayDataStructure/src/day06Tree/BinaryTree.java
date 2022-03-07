package day06Tree;

/*二叉树 2022.03.05*/
import day04Linear.Queue;

public class BinaryTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

/*    public BinaryTree() {
        this.root = new Node(null, null, null, null);
        N = 0;
    }*/


    public class Node {
        Node left;
        Node right;
        Key key;
        Value value;

        public Node(Node left, Node right, Key key, Value value) {
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
        }
    }


    //获取树中元素的个数
    public int size() {
        return N;
    }

    //向树中添加元素key-value
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    //向指定的树x中添加key-value,并返回添加元素后新的树
    private Node put(Node x, Key key, Value value) {
        //如果x子树为空，
        if (x == null) {
//            x = new Node(null, null, key, value);
            N++;
            return new Node(null, null, key, value);
        }
        //如果x子树不为空
        //比较x结点的键和key的大小：
        int cmp = key.compareTo(x.key);

        if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else {
            x.value = value;
        }
        return x;
        //如果key大于x结点的键，则继续找x结点的右子树

        //如果key小于x结点的键，则继续找x结点的左子树

        //如果key等于x结点的键，则替换x结点的值为value即可
    }


    //查询树中指定key对应的value
    public Value get(Key key) {
        return get(root, key);

    }

    //从指定的树x中，查找key对应的值
    public Value get(Node x, Key key) {
        //x树为null
        if (x == null) {
            return null;
        }

        //x树不为null

        //比较key和x结点的键的大小
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return get(x.right, key);
        } else if (cmp < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
        //如果key大于x结点的键，则继续找x结点的右子树

        //如果key小于x结点的键，则继续找x结点的左子树


    }


/*    # 先设置这两个参数
    git config --global http.sslBackend "openssl"
    git config --global http.sslVerify "false"
            # 以后运行这两个就可以了
    git config --global --unset http.proxy
    git config --global --unset https.proxy*/



    //删除树中key对应的value
    public void delete(Key key) {
        delete(root, key);
    }

    //删除指定树x中的key对应的value，并返回删除后的新树
    public Node delete(Node x, Key key) {
        //x树为null
        if (x == null) {
            return null;
        }
        //x树不为null
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            x.right = delete(x.right, key);
        } else if (cmp < 0) {
            x.left = delete(x.left, key);
        } else {
//            得找到右子树的最小节点
            N--;
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }

            Node miniNode = x.right;
            while (miniNode.left != null) {
                miniNode = miniNode.left;
            }

//            删除右子树的最小节点
            Node n = x.right;
            while (n.left != null) {
                if (n.left.left != null) {
                    n = n.left;
                } else {
                    n.left = null;
                }
            }
//            改变x的左右子树
            miniNode.left = x.left;
            miniNode.right = x.right;
            x = miniNode;   //让x结点的父结点指向minNode

        }
        return x;
    }

    public Key max() {
        return max(root).key;
    }

    public Node max(Node x) {
        if (x.right != null) {
            return max(x.right);
        } else {
            return x;
        }
    }

    public Key min() {
        return min(root).key;
    }

    public Node min(Node x) {
        if (x.left != null) {
            return max(x.left);
        } else {
            return x;
        }
    }


    public Queue<Key> preErgodic() {
        Queue<Key> keys = new Queue<>();
        preErgodic(root, keys);
        return keys;
    }

    /*每个结点都会先遍历左子树，再遍历右子树*/
    public void preErgodic(Node x, Queue<Key> keys) {
        if (x == null) {
            return;
        }
        keys.enqueue(x.key);
        if (x.left != null) {
            preErgodic(x.left, keys);
        }
        if (x.right != null) {
            preErgodic(x.right, keys);
        }
    }

    public Queue<Key> midErgodic() {
        Queue<Key> keys = new Queue<>();
        midErgodic(root, keys);
        return keys;
    }

    /*每个结点都会先遍历左子树，再遍历右子树*/
    public void midErgodic(Node x, Queue<Key> keys) {
        if (x == null) {
            return;
        }

        if (x.left != null) {
            midErgodic(x.left, keys);
        }

        keys.enqueue(x.key);
        if (x.right != null) {
            midErgodic(x.right, keys);
        }
    }


    public Queue<Key> afterErgodic() {
        Queue<Key> keys = new Queue<>();
        afterErgodic(root, keys);
        return keys;
    }

    /*每个结点都会先遍历左子树，再遍历右子树*/
    public void afterErgodic(Node x, Queue<Key> keys) {
        if (x == null) {
            return;
        }

        if (x.left != null) {
            afterErgodic(x.left, keys);
        }
        if (x.right != null) {
            afterErgodic(x.right, keys);
        }

        keys.enqueue(x.key);
    }
/*层序遍历*/
    public Queue<Key> layerErgodic() {
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);
        while (!nodes.isEmpty()) {
            Node x = nodes.dequeue();
            keys.enqueue(x.key);
            if (x.left != null) {
                nodes.enqueue(x.left);
            }
            if (x.right != null) {
                nodes.enqueue(x.right);
            }
        }
        return keys;

    }
/*最大深度*/
    public int maxDepth(){
        return maxDepth(root);
    }
    public int maxDepth(Node x){
        if (x == null){
            return  0;
        }
        int maxL = 0;
        int maxR = 0;
        int maxDepth = 0;
        if (x.left != null){
            maxL = maxDepth(x.left);

        }
        if (x.right != null){
            maxR = maxDepth(x.right);

        }
        maxDepth = maxL > maxR ? maxL+1:maxR+1;
        return maxDepth;
    }


}
