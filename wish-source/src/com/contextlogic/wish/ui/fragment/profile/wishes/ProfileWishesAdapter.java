// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.wishes;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.wishes:
//            ProfileWishesGridCellView, ProfileWishesFragment

public class ProfileWishesAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        ProfileWishesGridCellView firstBucket;
        ProfileWishesGridCellView secondBucket;

        ItemRowHolder()
        {
        }
    }

    static class NewItemRowHolder
    {

        WishUserProductBucket bucket;
        TextView countText;
        BorderedImageView firstImageView;
        BorderedImageView secondImageView;
        BorderedImageView thirdImageView;
        TextView titleText;

        NewItemRowHolder()
        {
        }
    }


    private ArrayList buckets;
    private ImageCacheWarmer cacheWarmer;
    private ProfileWishesFragment fragment;
    private ListView listView;

    public ProfileWishesAdapter(Context context, ArrayList arraylist, ListView listview, ProfileWishesFragment profilewishesfragment)
    {
        super(context, 0x7f030094, arraylist);
        fragment = profilewishesfragment;
        buckets = arraylist;
        listView = listview;
        cacheWarmer = new ImageCacheWarmer();
    }

    public int getCount()
    {
        return (int)Math.ceil((double)buckets.size() / 2D);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = ((Activity)getContext()).getLayoutInflater();
        com.contextlogic.wish.api.data.WishImage.ImageSize imagesize;
        final WishUserProductBucket firstBucket;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (TabletUtil.isTablet(getContext()))
        {
            j = ((RootActivity)getContext()).getTabletContentContainerWidth();
        } else
        {
            j = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
        }
        j1 = (int)(((double)j / 2D) * 1.3300000000000001D);
        k = (int)((double)j1 * 0.69999999999999996D);
        l = j / 2;
        i1 = (int)((double)j1 * 0.29999999999999999D);
        if (view == null)
        {
            view = ((LayoutInflater) (obj)).inflate(0x7f030094, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.firstBucket = (ProfileWishesGridCellView)view.findViewById(0x7f0d02d5);
            viewgroup.secondBucket = (ProfileWishesGridCellView)view.findViewById(0x7f0d02d6);
            ((ItemRowHolder) (viewgroup)).firstBucket.setImageSizes(l, k, i1, i1);
            ((ItemRowHolder) (viewgroup)).secondBucket.setImageSizes(l, k, i1, i1);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        obj = view.getLayoutParams();
        obj.height = j1;
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = com.contextlogic.wish.api.data.WishImage.ImageSize.Medium;
        imagesize = com.contextlogic.wish.api.data.WishImage.ImageSize.Small;
        if (j > 700)
        {
            obj = com.contextlogic.wish.api.data.WishImage.ImageSize.Large;
            imagesize = com.contextlogic.wish.api.data.WishImage.ImageSize.Medium;
        }
        firstBucket = (WishUserProductBucket)buckets.get(i * 2);
        if (firstBucket.getProductCount() > 0 && firstBucket.getProductPreviews().size() > 0)
        {
            cacheWarmer.cancel(((WishProduct)firstBucket.getProductPreviews().get(0)).getImage().getUrlString(((com.contextlogic.wish.api.data.WishImage.ImageSize) (obj))));
        }
        if (firstBucket.getProductCount() > 1 && firstBucket.getProductPreviews().size() > 1)
        {
            cacheWarmer.cancel(((WishProduct)firstBucket.getProductPreviews().get(1)).getImage().getUrlString(imagesize));
        }
        if (firstBucket.getProductCount() > 2 && firstBucket.getProductPreviews().size() > 2)
        {
            cacheWarmer.cancel(((WishProduct)firstBucket.getProductPreviews().get(2)).getImage().getUrlString(imagesize));
        }
        if (firstBucket.getProductCount() == 4 && firstBucket.getProductPreviews().size() > 3)
        {
            cacheWarmer.cancel(((WishProduct)firstBucket.getProductPreviews().get(3)).getImage().getUrlString(imagesize));
        }
        ((ItemRowHolder) (viewgroup)).firstBucket.setBucket(firstBucket, ((com.contextlogic.wish.api.data.WishImage.ImageSize) (obj)), imagesize);
        ((ItemRowHolder) (viewgroup)).firstBucket.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileWishesAdapter this$0;
            final WishUserProductBucket val$firstBucket;

            public void onClick(View view1)
            {
                fragment.handleBucketClick(firstBucket);
            }

            
            {
                this$0 = ProfileWishesAdapter.this;
                firstBucket = wishuserproductbucket;
                super();
            }
        });
        if (i * 2 + 1 < buckets.size())
        {
            ((ItemRowHolder) (viewgroup)).secondBucket.setVisibility(0);
            final WishUserProductBucket secondBucket = (WishUserProductBucket)buckets.get(i * 2 + 1);
            if (secondBucket.getProductCount() > 0 && secondBucket.getProductPreviews().size() > 0)
            {
                cacheWarmer.cancel(((WishProduct)secondBucket.getProductPreviews().get(0)).getImage().getUrlString(((com.contextlogic.wish.api.data.WishImage.ImageSize) (obj))));
            }
            if (secondBucket.getProductCount() > 1 && secondBucket.getProductPreviews().size() > 1)
            {
                cacheWarmer.cancel(((WishProduct)secondBucket.getProductPreviews().get(1)).getImage().getUrlString(imagesize));
            }
            if (secondBucket.getProductCount() > 2 && secondBucket.getProductPreviews().size() > 2)
            {
                cacheWarmer.cancel(((WishProduct)secondBucket.getProductPreviews().get(2)).getImage().getUrlString(imagesize));
            }
            if (secondBucket.getProductCount() == 4 && secondBucket.getProductPreviews().size() > 3)
            {
                cacheWarmer.cancel(((WishProduct)secondBucket.getProductPreviews().get(3)).getImage().getUrlString(imagesize));
            }
            ((ItemRowHolder) (viewgroup)).secondBucket.setBucket(secondBucket, ((com.contextlogic.wish.api.data.WishImage.ImageSize) (obj)), imagesize);
            ((ItemRowHolder) (viewgroup)).secondBucket.setOnClickListener(new android.view.View.OnClickListener() {

                final ProfileWishesAdapter this$0;
                final WishUserProductBucket val$secondBucket;

                public void onClick(View view1)
                {
                    fragment.handleBucketClick(secondBucket);
                }

            
            {
                this$0 = ProfileWishesAdapter.this;
                secondBucket = wishuserproductbucket;
                super();
            }
            });
        } else
        {
            ((ItemRowHolder) (viewgroup)).secondBucket.setVisibility(4);
            ((ItemRowHolder) (viewgroup)).secondBucket.setOnClickListener(null);
        }
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            i = Math.min(Math.max(i, listView.getLastVisiblePosition()) * 2 + 1, buckets.size());
            for (j = Math.min(i + 4, buckets.size()); i < j; i++)
            {
                viewgroup = (WishUserProductBucket)getItem(i);
                if (viewgroup.getProductCount() > 0 && viewgroup.getProductPreviews().size() > 0)
                {
                    cacheWarmer.warmCache(((WishProduct)viewgroup.getProductPreviews().get(0)).getImage().getUrlString(((com.contextlogic.wish.api.data.WishImage.ImageSize) (obj))), l, k);
                }
                if (viewgroup.getProductCount() > 1 && viewgroup.getProductPreviews().size() > 1)
                {
                    cacheWarmer.warmCache(((WishProduct)viewgroup.getProductPreviews().get(1)).getImage().getUrlString(imagesize), i1, i1);
                }
                if (viewgroup.getProductCount() > 2 && viewgroup.getProductPreviews().size() > 2)
                {
                    cacheWarmer.warmCache(((WishProduct)viewgroup.getProductPreviews().get(2)).getImage().getUrlString(imagesize), i1, i1);
                }
                if (viewgroup.getProductCount() == 4 && viewgroup.getProductPreviews().size() > 3)
                {
                    cacheWarmer.warmCache(((WishProduct)viewgroup.getProductPreviews().get(3)).getImage().getUrlString(imagesize), i1, i1);
                }
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
            int i = 0;
            while (i < listView.getChildCount()) 
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).firstBucket.releaseImages();
                    ((ItemRowHolder) (obj)).secondBucket.releaseImages();
                } else
                if (obj != null && (obj instanceof NewItemRowHolder))
                {
                    obj = (NewItemRowHolder)obj;
                    ((NewItemRowHolder) (obj)).firstImageView.getImageView().releaseImage();
                    ((NewItemRowHolder) (obj)).secondImageView.getImageView().releaseImage();
                    ((NewItemRowHolder) (obj)).thirdImageView.getImageView().releaseImage();
                }
                i++;
            }
        }
    }

    public void restoreImages()
    {
        if (listView != null)
        {
            int i = 0;
            while (i < listView.getChildCount()) 
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).firstBucket.restoreImages();
                    ((ItemRowHolder) (obj)).secondBucket.restoreImages();
                } else
                if (obj != null && (obj instanceof NewItemRowHolder))
                {
                    obj = (NewItemRowHolder)obj;
                    ((NewItemRowHolder) (obj)).firstImageView.getImageView().restoreImage();
                    ((NewItemRowHolder) (obj)).secondImageView.getImageView().restoreImage();
                    ((NewItemRowHolder) (obj)).thirdImageView.getImageView().restoreImage();
                }
                i++;
            }
        }
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }

}
