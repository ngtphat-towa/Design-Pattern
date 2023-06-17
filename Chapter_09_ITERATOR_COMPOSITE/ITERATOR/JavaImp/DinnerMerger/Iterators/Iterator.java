package Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger.Iterators;

import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.JavaImp.DinnerMerger.Menu.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
