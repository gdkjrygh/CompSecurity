// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class dsz extends dsu
{

    private List a;
    private LayoutInflater b;

    public dsz(Context context)
    {
        super(context);
        b = LayoutInflater.from(context);
        c(context.getResources().getDimensionPixelSize(0x7f0800cd));
        a = gke.b();
    }

    public final int a(int i)
    {
        return 0;
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x1090003, viewgroup, false);
        }
        view = b(i);
        ((TextView)view1.findViewById(0x1020014)).setText(view.b());
        return view1;
    }

    public final void a(List list)
    {
        a = list;
        notifyDataSetChanged();
    }

    public final View b(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }

    public final dsx b(int i)
    {
        return (dsx)a.get(i);
    }

    public final volatile void c(int i)
    {
        super.c(i);
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return b(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }
}
