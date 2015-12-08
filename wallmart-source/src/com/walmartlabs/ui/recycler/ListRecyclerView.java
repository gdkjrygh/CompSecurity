// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            LinearRecyclerView

public class ListRecyclerView extends LinearRecyclerView
{

    public ListRecyclerView(Context context)
    {
        this(context, null);
    }

    public ListRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
