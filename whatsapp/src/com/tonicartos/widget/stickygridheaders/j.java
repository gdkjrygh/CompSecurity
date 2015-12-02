// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            d, b

public class j extends BaseAdapter
    implements d
{

    private ListAdapter a;
    private DataSetObserver b;

    public j(ListAdapter listadapter)
    {
        b = new b(this);
        a = listadapter;
        listadapter.registerDataSetObserver(b);
    }

    public int a()
    {
        return 0;
    }

    public int a(int i)
    {
        return 0;
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }

    public int getCount()
    {
        return a.getCount();
    }

    public Object getItem(int i)
    {
        return a.getItem(i);
    }

    public long getItemId(int i)
    {
        return a.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a.getView(i, view, viewgroup);
    }
}
