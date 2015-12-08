// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.api.service.FeedCampaignLogService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls0
    implements nerView.ActionListener
{

    final ProductFeedFragment this$0;

    public void onAction(WishFeedPromotionItem wishfeedpromotionitem)
    {
        ProductFeedFragment.access$2400(ProductFeedFragment.this, wishfeedpromotionitem);
        ProductFeedFragment.access$2300(ProductFeedFragment.this, false);
    }

    public void onDismissed(WishFeedPromotionItem wishfeedpromotionitem)
    {
        (new FeedCampaignLogService()).requestService(com.contextlogic.wish.api.service.FeedCampaignLogServiceActionType.Dismiss, wishfeedpromotionitem.getCampaignId(), null, null);
        ProductFeedFragment.access$2300(ProductFeedFragment.this, true);
    }

    LogServiceActionType()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}
