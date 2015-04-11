package ninja.bryansills.twain;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bryan on 4/11/15.
 */
@Singleton
@Component(
    modules = {
        AppModule.class
    }
)
public interface AppComponent {
    void inject(App app);
}
