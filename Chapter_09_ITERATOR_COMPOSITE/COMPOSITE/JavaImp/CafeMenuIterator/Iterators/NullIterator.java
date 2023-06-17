package Chapter_09_ITERATOR_COMPOSITE.COMPOSITE.JavaImp.CafeMenuIterator.Iterators;

import java.util.Iterator;

import Chapter_09_ITERATOR_COMPOSITE.COMPOSITE.JavaImp.CafeMenuIterator.Menu.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
