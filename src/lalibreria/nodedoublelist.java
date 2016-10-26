package lalibreria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casa
 * @param <T>
 */
public class nodedoublelist<T> {
//Attibutes
    T data;
    nodedoublelist next;
    nodedoublelist prev;
    
    public nodedoublelist(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public nodedoublelist(){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public T getdata(){
        return this.data;
    }
    public nodedoublelist getnext() {
        return next;
    }
    public nodedoublelist getprev() {
        return prev;
    }
    public void setdata(T d){
        this.data = d;
    }
    public void setnext(nodedoublelist next) {
        this.next = next;
    }
    public void setprev(nodedoublelist prev) {
        this.prev = prev;
    }

}
