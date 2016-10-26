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
public class deque <T> {
    
    private nodedoublelist first;
    private nodedoublelist last;
    private int size;
    

    public deque() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }    
    
    public Object getfirst() {
        return first.getdata();
    }    
    public Object getlast(){
        return last.getdata();
    }  
    public int getsize(){
        return size;
    }
    public void setfirst(nodedoublelist first) {
        this.first = first;
    }
    public void setlast(nodedoublelist last) {
        this.last = last;
    }
    public void setsize(int size) {
        this.size = size;
    }
    public void insertfirst(T data){        
        nodedoublelist node = new nodedoublelist (data); 
        if (isempty()) { 
            this.first = node;
            this.last = node;
            ++size;
        } else { 
            node.setnext(first); 
            first.setprev(node); 
            first = node; 
            ++size;
        } 
    }
    
    
    public void insertlast(T data){        
        nodedoublelist node = new nodedoublelist (data); 
        
        if (isempty()) { 
            this.first = node;
            this.last = node;
            ++size;
        } else {
            node.setprev(last); 
            last.setnext(node); 
            last = node; 
            ++size;
        } 
    }
    /**
     * Método para mostrar la lista.
     */
    public void showlist () {
        if (!isempty()) { 
            nodedoublelist aux; 
            aux = first; 
            System.out.print("=>"); 
            while(aux != null){ 
                System.out.print("[" + aux.getdata() + "]=>");
                   
                aux = aux.getnext();
                    
            } 
            System.out.println(); 
        } else { 
            System.out.println("la lista esta vacia"); 
        } 
    }    
    public void deletefirst(){        
        first = first.getnext();
        first.setprev(null); 
        --size; 
    }    
    public void deletelast(){                
        last = last.getprev();
            
        last.setnext(null);
        --size; 
    }    
      
    public boolean isempty(){
        return first == null && last == null && size == 0;
    }    
    public void elist(){
        first = null;
        last = null;
        size = 0;
    }    
    
}
