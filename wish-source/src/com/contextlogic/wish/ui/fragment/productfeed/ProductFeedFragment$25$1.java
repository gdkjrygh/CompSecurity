// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.bannerTitle
    implements Runnable
{

    final val.bannerTitle this$1;
    final String val$bannerTitle;
    final WishCredit val$credit;
    final WishFeedEndedButtonSpec val$feedEndedSpec;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;

    public void run()
    {
        if (val$credit == null)
        {
            getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

                final ProductFeedFragment._cls25._cls1 this$2;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                    if (getActivity() != null)
                    {
                        getActivity().onSearchRequested();
                    }
                }

            
            {
                this$2 = ProductFeedFragment._cls25._cls1.this;
                super();
            }
            });
        }
        ProductFeedFragment.access$2100(_fld0, val$credit);
        ProductFeedFragment.access$1800(_fld0, val$items, val$noMoreItems, val$nextOffset, val$feedEndedSpec, val$bannerTitle);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$credit = wishcredit;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = i;
        val$feedEndedSpec = wishfeedendedbuttonspec;
        val$bannerTitle = String.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$25

/* anonymous class */
    class ProductFeedFragment._cls25
        implements com.contextlogic.wish.api.service.GetBrandFeedService.SuccessCallback
    {

        final ProductFeedFragment this$0;

        public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishCredit credit, String s, String s1, final WishFeedEndedButtonSpec feedEndedSpec, 
                String s2)
        {
            ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
            postDelayed(s2. new ProductFeedFragment._cls25._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }
    }

}
