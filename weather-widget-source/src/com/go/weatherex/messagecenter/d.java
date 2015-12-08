// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Vector;

// Referenced classes of package com.go.weatherex.messagecenter:
//            b, h, a, l

class d extends BaseAdapter
{

    final b a;
    private LayoutInflater b;

    d(b b1)
    {
        a = b1;
        super();
        b = (LayoutInflater)b1.getActivity().getSystemService("layout_inflater");
    }

    public int getCount()
    {
        if (com.go.weatherex.messagecenter.b.a(a) != null)
        {
            return com.go.weatherex.messagecenter.b.a(a).size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        if (i < getCount())
        {
            return com.go.weatherex.messagecenter.b.a(a).get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        a a1;
        if (view == null)
        {
            view = b.inflate(0x7f0300cd, null);
            viewgroup = new h(null);
            viewgroup.a = (TextView)view.findViewById(0x7f090434);
            viewgroup.b = (TextView)view.findViewById(0x7f090435);
            viewgroup.c = view.findViewById(0x7f090436);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (h)view.getTag();
        }
        a1 = (a)com.go.weatherex.messagecenter.b.a(a).get(i);
        if (a1 != null)
        {
            ((h) (viewgroup)).a.setText(a1.f());
            ((h) (viewgroup)).b.setText(a1.b());
            if (!a1.a())
            {
                ((h) (viewgroup)).a.setTextColor(-1);
                ((h) (viewgroup)).b.setTextColor(0xb3ffffff);
            } else
            {
                ((h) (viewgroup)).a.setTextColor(0x80ffffff);
                ((h) (viewgroup)).b.setTextColor(0x80ffffff);
            }
        }
        if (i == com.go.weatherex.messagecenter.b.a(a).size() - 1)
        {
            ((h) (viewgroup)).c.setVisibility(8);
            return view;
        } else
        {
            ((h) (viewgroup)).c.setVisibility(0);
            return view;
        }
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        if (com.go.weatherex.messagecenter.b.b(a))
        {
            com.go.weatherex.messagecenter.b.a(a, 0);
        } else
        {
            com.go.weatherex.messagecenter.b.a(a, 8);
        }
        com.go.weatherex.messagecenter.b.a(a, l.a(com.go.weatherex.messagecenter.b.a(a)), com.go.weatherex.messagecenter.b.a(a).size());
    }
}
