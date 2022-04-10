package iot.PetShop.manager;

import iot.PetShop.models.AnimalInfo;

import java.util.List;

public interface InterfaceAnimalManager {
    void addAnimals(List<AnimalInfo> animals);
    void sellAnimal(AnimalInfo animalInfo);
    List<AnimalInfo> searchByType(String type);
    List<AnimalInfo> sortByPrice(float price, boolean sortByDecreasing);
    List<AnimalInfo> sortByFeedType(String feedType, boolean sortByDecreasing);
    List<AnimalInfo> sortByDailyAmountOfFeed(float dailyAmountOfFeed, boolean sortByDecreasing);
}
