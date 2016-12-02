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
public class queuep <T> {
    private node first;
    private node last;
    private node moving;
    private int size;
    
    //Constructor
    public queuep (){
        this.first = null;
        this.last = null;
        this.moving = null;
        this.size = 0;
    }
    
    public queuep (T data){
        insertLast(data);
    }
    
    //Métodos
    public void insertLast(T data){
        node <T> node = new node(data);
        if (isEmpty()){
            this.first = node;
            this.last = node;
        }else{
            node.setnext(last);
            last=node;
        }
        ++this.size;
    }
    
    public T deleteFirst(){
        node temp;
        if (!isEmpty()){
            if (size==1){
                temp=this.first;
                this.first = this.last = null;
                size=0;
            }else{
                temp=last;
                while(temp.getnext()!=first){
                    temp=temp.getnext();
                }
                first = temp;
                temp = first.getnext();
                first.setnext(null);
                --size;
            }
           return (T) temp.getdata();
        }
        return null;
    }
    
    public void setEmpty(){
        this.first = null;
        this.last = null;
        this.size=0;
    }
    
    public boolean isEmpty(){
        return first == null;
    }

    public int getSize() {
        return size;
    }   
}
