package work.yanghao.chainlist;

/**
 * Chain List
 */
public class ChainList {


    //delete a node from the chain
    public static Node deleteNode(Node head, String nodeValue){

        //deal the null point head
        if(null == head){
            return null;
        }
        //find
        String value = head.getBack().getValue();
        Node prePoint = head;
        Node point = head.getBack();
        while(true){
            if(!nodeValue.equals(value))
            {
                prePoint = point;
                Node nextNode = point.getBack();
                if(null!=nextNode)
                {
                    point = nextNode;
                    value = nextNode.getValue();
                }
            }
            else{
                //find the destination node,delete the node
                if(null != point.getBack()){
                    prePoint.setBack(point);
                }
                break;
            }
        }
        return head;
    }


    public static Node createChainList(){

        //create the head node
        Node head = new Node();
        //create the child node
        Node childNode1 = new Node();
        Node childNode2 = new Node();
        Node childNode3 = new Node();
        Node childNode4 = new Node();
        Node childNode5 = new Node();
        Node childNode6 = new Node();
        Node childNode7 = new Node();
        //give the node for value
        childNode1.setValue("H");
        childNode2.setValue("e");
        childNode3.setValue("l");
        childNode4.setValue("l");
        childNode5.setValue("o");
        childNode6.setValue("!");
        childNode7.setValue("?");

        //link the child node
        head.setBack(childNode1);
        childNode1.setBack(childNode2);
        childNode2.setBack(childNode3);
        childNode3.setBack(childNode4);
        childNode4.setBack(childNode5);
        childNode5.setBack(childNode6);
        childNode6.setBack(childNode7);
        //return the head
        return head;
    }

    public static void main(String[] args) {
        Node chainList = createChainList();
        Node node = deleteNode(chainList, "?");
        printChain(node);
    }

    public static void printChain(Node node){

        while(null != node.getBack()){

            Node back = node.getBack();
            System.out.print(back.getValue());
        }
    }

}
