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
        insertlast(data);
    }
    
    public Object getfirst() {
        return this.first.getdata();
    }
    public node getlast() {
        return this.last;
    }
    public int getsize() {
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
    public void insertlast(T data) {
        node node = new node(data);
        if(isempty()) {
            setfirst(node); 
            setlast(node); 
        } else {
            node.setnext(last);
            setlast(node); 
        } ++this.size;
    }
    public void deletefirst(){
        node t;
        if (!isempty()){
           t = last;
           while (t.getnext() != first) {
               t = t.getnext(); 
           }
           t.setnext(null);
           setfirst(t);
           --this.size;
        } else {
            System.out.print("La lista está vacía");
        }
    }
    public boolean isempty(){
        return this.first == null;
    }
    public void setempty(){
        setfirst(null); 
        setlast(null); 
        setsize(0); 
    }
}
