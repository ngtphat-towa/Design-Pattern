package Chapter_03_DECORATOR.StarBuzz.Beverages;

public abstract class Beverage {

    protected String description = "Unknown Beverage";
    protected Size drinkSize = Size.TALL;

    public Size getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(Size drinkSize) {

        this.drinkSize = drinkSize;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}