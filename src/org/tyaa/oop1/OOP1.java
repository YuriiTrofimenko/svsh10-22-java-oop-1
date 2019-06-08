/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.tyaa.oop1.model.Person;

/**
 *
 * @author student
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) /*throws Exception */{
        
        //Создали экземпляр (объект) "Person"
        //и сохранили ссылку на него в переменную типа "Person"
        Person p1 = new Person();
        //p1.mFirstName = "John";
        // p1.mFirstName = "Vasia";
        //p1.mSurnameName = "Connor";
        System.out.println("Input person's age: ");
        Scanner sc = new Scanner(System.in);
        try {
            //p1.mAge = -10;
            p1.setAge(sc.nextInt());
        } 
        catch (InputMismatchException ex) {
            System.err.println("Error: Input Mismatch with Expected Type");
        }
        catch (Exception ex) {
            if (ex.getMessage() != null) {
                System.err.println(ex.getMessage());
            }
        }
        
        // System.out.println(p1.mFirstName);
        // System.out.println(p1);
        //System.out.println(p1.mAge);
        
        //v1
        //System.out.println(p1.getAge());
        
        //v2
        int age = p1.getAge();
        
        switch (age) {
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            default:
                System.out.println("Unknown age");
        }
        System.out.println("Input person's name: ");
        try {
            //p1.mAge = -10;
            p1.setFirstName(sc.next());
        }
        
        
        catch (InputMismatchException ex) {
            System.err.println("Error: Input Mismatch with Expected Type");
        }
        catch (Exception ex) {
            if (ex.getMessage() != null) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.println("Input person's surname: ");
        try {
            //p1.mAge = -10;
            p1.setSurnameName(sc.next());
        }catch (InputMismatchException ex) {
            System.err.println("Error: Input Mismatch with Expected Type");
        }
        catch (Exception ex) {
            if (ex.getMessage() != null) {
                System.err.println(ex.getMessage());
            }    
        }
        System.out.println(p1);
    }
}
       
        //String firstname = 

