package work.yanghao.chainlist;

/**
 * Chain Node
 */
public class Node {

    private Node pre;
    private String value;
    private Node back;

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

    public Node getBack(){
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }
}
