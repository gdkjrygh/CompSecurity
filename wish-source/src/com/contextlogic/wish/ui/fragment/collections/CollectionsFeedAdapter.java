// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.collections;

import android.content.Context;
import com.contextlogic.wish.api.data.Collection;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.collections:
//            CollectionsFeedGridCellView

public class CollectionsFeedAdapter
    implements StaggeredGridViewAdapter
{

    private ImageCacheWarmer cacheWarmer;
    private ArrayList collections;
    private Context context;
    private FilterFeedFragment fragment;
    private StaggeredGridView gridView;

    public CollectionsFeedAdapter(Context context1, ArrayList arraylist, StaggeredGridView staggeredgridview, FilterFeedFragment filterfeedfragment)
    {
        context = context1;
        collections = arraylist;
        gridView = staggeredgridview;
        cacheWarmer = new ImageCacheWarmer();
        fragment = filterfeedfragment;
    }

    public int getHeightForViewAtIndex(int i, int j)
    {
        return j / 2;
    }

    public int getNumColumnsInLandscape()
    {
        return !TabletUtil.isTablet(context) ? 1 : 2;
    }

    public int getNumColumnsInPortrait()
    {
        return !TabletUtil.isTablet(context) ? 1 : 2;
    }

    public int getNumItems()
    {
        return collections.size();
    }

    public int getScreenWidthOverride()
    {
        return ((RootActivity)context).getTabletContentContainerWidth();
    }

    public StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag)
    {
        long l1 = 0L;
        Collection collection = (Collection)collections.get(i);
        CollectionsFeedGridCellView collectionsfeedgridcellview1 = (CollectionsFeedGridCellView)gridView.dequeueView("CollectionView");
        CollectionsFeedGridCellView collectionsfeedgridcellview = collectionsfeedgridcellview1;
        if (collectionsfeedgridcellview1 == null)
        {
            collectionsfeedgridcellview = new CollectionsFeedGridCellView(context);
            collectionsfeedgridcellview.setImageWidth(j);
            collectionsfeedgridcellview.setIdentifier("CollectionView");
        }
        if (!collectionsfeedgridcellview.getPrimaryImageView().getImageView().isImageLoaded() && collectionsfeedgridcellview.getPrimaryImageView().getImageView().getImageUrl() != null && !collectionsfeedgridcellview.getTopSecondaryImageView().getImageView().isImageLoaded() && collectionsfeedgridcellview.getTopSecondaryImageView().getImageView().getImageUrl() != null && !collectionsfeedgridcellview.getBottomSecondaryImageView().getImageView().isImageLoaded() && collectionsfeedgridcellview.getBottomSecondaryImageView().getImageView().getImageUrl() != null && cacheWarmer != null)
        {
            cacheWarmer.warmCache(collectionsfeedgridcellview.getPrimaryImageView().getImageView().getImageUrl(), j, -1);
            cacheWarmer.warmCache(collectionsfeedgridcellview.getTopSecondaryImageView().getImageView().getImageUrl(), j, -1);
            cacheWarmer.warmCache(collectionsfeedgridcellview.getBottomSecondaryImageView().getImageView().getImageUrl(), j, -1);
        }
        cacheWarmer.cancel(collectionsfeedgridcellview.getImageUrl(collection.primaryImage(), j));
        cacheWarmer.cancel(collectionsfeedgridcellview.getImageUrl(collection.secondaryImageOne(), j));
        cacheWarmer.cancel(collectionsfeedgridcellview.getImageUrl(collection.secondaryImageTwo(), j));
        long l = l1;
        if (flag)
        {
            l = l1;
            if (fragment.getAnimationTimeRemaining() == 0L)
            {
                l = 100L;
            }
        }
        collectionsfeedgridcellview.setCollection(collection, i, j, l);
        return collectionsfeedgridcellview;
    }

    public boolean overrideScreenWidth()
    {
        return TabletUtil.isTablet(context);
    }
}
