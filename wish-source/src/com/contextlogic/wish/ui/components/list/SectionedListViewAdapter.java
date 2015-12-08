// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;

// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            SectionedListView

public abstract class SectionedListViewAdapter extends BaseAdapter
    implements android.widget.AbsListView.OnScrollListener, SectionIndexer
{

    public static final int PINNED_HEADER_GONE = 0;
    public static final int PINNED_HEADER_PUSHED_UP = 2;
    public static final int PINNED_HEADER_VISIBLE = 1;
    private Context context;
    private android.widget.AbsListView.OnScrollListener scrollListener;

    public SectionedListViewAdapter(Context context1)
    {
        context = context1;
    }

    protected abstract void bindSectionHeader(View view, int i, boolean flag);

    public abstract void configurePinnedHeader(View view, int i, int j);

    public Context getContext()
    {
        return context;
    }

    public int getPinnedHeaderState(int i)
    {
        if (i < 0 || getCount() == 0)
        {
            return 0;
        }
        int j = getPositionForSection(getSectionForPosition(i) + 1);
        return j == -1 || i != j - 1 ? 1 : 2;
    }

    public abstract int getPositionForSection(int i);

    public abstract int getSectionForPosition(int i);

    public abstract View getSectionedView(int i, View view, ViewGroup viewgroup);

    public abstract Object[] getSections();

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = getSectionedView(i, view, viewgroup);
        boolean flag;
        if (getPositionForSection(getSectionForPosition(i)) == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bindSectionHeader(view, i, flag);
        return view;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (abslistview instanceof SectionedListView)
        {
            ((SectionedListView)abslistview).configureHeaderView(i);
        }
        if (scrollListener != null)
        {
            scrollListener.onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (scrollListener != null)
        {
            scrollListener.onScrollStateChanged(abslistview, i);
        }
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        scrollListener = onscrolllistener;
    }
}
