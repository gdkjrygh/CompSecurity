// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

class this._cls0
    implements NavigationBarButtonCallback
{

    final TabbedProductDetailsFragment this$0;

    public void onMenuItemClicked()
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_DETAILS_SEARCH);
        if (getActivity() != null)
        {
            getActivity().onSearchRequested();
        }
    }

    ()
    {
        this$0 = TabbedProductDetailsFragment.this;
        super();
    }
}
