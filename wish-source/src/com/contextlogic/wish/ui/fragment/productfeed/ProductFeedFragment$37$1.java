// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.DeleteBucketService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
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

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$37

/* anonymous class */
    class ProductFeedFragment._cls37
        implements android.content.DialogInterface.OnClickListener
    {

        final ProductFeedFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.DeleteBucket);
            (new DeleteBucketService()).requestService(ProductFeedFragment.access$400(ProductFeedFragment.this).getBucketId(), new ProductFeedFragment._cls37._cls1(), null);
            PopupAlertDialog.showSuccess(getActivity(), null, getActivity().getString(0x7f060112));
            ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketDelete(ProductFeedFragment.access$400(ProductFeedFragment.this));
            ((RootActivity)getActivity()).closeScreensWithCount(1);
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}
