// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            m, o, s, ag

final class n extends BaseAdapter
{

    final m a;
    private int b;

    public n(m m1)
    {
        a = m1;
        super();
        b = -1;
        a();
    }

    private void a()
    {
        s s1 = a.c.s();
        if (s1 != null)
        {
            ArrayList arraylist = a.c.m();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((s)arraylist.get(i) == s1)
                {
                    b = i;
                    return;
                }
            }

        }
        b = -1;
    }

    public final s a(int i)
    {
        ArrayList arraylist = a.c.m();
        int j = m.a(a) + i;
        i = j;
        if (b >= 0)
        {
            i = j;
            if (j >= b)
            {
                i = j + 1;
            }
        }
        return (s)arraylist.get(i);
    }

    public final int getCount()
    {
        int i = a.c.m().size() - m.a(a);
        if (b < 0)
        {
            return i;
        } else
        {
            return i - 1;
        }
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = a.b.inflate(a.f, viewgroup, false);
        }
        ((ag)view).a(a(i), 0);
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
