package databinding.pjozsef.github.com.databindingdemo.di.activity;

import dagger.Module;
import dagger.Provides;

@Module
public class GeneralModule {

    @Provides
    public int provideNumber(){
        return 40;
    }
}
