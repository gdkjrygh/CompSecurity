// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import com.contextlogic.wish.ui.components.grid.StaggeredGridView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductView

class this._cls0
    implements Runnable
{

    final FilterFeedProductView this$0;

    public void run()
    {
        int i = FilterFeedProductView.access$000(FilterFeedProductView.this).getScrollY();
        if (FilterFeedProductView.access$100(FilterFeedProductView.this) - i == 0)
        {
            FilterFeedProductView.access$200(FilterFeedProductView.this);
            return;
        } else
        {
            FilterFeedProductView.access$102(FilterFeedProductView.this, i);
            FilterFeedProductView.access$000(FilterFeedProductView.this).postDelayed(FilterFeedProductView.access$300(FilterFeedProductView.this), 100L);
            return;
        }
    }

    ()
    {
        this$0 = FilterFeedProductView.this;
        super();
    }
}
