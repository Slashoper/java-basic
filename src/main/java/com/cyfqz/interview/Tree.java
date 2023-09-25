package com.cyfqz.interview;

/**
 * 树操作
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/14 19:22
 */
public class Tree {

    public static void main(String[] args) {
        Node head = new Node(3);
        head.l = new Node(1);
        head.r = new Node(2);
        post(head);
    }

    public static class Node{
        int value ;
        Node l;
        Node r;

        public Node(int value ){
            this.value = value;
        }
    }

    public static void post(Node head){
        if(head == null ){
            return;
        }
        System.out.println(head.value);
        post(head.l);
        post(head.r);
    }
}
