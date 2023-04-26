package com.test;

public class middle
{
    private Node head;
    private Node tail;

    private int size;

    public middle()
    {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next =head;
        head =node;

        if(tail == null)
        {
            tail = head;
        }
        size += 1;
    }


    public void middleNode()
    {
        Node slow = head;
        Node fast = head;

        while((fast != null && fast.next != null))
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);

    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("end");

    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;

        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

}