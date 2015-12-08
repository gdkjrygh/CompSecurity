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
//            ab, o, s, ag, 
//            ListMenuItemView

final class ac extends BaseAdapter
{

    final ab a;
    private o b;
    private int c;

    public ac(ab ab1, o o1)
    {
        a = ab1;
        super();
        c = -1;
        b = o1;
        a();
    }

    static o a(ac ac1)
    {
        return ac1.b;
    }

    private void a()
    {
        s s1 = ab.c(a).s();
        if (s1 != null)
        {
            ArrayList arraylist = ab.c(a).m();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((s)arraylist.get(i) == s1)
                {
                    c = i;
                    return;
                }
            }

        }
        c = -1;
    }

    public final s a(int i)
    {
        ArrayList arraylist;
        int j;
        if (ab.a(a))
        {
            arraylist = b.m();
        } else
        {
            arraylist = b.j();
        }
        j = i;
        if (c >= 0)
        {
            j = i;
            if (i >= c)
            {
                j = i + 1;
            }
        }
        return (s)arraylist.get(j);
    }

    public final int getCount()
    {
        ArrayList arraylist;
        if (ab.a(a))
        {
            arraylist = b.m();
        } else
        {
            arraylist = b.j();
        }
        if (c < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
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
            view = ab.b(a).inflate(ab.b, viewgroup, false);
        }
        viewgroup = (ag)view;
        if (a.c)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
        }
        viewgroup.a(a(i), 0);
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
