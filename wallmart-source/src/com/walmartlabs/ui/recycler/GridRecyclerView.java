// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            LinearRecyclerView, BasicAdapter

public class GridRecyclerView extends LinearRecyclerView
{
    public class SpanLookup extends android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    {

        final GridRecyclerView this$0;

        public int getSpanSize(int i)
        {
            if (getAdapter().isFixedSection(i))
            {
                return mColumnCount;
            } else
            {
                return 1;
            }
        }

        public SpanLookup()
        {
            this$0 = GridRecyclerView.this;
            super();
        }
    }


    private static final boolean DEBUG = false;
    private static final int DEFAULT_COLUMN_COUNT = 3;
    private static final String TAG = com/walmartlabs/ui/recycler/GridRecyclerView.getSimpleName();
    private int mColumnCount;
    private int mHorizontalItemMargin;
    private int mItemMargin;
    private GridLayoutManager mLayoutManager;
    private int mVerticalItemMargin;

    public GridRecyclerView(Context context)
    {
        this(context, null);
    }

    public GridRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GridRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.GridRecyclerView, i, 0);
        mColumnCount = context.getInteger(com.walmart.lib.R.styleable.GridRecyclerView_gridColumnCount, 3);
        mItemMargin = context.getDimensionPixelSize(com.walmart.lib.R.styleable.GridRecyclerView_gridItemSpacing, 0) / 2;
        mVerticalItemMargin = context.getDimensionPixelSize(com.walmart.lib.R.styleable.GridRecyclerView_gridVerticalItemSpacing, 0) / 2;
        mHorizontalItemMargin = context.getDimensionPixelSize(com.walmart.lib.R.styleable.GridRecyclerView_gridHorizontalItemSpacing, 0) / 2;
        mLayoutManager = new GridLayoutManager(getContext(), mColumnCount);
        mLayoutManager.setSpanSizeLookup(new SpanLookup());
        setLayoutManager(mLayoutManager);
        addItemDecoration(new android.support.v7.widget.RecyclerView.ItemDecoration() {

            final GridRecyclerView this$0;

            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
            {
                applySpacing(rect, recyclerview.getChildPosition(view));
            }

            
            {
                this$0 = GridRecyclerView.this;
                super();
            }
        });
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void applyBottomMargin(Rect rect, int i)
    {
        if (i < getAdapter().getItemCount() - mColumnCount || getFooterCount() > 0)
        {
            if (mVerticalItemMargin > 0)
            {
                i = mVerticalItemMargin;
            } else
            {
                i = mItemMargin;
            }
            rect.bottom = i;
        }
    }

    private void applyLeftMargin(Rect rect, int i)
    {
        if (i != 0)
        {
            if (mHorizontalItemMargin > 0)
            {
                i = mHorizontalItemMargin;
            } else
            {
                i = mItemMargin;
            }
            rect.left = i;
        }
    }

    private void applyRightMargin(Rect rect, int i)
    {
        if (i != mColumnCount - 1)
        {
            if (mHorizontalItemMargin > 0)
            {
                i = mHorizontalItemMargin;
            } else
            {
                i = mItemMargin;
            }
            rect.right = i;
        }
    }

    private void applyTopMargin(Rect rect, int i)
    {
        if (i > 0)
        {
            if (mVerticalItemMargin > 0)
            {
                i = mVerticalItemMargin;
            } else
            {
                i = mItemMargin;
            }
            rect.top = i;
        }
    }

    private void enforceLayoutManager(android.support.v7.widget.RecyclerView.LayoutManager layoutmanager)
    {
        if (!(layoutmanager instanceof GridLayoutManager))
        {
            throw new IllegalArgumentException("GridRecyclerView requires a GridLayoutManager");
        } else
        {
            return;
        }
    }

    protected void applySpacing(Rect rect, int i)
    {
        int j = getHeaderCount();
        int k = getFooterCount();
        int l = getLayoutManager().getSpanSizeLookup().getSpanGroupIndex(i, mColumnCount);
        int i1 = getLayoutManager().getSpanSizeLookup().getSpanIndex(i, mColumnCount);
        if (i < j || i > getAdapter().getItemCount() - 1 - k)
        {
            return;
        } else
        {
            applyLeftMargin(rect, i1);
            applyTopMargin(rect, l);
            applyRightMargin(rect, i1);
            applyBottomMargin(rect, i);
            return;
        }
    }

    public int getColumnCount()
    {
        return mColumnCount;
    }

    public GridLayoutManager getLayoutManager()
    {
        return (GridLayoutManager)super.getLayoutManager();
    }

    public volatile LinearLayoutManager getLayoutManager()
    {
        return getLayoutManager();
    }

    public volatile android.support.v7.widget.RecyclerView.LayoutManager getLayoutManager()
    {
        return getLayoutManager();
    }

    public void setColumnCount(int i)
    {
        mColumnCount = i;
        mLayoutManager.setSpanCount(mColumnCount);
    }

    public void setHorizontalItemSpacing(int i)
    {
        if (i < 0)
        {
            i = 0;
        } else
        {
            i /= 2;
        }
        mHorizontalItemMargin = i;
    }

    public void setItemSpacing(int i)
    {
        if (i < 0)
        {
            i = 0;
        } else
        {
            i /= 2;
        }
        mItemMargin = i;
    }

    public void setLayoutManager(android.support.v7.widget.RecyclerView.LayoutManager layoutmanager)
    {
        enforceLayoutManager(layoutmanager);
        super.setLayoutManager(layoutmanager);
    }

    public void setVerticalItemSpacing(int i)
    {
        if (i < 0)
        {
            i = 0;
        } else
        {
            i /= 2;
        }
        mVerticalItemMargin = i;
    }


}
