package Chapter_03_DECORATOR.StarBuzz.Beverages;

public abstract class DrinkSize {
    protected Size sizeName;

    public Size getSizeName() {
        return sizeName;
    }

    public void setSizeName(Size sizeName) {
        this.sizeName = sizeName;
    }

    public static double getCostBySize(Beverage beverage) {
        double cost = beverage.cost();
        Size drinkSize = beverage.getDrinkSize();
        switch (drinkSize) {
            case DEMI:
                cost += .05;
                break;
            case GRANDE:
                cost += .10;
                break;
            case SHORT:
                cost += .15;
                break;
            case TALL:
                cost += .20;
                break;
            case TRENTA:
                cost += .25;
                break;
            case VENTI:
                cost += .30;
                break;
            default:
                break;
        }
        return cost;
    }
}
