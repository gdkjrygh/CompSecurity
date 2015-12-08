// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            LinearRecyclerView, BasicAdapter

class stener extends android.support.v7.widget.Listener
{

    final LinearRecyclerView this$0;

    public void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        if (LinearRecyclerView.access$000(LinearRecyclerView.this) != null)
        {
            LinearRecyclerView.access$000(LinearRecyclerView.this).onScrollStateChanged(recyclerview, i);
        }
        if (i == 0 && getAdapter() != null)
        {
            getAdapter().onSettledAtVisibleRange(getFirstVisiblePosition(), getLastVisiblePosition());
        }
    }

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        if (LinearRecyclerView.access$000(LinearRecyclerView.this) != null)
        {
            LinearRecyclerView.access$000(LinearRecyclerView.this).onScrolled(recyclerview, i, j);
        }
    }

    stener()
    {
        this$0 = LinearRecyclerView.this;
        super();
    }
}
