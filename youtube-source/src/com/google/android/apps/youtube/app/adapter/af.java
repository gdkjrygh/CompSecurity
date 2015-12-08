// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ai, ax, ae

public class af extends a
{

    private final int a;
    private final ai b;
    private final Context d;
    private final LayoutInflater e;
    private final List f = new ArrayList(2);
    private final List g = new ArrayList(2);
    private final SparseArray h = new SparseArray();
    private int i;

    public af(Context context, int j, ai ai1)
    {
        a = j;
        b = (ai)c.a(ai1);
        d = (Context)c.a(context);
        e = LayoutInflater.from(context);
    }

    protected final void a(Iterable iterable)
    {
        super.a(iterable);
        b.a(iterable);
    }

    public boolean areAllItemsEnabled()
    {
        return i == 0;
    }

    public int getCount()
    {
        return super.getCount() + f.size() + g.size();
    }

    public Object getItem(int j)
    {
        while (j < f.size() || j - f.size() - super.getCount() >= 0) 
        {
            return null;
        }
        return super.getItem(j - f.size());
    }

    public int getItemViewType(int j)
    {
        while (j < f.size() || j - f.size() - super.getCount() >= 0) 
        {
            return -1;
        }
        return 0;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (j < f.size())
        {
            return ((ax)f.get(j)).a();
        }
        int k = j - f.size() - super.getCount();
        if (k >= 0)
        {
            return ((ax)g.get(k)).a();
        }
        Configuration configuration = d.getResources().getConfiguration();
        if (view != null)
        {
            int l = view.hashCode();
            if (h.indexOfKey(l) >= 0 && ((Integer)h.get(l)).intValue() != configuration.orientation)
            {
                view = null;
            }
        }
        if (view == null)
        {
            view = e.inflate(a, viewgroup, false);
            viewgroup = b.a(view, viewgroup);
            view.setTag(viewgroup);
            h.put(view.hashCode(), Integer.valueOf(configuration.orientation));
        } else
        {
            viewgroup = (ae)view.getTag();
        }
        viewgroup.a(j, getItem(j));
        return view;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int j)
    {
        if (j < f.size())
        {
            return ((ax)f.get(j)).b();
        }
        j = j - f.size() - super.getCount();
        if (j >= 0)
        {
            return ((ax)g.get(j)).b();
        } else
        {
            return true;
        }
    }
}
