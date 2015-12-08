// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter

class  extends CallbackSameThread
{

    final ShelfListPresenter this$0;
    final String val$barcode;
    final String val$storeIds[];

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.getData() != null && !isPopped())
        {
            request = (ItemModel)result.getData();
            result = new ItemDetailsPresenter(mActivity, request);
            mPresenterStackForPushes.pushAndReplacePresenter(result, false);
            GoogleAnalytics.trackEvent("Scan", "Scan to Item", request.getItemId());
            return;
        } else
        {
            ShelfListPresenter.access$200(ShelfListPresenter.this, val$barcode, val$storeIds);
            return;
        }
    }

    ()
    {
        this$0 = final_shelflistpresenter;
        val$barcode = s;
        val$storeIds = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
