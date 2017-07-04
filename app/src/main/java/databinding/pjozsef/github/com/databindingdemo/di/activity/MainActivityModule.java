package databinding.pjozsef.github.com.databindingdemo.di.activity;

import android.content.Context;
import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import databinding.pjozsef.github.com.databindingdemo.ui.MainActivity;
import databinding.pjozsef.github.com.databindingdemo.ui.MainViewModel;
import databinding.pjozsef.github.com.databindingdemo.di.annotation.ActivityContext;
import databinding.pjozsef.github.com.databindingdemo.di.annotation.ApplicationContext;

@Module
public class MainActivityModule {

    @Provides
    @ActivityContext
    Context provideContext(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    static MainViewModel provideMainViewModel(
            @ApplicationContext Context appCtx,
            @ActivityContext Context ctx,
            @Named("hello") String random,
            int number) {
        Log.i("Dagger", String.valueOf(appCtx.getClass()));
        Log.i("Dagger", String.valueOf(ctx.getClass()));
        Log.i("Dagger", String.valueOf(number));
        return new MainViewModel(
                "Hello!",
                "Hello ujra!",
                "csovi",
                random,
                "http://www.findcatnames.com/wp-content/uploads/2017/01/tabby-cat-names.jpg");
    }
}
