/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adtfraction;

/**
 *
 * @author Upeksha
 */
public class Main {
    public static void main(String[] args) {
        ADTFraction adt = new ADTFraction(2, 3);
        ADTFraction adt2 = new ADTFraction(4, 12);
        ADTFraction result = adt.times(adt2);
        result.display();
        
        result.refine();
        result.display();
        
    }
    
}
