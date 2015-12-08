// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.MotionEvent;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            ReorderGridRecyclerView

class this._cls0
    implements android.view.istener
{

    final ReorderGridRecyclerView this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        stopScroll();
        if (!ReorderGridRecyclerView.access$100(ReorderGridRecyclerView.this))
        {
            ReorderGridRecyclerView.access$200(ReorderGridRecyclerView.this, motionevent, motionevent.getActionIndex());
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    ()
    {
        this$0 = ReorderGridRecyclerView.this;
        super();
    }
}
