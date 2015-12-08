// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            ExpandingRecyclerAdapter

class ver extends android.support.v7.widget.erver
{

    final ExpandingRecyclerAdapter this$0;

    public void onChanged()
    {
        ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, -1);
    }

    public void onItemRangeInserted(int i, int j)
    {
        if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) >= i)
        {
            ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) + j);
        }
    }

    public void onItemRangeMoved(int i, int j, int k)
    {
        if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) > i)
        {
            if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) < i + k)
            {
                ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) - i) + j);
            } else
            if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) <= j)
            {
                ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) - k);
                return;
            }
        }
    }

    public void onItemRangeRemoved(int i, int j)
    {
        if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) >= i && ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) < i + j)
        {
            ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, -1);
        } else
        if (ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) >= i + j)
        {
            ExpandingRecyclerAdapter.access$002(ExpandingRecyclerAdapter.this, ExpandingRecyclerAdapter.access$000(ExpandingRecyclerAdapter.this) - j);
            return;
        }
    }

    ver()
    {
        this$0 = ExpandingRecyclerAdapter.this;
        super();
    }
}
