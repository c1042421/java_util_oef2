/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

import java.lang.Math;


/**
 *
 * @author c1042421
 */
public class RandomGenerator {
    private int kleinste;
    private int aantal;

    public RandomGenerator() {
        this.kleinste = 0;
        this.aantal = 1;
    }

    public RandomGenerator(int kleinste, int aantal) {
        this.kleinste = kleinste;
        this.aantal = aantal;
    }
    
    public int getRandom() {
        return (int) (aantal * Math.random() + kleinste);
    }

    @Override
    public String toString() {
        return getRandom().toString(); 
    }
    
    
}
