/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 * @param <T>
 */
public class Node<T extends Comparable> {
  public T key;
 private T item;
 private T price;
 private T date;
 private T time;
 private Node next;
public Node(){
       
       next = null; 
   }
public Node(T data,T barcode,T pr){
       key = barcode; 
       next = null; 
       item=data;
       price=pr;
   }
public Node(T barcode){
       key = barcode; 
       next = null; 
       
   }
public Node(T datE,T pr){
     
       next = null; 
       date=datE;
       price=pr;
   }
public Node(T datE,T pr,T tim,Node n){
     
       next = null; 
       date=datE;
       price=pr;
       time=tim;
   }
public Node(T data,T barcode,T pr,T dat){
       key = barcode; 
       next = null; 
       item=data;
       price=pr;
       date=dat;
   }
public Node(T data,T barcode,T pr,T dat,T TIME){
       key = barcode; 
       next = null; 
       item=data;
       price=pr;
       date=dat;
       time=TIME;
   }


 public Node(T d,T PR,T ke,Node n,T DAT,T TI)
    {
        item = d;
        next = n;
        price=PR;
        key=ke;
        date=DAT;
        time=TI;
    }
 public Node(T d,T PR,T ke,Node n,T Dat)
    {
        item = d;
        next = n;
        price=PR;
        key=ke;
        date=Dat;
    }

  public T getKey(){
   return key; 
   }
   public void setKey(T ke){
   key=ke;
   }
     public T getDate(){
   return date; 
   }
   public void setDate(T ke){
   date=ke;
   }
     public T getTime(){
   return time; 
   }
   public void setTime(T ke){
   time=ke;
   }
     public T getPrice(){
   return price; 
   }
   public void setPrice(T ke){
   price=ke;
   }
     public T getItem(){
   return item; 
   }
   public void setItem(T ke){
   item=ke;
   }
 public Node getnext()

{
 return next;

}
 public void setnext(Node temp)

{
 next = temp;

}
}
