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
public class lineallist <T> {
   
    private node first; 
    private node last; 
    
    public node getfirst() {
        return first;
    }
    public node getlast() {
        return last;
    }
    //Setters
    public void setfirst(node first) {
        this.first = first;
    }
    public void setlast(node last) {
        this.last = last;
    }
    
    public void insertfirst(T n){
        node node = new node(n); 
        
        if(isempty()){ 
            setfirst(node); 
                
            setlast(node); 
               
        } else { 
            node.setnext(first); 
              
            setfirst(node);
             
        }
    }
   
    public void insertlast(T n){
        node node = new node(n); 
    
        if(isempty()){
            setfirst(node);
              
            setlast(node);
               
        } else { 
            getlast().setnext(node);
            
            setlast(node); 
             
        }
    }
    
    public void deletefirst(){
         setfirst(first.getnext());
           
    }
  
    public void deletel(){
        node node = first; 
        node prev = null;
        while(node.next!=null){ 
            prev = node;
            node = node.next;
          
        }
        last = prev;
        prev.next = null;
    }
    
    public void deletelast(){
        node t = first;
        while (t.getnext().getnext() != null) {
           
            t = t.getnext();
               
        }
        setlast(t);
            
        getlast().setnext(null);
            
    }
    
    private boolean isempty(){
        return first == null;
    }
   
    public void showlist(){
        if (!isempty()){
            node t;
            t = first;
            System.out.print("->");
            while (t != null) {
                System.out.print("["+t.getdata()+"|]->");
                   
                t = t.getnext();
                    
            }
            System.out.println("☠");
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public boolean enode(T data){
        if (isempty()){ 
            System.out.println("La lista está vacía.");
            return false;
        } else { 
            node t, t2;
            t = first; 
            t2 = null;
            if(getfirst().getdata().equals(data)){
                
                deletefirst();
                return true;
            } else if(getlast().getdata().equals(data)){
                
                deletelast();
                return true;
            } else {
                while (t.getnext()!=null && t.getnext().getdata()!=data && !data.equals(t.getnext().getdata())) { 
                   
                    t = t.getnext(); 
                       
                }
                if (t.getnext()!=null && t.getnext().getdata().equals(data)) {
                    t.setnext(t.getnext().getnext());
                    return true;
                }
                System.out.println("No se encontró en la lista.");
                return false;
               
            }
        }
    }
}

