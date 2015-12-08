// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            ReorderGridRecyclerView

class chListener extends android.support.v7.widget.ouchListener
{

    final ReorderGridRecyclerView this$0;

    public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        return ReorderGridRecyclerView.access$000(ReorderGridRecyclerView.this, motionevent);
    }

    public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        ReorderGridRecyclerView.access$000(ReorderGridRecyclerView.this, motionevent);
    }

    chListener()
    {
        this$0 = ReorderGridRecyclerView.this;
        super();
    }
}
