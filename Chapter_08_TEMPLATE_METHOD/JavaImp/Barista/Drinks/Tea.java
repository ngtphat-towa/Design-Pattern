package Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks;

import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.ProcessBaverage.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
