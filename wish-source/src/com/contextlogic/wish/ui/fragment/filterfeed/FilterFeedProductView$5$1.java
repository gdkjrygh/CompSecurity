// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import com.contextlogic.wish.ui.fragment.dealdash.DealDashView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductView

class val.promoBannerSpec
    implements Runnable
{

    final val.promoBannerSpec this$1;
    final ArrayList val$featuredProductCollections;
    final DealDashInfo val$info;
    final int val$nextOffset;
    final boolean val$noMoreItems;
    final ArrayList val$products;
    final WishPromoBannerSpec val$promoBannerSpec;

    public void run()
    {
        if (val$info != null && FilterFeedProductView.access$900(_fld0).getFilterId().equals("deal_dash__tab"))
        {
            FilterFeedProductView.access$1000(_fld0).setInfo(val$info);
        }
        if (FilterFeedProductView.access$900(_fld0).getFilterId().equals("collections__tab"))
        {
            FilterFeedProductView.access$1100(_fld0, val$featuredProductCollections, val$noMoreItems, val$nextOffset);
            return;
        } else
        {
            FilterFeedProductView.access$1200(_fld0, val$products, val$noMoreItems, val$nextOffset, val$promoBannerSpec);
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$info = dealdashinfo;
        val$featuredProductCollections = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = i;
        val$products = arraylist1;
        val$promoBannerSpec = WishPromoBannerSpec.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/filterfeed/FilterFeedProductView$5

/* anonymous class */
    class FilterFeedProductView._cls5
        implements com.contextlogic.wish.api.service.GetFilteredFeedService.SuccessCallback
    {

        final FilterFeedProductView this$0;

        public void onServiceSucceeded(final ArrayList products, ArrayList arraylist, final int nextOffset, final boolean noMoreItems, final DealDashInfo info, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
                final ArrayList featuredProductCollections)
        {
            FilterFeedProductView.access$802(FilterFeedProductView.this, true);
            FilterFeedProductView.access$1300(FilterFeedProductView.this, wishpromobannerspec. new FilterFeedProductView._cls5._cls1());
        }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
    }

}
