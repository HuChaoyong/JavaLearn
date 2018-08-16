package Chapter5;

/**
 * 单向链表
 */




// 这是一个简单封装的链表, 操作稍微有点繁琐

class Node {

    public Node next = null;
    public String data = "数据";

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node n) {
        this(data);
        this.next = n;
    }

    public void pringData() {
        System.out.print(this.data + " =>");

        if (this.next != null) {
            this.next.pringData();
        } else {
            System.out.print("||");
        }
    }
}

// 这是一个深度封装后的链表

class Link {
    class Node {
        private String data;
        private Node next;


        public Node(String data) {
            this.data = data;
        }

        public void add(Node next) {
            if (this.next == null) {
                this.next = next;
            } else {
                this.next.add(next);
            }
        }

        public void print() {
            System.out.print(this.data + "=>");
            if (this.next != null) {
                this.next.print();
            } else {
                System.out.print("||");
            }
        }

        public boolean search(String  data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.search(data);
                } else {
                    return false;
                }
            }
        }

        public void delete(Node previous, String data) {
            if (this.data.equals(data)) {
                previous.next = this.next;
            } else {
                if (this.next != null) {
                    this.next.delete(this, data);
                }
            }
        }
    }

    private Node root;
    public void addNode(String data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.add(newNode);
        }
    }

    public void printNode() {
        if (this.root != null) {
            this.root.print();
        }
    }

    public boolean contins(String name) {
         return this.root.search(name);
    }

    public void deleteNode(String data) {
        if (this.contins(data)) {
            if (this.root.data.equals(data)) {
                this.root = this.root.next;
            } else {
                this.root.next.delete(root, data);
            }
        }
    }
}

public class SingleDirectorChain {

    static {
        Link l = new Link();
        l.addNode("A");
        l.addNode("B");
        l.addNode("C");
        l.addNode("D");
        l.addNode("F");
        l.addNode("G");
        l.addNode("H");
        System.out.println("");
        System.out.println("=========================before delete ==================");
        l.printNode();
        l.deleteNode("B");
        l.deleteNode("D");
        System.out.println("");
        System.out.println("======================== after delete ===================");
        l.printNode();
        System.out.println("");
        System.out.println("=====================  division  ===========================");
        System.out.println("");
        System.out.println("查询节点:" + l.contins("C"));
        System.out.println("");
    }

    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车厢-A");
        Node n2 = new Node("车厢-B");
        Node n3 = new Node("车厢-C");
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        root.pringData();
    }
}
