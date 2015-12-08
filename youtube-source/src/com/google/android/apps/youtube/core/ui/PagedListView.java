// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.l;
import com.google.android.youtube.q;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            BasePagedView, j

public class PagedListView extends BasePagedView
    implements android.widget.AbsListView.OnScrollListener
{

    private LinearLayout o;
    private boolean p;

    public PagedListView(Context context)
    {
        this(context, null, 0);
    }

    public PagedListView(Context context, int k, int i1, String s)
    {
        this(context, null, k, i1, s);
    }

    public PagedListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagedListView(Context context, AttributeSet attributeset, int k)
    {
        this(context, attributeset, -1, -1, null);
    }

    private PagedListView(Context context, AttributeSet attributeset, int k, int i1, String s)
    {
        super(l.aA, context, attributeset, q.h, i1, s);
        s = context.obtainStyledAttributes(attributeset, r.y);
        p = s.getBoolean(5, false);
        s.recycle();
        s = (ListView)h;
        context = context.obtainStyledAttributes(attributeset, r.y, 0, q.h);
        attributeset = context.getDrawable(1);
        i1 = context.getInt(2, 0);
        if (attributeset == null)
        {
            s.setDivider(null);
            s.setDividerHeight(0);
        } else
        {
            s.setDivider(attributeset);
            if (i1 > 0)
            {
                s.setDividerHeight(i1);
            }
        }
        i1 = context.getResourceId(4, 0);
        if (i1 != 0)
        {
            s.setSelector(i1);
        }
        i1 = context.getInt(3, 0);
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 1 2: default 152
    //                   1 212
    //                   2 221;
           goto _L3 _L4 _L5
_L3:
        s.setChoiceMode(0);
_L2:
        i1 = k;
        if (k < 0)
        {
            i1 = context.getColor(0, 0);
        }
        s.setCacheColorHint(i1);
        context.recycle();
        s.setOnScrollListener(this);
        return;
_L4:
        s.setChoiceMode(1);
        continue; /* Loop/switch isn't completed */
_L5:
        s.setChoiceMode(2);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void a(int k)
    {
        ListView listview = (ListView)h;
        if (k < listview.getChildCount())
        {
            listview.setSelection(k);
            listview.smoothScrollToPosition(k);
        }
    }

    protected final void c(View view)
    {
        ListView listview = (ListView)h;
        if (o == null)
        {
            o = new LinearLayout(getContext());
            o.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            listview.addHeaderView(o, null, false);
        }
        o.addView(view, new android.widget.LinearLayout.LayoutParams(view.getLayoutParams()));
        if (p)
        {
            view.setVisibility(0);
        }
    }

    protected final void d(View view)
    {
        ((ListView)h).addFooterView(view);
    }

    protected final void e(View view)
    {
        o.removeView(view);
        if (p)
        {
            view.setVisibility(8);
        }
    }

    protected final boolean g()
    {
        return true;
    }

    public final int i()
    {
        return ((ListView)h).getLastVisiblePosition();
    }

    public void onScroll(AbsListView abslistview, int k, int i1, int j1)
    {
        if (l != null)
        {
            l.a(k, i1, j1);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int k)
    {
    }

    public void setAdapter(ListAdapter listadapter)
    {
        super.setAdapter(listadapter);
        ((ListView)h).setAdapter(listadapter);
    }

    public void setListViewId(int k)
    {
        h.setId(k);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        super.setOnItemClickListener(onitemclicklistener);
        ((ListView)h).setOnItemClickListener(onitemclicklistener);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        super.setOnItemLongClickListener(onitemlongclicklistener);
        ((ListView)h).setOnItemLongClickListener(onitemlongclicklistener);
    }
}
