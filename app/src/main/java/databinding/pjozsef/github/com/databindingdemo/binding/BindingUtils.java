package databinding.pjozsef.github.com.databindingdemo.binding;

import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.transition.TransitionManager;
import android.view.ViewGroup;

public class BindingUtils {
    public static void initAnimation(ViewDataBinding binding){
        binding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition((ViewGroup) binding.getRoot());
                }
                return super.onPreBind(binding);
            }
        });
    }

}
