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
public class dgraph extends graph {
    int vertices, edges;
    protected listp<edge> arr[];
    
    public dgraph (int v){
        this.vertices=v+1;
        this.edges=0;
        arr = new listp[this.vertices];
        for (int i=1;i<this.vertices;i++){
            arr[i]=new listp <>();
        }
    } 

    @Override
    public int nEdges() {
        return this.edges;
    }

    @Override
    public int nVertices() {
        return this.vertices;
    }

    @Override
    public boolean isEdge(int i, int j) {
       listp <edge> lista = this.arr[i];
       for (lista.setFirst();!lista.isLast();lista.keepMoving()){
           if(lista.getMove().dest==j) return true;
       }
       return false;
    }

    @Override
    public double getEdgeW(int i, int j) { //Devuelve el peso de un edge(vertice)
        listp<edge> lista = this.arr[i];
        for (lista.setFirst();!lista.isLast();lista.keepMoving()){
            if(lista.getMove().dest==j) return lista.getMove().weight;
        }
        return 0.0;
    }

    @Override
    public void insertEdge(int i, int j) {
        insertEdge(i,j,0);
    }

    @Override
    public void insertEdge(int i, int j, double w) {
        if (!isEdge(i,j)){
            this.arr[i].insert(new edge(j,w));
            this.edges++;
        }
    }

    @Override
    public listp<edge> adjacentTo(int i) {
        return this.arr[i];  
    }
}
