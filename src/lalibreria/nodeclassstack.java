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
public class nodeclassstack <T> {
//Atributes
    private T data;
    private nodeclassstack next;
    //constructor
    public nodeclassstack(T data){
        this.data = data;
        this.next = null;
    }
    public void setdata(T data){
        this.data = data;
    }
    public T getdata(){
        return this.data;
    }
    public void setnext(nodeclassstack n){
        this.next = n;
    }

    public nodeclassstack getnext() {
        return next;
    }
}
