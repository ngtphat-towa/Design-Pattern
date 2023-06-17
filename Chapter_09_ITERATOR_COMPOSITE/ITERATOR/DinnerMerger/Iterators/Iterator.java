package Chapter_09_ITERATOR_COMPOSITE.ITERATOR.DinnerMerger.Iterators;

import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.DinnerMerger.Menu.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
