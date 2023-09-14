package com.company;

public class Father extends GrandFather {

    private String nameOfWife;
    private String colorOfHair;

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public Father(String name, int age, EnumProfession profession, String hobby) {
        super(name, age, profession, hobby);

    }

    public Father(String name, int age, EnumProfession profession, String hobby, String nameOfWife, String colorOfHair) {
        super(name, age, profession,hobby);
        this.nameOfWife = nameOfWife;
        this.colorOfHair = colorOfHair;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" nameOfWife "+nameOfWife+" profession "+getProfession()+" hobby "+getHobby()+" colorOfHair "+colorOfHair;
    }
}
