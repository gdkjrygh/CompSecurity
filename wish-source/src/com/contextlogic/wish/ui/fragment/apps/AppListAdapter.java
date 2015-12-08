// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCrossPromoBanner;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import java.util.ArrayList;

public class AppListAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        View actionButton;
        TextView actionButtonText;
        WishCrossPromoBanner appItem;
        int firstVisiblePosition;
        BorderedImageView image;
        TextView messageText;
        int position;
        TextView titleText;

        ItemRowHolder()
        {
        }
    }


    private ImageCacheWarmer cacheWarmer;
    private ArrayList data;
    private ListView listView;

    public AppListAdapter(Context context, ArrayList arraylist, ListView listview)
    {
        super(context, 0x7f03003e, arraylist);
        data = arraylist;
        listView = listview;
        cacheWarmer = new ImageCacheWarmer();
    }

    public int getCount()
    {
        return data.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WishCrossPromoBanner wishcrosspromobanner;
        GradientDrawable gradientdrawable;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03003e, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.titleText = (TextView)view.findViewById(0x7f0d0168);
            viewgroup.messageText = (TextView)view.findViewById(0x7f0d0169);
            viewgroup.actionButtonText = (TextView)view.findViewById(0x7f0d016b);
            viewgroup.actionButton = view.findViewById(0x7f0d016a);
            viewgroup.image = (BorderedImageView)view.findViewById(0x7f0d0167);
            ((ItemRowHolder) (viewgroup)).image.getImageView().setRequestedImageHeight(60);
            ((ItemRowHolder) (viewgroup)).image.getImageView().setRequestedImageWidth(60);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        if (((ItemRowHolder) (viewgroup)).appItem != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).image.getImageView().lockImageInCache();
        }
        wishcrosspromobanner = (WishCrossPromoBanner)data.get(i);
        viewgroup.appItem = wishcrosspromobanner;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        viewgroup.position = i;
        ((ItemRowHolder) (viewgroup)).actionButtonText.setText(wishcrosspromobanner.getActionButtonText());
        gradientdrawable = new GradientDrawable();
        gradientdrawable.setCornerRadius((int)TypedValue.applyDimension(1, 2.0F, getContext().getResources().getDisplayMetrics()));
        gradientdrawable.setColor(wishcrosspromobanner.getActionButtonColor());
        ((ItemRowHolder) (viewgroup)).actionButton.setBackgroundDrawable(gradientdrawable);
        ((ItemRowHolder) (viewgroup)).titleText.setText(wishcrosspromobanner.getTitle());
        ((ItemRowHolder) (viewgroup)).messageText.setText(wishcrosspromobanner.getMessage());
        ((ItemRowHolder) (viewgroup)).image.getImageView().setImageUrl(null);
        ((ItemRowHolder) (viewgroup)).image.getImageView().setImageBitmap(null);
        ((ItemRowHolder) (viewgroup)).image.getImageView().setImageUrl(wishcrosspromobanner.getImageUrl());
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            i = Math.min(Math.max(i, listView.getLastVisiblePosition()) + 1, getCount());
            for (int j = Math.min(i + 5, getCount()); i < j; i++)
            {
                viewgroup = (WishCrossPromoBanner)getItem(i);
                cacheWarmer.warmCache(viewgroup.getImageUrl(), 60, 60);
            }

        }
        return view;
    }

    public void pauseCacheWarming()
    {
        cacheWarmer.pause();
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
                    ((ItemRowHolder)obj).image.getImageView().releaseImage();
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
                    ((ItemRowHolder)obj).image.getImageView().restoreImage();
                }
            }

        }
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }
}
