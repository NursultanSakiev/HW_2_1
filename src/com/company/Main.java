package com.company;

public class Main {

    public static void main(String[] args) {
       /// b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
        //c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
        //d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
        //e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
        //f)  В классе 3-го уровня перезаписать один из методов родителя
        //g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
        //S
        Father father=new Father("Japar",50,EnumProfession.ENGINEER,"Walk");
        father.makeVoice("i am dad");
        System.out.println(father.getInfo());
        System.out.println("------------------");

        Father father1=new Father("Japar",59,EnumProfession.PENSIONER,"watch TV","Gulnara","Black");

        System.out.println(father1.getInfo());

        System.out.println("----------------------------");

        Son son=new Son("Nursultan",23,EnumProfession.STUDENT,"play football");
        son.makeVoice("I am Son");


        Son son1=new Son("Arslan",27,EnumProfession.STUDENT,"Draw","Nuraiym","Black");
    }
}
