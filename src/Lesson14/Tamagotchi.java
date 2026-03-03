package Lesson14;

public abstract class Tamagotchi {
    String name;
    String energy;

    Tamagotchi (String name, String energy){
      this.name = name;
      this.energy = energy;

    }

    String getName() {return name;}
    String getEnergy() {return energy;}

    void setName (String name) { this.name = name;}
    void setEnergy (String energy) { this.energy = energy;}

    public abstract String getFood();
    public abstract String getMood();


    @Override
    public String toString (){
        return name + " " + energy;

    }
}



