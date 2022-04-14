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
    public List<String> searchByType(String type) {
        List<String> oneTypeAnimalsNames = new LinkedList<String>();
        allAnimals.forEach(animal -> {
            if (Objects.equals(animal.getAnimalType(), type))
                oneTypeAnimalsNames.add(animal.getAnimalName());
        });
        return oneTypeAnimalsNames;
    }

    @Override
    public List<String> sortByPrice(boolean sortByDecreasing) {
        List<AnimalInfo> sortedByPriceClasses = allAnimals;
        List<String> sortedByPriceNames = new LinkedList<String>();
        Collections.sort(sortedByPriceClasses, Comparator.comparing(AnimalInfo::getPriceInUAH));
        sortedByPriceClasses.forEach(animal -> {
            sortedByPriceNames.add(animal.getAnimalName());
        });
        if (sortByDecreasing)
            Collections.reverse(sortedByPriceNames);
        return sortedByPriceNames;
    }

    @Override
    public List<String> sortByFeedType(boolean sortByDecreasing) {
        List<AnimalInfo> sortedByFeedTypeClasses = allAnimals;
        List<String> sortedByFeedTypeNames = new LinkedList<String>();
        Collections.sort(sortedByFeedTypeClasses, Comparator.comparing(AnimalInfo::getFeedType));
        sortedByFeedTypeClasses.forEach(animal -> {
            sortedByFeedTypeNames.add(animal.getAnimalName());
        });
        if (sortByDecreasing)
            Collections.reverse(sortedByFeedTypeNames);
        return sortedByFeedTypeNames;
    }

    @Override
    public List<String> sortByDailyAmountOfFeed(boolean sortByDecreasing) {
        List<AnimalInfo> sortedByByDailyAmountOfFeedClasses = allAnimals;
        List<String> sortedByByDailyAmountOfFeedNames = new LinkedList<String>();
        Collections.sort(sortedByByDailyAmountOfFeedClasses, Comparator.comparing(AnimalInfo::getDailyAmountOfFeedInGrams));

        sortedByByDailyAmountOfFeedClasses.forEach(animal -> {
            sortedByByDailyAmountOfFeedNames.add(animal.getAnimalName());
        });
        if (sortByDecreasing)
            Collections.reverse(sortedByByDailyAmountOfFeedNames);
        return sortedByByDailyAmountOfFeedNames;
    }
}
