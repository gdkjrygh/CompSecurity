// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicRecyclerView, FixedSectionsAdapter, BasicViewHolder

class this._cls0
    implements ckListener
{

    final BasicRecyclerView this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        if (BasicRecyclerView.access$100(BasicRecyclerView.this) != null)
        {
            int j;
            if (BasicRecyclerView.access$200(BasicRecyclerView.this) != null)
            {
                j = BasicRecyclerView.access$200(BasicRecyclerView.this).getHeaderCount();
            } else
            {
                j = 0;
            }
            BasicRecyclerView.access$100(BasicRecyclerView.this).onItemClick(basicviewholder, i - j);
        }
    }

    ItemClickListener()
    {
        this$0 = BasicRecyclerView.this;
        super();
    }
}
