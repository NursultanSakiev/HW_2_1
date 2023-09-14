package com.company;

import com.company.EnumProfession;
import com.company.Father;
import com.company.Hobby;

public final class Son extends Father {


      public Son(String name, int age, EnumProfession profession, String hobby) {
          super(name, age, profession, hobby);
      }

      public Son(String name, int age, EnumProfession profession, String hobby, String nameOfWife, String colorOfHair) {
          super(name, age, profession, colorOfHair, nameOfWife, colorOfHair);
      }

      @Override
      public void makeVoice(String voice) {
          super.makeVoice(voice);
      }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}

