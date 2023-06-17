package Chapter_09_ITERATOR_COMPOSITE.COMPOSITE.JavaImp.CafeMenu;

import Chapter_09_ITERATOR_COMPOSITE.COMPOSITE.JavaImp.CafeMenu.Menu.MenuComponent;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
