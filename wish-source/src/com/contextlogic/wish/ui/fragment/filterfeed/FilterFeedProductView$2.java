// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductView, FilterFeedFragment

class this._cls0
    implements android.support.v4.widget.reshListener
{

    final FilterFeedProductView this$0;

    public void onRefresh()
    {
        FilterFeedProductView.access$400(FilterFeedProductView.this).trackEvent(com.contextlogic.wish.analytics.esh, com.contextlogic.wish.analytics.ll);
        updateFeed(null, null);
    }

    ()
    {
        this$0 = FilterFeedProductView.this;
        super();
    }
}
