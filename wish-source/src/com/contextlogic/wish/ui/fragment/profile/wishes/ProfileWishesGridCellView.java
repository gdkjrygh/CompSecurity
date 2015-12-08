// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.wishes;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.BitmapUtil;
import java.util.ArrayList;

public class ProfileWishesGridCellView extends LinearLayout
{
    private class ImageSettingRunnable
        implements Runnable
    {

        private WishUserProductBucket bucket;
        private boolean cancelled;
        private com.contextlogic.wish.api.data.WishImage.ImageSize largeSize;
        private com.contextlogic.wish.api.data.WishImage.ImageSize smallSize;
        final ProfileWishesGridCellView this$0;

        public void markCancelled()
        {
            cancelled = true;
        }

        public void run()
        {
            ArrayList arraylist;
label0:
            {
                if (!cancelled)
                {
                    arraylist = bucket.getProductPreviews();
                    if (arraylist.size() > 0)
                    {
                        mainView.getImageView().setImageUrl(((WishProduct)arraylist.get(0)).getImage().getUrlString(largeSize));
                    } else
                    {
                        mainView.getImageView().setImageUrl(null);
                    }
                    if (bucket.getProductCount() > 1 && arraylist.size() > 1)
                    {
                        secondView.getImageView().setImageUrl(((WishProduct)arraylist.get(1)).getImage().getUrlString(smallSize));
                    } else
                    {
                        secondView.getImageView().setImageUrl(null);
                    }
                    if (bucket.getProductCount() > 2 && arraylist.size() > 2)
                    {
                        thirdView.getImageView().setImageUrl(((WishProduct)arraylist.get(2)).getImage().getUrlString(smallSize));
                    } else
                    {
                        thirdView.getImageView().setImageUrl(null);
                    }
                    if (bucket.getProductCount() <= 4)
                    {
                        break label0;
                    }
                    fourthView.setVisibility(8);
                    countLabel.setVisibility(0);
                    countLabel.setText((new StringBuilder()).append("+").append(bucket.getProductCount() - 3).toString());
                }
                return;
            }
            if (bucket.getProductCount() == 4 && arraylist.size() > 3)
            {
                countLabel.setVisibility(8);
                fourthView.setVisibility(0);
                fourthView.getImageView().setImageUrl(((WishProduct)arraylist.get(3)).getImage().getUrlString(smallSize));
                return;
            } else
            {
                countLabel.setVisibility(8);
                fourthView.setVisibility(0);
                fourthView.getImageView().setImageUrl(null);
                return;
            }
        }

        public ImageSettingRunnable(WishUserProductBucket wishuserproductbucket, com.contextlogic.wish.api.data.WishImage.ImageSize imagesize, com.contextlogic.wish.api.data.WishImage.ImageSize imagesize1)
        {
            this$0 = ProfileWishesGridCellView.this;
            super();
            bucket = wishuserproductbucket;
            largeSize = imagesize;
            smallSize = imagesize1;
        }
    }


    private TextView countLabel;
    private View emptyView;
    private BorderedImageView fourthView;
    private Handler handler;
    private ImageSettingRunnable imageSettingRunnable;
    private BorderedImageView mainView;
    private View rowImages;
    private BorderedImageView secondView;
    private BorderedImageView thirdView;
    private TextView titleLabel;

    public ProfileWishesGridCellView(Context context)
    {
        super(context);
    }

    public ProfileWishesGridCellView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030093, this);
        setOrientation(1);
        setWeightSum(1.0F);
        BitmapUtil.safeSetBackgroundResource(this, 0x7f02019d);
        emptyView = view.findViewById(0x7f0d02cf);
        rowImages = view.findViewById(0x7f0d02d0);
        titleLabel = (TextView)view.findViewById(0x7f0d02cd);
        mainView = (BorderedImageView)view.findViewById(0x7f0d02ce);
        secondView = (BorderedImageView)view.findViewById(0x7f0d02d1);
        thirdView = (BorderedImageView)view.findViewById(0x7f0d02d2);
        fourthView = (BorderedImageView)view.findViewById(0x7f0d02d3);
        countLabel = (TextView)view.findViewById(0x7f0d02d4);
        handler = new Handler();
    }

    public void releaseImages()
    {
        mainView.getImageView().releaseImage();
        secondView.getImageView().releaseImage();
        thirdView.getImageView().releaseImage();
        fourthView.getImageView().releaseImage();
    }

    public void restoreImages()
    {
        mainView.getImageView().restoreImage();
        secondView.getImageView().restoreImage();
        thirdView.getImageView().restoreImage();
        fourthView.getImageView().restoreImage();
    }

    public void setBucket(WishUserProductBucket wishuserproductbucket, com.contextlogic.wish.api.data.WishImage.ImageSize imagesize, com.contextlogic.wish.api.data.WishImage.ImageSize imagesize1)
    {
        titleLabel.setText(wishuserproductbucket.getName());
        if (imageSettingRunnable != null)
        {
            removeCallbacks(imageSettingRunnable);
            imageSettingRunnable.markCancelled();
            imageSettingRunnable = null;
        }
        mainView.getImageView().setImageUrl(null);
        secondView.getImageView().setImageUrl(null);
        thirdView.getImageView().setImageUrl(null);
        fourthView.getImageView().setImageUrl(null);
        if (wishuserproductbucket.getProductCount() == 0)
        {
            emptyView.setVisibility(0);
            rowImages.setVisibility(8);
            mainView.setVisibility(8);
            titleLabel.setText(wishuserproductbucket.getName());
            return;
        } else
        {
            rowImages.setVisibility(0);
            mainView.setVisibility(0);
            fourthView.setVisibility(0);
            countLabel.setVisibility(8);
            emptyView.setVisibility(8);
            imageSettingRunnable = new ImageSettingRunnable(wishuserproductbucket, imagesize, imagesize1);
            handler.postDelayed(imageSettingRunnable, 100L);
            return;
        }
    }

    public void setImageSizes(int i, int j, int k, int l)
    {
        mainView.getImageView().setRequestedImageWidthPx(i);
        mainView.getImageView().setRequestedImageHeightPx(j);
        secondView.getImageView().setRequestedImageWidthPx(k);
        secondView.getImageView().setRequestedImageHeightPx(l);
        thirdView.getImageView().setRequestedImageWidthPx(k);
        thirdView.getImageView().setRequestedImageHeightPx(l);
        fourthView.getImageView().setRequestedImageWidthPx(k);
        fourthView.getImageView().setRequestedImageHeightPx(l);
    }





}
