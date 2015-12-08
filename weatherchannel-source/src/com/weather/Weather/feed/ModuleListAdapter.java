// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.nhaarman.listviewanimations.ArrayAdapter;
import java.util.List;

// Referenced classes of package com.weather.Weather.feed:
//            Module

public class ModuleListAdapter extends ArrayAdapter
{

    public ModuleListAdapter(List list)
    {
        super(list);
    }

    public long getItemId(int i)
    {
        return (long)((Module)getItem(i)).hashCode();
    }

    public int getItemViewType(int i)
    {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            return view;
        } else
        {
            return ((Module)getItem(i)).getView(viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return getCount();
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (datasetobserver == null)
        {
            return;
        } else
        {
            super.unregisterDataSetObserver(datasetobserver);
            return;
        }
    }
}
