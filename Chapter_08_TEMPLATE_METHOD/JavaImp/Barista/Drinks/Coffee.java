package Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks;

import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.ProcessBaverage.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
