// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.contextlogic.wish.util.BitmapUtil;

// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            CachedTouchImageView, CachedImageView

public class BorderedImageView extends FrameLayout
    implements CachedImageView.Listener
{
    public static final class BorderedImageMode extends Enum
    {

        private static final BorderedImageMode $VALUES[];
        public static final BorderedImageMode Blank;

        public static BorderedImageMode valueOf(String s)
        {
            return (BorderedImageMode)Enum.valueOf(com/contextlogic/wish/ui/components/image/BorderedImageView$BorderedImageMode, s);
        }

        public static BorderedImageMode[] values()
        {
            return (BorderedImageMode[])$VALUES.clone();
        }

        static 
        {
            Blank = new BorderedImageMode("Blank", 0);
            $VALUES = (new BorderedImageMode[] {
                Blank
            });
        }

        private BorderedImageMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoadingStyle extends Enum
    {

        private static final LoadingStyle $VALUES[];
        public static final LoadingStyle Dark;
        public static final LoadingStyle Gone;
        public static final LoadingStyle Light;
        public static final LoadingStyle None;

        public static LoadingStyle valueOf(String s)
        {
            return (LoadingStyle)Enum.valueOf(com/contextlogic/wish/ui/components/image/BorderedImageView$LoadingStyle, s);
        }

        public static LoadingStyle[] values()
        {
            return (LoadingStyle[])$VALUES.clone();
        }

        static 
        {
            Dark = new LoadingStyle("Dark", 0);
            Light = new LoadingStyle("Light", 1);
            Gone = new LoadingStyle("Gone", 2);
            None = new LoadingStyle("None", 3);
            $VALUES = (new LoadingStyle[] {
                Dark, Light, Gone, None
            });
        }

        private LoadingStyle(String s, int i)
        {
            super(s, i);
        }
    }


    private TextView errorTextView;
    private BorderedImageMode imageMode;
    private CachedImageView imageView;
    private ImageView loadingImage;
    private ProgressBar loadingSpinner;
    private LoadingStyle loadingStyle;

    public BorderedImageView(Context context)
    {
        this(context, null);
    }

    public BorderedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BorderedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        android.widget.FrameLayout.LayoutParams layoutparams;
        int i;
        if (shouldSupportTouch())
        {
            imageView = new CachedTouchImageView(getContext());
        } else
        {
            imageView = new CachedImageView(getContext());
        }
        imageView.setListener(this);
        loadingStyle = LoadingStyle.None;
        addView(imageView);
        setImageMode(BorderedImageMode.Blank);
        setBackgroundColor(getResources().getColor(0x7f0c00e4));
        i = (int)TypedValue.applyDimension(1, 0.0F, getContext().getResources().getDisplayMetrics());
        setPadding(i, i, i, i);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        loadingImage = new ImageView(getContext());
        BitmapUtil.safeSetImageResource(loadingImage, 0x7f020133);
        layoutparams = new android.widget.FrameLayout.LayoutParams(i, i, 17);
        loadingImage.setLayoutParams(layoutparams);
        addView(loadingImage);
        loadingImage.setVisibility(4);
    }

    public CachedImageView getImageView()
    {
        return imageView;
    }

    public void onImageAnimationComplete()
    {
        post(new Runnable() {

            final BorderedImageView this$0;

            public void run()
            {
                imageView.setBackgroundDrawable(null);
            }

            
            {
                this$0 = BorderedImageView.this;
                super();
            }
        });
    }

    public void onImageErrored()
    {
        if (loadingStyle != LoadingStyle.None)
        {
            if (loadingSpinner != null)
            {
                loadingSpinner.setVisibility(8);
            }
            if (errorTextView != null)
            {
                errorTextView.setVisibility(0);
            }
            return;
        } else
        {
            loadingImage.setVisibility(4);
            return;
        }
    }

    public void onImageLoaded()
    {
        if (loadingStyle != LoadingStyle.None)
        {
            if (loadingSpinner != null)
            {
                loadingSpinner.setVisibility(8);
            }
            return;
        } else
        {
            loadingImage.setVisibility(4);
            return;
        }
    }

    public void onImageRequested()
    {
        if (loadingStyle == LoadingStyle.Dark || loadingStyle == LoadingStyle.Light)
        {
            if (loadingSpinner != null)
            {
                loadingSpinner.setVisibility(0);
            }
            if (errorTextView != null)
            {
                errorTextView.setVisibility(8);
            }
            return;
        }
        if (loadingStyle == LoadingStyle.Gone)
        {
            loadingImage.setVisibility(4);
            return;
        } else
        {
            loadingImage.setVisibility(0);
            return;
        }
    }

    public void onImageUnloaded()
    {
        setImageMode(imageMode);
        if (loadingStyle != LoadingStyle.None)
        {
            if (loadingSpinner != null)
            {
                loadingSpinner.setVisibility(8);
            }
            return;
        } else
        {
            loadingImage.setVisibility(4);
            return;
        }
    }

    public void setImageMode(BorderedImageMode borderedimagemode)
    {
        imageMode = borderedimagemode;
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$image$BorderedImageView$BorderedImageMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$image$BorderedImageView$BorderedImageMode = new int[BorderedImageMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$image$BorderedImageView$BorderedImageMode[BorderedImageMode.Blank.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls2..SwitchMap.com.contextlogic.wish.ui.components.image.BorderedImageView.BorderedImageMode[imageMode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            imageView.setBackgroundDrawable(null);
            break;
        }
    }

    public void setUseLoadingSpinner(LoadingStyle loadingstyle)
    {
        loadingStyle = loadingstyle;
        int i = (int)TypedValue.applyDimension(1, 50F, getResources().getDisplayMetrics());
        android.widget.FrameLayout.LayoutParams layoutparams;
        if (loadingstyle == LoadingStyle.Dark)
        {
            loadingSpinner = new ProgressBar(getContext(), null, 0x1010287);
        } else
        if (loadingstyle == LoadingStyle.Light)
        {
            loadingSpinner = new ProgressBar(getContext());
        }
        loadingSpinner = new ProgressBar(getContext(), null, 0x1010287);
        layoutparams = new android.widget.FrameLayout.LayoutParams(i, i, 17);
        loadingSpinner.setLayoutParams(layoutparams);
        loadingSpinner.setIndeterminate(true);
        addView(loadingSpinner);
        loadingSpinner.setVisibility(8);
        errorTextView = new TextView(getContext());
        errorTextView.setText(getContext().getString(0x7f060242));
        errorTextView.setTextSize(1, 13F);
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
        errorTextView.setLayoutParams(layoutparams);
        errorTextView.setVisibility(8);
        if (loadingstyle == LoadingStyle.Dark)
        {
            errorTextView.setTextColor(getResources().getColor(0x7f0c00b7));
        } else
        if (loadingstyle == LoadingStyle.Light)
        {
            errorTextView.setTextColor(getResources().getColor(0x7f0c00e8));
        }
        addView(errorTextView);
    }

    protected boolean shouldSupportTouch()
    {
        return false;
    }

}
