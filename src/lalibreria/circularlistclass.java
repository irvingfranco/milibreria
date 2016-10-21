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
public class circularlistclass <T> {
 
    node pivot;
    
    
    public circularlistclass(){
        pivot = null;
    }
    
    public node getPivot() {
        return pivot;
    }
    
    public void setPivot(node pivot) {
        this.pivot = pivot;
    }
   
    public void insert(T d){
        node node = new node(d); 
        if(!isEmpty()){ 
           
            node.setNext(pivot);
               
            findLast().setNext(node);
               
            setPivot(node);
                
        } else { 
            setPivot(node);
              
            node.setNext(pivot);
                
        }
    }
    
    public node findLast(){
        node t = pivot;
        do{ 
            t = t.getNext();
                
        } while (t.getNext() != pivot);
           
        return t;
    }
   
    private boolean isEmpty(){
        return pivot == null;
    }
  
    public node searchNode(T data){
        if (isEmpty()){ 
            System.out.println("La lista está vacía."); 
            return null;
        } else { 
            node t; 
            t = pivot; 
            if (getPivot().getData().equals(data)) {
               
                return t;
            } else {
                t = t.getNext();
                    
                while (!t.getData().equals(data) && t != pivot){
                   
                    t = t.getNext();
                       
                }
                if (t.getData().equals(data)) {
                    
                    System.out.println("El nodo solicitado si se encuentra dentro de la lista."); 
                    return t;
                } else { 
                    System.out.println("El nodo no se encuentra dentro de la lista."); 
                    return null;
                }
            }
           
        }
    }
  
    public boolean deleteNode(T data){
        node t = searchNode(data); 
        node tt = t; 
        if (t == null) { 
            System.out.println("No se encontró el nodo.");
            return false;
        } else { 
            if (t == pivot) { 
                findLast().setNext(t.getNext());
                   
                setPivot(t.getNext());
                    
                t.setNext(null);
                   
            } else { 
                do {
                    tt = tt.getNext();
                       
                } while (tt.getNext() != t);
                    
                tt.setNext(t.getNext());

                t.setNext(null);
                 
            } return true;
        }
    }
   
    public void showList(){
        if (isEmpty()){ 
            System.out.println("La lista está vacía");
        } else { 
            node t; 
            t = pivot; 
            System.out.print("->"); 
            do { 
                System.out.print("["+t.getData()+"|]->");
                t = t.getNext();
                    
            } while (t.getNext() != pivot.getNext());
                
            System.out.println(/*"☠"*/); 
        }
    }
}
