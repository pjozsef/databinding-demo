package databinding.pjozsef.github.com.databindingdemo.binding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import databinding.pjozsef.github.com.databindingdemo.R;

@SuppressWarnings("unused")
public class ImageViewBindingAdapter {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView img, String url) {
        if (url == null) {
            img.setImageDrawable(null);
        } else {
            Picasso.with(img.getContext())
                    .load(url)
                    .error(R.drawable.err)
                    .placeholder(R.drawable.placeholder)
                    .into(img);
        }
    }
}
