package Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger.Iterators;

import java.util.ArrayList;

import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger.Menu.MenuItem;

public class ArrayListIterator implements Iterator{
    ArrayList<MenuItem> items;
	int position = 0;
 
	public ArrayListIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
