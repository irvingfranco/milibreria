/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalibreria;

/**
 *
 * @author casa
 */
public class binarytree  {
    nodetree root;
    int height;
    int elements;

    public binarytree() {
        this.root = null;
        this.height = -1;
        this.elements = 0;
    }
   public boolean isempty(nodetree root){
    return root.left == null  &&  root.right == null;
   }
   
    public void insert(int data, nodetree root){
        nodetree  node = new nodetree(data);
        //si esta vacio
        if(isempty(root)){
            this.root = node;
            this.height++;
            
        }else{//si no esta avcio
            if(this.root.data < node.data){
                if(this.root.left != null){
                    this.root.left = node;
                }else{//si tiene un elemento a la izquiera
                   //buscara por la izquierda hasta encontrar un espacio
                    insert(data,root.left);
                }
            }else{//si no es mayor que raiz
                if(root.right ==null){//caso base
                    root.right = node;
                }else{// si tiene un elemento a la derecha buscara por la derecha hasta encontrar un espacio
                    //buscara por la derecha hasta 
                    insert(data, root.right);
                    
                }
            }
            
        }
        this.elements++;
    } 
}
