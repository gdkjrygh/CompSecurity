// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.youtube.d;
import com.google.android.youtube.g;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            eu, SelectorOnTopFrameLayout

public final class et extends a
    implements android.view.View.OnClickListener
{

    protected final Context a;
    protected final Resources b;
    private final a d;
    private android.widget.AdapterView.OnItemClickListener e;
    private int f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;

    public et(Context context, a a1)
    {
        f = 1;
        g = 0.0F;
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = context.getResources();
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(d.a, typedvalue, true);
        s = typedvalue.resourceId;
        a1.registerDataSetObserver(new eu(this, (byte)0));
    }

    public static et a(Context context, a a1)
    {
        context = c(context, a1);
        context.a(g.k, g.m, g.l, g.j);
        context.b(g.o, g.q, g.p, g.n);
        context.c(g.j);
        context.b(g.k);
        context.r = true;
        return context;
    }

    public static et b(Context context, a a1)
    {
        context = c(context, a1);
        context.e(g.l);
        context.d(g.k);
        context.b(g.g, g.i, g.h, g.f);
        context.r = true;
        return context;
    }

    private void b(int i1, int j1, int k1, int l1)
    {
        o = (int)b.getDimension(i1);
        n = (int)b.getDimension(j1);
        q = (int)b.getDimension(k1);
        p = (int)b.getDimension(l1);
    }

    private static et c(Context context, a a1)
    {
        context.getResources();
        return new et(context, a1);
    }

    private void d(int i1)
    {
        h = b.getDimension(i1);
    }

    private void e(int i1)
    {
        i = b.getDimension(i1);
    }

    public final void a()
    {
        d.a();
    }

    public final void a(int i1)
    {
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "numColumns must be > 0");
        if (f != i1)
        {
            f = i1;
            notifyDataSetChanged();
        }
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        d(i1);
        g = b.getDimension(j1);
        e(k1);
        j = b.getDimension(l1);
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        e = onitemclicklistener;
    }

    public final void a(Object obj, Object obj1)
    {
        d.a(obj, obj1);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final a b()
    {
        return d;
    }

    public final void b(int i1)
    {
        l = b.getDimension(i1);
    }

    public final void b(Iterable iterable)
    {
        d.b(iterable);
    }

    public final void b(Object obj)
    {
        d.b(obj);
    }

    public final void c(int i1)
    {
        k = b.getDimension(i1);
    }

    public final void c(int i1, Object obj)
    {
        d.c(i1, obj);
    }

    public final boolean c(Object obj)
    {
        return d.c(obj);
    }

    public final int getCount()
    {
        return (int)Math.ceil((double)d.getCount() / (double)f);
    }

    public final Object getItem(int i1)
    {
        return d.getItem(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final int getItemViewType(int i1)
    {
        return 0;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        int j1;
        int k1;
        if (view == null)
        {
            viewgroup = new LinearLayout(a);
            viewgroup.setOrientation(0);
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            view = null;
        } else
        {
            viewgroup = (LinearLayout)view;
            view = (SelectorOnTopFrameLayout[])viewgroup.getTag();
        }
        if (i1 == 0)
        {
            j1 = Math.round(g - m);
        } else
        {
            j1 = 0;
        }
        if (i1 == getCount() - 1)
        {
            k1 = Math.round(j - m);
        } else
        {
            k1 = Math.round(k - m * 2.0F);
        }
        viewgroup.setPadding(Math.round(h - m), j1, Math.round(i - m), k1);
        if (view == null || view.length != f)
        {
            view = new SelectorOnTopFrameLayout[f];
            viewgroup.removeAllViews();
            viewgroup.setTag(view);
            viewgroup.setWeightSum(f);
        }
        j1 = 0;
        while (j1 < f) 
        {
            View view1;
            if (view[j1] == null)
            {
                view[j1] = new SelectorOnTopFrameLayout(a);
                view1 = view[j1];
                if (r)
                {
                    view1.setSelectorMargins(o, n, q, p);
                    view1.setSelector(s);
                }
                view1.setOnClickListener(this);
                view1.setClickable(true);
                view1.setEnabled(true);
                k1 = Math.round(m);
                view1.setPadding(k1, k1, k1, k1);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -2);
                layoutparams.weight = 1.0F;
                if (j1 > 0)
                {
                    layoutparams.leftMargin = Math.round(l - m * 2.0F);
                }
                viewgroup.addView(view1, layoutparams);
            } else
            {
                view1 = view[j1];
            }
            k1 = f;
            view1.setTag(j.el, Integer.valueOf(k1 * i1 + j1));
            j1++;
        }
        j1 = 0;
        while (j1 < f) 
        {
            View view2 = (View)view[j1].getTag();
            int l1 = f * i1 + j1;
            if (l1 < d.getCount())
            {
                View view3 = d.getView(l1, view2, viewgroup);
                if (view2 != view3)
                {
                    if (view[j1].getChildCount() > 0)
                    {
                        view[j1].removeAllViews();
                    }
                    view[j1].setTag(view3);
                    view[j1].setOnClickListener(this);
                    view[j1].setClickable(true);
                    view[j1].addView(view3, new android.widget.FrameLayout.LayoutParams(-1, -2));
                }
            } else
            {
                view[j1].removeAllViews();
                view[j1].setTag(j.el, null);
                view[j1].setTag(null);
                view[j1].setOnClickListener(null);
                view[j1].setOnLongClickListener(null);
                view[j1].setClickable(false);
            }
            j1++;
        }
        return viewgroup;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean isEnabled(int i1)
    {
        return false;
    }

    public final void onClick(View view)
    {
        if (e != null)
        {
            int i1 = ((Integer)view.getTag(j.el)).intValue();
            e.onItemClick(null, view, i1, getItemId(i1));
        }
    }
}
