// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            FixedSectionsAdapter

private class <init> extends android.support.v7.widget.r
{

    final FixedSectionsAdapter this$0;

    public void onChanged()
    {
        notifyDataSetChanged();
    }

    public void onItemRangeChanged(int i, int j)
    {
        notifyItemRangeChanged(getHeaderCount() + i, j);
    }

    public void onItemRangeInserted(int i, int j)
    {
        notifyItemRangeInserted(getHeaderCount() + i, j);
    }

    public void onItemRangeMoved(int i, int j, int k)
    {
        notifyDataSetChanged();
    }

    public void onItemRangeRemoved(int i, int j)
    {
        notifyItemRangeRemoved(getHeaderCount() + i, j);
    }

    private ()
    {
        this$0 = FixedSectionsAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
