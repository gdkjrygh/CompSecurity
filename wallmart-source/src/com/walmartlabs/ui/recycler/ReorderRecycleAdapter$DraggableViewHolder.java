// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.View;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicViewHolder, ReorderRecycleAdapter

public abstract class this._cls0 extends BasicViewHolder
{

    public static final int STATE_DRAGGING = 1;
    public static final int STATE_NORMAL = 0;
    private boolean mIsAnimating;
    final ReorderRecycleAdapter this$0;

    boolean isAnimating()
    {
        return mIsAnimating;
    }

    public abstract boolean isViewDraggable(int i, int j);

    protected abstract void onItemDragChange(int i);

    void setAnimating(boolean flag)
    {
        mIsAnimating = flag;
    }

    public (View view)
    {
        this$0 = ReorderRecycleAdapter.this;
        super(view);
    }
}
