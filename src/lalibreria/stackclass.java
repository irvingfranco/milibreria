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
   
    public node gettop(){
        return this.top;
    }
  
    public int getsize(){
        return this.size;
    }

    public void settop(node top) {
        this.top = top;
    }
    public void setsize(int size) {
        this.size = size;
    }    
    public boolean isempty(){
        return this.top == null;
    }
   
    public void push (T data) {
        node node = new node (data);
        if (isempty()) { 
            settop(node);
              
        } else { 
            node.setnext(top);
            settop(node);
                
        } ++size;
    }
    
    public void pop() {
        if (!isempty()) {
            settop(top.getnext());
               
            --size;
        } else { 
            System.out.println("La pila está vacía");
        }
    }
   
    public void empty(){
        settop(null);
           
        setsize(0);
            
    }
    
    public void showstack() {
        if (!isempty()){
            node t = top;
            do {
                System.out.println(t.getdata());
                System.out.println("|");
                System.out.println("V");
                t = t.getnext();
            } while(t != null);
            System.out.println("☠");
        }
    }
}
