// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jiubang.playsdk.e;
import com.jiubang.playsdk.f;

// Referenced classes of package com.jiubang.playsdk.c:
//            e

public class c extends BaseAdapter
{

    private int a[];
    private LayoutInflater b;
    private Context c;

    public c(Context context)
    {
        a = new int[0];
        b = null;
        c = context;
        b = LayoutInflater.from(context);
    }

    public void a(int ai[])
    {
        if (ai != null)
        {
            a = ai;
        }
    }

    public boolean a()
    {
        return a == null;
    }

    public int getCount()
    {
        return a.length;
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(a[i]);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = b.inflate(f.b, null);
            view = new com.jiubang.playsdk.c.e(this, null);
            view.a = (TextView)view1.findViewById(e.j);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (com.jiubang.playsdk.c.e)view.getTag();
            view1 = view;
        }
        i = a[i];
        ((com.jiubang.playsdk.c.e) (viewgroup)).a.setText(i);
        view1.setId(i);
        return view1;
    }
}
