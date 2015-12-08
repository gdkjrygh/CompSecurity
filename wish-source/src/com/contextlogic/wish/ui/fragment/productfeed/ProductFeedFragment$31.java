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

class this._cls0
    implements View.Callback
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
        (new RenameBucketService()).requestService(ProductFeedFragment.access$400(ProductFeedFragment.this).getBucketId(), s, new com.contextlogic.wish.api.service.RenameBucketService.SuccessCallback() {

            final ProductFeedFragment._cls31 this$1;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RenameBucket, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

            
            {
                this$1 = ProductFeedFragment._cls31.this;
                super();
            }
        }, null);
    }

    _cls1.this._cls1()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}
