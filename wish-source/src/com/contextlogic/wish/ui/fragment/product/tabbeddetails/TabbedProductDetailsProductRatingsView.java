// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishRatingSummary;
import com.contextlogic.wish.api.service.GetProductRatingsService;
import java.text.NumberFormat;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRatingsView, TabbedProductDetailsFragment

public class TabbedProductDetailsProductRatingsView extends TabbedProductDetailsRatingsView
{

    private static final int REQUEST_ITEM_COUNT = 25;
    private GetProductRatingsService getProductRatingsService;
    private String productId;

    public TabbedProductDetailsProductRatingsView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsProductRatingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsProductRatingsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void cancelNetworkRequest()
    {
        getProductRatingsService.cancelAllRequests();
    }

    protected String getActionButtonText()
    {
        return null;
    }

    protected String getSubtitleLineOne()
    {
        if (product.getNumBought() > 0)
        {
            String s = getContext().getString(0x7f0600a6);
            String s2 = WishApplication.getAppInstance().getQuantityString(0x7f070008, product.getNumBought(), new Object[] {
                NumberFormat.getInstance().format(product.getNumBought())
            });
            return (new StringBuilder()).append(s).append(": ").append(s2).toString();
        }
        if (product.getNumWishes() > 0)
        {
            String s1 = getContext().getString(0x7f060398);
            String s3 = WishApplication.getAppInstance().getQuantityString(0x7f070008, product.getNumWishes(), new Object[] {
                NumberFormat.getInstance().format(product.getNumWishes())
            });
            return (new StringBuilder()).append(s1).append(": ").append(s3).toString();
        } else
        {
            return null;
        }
    }

    protected String getSubtitleLineTwo()
    {
        if (product.getNumWishes() > 0 && product.getNumBought() > 0)
        {
            String s = getContext().getString(0x7f060398);
            String s1 = WishApplication.getAppInstance().getQuantityString(0x7f070008, product.getNumWishes(), new Object[] {
                NumberFormat.getInstance().format(product.getNumWishes())
            });
            return (new StringBuilder()).append(s).append(": ").append(s1).toString();
        } else
        {
            return null;
        }
    }

    public void handleActionClick()
    {
    }

    protected void init()
    {
        super.init();
        getProductRatingsService = new GetProductRatingsService();
    }

    protected boolean isNetworkRequestPending()
    {
        return getProductRatingsService.isPending();
    }

    protected void performNetworkRequest()
    {
        getProductRatingsService.requestService(productId, nextOffset, 25, new com.contextlogic.wish.api.service.GetProductRatingsService.SuccessCallback() {

            final TabbedProductDetailsProductRatingsView this$0;

            public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, int i, final boolean noMoreRatings)
            {
                updatingList = true;
                queuePagerSettledTask(i. new Runnable() {

                    final _cls1 this$1;
                    final ArrayList val$items;
                    final int val$nextOffset;
                    final boolean val$noMoreRatings;
                    final int val$ratingsCount;
                    final WishRatingSummary val$summary;

                    public void run()
                    {
                        handleLoadingSuccess(summary, items, noMoreRatings, ratingsCount, nextOffset);
                    }

            
            {
                this$1 = final__pcls1;
                summary = wishratingsummary;
                items = arraylist;
                noMoreRatings = flag;
                ratingsCount = i;
                nextOffset = I.this;
                super();
            }
                });
            }

            
            {
                this$0 = TabbedProductDetailsProductRatingsView.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final TabbedProductDetailsProductRatingsView this$0;

            public void onServiceFailed()
            {
                updatingList = true;
                queuePagerSettledTask(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$0 = TabbedProductDetailsProductRatingsView.this;
                super();
            }
        });
    }

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        productId = wishproduct.getProductId();
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
    }
}
