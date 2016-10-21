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
public class stackclass <T> {
  
    private node top;
    private int size;
    
    
    public stackclass() {
        this.top = null;
        this.size = 0;
    }
   
    public node getTop(){
        return this.top;
    }
  
    public int getSize(){
        return this.size;
    }

    public void setTop(node top) {
        this.top = top;
    }
    public void setSize(int size) {
        this.size = size;
    }    
    public boolean isEmpty(){
        return this.top == null;
    }
   
    public void push (T data) {
        node node = new node (data);
        if (isEmpty()) { 
            setTop(node);
              
        } else { 
            node.setNext(top);
            setTop(node);
                
        } ++size;
    }
    
    public void pop() {
        if (!isEmpty()) {
            setTop(top.getNext());
               
            --size;
        } else { 
            System.out.println("La pila está vacía");
        }
    }
   
    public void empty(){
        setTop(null);
           
        setSize(0);
            
    }
    
    public void showStack() {
        if (!isEmpty()){
            node t = top;
            do {
                System.out.println(t.getData());
                System.out.println("|");
                System.out.println("V");
                t = t.getNext();
            } while(t != null);
            System.out.println("☠");
        }
    }
}
