package work.yanghao.chainlist;

import com.sun.corba.se.impl.orb.PrefixParserAction;

/**
 * Chain List
 */
public class ChainList {

    //reverse the chain list
    //method one (递归法)
    public static Node reverseChainListByRecursion(Node head){
        if(null == head || null == head.getNext())
        {
            return head;
        }
        Node temp = head.getNext();
        Node newHead = reverseChainListByRecursion(head.getNext());

        temp.setNext(head);
        head.setNext(null);
        return newHead;
    }

    //method two (循环法)
    public static Node reverseChainListByLoop(Node node){

        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.getNext();
            node.setNext(pre);
            pre = node;
            node = next;
        }
        return pre;
    }


    //XXXX delete a node from the chain
    public static Node deleteNode(Node head, String nodeValue){

        //deal the null point head
        if(null == head){
            return null;
        }
        //find
        String value = head.getNext().getValue();
        Node prePoint = head;
        Node point = head.getNext();
        while(true){
            if(!nodeValue.equals(value))
            {
                prePoint = point;
                Node nextNode = point.getNext();
                if(null!=nextNode)
                {
                    point = nextNode;
                    value = nextNode.getValue();
                }
            }
            else{
                //find the destination node,delete the node
                if(null != point.getNext()){
                    prePoint.setNext(point.getNext());
                }
                else{
                    prePoint.setNext(null);
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
        head.setValue("head");
        childNode1.setValue("H");
        childNode2.setValue("e");
        childNode3.setValue("l");
        childNode4.setValue("l");
        childNode5.setValue("o");
        childNode6.setValue("!");
        childNode7.setValue("?");

        //link the child node
        head.setNext(childNode1);
        childNode1.setNext(childNode2);
        childNode2.setNext(childNode3);
        childNode3.setNext(childNode4);
        childNode4.setNext(childNode5);
        childNode5.setNext(childNode6);
        childNode6.setNext(childNode7);
        //return the head
        return head;
    }

    public static void main(String[] args) {
        Node chainList = createChainList();
        printChain(chainList);
        System.out.println("以上是创建的初始链表");
//        Node node = deleteNode(chainList, "?");
        Node result = reverseChainListByLoop(chainList);
//        Node result1 = reverseChainListByRecursion(chainList);
        printChain(result);
    }

    public static void printChain(Node node){

        System.out.println(node.getValue());
        Node temp = node.getNext();

        while(null!=temp)
        {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

}
