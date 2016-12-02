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
class edge {
    int dest;
    double weight;
    
    edge (int d, double w){
        this.dest=d;
        this.weight=w;
    }
    
    public String toString (){
        return this.dest +"("+this.weight+")";
    }
}
