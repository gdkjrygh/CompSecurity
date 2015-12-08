// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            q

final class n extends BaseAdapter
{

    private final LayoutInflater a;
    private final List b;

    public n(Context context, List list)
    {
        a = LayoutInflater.from(context);
        b = list;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = (TextView)a.inflate(l.bk, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        view.setText(((q)getItem(i)).f());
        return view;
    }
}
