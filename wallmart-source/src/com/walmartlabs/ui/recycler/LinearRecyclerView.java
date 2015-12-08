// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicRecyclerView, BasicAdapter

public class LinearRecyclerView extends BasicRecyclerView
{

    private android.support.v7.widget.RecyclerView.OnScrollListener mScrollListener;

    public LinearRecyclerView(Context context)
    {
        this(context, null);
    }

    public LinearRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LinearRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void enforceLayoutManager(android.support.v7.widget.RecyclerView.LayoutManager layoutmanager)
    {
        if (!(layoutmanager instanceof LinearLayoutManager))
        {
            throw new IllegalArgumentException("LinearRecyclerView requires a LinearLayoutManager");
        } else
        {
            return;
        }
    }

    public int getFirstVisiblePosition()
    {
        return getLayoutManager().findFirstVisibleItemPosition();
    }

    public int getLastVisiblePosition()
    {
        return getLayoutManager().findLastVisibleItemPosition();
    }

    public LinearLayoutManager getLayoutManager()
    {
        return (LinearLayoutManager)super.getLayoutManager();
    }

    public volatile android.support.v7.widget.RecyclerView.LayoutManager getLayoutManager()
    {
        return getLayoutManager();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        super.setOnScrollListener(new android.support.v7.widget.RecyclerView.OnScrollListener() {

            final LinearRecyclerView this$0;

            public void onScrollStateChanged(RecyclerView recyclerview, int i)
            {
                if (mScrollListener != null)
                {
                    mScrollListener.onScrollStateChanged(recyclerview, i);
                }
                if (i == 0 && getAdapter() != null)
                {
                    getAdapter().onSettledAtVisibleRange(getFirstVisiblePosition(), getLastVisiblePosition());
                }
            }

            public void onScrolled(RecyclerView recyclerview, int i, int j)
            {
                if (mScrollListener != null)
                {
                    mScrollListener.onScrolled(recyclerview, i, j);
                }
            }

            
            {
                this$0 = LinearRecyclerView.this;
                super();
            }
        });
    }

    public void setLayoutManager(android.support.v7.widget.RecyclerView.LayoutManager layoutmanager)
    {
        enforceLayoutManager(layoutmanager);
        super.setLayoutManager(layoutmanager);
    }

    public void setOnScrollListener(android.support.v7.widget.RecyclerView.OnScrollListener onscrolllistener)
    {
        mScrollListener = onscrolllistener;
    }

}
