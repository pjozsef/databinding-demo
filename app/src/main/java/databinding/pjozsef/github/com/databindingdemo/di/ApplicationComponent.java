package databinding.pjozsef.github.com.databindingdemo.di;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import databinding.pjozsef.github.com.databindingdemo.App;
import databinding.pjozsef.github.com.databindingdemo.di.activity.ActivityBuilder;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        ActivityBuilder.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App application);

        ApplicationComponent build();
    }

    void inject(App app);
}
