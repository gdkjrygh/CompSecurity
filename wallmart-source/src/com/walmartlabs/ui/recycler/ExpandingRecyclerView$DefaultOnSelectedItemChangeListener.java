// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.View;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            ExpandingRecyclerView, BasicViewHolder

public class this._cls0
    implements this._cls0
{

    final ExpandingRecyclerView this$0;

    public boolean onSelectedItemChange(int i, BasicViewHolder basicviewholder, BasicViewHolder basicviewholder1)
    {
        if (basicviewholder1 != null)
        {
            basicviewholder1.itemView.setSelected(false);
        }
        if (basicviewholder != null)
        {
            basicviewholder.itemView.setSelected(true);
        }
        return true;
    }

    public ()
    {
        this$0 = ExpandingRecyclerView.this;
        super();
    }
}
