/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Upeksha
 */
public class Main {
    public static void main(String[] args) {
//        Stack s = new Stack(5);
//        s.push(30);
//        s.push(20);
//        try {
//            s.display();
//            s.pop();
//            s.display();
//        } catch (MyStackEmptyException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        s.push(55);
//        s.push(10);
//        try {
//            s.display();
//            System.out.println(s.peek());
//        } catch (MyStackEmptyException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        convertADecimalToBinari(100);
        
    }
    
    public static void convertADecimalToBinari(int decimal) {
        int temp = decimal;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 2;
        }
        Stack stk = new Stack(count);
        temp = decimal;
        while (temp != 0) {
            int bit = temp % 2;
            stk.push(bit);
            temp = temp / 2;
        }
        // display the binary number
        while (!stk.isEmpty()) {
            try {
                System.out.print(stk.pop());
            } catch (MyStackEmptyException ex) {
                System.out.println(ex);
            }
        }
    }
}
