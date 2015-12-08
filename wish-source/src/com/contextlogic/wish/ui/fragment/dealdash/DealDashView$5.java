// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.view.View;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls0
    implements android.view.tener
{

    final DealDashView this$0;

    public void onClick(View view)
    {
        if (getState() == com.contextlogic.wish.api.data.o.PAGE.ACCESS_GRANTED)
        {
            trackEvent(WishAnalyticsEvent.CLICK_DEAL_DASH_START);
            DealDashView.access$1100(DealDashView.this);
        }
    }

    ()
    {
        this$0 = DealDashView.this;
        super();
    }
}
