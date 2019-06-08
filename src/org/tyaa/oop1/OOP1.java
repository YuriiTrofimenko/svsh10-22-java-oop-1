/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import org.tyaa.oop1.model.Person;

/**
 *
 * @author student
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Создали экземпляр (объект) "Person"
        //и сохранили ссылку на него в переменную типа "Person"
        Person p1 = new Person();
        p1.mFirstName = "John";
        p1.mFirstName = "Vasia";
        p1.mSurnameName = "Pupkin";
        p1.mAge = 1;
        // System.out.println(p1.mFirstName);
        System.out.println(p1);
    }
    
}
