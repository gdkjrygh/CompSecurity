// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishRatingSummary;
import com.contextlogic.wish.api.service.GetMerchantRatingsService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsRatingsView, TabbedProductDetailsFragment

public class TabbedProductDetailsMerchantRatingsView extends TabbedProductDetailsRatingsView
{

    private static final int REQUEST_ITEM_COUNT = 25;
    private GetMerchantRatingsService getMerchantRatingsService;
    private String merchantId;

    public TabbedProductDetailsMerchantRatingsView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsMerchantRatingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsMerchantRatingsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void cancelNetworkRequest()
    {
        getMerchantRatingsService.cancelAllRequests();
    }

    protected String getActionButtonText()
    {
        return fragment.getString(0x7f0601c0);
    }

    protected String getSubtitleLineOne()
    {
        return null;
    }

    protected String getSubtitleLineTwo()
    {
        return null;
    }

    public void handleActionClick()
    {
        fragment.trackClick(WishAnalyticsEvent.CLICK_MOBILE_RATINGS_VISIT_STORE);
        com.contextlogic.wish.ApplicationDeepLinkConfig applicationdeeplinkconfig = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(String.format((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://merchant/%s").toString(), new Object[] {
            ratingSummary.getName()
        })));
        if (applicationdeeplinkconfig != null)
        {
            ((RootActivity)fragment.getActivity()).processDeepLink(applicationdeeplinkconfig, false);
        }
    }

    protected void init()
    {
        super.init();
        getMerchantRatingsService = new GetMerchantRatingsService();
    }

    protected boolean isNetworkRequestPending()
    {
        return getMerchantRatingsService.isPending();
    }

    protected void performNetworkRequest()
    {
        getMerchantRatingsService.requestService(merchantId, nextOffset, 25, new com.contextlogic.wish.api.service.GetMerchantRatingsService.SuccessCallback() {

            final TabbedProductDetailsMerchantRatingsView this$0;

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
                this$0 = TabbedProductDetailsMerchantRatingsView.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final TabbedProductDetailsMerchantRatingsView this$0;

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
                this$0 = TabbedProductDetailsMerchantRatingsView.this;
                super();
            }
        });
    }

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        merchantId = wishproduct.getMerchantId();
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
    }
}
