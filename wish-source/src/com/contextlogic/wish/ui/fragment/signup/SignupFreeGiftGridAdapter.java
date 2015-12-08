// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupFreeGiftGridCellView

public class SignupFreeGiftGridAdapter
    implements StaggeredGridViewAdapter
{

    private ImageCacheWarmer cacheWarmer;
    private Context context;
    private StaggeredGridView gridView;
    private ArrayList products;

    public SignupFreeGiftGridAdapter(Context context1, StaggeredGridView staggeredgridview, ArrayList arraylist)
    {
        context = context1;
        gridView = staggeredgridview;
        cacheWarmer = new ImageCacheWarmer();
        products = arraylist;
    }

    public int getHeightForViewAtIndex(int i, int j)
    {
        return j + (int)TypedValue.applyDimension(1, 85F, context.getResources().getDisplayMetrics());
    }

    public int getNumColumnsInLandscape()
    {
        return 2;
    }

    public int getNumColumnsInPortrait()
    {
        return 2;
    }

    public int getNumItems()
    {
        return products.size();
    }

    public int getScreenWidthOverride()
    {
        if (TabletUtil.isTablet(context))
        {
            double d1 = (double)context.getResources().getConfiguration().screenWidthDp * 0.80000000000000004D;
            double d = d1;
            if (d1 > 600D)
            {
                d = 600D;
            }
            return (int)TypedValue.applyDimension(1, (float)d, context.getResources().getDisplayMetrics());
        } else
        {
            return 0;
        }
    }

    public StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag)
    {
        WishProduct wishproduct = (WishProduct)products.get(i);
        SignupFreeGiftGridCellView signupfreegiftgridcellview1 = (SignupFreeGiftGridCellView)gridView.dequeueView("ProductCell");
        SignupFreeGiftGridCellView signupfreegiftgridcellview = signupfreegiftgridcellview1;
        if (signupfreegiftgridcellview1 == null)
        {
            signupfreegiftgridcellview = new SignupFreeGiftGridCellView(context);
            signupfreegiftgridcellview.setImageWidth(j);
            signupfreegiftgridcellview.setIdentifier("ProductCell");
        }
        if (!signupfreegiftgridcellview.getImageView().getImageView().isImageLoaded() && signupfreegiftgridcellview.getImageView().getImageView().getImageUrl() != null && cacheWarmer != null)
        {
            cacheWarmer.warmCache(signupfreegiftgridcellview.getImageView().getImageView().getImageUrl(), j, -1);
        }
        signupfreegiftgridcellview.updateImageHeight(j);
        cacheWarmer.cancel(signupfreegiftgridcellview.getImageUrl(wishproduct, j));
        long l;
        if (flag)
        {
            l = 100L;
        } else
        {
            l = 0L;
        }
        signupfreegiftgridcellview.setProduct(wishproduct, j, l);
        return signupfreegiftgridcellview;
    }

    public boolean overrideScreenWidth()
    {
        return TabletUtil.isTablet(context);
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
