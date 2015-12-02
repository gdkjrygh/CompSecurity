// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class mListAdapter
    implements ListAdapter, SpinnerAdapter
{

    private SpinnerAdapter mAdapter;
    private ListAdapter mListAdapter;

    public boolean areAllItemsEnabled()
    {
        ListAdapter listadapter = mListAdapter;
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
        if (mAdapter == null)
        {
            return 0;
        } else
        {
            return mAdapter.getCount();
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.getDropDownView(i, view, viewgroup);
        }
    }

    public Object getItem(int i)
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.getItem(i);
        }
    }

    public long getItemId(int i)
    {
        if (mAdapter == null)
        {
            return -1L;
        } else
        {
            return mAdapter.getItemId(i);
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
        return mAdapter != null && mAdapter.hasStableIds();
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isEnabled(int i)
    {
        ListAdapter listadapter = mListAdapter;
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
        if (mAdapter != null)
        {
            mAdapter.registerDataSetObserver(datasetobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(datasetobserver);
        }
    }

    public (SpinnerAdapter spinneradapter)
    {
        mAdapter = spinneradapter;
        if (spinneradapter instanceof ListAdapter)
        {
            mListAdapter = (ListAdapter)spinneradapter;
        }
    }
}
