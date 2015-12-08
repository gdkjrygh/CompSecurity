// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class av
    implements ListAdapter, SpinnerAdapter
{

    private SpinnerAdapter a;
    private ListAdapter b;

    public av(SpinnerAdapter spinneradapter)
    {
        a = spinneradapter;
        if (spinneradapter instanceof ListAdapter)
        {
            b = (ListAdapter)spinneradapter;
        }
    }

    public boolean areAllItemsEnabled()
    {
        ListAdapter listadapter = b;
        if (listadapter != null)
        {
            return listadapter.areAllItemsEnabled();
        } else
        {
            return true;
        }
    }

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getCount();
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getDropDownView(i, view, viewgroup);
        }
    }

    public Object getItem(int i)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getItem(i);
        }
    }

    public long getItemId(int i)
    {
        if (a == null)
        {
            return -1L;
        } else
        {
            return a.getItemId(i);
        }
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return getDropDownView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return a != null && a.hasStableIds();
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isEnabled(int i)
    {
        ListAdapter listadapter = b;
        if (listadapter != null)
        {
            return listadapter.isEnabled(i);
        } else
        {
            return true;
        }
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        if (a != null)
        {
            a.registerDataSetObserver(datasetobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (a != null)
        {
            a.unregisterDataSetObserver(datasetobserver);
        }
    }
}
