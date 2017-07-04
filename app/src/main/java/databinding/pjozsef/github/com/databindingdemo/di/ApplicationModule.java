package databinding.pjozsef.github.com.databindingdemo.di;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import databinding.pjozsef.github.com.databindingdemo.App;
import databinding.pjozsef.github.com.databindingdemo.di.annotation.ApplicationContext;

@Module
public class ApplicationModule {

    @Provides
    @ApplicationContext
    Context provideContext(App application) {
        return application;
    }

    @Provides
    @Named("hello")
    String provideHelloString() {
        return "Hello, Dagger!";
    }
}
