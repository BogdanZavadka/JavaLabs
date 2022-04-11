package iot.PetShop.manager;

import iot.PetShop.models.AnimalInfo;

import java.util.List;

public interface InterfaceAnimalManager {
    void addAnimals(List<AnimalInfo> animals);
    void sellAnimal(AnimalInfo animalInfo);
    List<String> searchByType(String type);
    List<String> sortByPrice(boolean sortByDecreasing);
    List<String> sortByFeedType(boolean sortByDecreasing);
    List<String> sortByDailyAmountOfFeed(boolean sortByDecreasing);
}
