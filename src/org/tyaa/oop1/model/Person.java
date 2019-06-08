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
    
    //Составляющая (поле / переменная) класса  типа строка
    public String mFirstName;
    public String mSurnameName;
    private int mAge;
    
    //Составляющая (метод / функция) класса
    //Принимает один аргумент целого типа и записывает его в поле mAge,
    //а если полученное значение не больше 0 - выбрасывает исключение
    //Заголовок
    public void setAge(int _age) throws Exception{
       //Тело
       //Проверка, что значение аргумента больше 0
        if (_age > 0) {
            //Сохранение значения в поле объекта
            mAge = _age;
        } else {
            //Выброс исключения
            throw new Exception("Age must be greather than 0");
        }
    }
    
    //Составляющая (метод / функция) класса
    //Возвращает значение возраста из поля mAge
    public int getAge(){
        return mAge;
    }

    @Override
    public String toString() {
        return "Person{" + "mFirstName=" + mFirstName + ", mSurnameName=" + mSurnameName + ", mAge=" + mAge + '}';
    }
}
