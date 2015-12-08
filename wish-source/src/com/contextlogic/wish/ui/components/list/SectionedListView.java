// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            SectionedListViewAdapter

public class SectionedListView extends ListView
{

    private SectionedListViewAdapter adapter;
    private View headerView;
    private int headerViewHeight;
    private boolean headerViewVisible;
    private int headerViewWidth;
    private View listFooter;

    public SectionedListView(Context context)
    {
        super(context);
    }

    public SectionedListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SectionedListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void configureHeaderView(int i)
    {
        if (headerView != null)
        {
            View view;
            switch (adapter.getPinnedHeaderState(i))
            {
            default:
                return;

            case 0: // '\0'
                headerViewVisible = false;
                return;

            case 1: // '\001'
                adapter.configurePinnedHeader(headerView, i, 255);
                if (headerView.getTop() != 0)
                {
                    headerView.layout(0, 0, headerViewWidth, headerViewHeight);
                }
                headerViewVisible = true;
                return;

            case 2: // '\002'
                view = getChildAt(0);
                break;
            }
            if (view != null)
            {
                int k = view.getBottom();
                int j = headerView.getHeight();
                if (k < j)
                {
                    k -= j;
                    j = ((j + k) * 255) / j;
                } else
                {
                    k = 0;
                    j = 255;
                }
                adapter.configurePinnedHeader(headerView, i, j);
                if (headerView.getTop() != k)
                {
                    headerView.layout(0, k, headerViewWidth, headerViewHeight + k);
                }
                headerViewVisible = true;
                return;
            }
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (headerViewVisible)
        {
            drawChild(canvas, headerView, getDrawingTime());
        }
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public volatile ListAdapter getAdapter()
    {
        return getAdapter();
    }

    public SectionedListViewAdapter getAdapter()
    {
        return adapter;
    }

    public View getLoadingView()
    {
        return listFooter;
    }

    protected void layoutChildren()
    {
        try
        {
            super.layoutChildren();
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (headerView != null)
        {
            headerView.layout(0, 0, headerViewWidth, headerViewHeight);
            configureHeaderView(getFirstVisiblePosition());
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (headerView != null)
        {
            measureChild(headerView, i, j);
            headerViewWidth = headerView.getMeasuredWidth();
            headerViewHeight = headerView.getMeasuredHeight();
        }
    }

    public volatile void setAdapter(Adapter adapter1)
    {
        setAdapter((ListAdapter)adapter1);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (!(listadapter instanceof SectionedListViewAdapter))
        {
            throw new IllegalArgumentException();
        }
        if (adapter != null)
        {
            setOnScrollListener(null);
        }
        adapter = (SectionedListViewAdapter)listadapter;
        setOnScrollListener((SectionedListViewAdapter)listadapter);
        View view = new View(getContext());
        super.addFooterView(view);
        super.setAdapter(listadapter);
        super.removeFooterView(view);
    }

    public void setLoadingView(View view)
    {
        listFooter = view;
        super.addFooterView(listFooter);
    }

    public void setPinnedHeaderView(View view)
    {
        headerView = view;
        if (headerView != null)
        {
            setFadingEdgeLength(0);
        }
        requestLayout();
    }
}
