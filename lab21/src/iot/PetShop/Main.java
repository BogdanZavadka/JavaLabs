package iot.PetShop;

import iot.PetShop.manager.impl.AnimalManager;
import iot.PetShop.models.AnimalInfo;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        AnimalInfo animalInfo1 = new AnimalInfo("dog", "dogName1", 12, "High-protein", 500, 2000, 100, 20, 20);
        AnimalInfo animalInfo2 = new AnimalInfo("cat", "catName1", 10, "High-protein", 200, 1500, 60, 10, 5);
        AnimalInfo animalInfo3 = new AnimalInfo("hamster", "hamsterName1", 3, "Cereal", 10, 500, 5, 3, 0.01);
        List<AnimalInfo> animalList = new LinkedList<AnimalInfo>();
        animalList.add(animalInfo1);
        animalList.add(animalInfo2);
        animalList.add(animalInfo3);
        animalManager.addAnimals(animalList);
    }
}
