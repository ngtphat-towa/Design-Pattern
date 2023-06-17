package Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger_Util_Iteraror.Iterators;

import java.util.Iterator;

import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger_Util_Iteraror.Menu.MenuItem;



/**
 * DinnerMenuIteractor
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

    @Override

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }



}