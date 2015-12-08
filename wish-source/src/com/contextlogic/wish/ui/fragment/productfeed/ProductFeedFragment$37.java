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

class this._cls0
    implements android.content.Listener
{

    final ProductFeedFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        trackClick(com.contextlogic.wish.analytics.eteBucket);
        (new DeleteBucketService()).requestService(ProductFeedFragment.access$400(ProductFeedFragment.this).getBucketId(), new com.contextlogic.wish.api.service.DeleteBucketService.SuccessCallback() {

            final ProductFeedFragment._cls37 this$1;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.DeleteBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$1 = ProductFeedFragment._cls37.this;
                super();
            }
        }, null);
        PopupAlertDialog.showSuccess(getActivity(), null, getActivity().getString(0x7f060112));
        ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketDelete(ProductFeedFragment.access$400(ProductFeedFragment.this));
        ((RootActivity)getActivity()).closeScreensWithCount(1);
    }

    _cls1.this._cls1()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}
