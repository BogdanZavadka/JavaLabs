package iot.PetShop;

import iot.PetShop.manager.AnimalManager;
import iot.PetShop.manager.PetSeller;
import iot.PetShop.models.AnimalInfo;
import iot.PetShop.models.AnimalSize;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        AnimalInfo animalInfo = new AnimalInfo();
        AnimalSize animalSize = new AnimalSize();
        PetSeller petSeller = new PetSeller( );
    }
}
