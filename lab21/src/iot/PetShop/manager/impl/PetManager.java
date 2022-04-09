package iot.PetShop.manager.impl;

import iot.PetShop.manager.InterfaceAnimalManager;
import iot.PetShop.models.AnimalInfo;

import java.util.List;

public class PetManager implements InterfaceAnimalManager {

    private List<AnimalInfo> allAnimals;

    @Override
    public void addAnimal(AnimalInfo animalInfo) {

    }

    @Override
    public void sellPet(AnimalInfo animalInfo) {

    }

    @Override
    public void printSortedAnimals(List<AnimalInfo> listOfAnimals) {

    }

    @Override
    public List<AnimalInfo> searchByType(List<AnimalInfo> animals) {
        return null;
    }

    @Override
    public List<AnimalInfo> sortByPrice(List<AnimalInfo> animals, boolean sortByDecreasing) {
        return null;
    }

    @Override
    public List<AnimalInfo> sortByFeedType(List<AnimalInfo> animals, boolean sortByDecreasing) {
        return null;
    }

    @Override
    public List<AnimalInfo> sortByDailyAmountOfFeed(List<AnimalInfo> animals, boolean sortByDecreasing) {
        return null;
    }
}
