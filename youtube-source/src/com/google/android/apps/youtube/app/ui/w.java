// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.l;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            x, v, z, ab, 
//            aa

final class w extends BaseAdapter
{

    final v a;
    private final ArrayList b = new ArrayList();
    private final SparseArray c = new SparseArray();
    private final ArrayList d = new ArrayList();
    private int e;

    public w(v v1)
    {
        a = v1;
        super();
        e = 1;
    }

    static int a(w w1, int i, String s, int j, ab ab)
    {
        int k = w1.e;
        w1.e = k + 1;
        s = new x(w1, Integer.valueOf(k), s, j, ab);
        w1.b.add(i, s);
        w1.c.put(s.a().intValue(), s);
        w1.notifyDataSetChanged();
        return s.a().intValue();
    }

    public final int a()
    {
        return b.size();
    }

    public final int a(int i, aa aa, ab ab)
    {
        int j = e;
        e = j + 1;
        aa = new x(this, Integer.valueOf(j), aa, ab);
        b.add(i, aa);
        c.put(aa.a().intValue(), aa);
        notifyDataSetChanged();
        return aa.a().intValue();
    }

    public final ab a(int i)
    {
        return ((x)d.get(i)).e();
    }

    public final void b(int i)
    {
        x x1 = (x)c.get(i);
        if (x1 != null)
        {
            x1.a(true);
        }
        notifyDataSetChanged();
    }

    public final void c(int i)
    {
        x x1 = (x)c.get(i);
        if (x1 != null)
        {
            x1.a(false);
        }
        notifyDataSetChanged();
    }

    public final void d(int i)
    {
        x x1 = (x)c.get(i);
        if (x1 != null)
        {
            b.remove(x1);
            c.remove(i);
        }
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.size();
    }

    public final Object getItem(int i)
    {
        return d.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((x)d.get(i)).a().intValue();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        x x1;
        if (view == null)
        {
            view = v.b(a).inflate(l.B, null);
            viewgroup = new z(this, view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (z)view.getTag();
        }
        x1 = (x)d.get(i);
        if (x1 == null)
        {
            obj = null;
        } else
        {
            if (((z) (viewgroup)).a != null)
            {
                obj = x1.b();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    ((z) (viewgroup)).a.setText(((CharSequence) (obj)));
                    ((z) (viewgroup)).a.setVisibility(0);
                } else
                {
                    ((z) (viewgroup)).a.setText(null);
                    ((z) (viewgroup)).a.setVisibility(8);
                }
            }
            obj = view;
            if (((z) (viewgroup)).b != null)
            {
                i = x1.c();
                if (i > 0)
                {
                    ((z) (viewgroup)).b.setImageResource(i);
                    ((z) (viewgroup)).b.setVisibility(0);
                    return view;
                } else
                {
                    ((z) (viewgroup)).b.setImageBitmap(null);
                    ((z) (viewgroup)).b.setVisibility(8);
                    return view;
                }
            }
        }
        return ((View) (obj));
    }

    public final void notifyDataSetChanged()
    {
        d.clear();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            x x1 = (x)iterator.next();
            if (x1.d())
            {
                d.add(x1);
            }
        } while (true);
        super.notifyDataSetChanged();
        v.a(a);
    }
}
