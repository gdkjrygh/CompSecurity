// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.youtube.l;
import com.google.android.youtube.q;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            BasePagedView, j

public class PagedGridView extends BasePagedView
    implements android.widget.AbsListView.OnScrollListener
{

    public PagedGridView(Context context)
    {
        this(context, null, 0);
    }

    public PagedGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagedGridView(Context context, AttributeSet attributeset, int i)
    {
        GridView gridview;
        super(l.az, context, attributeset, q.g);
        gridview = (GridView)h;
        context = context.obtainStyledAttributes(attributeset, r.x, 0, q.g);
        gridview.setVerticalSpacing(context.getDimensionPixelOffset(2, 0));
        gridview.setHorizontalSpacing(context.getDimensionPixelOffset(1, 0));
        i = context.getDimensionPixelOffset(5, -1);
        if (i > 0)
        {
            gridview.setColumnWidth(i);
        }
        i = context.getInt(4, -1);
        if (i < 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 3: default 112
    //                   1 169
    //                   2 178
    //                   3 187;
           goto _L3 _L4 _L5 _L6
_L3:
        gridview.setStretchMode(0);
_L2:
        gridview.setNumColumns(context.getInt(0, 1));
        i = context.getInt(6, -1);
        if (i >= 0)
        {
            gridview.setGravity(i);
        }
        gridview.setCacheColorHint(context.getColor(3, 0));
        context.recycle();
        gridview.setOnScrollListener(this);
        return;
_L4:
        gridview.setStretchMode(1);
        continue; /* Loop/switch isn't completed */
_L5:
        gridview.setStretchMode(2);
        continue; /* Loop/switch isn't completed */
_L6:
        gridview.setStretchMode(3);
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected final void c(View view)
    {
    }

    protected final void d(View view)
    {
    }

    protected final void e(View view)
    {
    }

    protected final boolean g()
    {
        return false;
    }

    public void onScroll(AbsListView abslistview, int i, int k, int i1)
    {
        if (l != null)
        {
            l.a(i, k, i1);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public void setAdapter(ListAdapter listadapter)
    {
        super.setAdapter(listadapter);
        ((GridView)h).setAdapter(listadapter);
    }

    public void setHorizontalSpacing(int i)
    {
        ((GridView)h).setHorizontalSpacing(i);
    }

    public void setNumColumns(int i)
    {
        ((GridView)h).setNumColumns(i);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        super.setOnItemClickListener(onitemclicklistener);
        ((GridView)h).setOnItemClickListener(onitemclicklistener);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        super.setOnItemLongClickListener(onitemlongclicklistener);
        ((GridView)h).setOnItemLongClickListener(onitemlongclicklistener);
    }

    public void setVerticalSpacing(int i)
    {
        ((GridView)h).setVerticalSpacing(i);
    }
}
