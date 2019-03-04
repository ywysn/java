package www.bit.java;

import javax.xml.soap.Node;

public class LinedList {
   private Node head;
   private int size;
   public LinedList(){
       head = null;
       size = 0;
   }
   private class Node{
       Object data;
       Node next;
       public Node(Object data,Node next){
           this.data = data;
           this.next = next;
       }
       public Node(Object data){
           this.data = data;
       }
   }
   public void addFirst(Object data){
       head = new Node(data,head);
       size++;
   }
   public void add(Object data,int index){
       if(index < 0||index > size){
           throw new IndexOutOfBoundsException("index Illegal");
       }else {
           Node prew = head;
           for(int i = 0;i < index - 1;i++){
               prew = prew.next;
           }
       }
   }
}
