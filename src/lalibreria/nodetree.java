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
public class nodetree <T> {
    int data;
    nodetree left;
    nodetree right;

    public nodetree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
}
