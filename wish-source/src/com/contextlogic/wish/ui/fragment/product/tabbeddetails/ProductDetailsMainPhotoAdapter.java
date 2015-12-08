// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProductExtraImage;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductDetailsMainPhotoAdapter extends PagerAdapter
{
    public static interface PhotoAdapterCallback
    {

        public abstract void showExtraPhotos(int i);
    }


    private PhotoAdapterCallback callback;
    private Context context;
    private int imageHeight;
    private ArrayList imageUrls;
    private ArrayList imageViews;

    public ProductDetailsMainPhotoAdapter(Context context1, PhotoAdapterCallback photoadaptercallback, int i, WishProduct wishproduct)
    {
        imageUrls = new ArrayList();
        imageViews = new ArrayList();
        imageHeight = i;
        updateImages(wishproduct);
        context = context1;
        callback = photoadaptercallback;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (BorderedImageView)obj;
        imageViews.remove(obj);
        viewgroup.removeView(((View) (obj)));
    }

    public int getCount()
    {
        return imageUrls.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, final int position)
    {
        BorderedImageView borderedimageview = new BorderedImageView(context);
        borderedimageview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        borderedimageview.setImageMode(com.contextlogic.wish.ui.components.image.BorderedImageView.BorderedImageMode.Blank);
        if (TabletUtil.isTablet(context))
        {
            borderedimageview.getImageView().setRequestedImageWidthPx(RootActivity.getContentPaneWidth((Activity)context));
        } else
        {
            borderedimageview.getImageView().setRequestedImageWidthPercent(100F);
        }
        borderedimageview.getImageView().setRequestedImageHeightPx(imageHeight);
        borderedimageview.getImageView().setLoadedBackgroundColor(context.getResources().getColor(0x106000b));
        if (position != 0)
        {
            borderedimageview.getImageView().setUseDynamicScaling(true);
        }
        borderedimageview.getImageView().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        borderedimageview.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Dark);
        borderedimageview.getImageView().setImageUrl((String)imageUrls.get(position));
        borderedimageview.setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsMainPhotoAdapter this$0;
            final int val$position;

            public void onClick(View view)
            {
                callback.showExtraPhotos(position);
            }

            
            {
                this$0 = ProductDetailsMainPhotoAdapter.this;
                position = i;
                super();
            }
        });
        viewgroup.addView(borderedimageview);
        imageViews.add(borderedimageview);
        return borderedimageview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void releaseImages()
    {
        for (Iterator iterator = imageViews.iterator(); iterator.hasNext(); ((BorderedImageView)iterator.next()).getImageView().releaseImage()) { }
    }

    public void restoreImages()
    {
        for (Iterator iterator = imageViews.iterator(); iterator.hasNext(); ((BorderedImageView)iterator.next()).getImageView().restoreImage()) { }
    }

    public void updateImages(WishProduct wishproduct)
    {
        imageUrls.clear();
        imageUrls.add(wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large));
        WishProductExtraImage wishproductextraimage;
        for (wishproduct = wishproduct.getExtraPhotos().iterator(); wishproduct.hasNext(); imageUrls.add(wishproductextraimage.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large)))
        {
            wishproductextraimage = (WishProductExtraImage)wishproduct.next();
        }

    }

}
