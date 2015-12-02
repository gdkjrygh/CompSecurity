// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.ui.TextView;

public final class evf extends BaseAdapter
{

    private eve a;
    private LayoutInflater b;

    public evf(Context context, eve eve1)
    {
        a = eve1;
        b = LayoutInflater.from(context);
    }

    public final int getCount()
    {
        return a != null ? 1 : 0;
    }

    public final Object getItem(int i)
    {
        if (i == 0)
        {
            return a;
        } else
        {
            return null;
        }
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f03011a, viewgroup, false);
        }
        ((TextView)view1.findViewById(0x7f0e02f7)).setText(a.a());
        return view1;
    }
}
