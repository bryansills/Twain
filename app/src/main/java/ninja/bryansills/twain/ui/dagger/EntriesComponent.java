package ninja.bryansills.twain.ui.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ninja.bryansills.twain.ActivityScope;
import ninja.bryansills.twain.AppComponent;
import ninja.bryansills.twain.ui.fragments.EntriesFragment;
import ninja.bryansills.twain.ui.presenter.EntriesPresenter;

/**
 * Created by bryan on 4/15/15.
 */
@ActivityScope
@Component(
    dependencies = AppComponent.class,
    modules = EntriesModule.class
)
public interface EntriesComponent {

    void inject(EntriesFragment fragment);

    EntriesPresenter getEntriesPresenter();
}
