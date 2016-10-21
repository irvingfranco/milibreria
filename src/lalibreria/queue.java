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
public class queue <T>{
   //Attributes
    private node first;
    private node last;
    private int size;

    //Constructor
    public queue() {
        this.first = first;
        this.last = last;
        this.size = 0;
    }
    public queue(T data) {
        insertLast(data);
    }
    
    public Object getFirst() {
        return this.first.getData();
    }
    public node getLast() {
        return this.last;
    }
    public int getSize() {
        return this.size;
    }
    
    public void setfirst(node first) {
        this.first = first;
    }
    public void setlast(node last) {
        this.last = last;
    }
    public void setsize(int size) {
        this.size = size;
    }
    //Methods
    public void insertLast(T data) {
        node node = new node(data);
        if(isEmpty()) {
            setfirst(node); 
            setlast(node); 
        } else {
            node.setNext(last);
            setlast(node); 
        } ++this.size;
    }
    public void deleteFirst(){
        node t;
        if (!isEmpty()){
           t = last;
           while (t.getNext() != first) {
               t = t.getNext(); 
           }
           t.setNext(null);
           setfirst(t);
           --this.size;
        } else {
            System.out.print("La lista está vacía");
        }
    }
    public boolean isEmpty(){
        return this.first == null;
    }
    public void setEmpty(){
        setfirst(null); 
        setlast(null); 
        setsize(0); 
    }
}
