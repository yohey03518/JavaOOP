package inheritance.animal;

public abstract class Animal {
  public abstract void MakeSound();
  
  public void Breath() {
    System.out.println("Get Oxygen");
    System.out.println("Release Carbon Dioxide");
  }
}