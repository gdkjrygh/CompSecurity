// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

public class SignupFreeGiftGridCellView extends StaggeredGridCellView
{
    private class ImageSettingRunnable
        implements Runnable
    {

        private boolean cancelled;
        private String imageUrl;
        final SignupFreeGiftGridCellView this$0;

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
            this$0 = SignupFreeGiftGridCellView.this;
            super();
            imageUrl = s;
            cancelled = false;
        }
    }


    private UnifiedFontButton buyButton;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView imageView;
    private View priceLayout;
    private TextView priceLayoutMainText;
    private TextView priceLayoutSubText;

    public SignupFreeGiftGridCellView(Context context)
    {
        super(context);
    }

    protected ViewGroup createContentView(Context context)
    {
        return new RelativeLayout(context);
    }

    public String getImageUrl(WishProduct wishproduct, int i)
    {
        if (i > 350)
        {
            return wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large);
        } else
        {
            return wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium);
        }
    }

    public BorderedImageView getImageView()
    {
        return imageView;
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300a5, getContentView());
        imageView = (BorderedImageView)view.findViewById(0x7f0d034b);
        priceLayout = view.findViewById(0x7f0d034a);
        priceLayoutMainText = (TextView)view.findViewById(0x7f0d034d);
        priceLayoutSubText = (TextView)view.findViewById(0x7f0d034c);
        priceLayoutSubText.setPaintFlags(priceLayoutSubText.getPaintFlags() | 0x10);
        buyButton = (UnifiedFontButton)view.findViewById(0x7f0d034e);
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

    public void setPrices(WishProduct wishproduct)
    {
        WishLocalizedCurrencyValue wishlocalizedcurrencyvalue = wishproduct.getSignupGiftPrice();
        wishproduct = wishproduct.getVariationRetailPrice(wishproduct.getCommerceDefaultVariationId());
        if (wishlocalizedcurrencyvalue.getValue() > 0.0D)
        {
            priceLayoutMainText.setText(wishlocalizedcurrencyvalue.toFormattedString());
        } else
        {
            priceLayoutMainText.setText(getResources().getString(0x7f0601e1));
        }
        if (wishproduct.getValue() > wishlocalizedcurrencyvalue.getValue())
        {
            priceLayoutSubText.setVisibility(0);
            if (wishproduct.getValue() > 0.0D)
            {
                priceLayoutSubText.setText(wishproduct.toFormattedString());
                return;
            } else
            {
                priceLayoutSubText.setText(getResources().getString(0x7f0601e1));
                return;
            }
        } else
        {
            priceLayoutSubText.setVisibility(8);
            return;
        }
    }

    public void setProduct(WishProduct wishproduct, int i, long l)
    {
        setPrices(wishproduct);
        wishproduct = getImageUrl(wishproduct, i);
        if (imageSettingRunnable != null)
        {
            removeCallbacks(imageSettingRunnable);
            imageSettingRunnable.markCancelled();
            imageSettingRunnable = null;
        }
        imageView.getImageView().setImageUrl(null);
        imageSettingRunnable = new ImageSettingRunnable(wishproduct);
        if (l > 0L)
        {
            postDelayed(imageSettingRunnable, l);
            return;
        } else
        {
            imageSettingRunnable.run();
            return;
        }
    }

    public void updateImageHeight(int i)
    {
        imageView.getImageView().setRequestedImageHeightPx(i);
    }

}
