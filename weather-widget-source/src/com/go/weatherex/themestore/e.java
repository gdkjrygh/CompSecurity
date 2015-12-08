// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.jiubang.playsdk.adapter.a;
import java.util.List;

public abstract class e extends a
    implements android.view.View.OnClickListener
{

    protected ListView a;
    private final SparseIntArray b = new SparseIntArray();
    private int f;
    private int g;
    private int h;

    public e(Context context, List list, ListView listview)
    {
        super(context, list);
        a = null;
        f = 2;
        g = 0;
        h = 0;
        a = listview;
        a.setDividerHeight(0);
        int i = context.getResources().getDimensionPixelSize(0x7f0c0238);
        int j = context.getResources().getDimensionPixelSize(0x7f0c0239);
        b(i);
        c(j);
    }

    private void a(LinearLayout linearlayout, View view, int i)
    {
        linearlayout.addView(view, i, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
    }

    public int a()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.size();
        }
    }

    public abstract View a(int i, View view, ViewGroup viewgroup);

    public void a(int i)
    {
        if (f == i)
        {
            return;
        } else
        {
            f = i;
            a.setAdapter(this);
            return;
        }
    }

    protected void a(FrameLayout framelayout, android.widget.LinearLayout.LayoutParams layoutparams, int i, int j)
    {
        framelayout.setPadding(0, h / 2, 0, h / 2);
        layoutparams.leftMargin = 0;
        layoutparams.rightMargin = 0;
        layoutparams.gravity = 16;
        if (i == 0)
        {
            framelayout.setPadding(0, 0, 0, h / 2);
        }
        if (i == getCount() - 1)
        {
            framelayout.setPadding(0, h / 2, 0, 0);
        }
        if (j != 0);
        if (j < f - 1)
        {
            layoutparams.rightMargin = g;
        }
    }

    public void a(List list)
    {
        if (e != list)
        {
            if (e != null)
            {
                e.clear();
            }
            if (list != null && e != null)
            {
                e.addAll(list);
            }
        }
        notifyDataSetChanged();
    }

    public int b()
    {
        return h;
    }

    public void b(int i)
    {
        g = i;
    }

    public void c(int i)
    {
        h = i;
    }

    public int getCount()
    {
        int k = a();
        int j = k / f;
        int i = j;
        if (k % f != 0)
        {
            i = j + 1;
        }
        return i;
    }

    public Object getItem(int i)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.get(i);
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        FrameLayout framelayout;
        int k;
        int i1;
        if (view == null)
        {
            view = new LinearLayout(c);
            view.setOrientation(0);
            view.setMotionEventSplittingEnabled(false);
            view.setFocusable(true);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            for (int j = 0; j < f; j++)
            {
                a(view, new FrameLayout(c), j);
            }

            viewgroup = view;
        } else
        {
            viewgroup = (LinearLayout)view;
        }
        i1 = a();
        k = 0;
_L3:
        View view1;
        int l;
        if (k >= f)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        framelayout = (FrameLayout)viewgroup.getChildAt(k);
        framelayout.setVisibility(0);
        a(framelayout, (android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams(), i, k);
        if (framelayout.getChildCount() > 1)
        {
            throw new IllegalStateException("convertViewContainer can't has more than 1 child...");
        }
        l = f * i + k;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        if (framelayout.getChildCount() == 1)
        {
            view1 = framelayout.getChildAt(0);
        } else
        {
            view1 = null;
        }
        view1 = a(l, view1, framelayout);
        if (view1 != null) goto _L2; else goto _L1
_L1:
        framelayout.removeAllViews();
_L6:
        k++;
          goto _L3
_L2:
        view1.setOnClickListener(this);
        b.put(view1.hashCode(), l);
        if (framelayout.getChildCount() != 1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        if (view1 != framelayout.getChildAt(0)) goto _L5; else goto _L4
_L4:
        boolean flag = false;
_L7:
        if (flag)
        {
            framelayout.addView(view1);
        }
          goto _L6
_L5:
        framelayout.removeAllViews();
        flag = true;
          goto _L7
        framelayout.setVisibility(4);
          goto _L6
        return view;
    }

    public void onClick(View view)
    {
        int i = b.get(view.hashCode(), -1);
        if (a != null && i != -1)
        {
            android.widget.AdapterView.OnItemClickListener onitemclicklistener = a.getOnItemClickListener();
            if (onitemclicklistener != null)
            {
                onitemclicklistener.onItemClick(a, view, i, getItemId(i));
            }
        }
    }
}
