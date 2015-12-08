// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.test:
//            MockServiceListPresenter

public static class mServiceNames extends BaseAdapter
{

    private Context mContext;
    private ArrayList mServiceNames;

    public int getCount()
    {
        return mServiceNames.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public String getString(int i)
    {
        return (String)mServiceNames.get(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(mContext).inflate(com.walmart.lib.tAdapter.mContext, null);
        }
        ViewUtil.setText(com.walmart.lib.tAdapter.mContext, viewgroup, (CharSequence)mServiceNames.get(i));
        return viewgroup;
    }

    public I(Context context, ArrayList arraylist)
    {
        mContext = context;
        mServiceNames = arraylist;
    }
}
