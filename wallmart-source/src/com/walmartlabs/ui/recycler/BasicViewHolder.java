// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.View;

public class BasicViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    implements android.view.View.OnClickListener
{
    public static interface ClickListener
    {

        public abstract void onClick();
    }


    private ClickListener mListener;

    public BasicViewHolder(View view)
    {
        super(view);
    }

    public void onClick(View view)
    {
        if (mListener != null)
        {
            mListener.onClick();
        }
    }

    public void setClickListener(ClickListener clicklistener)
    {
        itemView.setOnClickListener(this);
        mListener = clicklistener;
    }
}
