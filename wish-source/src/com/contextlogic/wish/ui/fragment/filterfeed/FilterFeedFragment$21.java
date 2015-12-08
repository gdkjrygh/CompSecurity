// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment

class this._cls0
    implements com.contextlogic.wish.api.service.cessCallback
{

    final FilterFeedFragment this$0;

    public void onServiceSucceeded()
    {
        trackEvent(com.contextlogic.wish.analytics.wishFromFilterFeed, com.contextlogic.wish.analytics.ccess);
    }

    k()
    {
        this$0 = FilterFeedFragment.this;
        super();
    }
}
