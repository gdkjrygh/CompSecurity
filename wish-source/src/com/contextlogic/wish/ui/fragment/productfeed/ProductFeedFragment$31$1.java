// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.RenameBucketService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls1
    implements com.contextlogic.wish.api.service.ssCallback
{

    final Event this$1;

    public void onServiceSucceeded()
    {
        trackEvent(com.contextlogic.wish.analytics.eBucket, com.contextlogic.wish.analytics.ss);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$31

/* anonymous class */
    class ProductFeedFragment._cls31
        implements ProductFeedRenameBucketView.Callback
    {

        final ProductFeedFragment this$0;

        public void onBucketRenameCanceled()
        {
            clearOverlay();
        }

        public void onBucketRenamed(String s)
        {
            clearOverlay();
            PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f060374), new Object[] {
                s
            }));
            ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketRename(ProductFeedFragment.access$400(ProductFeedFragment.this), s);
            (new RenameBucketService()).requestService(ProductFeedFragment.access$400(ProductFeedFragment.this).getBucketId(), s, new ProductFeedFragment._cls31._cls1(), null);
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}
