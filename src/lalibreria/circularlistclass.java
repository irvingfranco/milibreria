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
    
    public node getpivot() {
        return pivot;
    }
    
    public void setpivot(node pivot) {
        this.pivot = pivot;
    }
   
    public void insert(T d){
        node node = new node(d); 
        if(!isempty()){ 
           
            node.setnext(pivot);
               
            findlast().setnext(node);
               
            setpivot(node);
                
        } else { 
            setpivot(node);
              
            node.setnext(pivot);
                
        }
    }
    
    public node findlast(){
        node t = pivot;
        do{ 
            t = t.getnext();
                
        } while (t.getnext() != pivot);
           
        return t;
    }
   
    private boolean isempty(){
        return pivot == null;
    }
  
    public node searchnode(T data){
        if (isempty()){ 
            System.out.println("La lista está vacía."); 
            return null;
        } else { 
            node t; 
            t = pivot; 
            if (getpivot().getdata().equals(data)) {
               
                return t;
            } else {
                t = t.getnext();
                    
                while (!t.getdata().equals(data) && t != pivot){
                   
                    t = t.getnext();
                       
                }
                if (t.getdata().equals(data)) {
                    
                    System.out.println("El nodo solicitado si se encuentra dentro de la lista."); 
                    return t;
                } else { 
                    System.out.println("El nodo no se encuentra dentro de la lista."); 
                    return null;
                }
            }
           
        }
    }
  
    public boolean deletenode(T data){
        node t = searchnode(data); 
        node tt = t; 
        if (t == null) { 
            System.out.println("No se encontró el nodo.");
            return false;
        } else { 
            if (t == pivot) { 
                findlast().setnext(t.getnext());
                   
                setpivot(t.getnext());
                    
                t.setnext(null);
                   
            } else { 
                do {
                    tt = tt.getnext();
                       
                } while (tt.getnext() != t);
                    
                tt.setnext(t.getnext());

                t.setnext(null);
                 
            } return true;
        }
    }
   
    public void showlist(){
        if (isempty()){ 
            System.out.println("La lista está vacía");
        } else { 
            node t; 
            t = pivot; 
            System.out.print("->"); 
            do { 
                System.out.print("["+t.getdata()+"|]->");
                t = t.getnext();
                    
            } while (t.getnext() != pivot.getnext());
                
            System.out.println("☠"); 
        }
    }
}
