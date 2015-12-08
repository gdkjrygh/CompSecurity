// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            ExpandingRecyclerView, ExpandingRecyclerAdapter, BasicViewHolder

class this._cls0
    implements ClickListener
{

    final ExpandingRecyclerView this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        if (expandingrecycleradapter == null) goto _L2; else goto _L1
_L1:
        if (!expandingrecycleradapter.isSectionHeader(i)) goto _L4; else goto _L3
_L3:
        int j = expandingrecycleradapter.getSection(i);
        boolean flag;
        if (!expandingrecycleradapter.isSectionExpanded(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ExpandingRecyclerView.access$000(ExpandingRecyclerView.this, j, i, flag);
_L6:
        return;
_L4:
        ExpandingRecyclerView.access$100(ExpandingRecyclerView.this, i);
        return;
_L2:
        if (ExpandingRecyclerView.access$200(ExpandingRecyclerView.this) != null)
        {
            ExpandingRecyclerView.access$200(ExpandingRecyclerView.this).onItemClick(basicviewholder, i);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$0 = ExpandingRecyclerView.this;
        super();
    }
}
