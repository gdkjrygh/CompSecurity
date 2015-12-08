// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

public class ProductFeedGridPromotionCellView extends StaggeredGridCellView
{
    private class ImageSettingRunnable
        implements Runnable
    {

        private boolean cancelled;
        private String imageUrl;
        final ProductFeedGridPromotionCellView this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void run()
        {
            if (!cancelled)
            {
                imageView.getImageView().setImageUrl(imageUrl);
            }
        }

        public ImageSettingRunnable(String s)
        {
            this$0 = ProductFeedGridPromotionCellView.this;
            super();
            imageUrl = s;
            cancelled = false;
        }
    }


    private Button actionButton;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView imageView;
    private TextView textView;

    public ProductFeedGridPromotionCellView(Context context)
    {
        super(context);
    }

    public BorderedImageView getImageView()
    {
        return imageView;
    }

    public TextView getTextView()
    {
        return textView;
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030089, getContentView());
        imageView = (BorderedImageView)view.findViewById(0x7f0d029b);
        imageView.getImageView().setForceAnimation(true);
        textView = (TextView)view.findViewById(0x7f0d029c);
        actionButton = (Button)view.findViewById(0x7f0d029d);
        imageSettingRunnable = null;
    }

    public void prepareForRecycle()
    {
        imageView.getImageView().releaseImage();
        imageView.getImageView().setImageUrl(null);
    }

    public void releaseImages()
    {
        imageView.getImageView().releaseImage();
    }

    public void restoreImages()
    {
        imageView.getImageView().restoreImage();
    }

    public void setImageWidth(int i)
    {
        imageView.getImageView().setRequestedImageWidthPx(i);
    }

    public void setPromotionItem(WishFeedPromotionItem wishfeedpromotionitem, int i, int j, long l, boolean flag)
    {
label0:
        {
            String s = wishfeedpromotionitem.getImageUrl();
            if (imageSettingRunnable != null)
            {
                removeCallbacks(imageSettingRunnable);
                imageSettingRunnable.markCancelled();
                imageSettingRunnable = null;
            }
            textView.setText(wishfeedpromotionitem.getText());
            actionButton.setText(wishfeedpromotionitem.getActionButtonText());
            imageView.getImageView().setImageUrl(null);
            if (!flag && s != null)
            {
                imageSettingRunnable = new ImageSettingRunnable(s);
                if (l <= 0L)
                {
                    break label0;
                }
                imageView.getImageView().setForceAnimation(true);
                postDelayed(imageSettingRunnable, l);
            }
            return;
        }
        imageView.getImageView().setForceAnimation(false);
        imageSettingRunnable.run();
    }

}
