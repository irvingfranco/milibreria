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
    public nodedoublelist getfirst() {
        return first;
    }
    public nodedoublelist getlast() {
        return last;
    }
    //Setters
    public void setfirst(nodedoublelist first) {
        this.first = first;
    }
    public void setlast(nodedoublelist last) {
        this.last = last;
    }
    
    public void insertfirst(T data){
        nodedoublelist node = new nodedoublelist(data); 
        if(isempty()){
            setfirst(node);
              
            setlast(node);
                
        } else { 
            node.setnext(first);
               
            first.setprev(node);
               
            setfirst(node);            
               
        }
    }
   
    public void insertlast(T data){
        nodedoublelist node = new nodedoublelist(data); 
        if(isempty()){ 
            setfirst(node);
               
            setlast(node);
                
        } else { 
            node.setprev(last);
              
            last.setnext(node);
                
            setlast(node);            
               
        }
    }
    
    private boolean isempty(){
        return first == null && last == null;
    }
    
    public nodedoublelist searchnode(T data){
        nodedoublelist t;
        if (isempty()){ 
            System.out.println("La lista está vacía."); 
            return null;
        } else { 
            t = first; 
            while (!t.getdata().equals(data) && t != last){
               
                t = t.getnext();
                    
            } 
            if (t.getdata().equals(data)){
              
                System.out.println("El nodo solicitado si se encuentra dentro de la lista."); 
                return t;
            } else { 
                System.out.println("El nodo no se encuentra dentro de la lista."); 
                return null;
            }
         
        }
    }
   
     public boolean enode(T data){
        nodedoublelist t = searchnode(data);
        if (t == null) {
            System.out.println("No se encontró el nodo."); 
            return false;
        } else {
            if (t == first) {
               
                    deletefirst(); 
            } else if (t == last) {
                deleteLast(); 
            } else {
                t.getprev().setnext(t.getnext());
                   
                t.getnext().setprev(t.getprev());
                   
            } return true;
        }
    }
    
    public void deletefirst(){
       
        setfirst(first.getnext());
            
        first.setprev(null);
            
    }
  
    public void deleteLast(){
        
        setlast(last.getprev());
            
        last.setnext(null);

    }
 
    public void showList(){
        if (!isempty()){ 
            nodedoublelist t; 
            t = first; 
            System.out.print("☠<=>"); 
            while(t != null){
                System.out.print("[|"+t.getdata()+"|]<=>");
                   
                t = t.getnext();
                   
            } 
            System.out.println("☠"); 
        } else { //
            System.out.println("La lista está vacía"); 
        } 
    }
    
    public void showlistrever(){
        if (!isempty()){ 
            nodedoublelist t; 
            t = (nodedoublelist) last; 
            System.out.print("☠<=>"); 
            while(t != null){ 
                System.out.print("[|"+t.getdata()+"|]<=>");
                   
                t = t.getprev();
                  
            }
            System.out.println("☠");
        } else { 
            System.out.println("La lista está vacía");
        } 
    }
}
