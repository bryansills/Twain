package ninja.bryansills.twain;

import android.app.Application;

/**
 * Created by bryan on 4/11/15.
 */
public class App extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }
}
