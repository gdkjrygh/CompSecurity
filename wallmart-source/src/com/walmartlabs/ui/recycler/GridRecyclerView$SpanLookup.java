// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            GridRecyclerView, BasicAdapter

public class up extends android.support.v7.widget.okup
{

    final GridRecyclerView this$0;

    public int getSpanSize(int i)
    {
        if (getAdapter().isFixedSection(i))
        {
            return GridRecyclerView.access$000(GridRecyclerView.this);
        } else
        {
            return 1;
        }
    }

    public up()
    {
        this$0 = GridRecyclerView.this;
        super();
    }
}
