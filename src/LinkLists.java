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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException; 
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkLists <T extends Comparable> {
    protected Node head;
    protected  int count;
 public LinkLists()
 { head = null;
 }
 public LinkLists(T valu, T key,T pr){
    head = new Node((Comparable) valu,key,pr);   
    count++; 
    }
 public LinkLists(T valu, T key,T pr,T DATE){
    head = new Node((Comparable) valu,key,pr,DATE);   
    count++; 
    }
 public LinkLists(T valu, T key,T pr,T DATE,T TIME){
    head = new Node((Comparable) valu,key,pr,DATE,TIME);   
    count++; 
    }
 void clear()
 {
     head=null;
 }
 // Insert WITH   ITEM,BARCODE,PRICE,DATE
 
 boolean insertatfirstWithDate(T DATE,T key,T pr,T ite)
 {
     Node t=head;
      while(t!=null)
     {
         
         t=t.getnext();
     }
     t=head;
    if(head == null){
            head = new Node((Comparable) DATE,key,pr,ite); 
        }
        else {
    Node newNode = new Node((Comparable) DATE,key,pr,ite);
    newNode.setnext(head); 
    head= newNode; 
    
     }
        count++; 
        return true;
 }
  Node insertatendWithDate(T DATE,T ke,T pr,T item)
 {
     Node mm;
     mm=head;
     if(mm==null)
     {
         insertatfirstWithDate(DATE,ke,pr,item);
     }
     else{
     while(mm.getnext()!=null)
     {
         mm=mm.getnext();
     }
     Node t=new Node((Comparable) DATE,ke,pr,item);
     mm.setnext(t);
     }
     count ++;

 return mm;
 }
  //**************************************************************
  
  // Insert With Barcode
  
   boolean insertatfirstBarcode(T key)
 {
     Node t=head;
      while(t!=null)
     {
         
         t=t.getnext();
     }
     t=head;
    if(head == null){
            head = new Node((Comparable) key); 
        }
        else {
    Node newNode = new Node((Comparable) key);
    newNode.setnext(head); 
    head= newNode; 
    
     }
        count++; 
        return true;
 }
  Node insertatendBarcode(T ke)
 {
     Node mm;
     mm=head;
     if(mm==null)
     {
         insertatfirstBarcode(ke);
     }
     else{
     while(mm.getnext()!=null)
     {
         mm=mm.getnext();
     }
     Node t=new Node((Comparable) ke);
     mm.setnext(t);
     }
     count ++;

 return mm;
 }
  
  
  //**************************************************************
  
  // Insert with ITEM,BARCODE,PRICE
  
  boolean insertatfirst(T key,T pr,T ite)
 {
     Node t=head;
      while(t!=null)
     {
         
         t=t.getnext();
     }
     t=head;
    if(head == null){
            head = new Node((Comparable) key, pr,ite); 
        }
        else {
    Node newNode = new Node((Comparable) key, pr,ite);
    newNode.setnext(head); 
    head= newNode; 
    
     }
        count++; 
        return true;
 }
   Node insertatend(T ke,T pr,T item)
 {
     Node mm;
     mm=head;
     if(mm==null)
     {
         insertatfirst(ke, pr,item);
     }
         else{
     while(mm.getnext()!=null)
     {
         mm=mm.getnext();
     }
     Node t=new Node((Comparable) ke, pr,item);
     mm.setnext(t);}
     count ++;
     
 return mm;
 }
   
   
   //*****************************************
   // Insert With ITEM,BARCODE,PRICE,DATE,TIME
   
  boolean insertatfirstWithTime(T DATE,T TIME,T key,T pr,T ite)
 {
     Node t=head;
      while(t!=null)
     {
         
         t=t.getnext();
     }
     t=head;
    if(head == null){
            head = new Node((Comparable)DATE,TIME,key,pr,ite); 
        }
        else {
    Node newNode = new Node((Comparable)DATE,TIME,key,pr,ite);
    newNode.setnext(head); 
    head= newNode; 
    
     }
        count++; 
        return true;
 }
  Node insertatendWithTime(T DATE,T TIME,T ke,T pr, T item)
 {
     Node mm;
     mm=head;
     if(mm==null)
     {
         insertatfirstWithTime(DATE,TIME,ke,pr,item);
     }
     else{
     while(mm.getnext()!=null)
     {
         mm=mm.getnext();
     }
     Node t=new Node((Comparable) DATE,TIME,ke,pr,item);
     mm.setnext(t);}
     count ++;

 return mm;
 }
  //********************************
  //Insert WITH DATE , TIME,PRICE
  boolean insertatfirstPRICE(T DATE,T pr)
 {
     Node t=head;
      while(t!=null)
     {
         
         t=t.getnext();
     }
     t=head;
    if(head == null){
            head = new Node((Comparable) DATE,pr); 
        }
        else {
    Node newNode = new Node((Comparable) DATE,pr);
    newNode.setnext(head); 
    head= newNode; 
    
     }
        count++; 
        return true;
 }
  
   Node insertatendWithPRICE(T date,T prs)
 {
     Node mm;
     mm=head;
     if(mm==null)
     {
         insertatfirstPRICE(date,prs);
     }
     else{
     while(mm.getnext()!=null)
     {
         mm=mm.getnext();
     }
     Node t=new Node((Comparable) date,prs);
     mm.setnext(t);}
     count ++;

 return mm;
 }
  
 void SaveDatePrice()
 {
     Node mm;
     mm=head;
      FileWriter fw=null;
       
           try {
               fw = new FileWriter("sale.txt",true);
               BufferedWriter bw=new BufferedWriter(fw);
               if(mm!=null)
               {
               bw.write(""+mm.getDate());
               bw.newLine();
               }
            while(mm!=null)
             {
       
         bw.write(""+mm.getPrice());
         mm=mm.getnext();
         bw.newLine();
            }
    
           
                     bw.close();
           } catch (IOException ex) {
               Logger.getLogger(pointofsale.class.getName()).log(Level.SEVERE, null, ex);
           } 
   
 }
  void SaveTempDatePrice()
 {
     Node mm;
     mm=head;
      FileWriter fw=null;
       
           try {
               fw = new FileWriter("tempSale.txt",true);
               BufferedWriter bw=new BufferedWriter(fw);

            while(mm!=null)
             {
       
         bw.write(""+mm.getPrice());
         mm=mm.getnext();
         bw.newLine();
            }
    
           
                     bw.close();
           } catch (IOException ex) {
               Logger.getLogger(pointofsale.class.getName()).log(Level.SEVERE, null, ex);
           } 
   
 }
 void SaveBarcodeInStock()
 {
     Node mm;
     mm=head;
      FileWriter fw=null;
       
           try {
               fw = new FileWriter("InStock.txt");
               BufferedWriter bw=new BufferedWriter(fw);

            while(mm!=null)
             {
       
         bw.write(""+mm.getKey());
         mm=mm.getnext();
         bw.newLine();
            }
    
           
                     bw.close();
           } catch (IOException ex) {
               Logger.getLogger(pointofsale.class.getName()).log(Level.SEVERE, null, ex);
           } 
   
 }

 boolean CheckBar(T bar)
 {
     Node mm;
     mm=head;
     
     while(mm!=null)
     {
         if(mm.getKey()==bar)
         {
             return true;
         }
         mm=mm.getnext();
     }
     return false;
 }
   

 void insertatpositionWithDate(T item,int index,T k,T pr,T DATE)
 {
     Node mm;
     mm=head;
      while(mm!=null)
     {
         
         mm=mm.getnext();
     }
     mm=head;
     if(index==0)
     {
         insertatfirstWithDate(item,k,pr,DATE);
         count ++;
     }
     else {
     for(int i=0;i<index-1;i++)
     {
           mm=mm.getnext();
     }
     Node t=new Node((Comparable) item,k,pr,DATE);
     t.setnext(mm.getnext());
     mm.setnext(t);
     count ++;}
      
 }
 void insertatposition(T item,int index,T k,T pr)
 {
     Node mm;
     mm=head;
      while(mm!=null)
     {
         
         mm=mm.getnext();
     }
     mm=head;
     if(index==0)
     {
         insertatfirst(item,k,pr);
         count ++;
     }
     else {
     for(int i=0;i<index-1;i++)
     {
           mm=mm.getnext();
     }
     Node t=new Node((Comparable) item,k,pr);
     t.setnext(mm.getnext());
     mm.setnext(t);
     count ++;}
      
 }
  void insertatpositionWithTime(T item,int index,T k,T pr,T DATE,T TIME)
 {
     Node mm;
     mm=head;
      while(mm!=null)
     {
         
         mm=mm.getnext();
     }
     mm=head;
     if(index==0)
     {
         insertatfirstWithTime(item,k,pr,DATE,TIME);
         count ++;
     }
     else {
     for(int i=0;i<index-1;i++)
     {
           mm=mm.getnext();
     }
     Node t=new Node((Comparable) item,k,pr,DATE,TIME);
     t.setnext(mm.getnext());
     mm.setnext(t);
     count ++;}
      
 }
void DeletetheBarcode(T bar)
{
         Node mm;
     mm=head;
     if(mm.getKey()==bar)
     {
         deleteatfront();
     }
     else{
    while (mm!=null && mm.getnext().getKey() != bar)
     {

        mm=mm.getnext();
     }
    if(mm!=null)
    {
     mm.setnext(mm.getnext().getnext());
    }
    }
     count --;
      
}
 
 Node deleteatfront()
 {
     head=head.getnext();
     count --;
     return head;
     
 }
 T deleteatlast()
 {
     Node mm;
     mm=head;
     while(mm.getnext().getnext()!=null)
     {
         mm=mm.getnext();
     }
     T temp=(T) mm.getItem();
     mm.setnext(null);
     count --;
     return temp ;
 }
 boolean remove(int index)
 {
     
     Node mm;
     mm=head;
     if(index==0)
     {
         deleteatfront();
     }
     else{
     for(int i=0;i<index-1;i++)
     {
         mm=mm.getnext();
     }
     mm.setnext(mm.getnext().getnext());
     
 }
     count --;
      return true;
 }

 public T getValue(int pos){
    if(head!= null && pos <= count){
    Node temp= head; 
    for(; pos>1; pos--)
        temp = temp.getnext(); 
    return (T) temp.getItem(); 
        }
    throw new NoSuchElementException(); 
        } 

    




 
int size()
{
    return count;
}
boolean isEmpty()
{
return head==null;
}

}