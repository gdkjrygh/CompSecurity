// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedProductView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls0
    implements com.contextlogic.wish.api.service.vice.SuccessCallback
{

    final DealDashView this$0;

    public void onServiceSucceeded()
    {
        if (DealDashView.access$900(DealDashView.this).getDealDashProdView() != null)
        {
            DealDashView.access$900(DealDashView.this).getDealDashProdView().updateFeed(null, null);
        }
    }

    ductView()
    {
        this$0 = DealDashView.this;
        super();
    }
}
