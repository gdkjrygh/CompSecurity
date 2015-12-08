// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, k

final class t extends BaseAdapter
{

    final ActivityChooserView a;
    private k b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    private t(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
        c = 4;
    }

    t(ActivityChooserView activitychooserview, byte byte0)
    {
        this(activitychooserview);
    }

    public final int a()
    {
        int j = 0;
        int i1 = c;
        c = 0x7fffffff;
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l1 = getCount();
        View view = null;
        int l = 0;
        for (; j < l1; j++)
        {
            view = getView(j, view, null);
            view.measure(j1, k1);
            l = Math.max(l, view.getMeasuredWidth());
        }

        c = i1;
        return l;
    }

    public final void a(int j)
    {
        if (c != j)
        {
            c = j;
            notifyDataSetChanged();
        }
    }

    public final void a(k k1)
    {
        k k2 = ActivityChooserView.a(a).b;
        if (k2 != null && a.isShown())
        {
            k2.unregisterObserver(android.support.v7.internal.widget.ActivityChooserView.i(a));
        }
        b = k1;
        if (k1 != null && a.isShown())
        {
            k1.registerObserver(android.support.v7.internal.widget.ActivityChooserView.i(a));
        }
        notifyDataSetChanged();
    }

    public final void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (d != flag || e != flag1)
        {
            d = flag;
            e = flag1;
            notifyDataSetChanged();
        }
    }

    public final ResolveInfo b()
    {
        return b.b();
    }

    public final int c()
    {
        return b.a();
    }

    public final int d()
    {
        return b.c();
    }

    public final k e()
    {
        return b;
    }

    public final boolean f()
    {
        return d;
    }

    public final int getCount()
    {
        int l = b.a();
        int j = l;
        if (!d)
        {
            j = l;
            if (b.b() != null)
            {
                j = l - 1;
            }
        }
        l = Math.min(j, c);
        j = l;
        if (f)
        {
            j = l + 1;
        }
        return j;
    }

    public final Object getItem(int j)
    {
        int l;
        switch (getItemViewType(j))
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return null;

        case 0: // '\0'
            l = j;
            break;
        }
        if (!d)
        {
            l = j;
            if (b.b() != null)
            {
                l = j + 1;
            }
        }
        return b.a(l);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final int getItemViewType(int j)
    {
        return !f || j != getCount() - 1 ? 0 : 1;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        getItemViewType(j);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 107
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        Object obj;
label0:
        {
            if (view != null)
            {
                obj = view;
                if (view.getId() == 1)
                {
                    break label0;
                }
            }
            obj = LayoutInflater.from(a.getContext()).inflate(h.k, viewgroup, false);
            ((View) (obj)).setId(1);
            ((TextView)((View) (obj)).findViewById(f.E)).setText(a.getContext().getString(i.c));
        }
_L8:
        return ((View) (obj));
_L2:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == f.q) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(a.getContext()).inflate(h.k, viewgroup, false);
_L6:
        view = a.getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(f.o);
        obj = (ResolveInfo)getItem(j);
        viewgroup.setImageDrawable(((ResolveInfo) (obj)).loadIcon(view));
        ((TextView)view1.findViewById(f.E)).setText(((ResolveInfo) (obj)).loadLabel(view));
        obj = view1;
        if (d)
        {
            obj = view1;
            if (j == 0)
            {
                boolean flag = e;
                return view1;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}
