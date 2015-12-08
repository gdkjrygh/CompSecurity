// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends BaseAdapter
{

    protected Context c;
    protected LayoutInflater d;
    protected List e;

    public a(Context context, List list)
    {
        c = context;
        d = LayoutInflater.from(c);
        if (list == null)
        {
            e = new ArrayList();
            return;
        } else
        {
            e = list;
            return;
        }
    }

    public void a(List list)
    {
        if (list != null)
        {
            e = list;
            notifyDataSetChanged();
        }
    }

    public List d()
    {
        return e;
    }

    public int getCount()
    {
        return e.size();
    }

    public Object getItem(int i)
    {
        return e.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }
}
