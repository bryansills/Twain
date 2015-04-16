package ninja.bryansills.twain.ui.presenter;

import java.util.ArrayList;
import java.util.List;

import ninja.bryansills.twain.model.Entry;

/**
 * Created by bryan on 4/15/15.
 */
public class EntriesPresenterImpl implements EntriesPresenter {
    @Override
    public List<Entry> onCreateView() {
        List<Entry> items = new ArrayList<Entry>();
        for (int i = 1; i <= 100; i++) {
            items.add(new Entry("Item " + i, i));
        }
        return items;
    }
}
