// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.service.item.ItemModel;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.item:
//            BundleSummaryPresenter

class this._cls0 extends CallbackSameThread
{

    final BundleSummaryPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            GoogleAnalytics.trackEvent("Cart", String.format(Locale.US, "Add to Cart %s", new Object[] {
                "configurable_bundle"
            }), BundleSummaryPresenter.access$900(BundleSummaryPresenter.this).getItemId());
            if (BundleSummaryPresenter.access$1100(BundleSummaryPresenter.this))
            {
                GoogleAnalytics.trackEvent("Recommendations", "Item Page Add to Cart", BundleSummaryPresenter.access$900(BundleSummaryPresenter.this).getItemId());
            }
            BundleSummaryPresenter.access$1200(BundleSummaryPresenter.this);
        } else
        if (!isPopped())
        {
            BundleSummaryPresenter.access$1300(BundleSummaryPresenter.this, 2);
            BundleSummaryPresenter.access$1000(BundleSummaryPresenter.this);
            return;
        }
    }

    ()
    {
        this$0 = BundleSummaryPresenter.this;
        super();
    }
}
