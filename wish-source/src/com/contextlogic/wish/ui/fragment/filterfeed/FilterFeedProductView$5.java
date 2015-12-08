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

class this._cls0
    implements com.contextlogic.wish.api.service.uccessCallback
{

    final FilterFeedProductView this$0;

    public void onServiceSucceeded(final ArrayList products, ArrayList arraylist, final int nextOffset, final boolean noMoreItems, final DealDashInfo info, WishWishLookBannerSpec wishwishlookbannerspec, final WishPromoBannerSpec promoBannerSpec, 
            final ArrayList featuredProductCollections)
    {
        FilterFeedProductView.access$802(FilterFeedProductView.this, true);
        FilterFeedProductView.access$1300(FilterFeedProductView.this, new Runnable() {

            final FilterFeedProductView._cls5 this$1;
            final ArrayList val$featuredProductCollections;
            final DealDashInfo val$info;
            final int val$nextOffset;
            final boolean val$noMoreItems;
            final ArrayList val$products;
            final WishPromoBannerSpec val$promoBannerSpec;

            public void run()
            {
                if (info != null && FilterFeedProductView.access$900(this$0).getFilterId().equals("deal_dash__tab"))
                {
                    FilterFeedProductView.access$1000(this$0).setInfo(info);
                }
                if (FilterFeedProductView.access$900(this$0).getFilterId().equals("collections__tab"))
                {
                    FilterFeedProductView.access$1100(this$0, featuredProductCollections, noMoreItems, nextOffset);
                    return;
                } else
                {
                    FilterFeedProductView.access$1200(this$0, products, noMoreItems, nextOffset, promoBannerSpec);
                    return;
                }
            }

            
            {
                this$1 = FilterFeedProductView._cls5.this;
                info = dealdashinfo;
                featuredProductCollections = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                products = arraylist1;
                promoBannerSpec = wishpromobannerspec;
                super();
            }
        });
    }

    _cls1.val.promoBannerSpec()
    {
        this$0 = FilterFeedProductView.this;
        super();
    }
}
