package databinding.pjozsef.github.com.databindingdemo.di.activity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import databinding.pjozsef.github.com.databindingdemo.ui.MainActivity;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, GeneralModule.class})
    abstract MainActivity bindMainActivity();
}