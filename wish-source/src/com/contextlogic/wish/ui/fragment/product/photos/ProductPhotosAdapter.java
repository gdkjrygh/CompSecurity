// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.photos;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProductExtraImage;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.BorderedTouchImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductPhotosAdapter extends PagerAdapter
{

    private Context context;
    private ArrayList imageUrls;

    public ProductPhotosAdapter(Context context1, WishProduct wishproduct, String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            arraylist.add(s);
        } else
        {
            arraylist.add(wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large));
            wishproduct = wishproduct.getExtraPhotos().iterator();
            while (wishproduct.hasNext()) 
            {
                arraylist.add(((WishProductExtraImage)wishproduct.next()).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large));
            }
        }
        imageUrls = arraylist;
        context = context1;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return imageUrls.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        BorderedTouchImageView borderedtouchimageview = new BorderedTouchImageView(context);
        borderedtouchimageview.getImageView().setTouchImageViewZoomEvent(WishAnalyticsEvent.CLICK_MOBILE_ZOOM_PRODUCT_PHOTO);
        borderedtouchimageview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        borderedtouchimageview.setImageMode(com.contextlogic.wish.ui.components.image.BorderedImageView.BorderedImageMode.Blank);
        if (TabletUtil.isTablet(context))
        {
            borderedtouchimageview.getImageView().setRequestedImageWidthPx(RootActivity.getTabletModalWidth((Activity)context));
            borderedtouchimageview.getImageView().setRequestedImageHeightPx(RootActivity.getTabletModalWidth((Activity)context));
        } else
        {
            borderedtouchimageview.getImageView().setRequestedImageWidthPercent(100F);
            borderedtouchimageview.getImageView().setRequestedImageHeightPercent(100F);
        }
        borderedtouchimageview.getImageView().setLoadedBackgroundColor(context.getResources().getColor(0x7f0c0080));
        borderedtouchimageview.getImageView().setUseDynamicScaling(true);
        borderedtouchimageview.getImageView().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        borderedtouchimageview.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Light);
        borderedtouchimageview.getImageView().setImageUrl((String)imageUrls.get(i));
        viewgroup.addView(borderedtouchimageview);
        return borderedtouchimageview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
