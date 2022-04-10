package iot.PetShop.manager.impl;

import iot.PetShop.manager.InterfaceAnimalManager;
import iot.PetShop.models.AnimalInfo;

import java.util.*;
import java.util.Comparator;

public class AnimalManager implements InterfaceAnimalManager {

    private List<AnimalInfo> allAnimals = new LinkedList<AnimalInfo>();


    @Override
    public void addAnimals(List<AnimalInfo> animals) {
        animals.forEach(animal -> {
            if (!allAnimals.contains(animal)){
                allAnimals.add(animal);
            }});
    }

    @Override
    public void sellAnimal(AnimalInfo animalInfo) {
        allAnimals.forEach(animal -> {
            if (animalInfo.equals(animal)){allAnimals.remove(animal);};
        });
    }

    @Override
    public List<AnimalInfo> searchByType(String type) {
        List<AnimalInfo> oneTypeAnimals = new LinkedList<AnimalInfo>();
        allAnimals.forEach(animal -> {
            if (animal.getAnimalType() == type)
                oneTypeAnimals.add(animal);
        });
        return oneTypeAnimals;
    }

    @Override
    public List<AnimalInfo> sortByPrice(float price, boolean sortByDecreasing) {
        List<AnimalInfo> sortedByPrice = new LinkedList<AnimalInfo>();
        sortedByPrice = allAnimals;
        if (!sortByDecreasing){
            Collections.sort(sortedByPrice, Comparator.comparing(AnimalInfo::getPriceInUAH));
        } else Collections.reverse(sortedByPrice);
        return sortedByPrice;
    }

    @Override
    public List<AnimalInfo> sortByFeedType(String feedType, boolean sortByDecreasing) {
        List<AnimalInfo> sortedByFeedType = new LinkedList<AnimalInfo>();
        sortedByFeedType = allAnimals;
        if (!sortByDecreasing){
            Collections.sort(sortedByFeedType, Comparator.comparing(AnimalInfo::getPriceInUAH));
        } else Collections.reverse(sortedByFeedType);
        return sortedByFeedType;
    }

    @Override
    public List<AnimalInfo> sortByDailyAmountOfFeed(float dailyAmountOfFeed, boolean sortByDecreasing) {
        List<AnimalInfo> sortedByByDailyAmountOfFeed = new LinkedList<AnimalInfo>();
        sortedByByDailyAmountOfFeed = allAnimals;
        if (!sortByDecreasing){
            Collections.sort(sortedByByDailyAmountOfFeed, Comparator.comparing(AnimalInfo::getPriceInUAH));
        } else Collections.reverse(sortedByByDailyAmountOfFeed);
        return sortedByByDailyAmountOfFeed;
    }
}
