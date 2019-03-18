package work.yanghao.chainlist;

/**
 * Chain Node
 */
public class Node {

    private Node pre; //前置节点引用
    private String value; //节点的值
    private Node next; //后置节点引用

    public Node getPre(){
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
