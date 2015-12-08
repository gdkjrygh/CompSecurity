// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.a.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public abstract class c extends BaseAdapter
{

    protected final BaseAdapter a;
    private ListView b;

    public c(BaseAdapter baseadapter)
    {
        a = baseadapter;
    }

    public void a(ListView listview)
    {
        b = listview;
        if (a instanceof c)
        {
            ((c)a).a(listview);
        }
    }

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    public ListView d()
    {
        return b;
    }

    public BaseAdapter e()
    {
        return a;
    }

    public int getCount()
    {
        return a.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a.getDropDownView(i, view, viewgroup);
    }

    public Object getItem(int i)
    {
        return a.getItem(i);
    }

    public long getItemId(int i)
    {
        return a.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return a.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a.getView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return a.isEnabled(i);
    }

    public void notifyDataSetChanged()
    {
        a.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        a.notifyDataSetInvalidated();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        if (datasetobserver != null)
        {
            a.registerDataSetObserver(datasetobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (datasetobserver != null)
        {
            a.unregisterDataSetObserver(datasetobserver);
        }
    }
}
