/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.model;

/**
 *
 * @author student
 */
//Класс, тип
public class Person {
    
    //Составляющая (поле) класса  типа строка
    public String mFirstName;
    public String mSurnameName;
    public int mAge;

    @Override
    public String toString() {
        return "Person{" + "mFirstName=" + mFirstName + ", mSurnameName=" + mSurnameName + ", mAge=" + mAge + '}';
    }
}
