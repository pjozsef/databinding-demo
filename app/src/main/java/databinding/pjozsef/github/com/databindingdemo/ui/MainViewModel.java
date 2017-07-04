package databinding.pjozsef.github.com.databindingdemo.ui;

import android.databinding.ObservableField;

import java.util.Random;

public class MainViewModel {
    public String first;
    public String second;
    public String third;
    public ObservableField<String> random;
    public String url;

    private Random rnd;


    public MainViewModel(String first, String second, String third, String random, String url) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.random = new ObservableField<>(random);
        this.url = url;

        this.rnd = new Random();
    }

    public void onRandom(){
        this.random.set(String.valueOf(rnd.nextInt()));
    }
}
