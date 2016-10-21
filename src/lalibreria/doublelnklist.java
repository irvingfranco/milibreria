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
public class doublelnklist <T>{
    //Attributes
    nodedoublelist first;
    nodedoublelist last;
    //Methods
    //Getters
    public nodedoublelist getFirst() {
        return first;
    }
    public nodedoublelist getLast() {
        return last;
    }
    //Setters
    public void setFirst(nodedoublelist first) {
        this.first = first;
    }
    public void setLast(nodedoublelist last) {
        this.last = last;
    }
    
    public void insertFirst(T data){
        nodedoublelist node = new nodedoublelist(data); 
        if(isEmpty()){
            setFirst(node);
              
            setLast(node);
                
        } else { 
            node.setNext(first);
               
            first.setPrev(node);
               
            setFirst(node);            
               
        }
    }
   
    public void insertLast(T data){
        nodedoublelist node = new nodedoublelist(data); 
        if(isEmpty()){ 
            setFirst(node);
               
            setLast(node);
                
        } else { 
            node.setPrev(last);
              
            last.setNext(node);
                
            setLast(node);            
               
        }
    }
    
    private boolean isEmpty(){
        return first == null && last == null;
    }
    
    public nodedoublelist searchNode(T data){
        nodedoublelist t;
        if (isEmpty()){ 
            System.out.println("La lista está vacía."); 
            return null;
        } else { 
            t = first; 
            while (!t.getData().equals(data) && t != last){
               
                t = t.getNext();
                    
            } 
            if (t.getData().equals(data)){
              
                System.out.println("El nodo solicitado si se encuentra dentro de la lista."); 
                return t;
            } else { 
                System.out.println("El nodo no se encuentra dentro de la lista."); 
                return null;
            }
         
        }
    }
   
     public boolean eNode(T data){
        nodedoublelist t = searchNode(data);
        if (t == null) {
            System.out.println("No se encontró el nodo."); 
            return false;
        } else {
            if (t == first) {
               
                    deleteFirst(); 
            } else if (t == last) {
                deleteLast(); 
            } else {
                t.getPrev().setNext(t.getNext());
                   
                t.getNext().setPrev(t.getPrev());
                   
            } return true;
        }
    }
    
    public void deleteFirst(){
       
        setFirst(first.getNext());
            
        first.setPrev(null);
            
    }
  
    public void deleteLast(){
        
        setLast(last.getPrev());
            
        last.setNext(null);

    }
 
    public void showList(){
        if (!isEmpty()){ 
            nodedoublelist t; 
            t = first; 
            System.out.print("☠<=>"); 
            while(t != null){
                System.out.print("[|"+t.getData()+"|]<=>");
                   
                t = t.getNext();
                   
            } 
            System.out.println("☠"); 
        } else { //
            System.out.println("La lista está vacía"); 
        } 
    }
    
    public void showListRever(){
        if (!isEmpty()){ 
            nodedoublelist t; 
            t = (nodedoublelist) last; 
            System.out.print("☠<=>"); 
            while(t != null){ 
                System.out.print("[|"+t.getData()+"|]<=>");
                   
                t = t.getPrev();
                  
            }
            System.out.println("☠");
        } else { 
            System.out.println("La lista está vacía");
        } 
    }
}
