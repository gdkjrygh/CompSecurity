// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.service.FeedCampaignLogService;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.menu.wishlistv2.WishlistV2MenuFragment;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedGridPromotionCellView, ProductFeedGridCellView

public class ProductFeedAdapter
    implements StaggeredGridViewAdapter
{

    private ImageCacheWarmer cacheWarmer;
    private Context context;
    private ProductFeedGridCellView.GridCellFragment fragment;
    private StaggeredGridView gridView;
    private int overriddenFeedWidth;
    private int overriddenNumberOfColumns;
    private ArrayList products;
    private ProductFeedGridPromotionCellView samplePromotionCellView;

    public ProductFeedAdapter(Context context1, ArrayList arraylist, StaggeredGridView staggeredgridview, ProductFeedGridCellView.GridCellFragment gridcellfragment)
    {
        context = context1;
        products = arraylist;
        gridView = staggeredgridview;
        fragment = gridcellfragment;
        cacheWarmer = new ImageCacheWarmer();
        overriddenNumberOfColumns = 0;
        overriddenFeedWidth = 0;
        samplePromotionCellView = new ProductFeedGridPromotionCellView(context1);
    }

    public int getHeightForViewAtIndex(int i, int j)
    {
        Object obj = products.get(i);
        if (obj instanceof WishProduct)
        {
            obj = (WishProduct)obj;
            String s = UserStatusManager.getInstance().getBucketForExperiment("mobile_simple_feed_tile");
            if (s.equals("show") || s.equals("show-v2"))
            {
                return j;
            }
            if (((WishProduct) (obj)).isCommerceProduct())
            {
                return j + (int)TypedValue.applyDimension(1, 29F, context.getResources().getDisplayMetrics()) + (int)TypedValue.applyDimension(1, 29F, context.getResources().getDisplayMetrics());
            } else
            {
                return j + (int)TypedValue.applyDimension(1, 29F, context.getResources().getDisplayMetrics());
            }
        } else
        {
            obj = (WishFeedPromotionItem)obj;
            int k = (int)TypedValue.applyDimension(1, 45F, context.getResources().getDisplayMetrics());
            samplePromotionCellView.setPromotionItem(((WishFeedPromotionItem) (obj)), i, j, 0L, true);
            samplePromotionCellView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), 0);
            return k + j + samplePromotionCellView.getTextView().getMeasuredHeight();
        }
    }

    public int getNumColumnsInLandscape()
    {
        return !TabletUtil.isTablet(context) ? 2 : 3;
    }

    public int getNumColumnsInPortrait()
    {
        if (overriddenNumberOfColumns > 0)
        {
            return overriddenNumberOfColumns;
        }
        return !TabletUtil.isTablet(context) ? 2 : 3;
    }

    public int getNumItems()
    {
        return products.size();
    }

    public int getScreenWidthOverride()
    {
        if (overriddenFeedWidth > 0)
        {
            return overriddenFeedWidth;
        } else
        {
            return ((RootActivity)context).getTabletContentContainerWidth();
        }
    }

    public StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag)
    {
        Object obj = products.get(i);
        if (obj instanceof WishProduct)
        {
            WishProduct wishproduct = (WishProduct)obj;
            ProductFeedGridCellView productfeedgridcellview = (ProductFeedGridCellView)gridView.dequeueView("ProductCell");
            obj = productfeedgridcellview;
            if (productfeedgridcellview == null)
            {
                obj = new ProductFeedGridCellView(context);
                ((ProductFeedGridCellView) (obj)).setImageWidth(j);
                ((ProductFeedGridCellView) (obj)).setIdentifier("ProductCell");
                ((ProductFeedGridCellView) (obj)).setFragment(fragment);
            }
            if (!((ProductFeedGridCellView) (obj)).getImageView().getImageView().isImageLoaded() && ((ProductFeedGridCellView) (obj)).getImageView().getImageView().getImageUrl() != null && cacheWarmer != null)
            {
                cacheWarmer.warmCache(((ProductFeedGridCellView) (obj)).getImageView().getImageView().getImageUrl(), j, -1);
            }
            long l;
            if (fragment instanceof WishlistV2MenuFragment)
            {
                ((ProductFeedGridCellView) (obj)).hideWishButton();
                ((ProductFeedGridCellView) (obj)).hideHourlyDeal(true);
                ((ProductFeedGridCellView) (obj)).updateImageHeight(j, false);
                ((ProductFeedGridCellView) (obj)).setUseOriginalImage(true);
            } else
            {
                boolean flag1;
                if (wishproduct.getHourlyDeal() != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((ProductFeedGridCellView) (obj)).updateImageHeight(j, flag1);
            }
            cacheWarmer.cancel(((ProductFeedGridCellView) (obj)).getImageUrl(wishproduct, j));
            if (flag && fragment.getAnimationTimeRemaining() == 0L)
            {
                l = 100L;
            } else
            {
                l = 0L;
            }
            ((ProductFeedGridCellView) (obj)).setProduct(wishproduct, i, j, l);
            return ((StaggeredGridCellView) (obj));
        }
        if (obj instanceof WishFeedPromotionItem)
        {
            WishFeedPromotionItem wishfeedpromotionitem = (WishFeedPromotionItem)obj;
            if (!wishfeedpromotionitem.isImpressionTracked())
            {
                wishfeedpromotionitem.setImpressionTracked(true);
                (new FeedCampaignLogService()).requestService(com.contextlogic.wish.api.service.FeedCampaignLogService.FeedCampaignLogServiceActionType.Impression, wishfeedpromotionitem.getCampaignId(), null, null);
            }
            ProductFeedGridPromotionCellView productfeedgridpromotioncellview = (ProductFeedGridPromotionCellView)gridView.dequeueView("PromotionCell");
            obj = productfeedgridpromotioncellview;
            if (productfeedgridpromotioncellview == null)
            {
                obj = new ProductFeedGridPromotionCellView(context);
                ((ProductFeedGridPromotionCellView) (obj)).setImageWidth(j);
                ((ProductFeedGridPromotionCellView) (obj)).setIdentifier("PromotionCell");
            }
            if (!((ProductFeedGridPromotionCellView) (obj)).getImageView().getImageView().isImageLoaded() && ((ProductFeedGridPromotionCellView) (obj)).getImageView().getImageView().getImageUrl() != null && cacheWarmer != null)
            {
                cacheWarmer.warmCache(((ProductFeedGridPromotionCellView) (obj)).getImageView().getImageView().getImageUrl(), j, -1);
            }
            if (wishfeedpromotionitem.getImageUrl() != null)
            {
                cacheWarmer.cancel(wishfeedpromotionitem.getImageUrl());
            }
            long l1;
            if (flag && fragment.getAnimationTimeRemaining() == 0L)
            {
                l1 = 100L;
            } else
            {
                l1 = 0L;
            }
            ((ProductFeedGridPromotionCellView) (obj)).setPromotionItem(wishfeedpromotionitem, i, j, l1, false);
            return ((StaggeredGridCellView) (obj));
        } else
        {
            return null;
        }
    }

    public void overrideFeedWidth(int i)
    {
        overriddenFeedWidth = i;
    }

    public void overrideNumberOfColumns(int i)
    {
        overriddenNumberOfColumns = i;
    }

    public boolean overrideScreenWidth()
    {
        return TabletUtil.isTablet(context) || overriddenFeedWidth > 0;
    }

    public void pauseCacheWarming()
    {
        cacheWarmer.pause();
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }
}
