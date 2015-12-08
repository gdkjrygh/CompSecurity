// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.product.photos.ProductPhotosFragment;
import com.contextlogic.wish.util.DateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RatingsAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        TextView author;
        TextView commentText;
        int firstVisiblePosition;
        int position;
        BorderedImageView profileImage;
        WishRating rating;
        BorderedImageView ratingImage;
        ImageView ratingStarFive;
        ImageView ratingStarFour;
        ImageView ratingStarOne;
        ImageView ratingStarThree;
        ImageView ratingStarTwo;
        boolean shouldAnimate;
        TextView timestamp;

        ItemRowHolder()
        {
        }
    }


    private ImageCacheWarmer cacheWarmer;
    private List data;
    private Set indexToAnimate;
    private ListView listView;

    public RatingsAdapter(Context context, ArrayList arraylist, ListView listview)
    {
        super(context, 0x7f030098, arraylist);
        indexToAnimate = new HashSet();
        data = arraylist;
        cacheWarmer = new ImageCacheWarmer();
        listView = listview;
    }

    private void showLargeImage(String s)
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_RATING_PHOTO.getValue()), null, null, null);
        ProductPhotosFragment productphotosfragment = new ProductPhotosFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ArgImageUrlString", s);
        bundle.putInt("ArgStartIndex", 0);
        productphotosfragment.setArguments(bundle);
        ((RootActivity)getContext()).setModalContentFragment(productphotosfragment, true);
    }

    public int getCount()
    {
        if (data == null)
        {
            return 0;
        } else
        {
            return data.size();
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        final WishRating rating;
        String s;
        int ai[];
        int j;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030098, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.commentText = (TextView)view.findViewById(0x7f0d02e8);
            viewgroup.author = (TextView)view.findViewById(0x7f0d02e1);
            viewgroup.profileImage = (BorderedImageView)view.findViewById(0x7f0d02e0);
            viewgroup.timestamp = (TextView)view.findViewById(0x7f0d02e2);
            viewgroup.ratingImage = (BorderedImageView)view.findViewById(0x7f0d02e9);
            ((ItemRowHolder) (viewgroup)).profileImage.getImageView().setRequestedImageHeight(45);
            ((ItemRowHolder) (viewgroup)).profileImage.getImageView().setRequestedImageWidth(45);
            ((ItemRowHolder) (viewgroup)).ratingImage.getImageView().setRequestedImageHeight(80);
            ((ItemRowHolder) (viewgroup)).ratingImage.getImageView().setRequestedImageWidth(80);
            viewgroup.ratingStarOne = (ImageView)view.findViewById(0x7f0d02e3);
            viewgroup.ratingStarTwo = (ImageView)view.findViewById(0x7f0d02e4);
            viewgroup.ratingStarThree = (ImageView)view.findViewById(0x7f0d02e5);
            viewgroup.ratingStarFour = (ImageView)view.findViewById(0x7f0d02e6);
            viewgroup.ratingStarFive = (ImageView)view.findViewById(0x7f0d02e7);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
            ((TransitionDrawable)view.getBackground()).resetTransition();
        }
        if (((ItemRowHolder) (viewgroup)).profileImage.getImageView().getImageUrl() != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).profileImage.getImageView().lockImageInCache();
            ((ItemRowHolder) (viewgroup)).ratingImage.getImageView().lockImageInCache();
        }
        viewgroup.position = i;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        rating = (TransitionDrawable)view.getBackground();
        if (indexToAnimate.remove(Integer.valueOf(i)))
        {
            rating.startTransition(0);
            rating.reverseTransition(1000);
        }
        rating = (WishRating)data.get(i);
        viewgroup.rating = rating;
        s = rating.getComment();
        if (s != null && !s.trim().equals(""))
        {
            ((ItemRowHolder) (viewgroup)).commentText.setText(rating.getComment());
            ((ItemRowHolder) (viewgroup)).commentText.setTextColor(getContext().getResources().getColor(0x7f0c00b7));
        } else
        {
            ((ItemRowHolder) (viewgroup)).commentText.setText(getContext().getResources().getString(0x7f0601bc));
            ((ItemRowHolder) (viewgroup)).commentText.setTextColor(getContext().getResources().getColor(0x7f0c008e));
        }
        ((ItemRowHolder) (viewgroup)).author.setText(rating.getAuthor().getName());
        ((ItemRowHolder) (viewgroup)).profileImage.getImageView().setImageUrl(rating.getAuthor().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
        ((ItemRowHolder) (viewgroup)).timestamp.setText(DateUtil.getFuzzyDateFromNow(rating.getTimestamp()));
        ((ItemRowHolder) (viewgroup)).ratingImage.getImageView().setImageUrl(null);
        if (rating.getImageThumbnailUrlString() != null)
        {
            ((ItemRowHolder) (viewgroup)).ratingImage.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).ratingImage.getImageView().setImageUrl(rating.getImageThumbnailUrlString());
            ((ItemRowHolder) (viewgroup)).ratingImage.setOnClickListener(new android.view.View.OnClickListener() {

                final RatingsAdapter this$0;
                final WishRating val$rating;

                public void onClick(View view1)
                {
                    showLargeImage(rating.getImageLargeUrlString());
                }

            
            {
                this$0 = RatingsAdapter.this;
                rating = wishrating;
                super();
            }
            });
        } else
        {
            ((ItemRowHolder) (viewgroup)).ratingImage.setVisibility(8);
        }
        ai = new int[5];
        j = 0;
        while (j < 5) 
        {
            if (rating.getRating() >= j + 1)
            {
                ai[j] = 0x7f0201ce;
            } else
            {
                ai[j] = 0x7f0200d8;
            }
            j++;
        }
        ((ItemRowHolder) (viewgroup)).ratingStarOne.setImageResource(ai[0]);
        ((ItemRowHolder) (viewgroup)).ratingStarTwo.setImageResource(ai[1]);
        ((ItemRowHolder) (viewgroup)).ratingStarThree.setImageResource(ai[2]);
        ((ItemRowHolder) (viewgroup)).ratingStarFour.setImageResource(ai[3]);
        ((ItemRowHolder) (viewgroup)).ratingStarFive.setImageResource(ai[4]);
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            i = Math.min(Math.max(i, listView.getLastVisiblePosition()) + 1, getCount());
            for (int k = Math.min(i + 7, getCount()); i < k; i++)
            {
                viewgroup = (WishRating)getItem(i);
                cacheWarmer.warmCache(viewgroup.getAuthor().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium), 45, 45);
                if (viewgroup.getImageThumbnailUrlString() != null)
                {
                    cacheWarmer.warmCache(viewgroup.getImageThumbnailUrlString(), 80, 80);
                }
            }

        }
        return view;
    }

    public void pauseCacheWarming()
    {
        cacheWarmer.pause();
    }

    public void refreshTimestamps()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).timestamp.setText(DateUtil.getFuzzyDateFromNow(((ItemRowHolder) (obj)).rating.getTimestamp()));
                }
            }

        }
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }

}
