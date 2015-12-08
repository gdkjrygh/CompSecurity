// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import java.util.ArrayList;

public class WishlistMenuAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        WishUserProductBucket bucket;
        TextView emptyView;
        int firstVisiblePosition;
        int position;
        BorderedImageView rowImage;
        TextView rowText;

        ItemRowHolder()
        {
        }
    }


    private ListView listView;

    public WishlistMenuAdapter(Context context, ArrayList arraylist, ListView listview)
    {
        super(context, 0x7f0300bc, arraylist);
        listView = listview;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WishUserProductBucket wishuserproductbucket;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f0300bc, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowImage = (BorderedImageView)view.findViewById(0x7f0d03fb);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d03fc);
            viewgroup.emptyView = (TextView)view.findViewById(0x7f0d03fd);
            int j = ((RootActivity)getContext()).getCurrentRightMenuWidth();
            int k = (int)((double)j / 1.75D);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)((ItemRowHolder) (viewgroup)).rowImage.getLayoutParams();
            layoutparams.height = k;
            ((ItemRowHolder) (viewgroup)).rowImage.setLayoutParams(layoutparams);
            ((ItemRowHolder) (viewgroup)).rowImage.getImageView().setRequestedImageHeightPx(k);
            ((ItemRowHolder) (viewgroup)).rowImage.getImageView().setRequestedImageWidthPx(j);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        if (((ItemRowHolder) (viewgroup)).bucket != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).rowImage.getImageView().lockImageInCache();
        }
        wishuserproductbucket = (WishUserProductBucket)getItem(i);
        ((ItemRowHolder) (viewgroup)).rowText.setText(wishuserproductbucket.getName());
        viewgroup.position = i;
        viewgroup.bucket = wishuserproductbucket;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        ((ItemRowHolder) (viewgroup)).rowImage.getImageView().setImageUrl(null);
        if (wishuserproductbucket.getProductPreviews().size() > 0)
        {
            ((ItemRowHolder) (viewgroup)).emptyView.setVisibility(8);
            ((ItemRowHolder) (viewgroup)).rowImage.getImageView().setImageUrl(((WishProduct)wishuserproductbucket.getProductPreviews().get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
            return view;
        } else
        {
            ((ItemRowHolder) (viewgroup)).emptyView.setVisibility(0);
            return view;
        }
    }

    public void releaseImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    ((ItemRowHolder)obj).rowImage.getImageView().releaseImage();
                }
            }

        }
    }

    public void restoreImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    ((ItemRowHolder)obj).rowImage.getImageView().restoreImage();
                }
            }

        }
    }
}
