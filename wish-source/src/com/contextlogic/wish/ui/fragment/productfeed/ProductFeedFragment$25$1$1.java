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

class this._cls2
    implements NavigationBarButtonCallback
{

    final vity this$2;

    public void onMenuItemClicked()
    {
        trackClick(com.contextlogic.wish.analytics.elect);
        if (getActivity() != null)
        {
            getActivity().onSearchRequested();
        }
    }

    ._cls0()
    {
        this$2 = this._cls2.this;
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


    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$25$1

/* anonymous class */
    class ProductFeedFragment._cls25._cls1
        implements Runnable
    {

        final ProductFeedFragment._cls25 this$1;
        final String val$bannerTitle;
        final WishCredit val$credit;
        final WishFeedEndedButtonSpec val$feedEndedSpec;
        final ArrayList val$items;
        final int val$nextOffset;
        final boolean val$noMoreItems;

        public void run()
        {
            if (credit == null)
            {
                getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new ProductFeedFragment._cls25._cls1._cls1());
            }
            ProductFeedFragment.access$2100(this$0, credit);
            ProductFeedFragment.access$1800(this$0, items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
        }

            
            {
                this$1 = final__pcls25;
                credit = wishcredit;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = String.this;
                super();
            }
    }

}
