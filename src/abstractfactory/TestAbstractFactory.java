/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.BobBotFactory;

/**
 *
 * @author a1152220
 */
public class TestAbstractFactory {
    public static void main(String [] args) {
        
        BobBotFactory factory = new BobBotFactory();
        factory.createBot();
        System.out.println(factory.toString());
        
    } 
}
