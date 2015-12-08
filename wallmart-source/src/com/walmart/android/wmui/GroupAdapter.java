// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class GroupAdapter extends BaseAdapter
{

    ArrayList mAdapters;
    private int mCount;

    public GroupAdapter()
    {
    }

    public void addAdapter(BaseAdapter baseadapter)
    {
        mAdapters.add(baseadapter);
        mCount = mCount + baseadapter.getCount();
    }

    public int getCount()
    {
        return mCount;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }
}
