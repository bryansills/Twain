package ninja.bryansills.twain.ui.dagger;

import dagger.Module;
import dagger.Provides;
import ninja.bryansills.twain.ui.presenter.EntriesPresenter;
import ninja.bryansills.twain.ui.presenter.EntriesPresenterImpl;

/**
 * Created by bryan on 4/15/15.
 */
@Module
public class EntriesModule {
    @Provides
    public EntriesPresenter providePresenter() {
        return new EntriesPresenterImpl();
    }
}
