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

class this._cls0
    implements com.contextlogic.wish.api.service.cessCallback
{

    final ProductFeedFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset, final WishCredit credit, String s, String s1, final WishFeedEndedButtonSpec feedEndedSpec, 
            final String bannerTitle)
    {
        ProductFeedFragment.access$1302(ProductFeedFragment.this, true);
        postDelayed(new Runnable() {

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
                    getNavigationBar().setMenuItem(getResources().getString(0x7f06039b), 0x7f0200be, new NavigationBarButtonCallback() {

                        final _cls1 this$2;

                        public void onMenuItemClicked()
                        {
                            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SearchSelect);
                            if (getActivity() != null)
                            {
                                getActivity().onSearchRequested();
                            }
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    });
                }
                ProductFeedFragment.access$2100(this$0, credit);
                ProductFeedFragment.access$1800(this$0, items, noMoreItems, nextOffset, feedEndedSpec, bannerTitle);
            }

            
            {
                this$1 = ProductFeedFragment._cls25.this;
                credit = wishcredit;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                feedEndedSpec = wishfeedendedbuttonspec;
                bannerTitle = s;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.bannerTitle()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}
