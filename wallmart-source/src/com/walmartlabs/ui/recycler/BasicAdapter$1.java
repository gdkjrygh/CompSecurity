// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, BasicViewHolder

class 
    implements .ClickListener
{

    final BasicAdapter this$0;
    final BasicViewHolder val$viewHolder;

    public void onClick()
    {
        if (BasicAdapter.access$000(BasicAdapter.this) != null)
        {
            BasicAdapter.access$000(BasicAdapter.this).onItemClick(val$viewHolder, val$viewHolder.getPosition());
        }
    }

    ()
    {
        this$0 = final_basicadapter;
        val$viewHolder = BasicViewHolder.this;
        super();
    }
}
