package Chapter_03_DECORATOR.StarBuzz.Beverages;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}