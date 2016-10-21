/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalibreria;

/**
 *
 * @author casa
 * @param <T>
 */
public class lineallist <T> {
   
    private node first; 
    private node last; 
    
    public node getFirst() {
        return first;
    }
    public node getLast() {
        return last;
    }
    //Setters
    public void setFirst(node first) {
        this.first = first;
    }
    public void setLast(node last) {
        this.last = last;
    }
    
    public void insertFirst(T n){
        node node = new node(n); 
        
        if(isEmpty()){ 
            setFirst(node); 
                
            setLast(node); 
               
        } else { 
            node.setNext(first); 
              
            setFirst(node);
             
        }
    }
   
    public void insertLast(T n){
        node node = new node(n); 
    
        if(isEmpty()){
            setFirst(node);
              
            setLast(node);
               
        } else { 
            getLast().setNext(node);
            
            setLast(node); 
             
        }
    }
    
    public void deleteFirst(){
         setFirst(first.getNext());
           
    }
  
    public void deletel(){
        node node = first; 
        node prev = null;
        while(node.next!=null){ 
            prev = node;
            node = node.next;
          
        }
        last = prev;
        prev.next = null;
    }
    
    public void deleteLast(){
        node t = first;
        while (t.getNext().getNext() != null) {
           
            t = t.getNext();
               
        }
        setLast(t);
            
        getLast().setNext(null);
            
    }
    
    private boolean isEmpty(){
        return first == null;
    }
   
    public void showList(){
        if (!isEmpty()){
            node t;
            t = first;
            System.out.print("->");
            while (t != null) {
                System.out.print("["+t.getData()+"|]->");
                   
                t = t.getNext();
                    
            }
            System.out.println("☠");
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public boolean eNode(T data){
        if (isEmpty()){ 
            System.out.println("La lista está vacía.");
            return false;
        } else { 
            node t, t2;
            t = first; 
            t2 = null;
            if(getFirst().getData().equals(data)){
                
                deleteFirst();
                return true;
            } else if(getLast().getData().equals(data)){
                
                deleteLast();
                return true;
            } else {
                while (t.getNext()!=null && t.getNext().getData()!=data && !data.equals(t.getNext().getData())/*!data.equals(t.data) && t != null && t.data != data*/) { //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                   
                    t = t.getNext(); 
                       
                }
                if (t.getNext()!=null && t.getNext().getData().equals(data)) {
                    t.setNext(t.getNext().getNext());
                    return true;
                }
                System.out.println("No se encontró en la lista.");
                return false;
               
            }
        }
    }
}

