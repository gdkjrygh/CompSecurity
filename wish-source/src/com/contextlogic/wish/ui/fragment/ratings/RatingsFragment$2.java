// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import android.widget.AbsListView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsFragment

class this._cls0
    implements android.widget.llListener
{

    final RatingsFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        RatingsFragment.access$100(RatingsFragment.this, i, j, k);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    A()
    {
        this$0 = RatingsFragment.this;
        super();
    }
}
