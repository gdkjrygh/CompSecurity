// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

abstract class dsu extends BaseAdapter
{

    private int a;
    private int b;
    private Context c;
    private Drawable d;
    private dsq e;

    dsu(Context context)
    {
        c = context;
        context = context.obtainStyledAttributes(0x7f090178, new int[] {
            0x1010214
        });
        d = context.getDrawable(0);
        b = d.getIntrinsicHeight();
        context.recycle();
        e = new dsq();
        e.a();
    }

    static int a(dsu dsu1)
    {
        return dsu1.a;
    }

    private View a(dsv dsv1, int i)
    {
        i = a(i);
        View view1 = dsv.a(dsv1);
        View view = view1;
        if (view1 == null)
        {
            view = e.a(i, 0);
        }
        return b(i, view, dsv1);
    }

    private boolean a(int i, boolean flag)
    {
        return !flag && i < getCount() - 1;
    }

    static int b(dsu dsu1)
    {
        return dsu1.b;
    }

    private View b(dsv dsv1, int i)
    {
        View view1 = dsv.b(dsv1);
        View view = view1;
        if (view1 == null)
        {
            view = e.a(i, 1);
        }
        return a(i, view, dsv1);
    }

    private boolean b(int i)
    {
        return i == 0 || a(i) != a(i - 1);
    }

    static Drawable c(dsu dsu1)
    {
        return dsu1.d;
    }

    private View c(dsv dsv1, int i)
    {
        i = a(i);
        if (dsv.c(dsv1) == null)
        {
            e.a(i, 2);
        }
        return null;
    }

    static dsq d(dsu dsu1)
    {
        return dsu1.e;
    }

    private boolean d(int i)
    {
        return i + 1 == getCount() || a(i) != a(i + 1);
    }

    public abstract int a(int i);

    public abstract View a(int i, View view, ViewGroup viewgroup);

    public abstract View b(int i, View view, ViewGroup viewgroup);

    public void c(int i)
    {
        a = i;
        notifyDataSetChanged();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (view == null)
        {
            view = new dsv(this, c);
        } else
        {
            view = (dsv)view;
        }
        flag = b(i);
        flag1 = d(i);
        flag2 = a(i, flag1);
        if (flag)
        {
            viewgroup = a(view, i);
        } else
        {
            viewgroup = null;
        }
        if (flag1)
        {
            c(view, i);
        }
        view1 = b(view, i);
        view.a(i, a(i), viewgroup, view1, flag2);
        return view;
    }
}
