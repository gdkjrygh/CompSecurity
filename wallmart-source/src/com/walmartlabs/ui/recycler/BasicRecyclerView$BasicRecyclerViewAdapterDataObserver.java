// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicRecyclerView, BasicAdapter

private class <init> extends android.support.v7.widget.r
{

    final BasicRecyclerView this$0;

    void notifyItemCount()
    {
        if (getAdapter() != null && BasicRecyclerView.access$300(BasicRecyclerView.this) != null)
        {
            BasicRecyclerView.access$300(BasicRecyclerView.this).t(getAdapter().getItemCount());
        }
    }

    public void onChanged()
    {
        notifyItemCount();
    }

    public void onItemRangeInserted(int i, int j)
    {
        notifyItemCount();
    }

    public void onItemRangeRemoved(int i, int j)
    {
        notifyItemCount();
    }

    private ()
    {
        this$0 = BasicRecyclerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
