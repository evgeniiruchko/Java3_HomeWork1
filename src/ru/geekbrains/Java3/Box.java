package ru.geekbrains.Java3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight(){
        if (fruits.size() > 0){
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;
    }

    public <O extends Fruit> boolean compare(Box<O> otherBox){
        if (this.getWeight() == otherBox.getWeight()){
            return true;
        }
        return false;
     }

     public void addToBox(T fruit){
        fruits.add(fruit);
     }

     public void transfer(Box<T> otherBox){
         if (this.fruits.equals(otherBox.fruits)) {
             return;
         }
         otherBox.fruits.addAll(this.fruits);
         this.fruits.clear();
     }
}
