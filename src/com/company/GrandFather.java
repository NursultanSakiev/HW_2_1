package com.company;

public class GrandFather {
    private String name;
    private int age;
    private EnumProfession profession;
    private String hobby;

    public GrandFather(String name, int age, EnumProfession profession, String hobby) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EnumProfession getProfession() {
        return profession;
    }

    public String getHobby() {
        return hobby;
    }

    public String getInfo(){
        return " name "+name  +" age " +age;
    }

}
