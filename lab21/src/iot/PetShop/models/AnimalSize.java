package iot.PetShop.models;

public class AnimalSize {
    protected double lengthInCm;
    protected double widthInCm;
    protected double weightInKg;

    public AnimalSize(double lengthInCm, double widthInCm, double weightInGrams) {
        this.lengthInCm = lengthInCm;
        this.widthInCm = widthInCm;
        this.weightInKg = weightInGrams;
    }

    public double getLengthInCm() {
        return lengthInCm;
    }

    public double getWidthInCm() {
        return widthInCm;
    }

    public double getWeightInGrams() {
        return weightInKg;
    }


    public AnimalSize(){}
}
