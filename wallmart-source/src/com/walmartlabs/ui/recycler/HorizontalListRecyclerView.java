// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            LinearRecyclerView, ListLayoutManager

public class HorizontalListRecyclerView extends LinearRecyclerView
{

    public HorizontalListRecyclerView(Context context)
    {
        this(context, null);
    }

    public HorizontalListRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HorizontalListRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setLayoutManager(new ListLayoutManager(getContext(), 0));
    }
}
