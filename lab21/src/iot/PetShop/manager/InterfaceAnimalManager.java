package iot.PetShop.manager;

import iot.PetShop.models.AnimalInfo;

import java.util.List;

public interface InterfaceAnimalManager {
    void addAnimal(AnimalInfo animalInfo);
    void sellPet(AnimalInfo animalInfo);
    void printSortedAnimals(List<AnimalInfo> listOfAnimals);
    List<AnimalInfo> searchByType(List<AnimalInfo> animals);
    List<AnimalInfo> sortByPrice(List<AnimalInfo> animals, boolean sortByDecreasing);
    List<AnimalInfo> sortByFeedType(List<AnimalInfo> animals, boolean sortByDecreasing);
    List<AnimalInfo> sortByDailyAmountOfFeed(List<AnimalInfo> animals, boolean sortByDecreasing);
}
