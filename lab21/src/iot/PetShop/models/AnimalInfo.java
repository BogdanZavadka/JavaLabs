package iot.PetShop.models;

public class AnimalInfo extends AnimalSize {
    String animalType;
    String animalName;
    int animalAgeInMonth;
    String feedType;
    double dailyAmountOfFeedInGrams;
    double priceInUAH;
    AnimalSize animalSize;

    public AnimalInfo(String animalType, String animalName, int animalAgeInMonth, String feedType, double dailyAmountOfFeedInGrams, double priceInUAH, double lengthInCm, double widthInCm, double weightInKg) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAgeInMonth = animalAgeInMonth;
        this.feedType = feedType;
        this.dailyAmountOfFeedInGrams = dailyAmountOfFeedInGrams;
        this.priceInUAH = priceInUAH;
        this.lengthInCm = lengthInCm;
        this.widthInCm = widthInCm;
        this.weightInKg = weightInKg;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getAnimalAgeInMonth() {
        return animalAgeInMonth;
    }

    public String getFeedType() {
        return feedType;
    }

    public double getDailyAmountOfFeedInGrams() {
        return dailyAmountOfFeedInGrams;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }


    public String getAnimalName() {
        return animalName;
    }

    public boolean equals(AnimalInfo animalInfo){
        boolean bool1 = this.getAnimalName() == animalInfo.getAnimalName();
        boolean bool2 = this.getAnimalType() == animalInfo.getAnimalType();
        boolean bool3 = this.getAnimalAgeInMonth() == animalInfo.getAnimalAgeInMonth();
        boolean bool4 = this.getPriceInUAH() == animalInfo.getPriceInUAH();
        boolean bool5 = this.getLengthInCm() == animalInfo.animalSize.getLengthInCm();
        boolean bool6 = this.getWeightInGrams() == animalInfo.animalSize.getWeightInGrams();
        boolean bool7 = this.getWidthInCm() == animalInfo.animalSize.getWidthInCm();
        if (bool1 || bool2 || bool3 || bool4 || bool5 || bool6 || bool7){
            return true;
        }else return false;
    }
}
