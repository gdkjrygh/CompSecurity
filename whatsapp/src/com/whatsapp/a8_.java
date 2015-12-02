// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, iz, App, og, 
//            uu, a1g, ao9, cm

class a8_ extends BaseAdapter
{

    final MultipleContactsSelector a;

    private a8_(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
        super();
    }

    a8_(MultipleContactsSelector multiplecontactsselector, cm cm)
    {
        this(multiplecontactsselector);
    }

    public int getCount()
    {
        return a.j.size();
    }

    public Object getItem(int i)
    {
        return a.j.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = iz.a(a.getLayoutInflater(), 0x7f03008d, viewgroup, false);
            if (App.am != 0)
            {
                view1 = view;
            }
        }
        view = (og)a.j.get(i);
        ((ImageView)view1.findViewById(0x7f0b0253)).setOnClickListener(new uu(this, view));
        viewgroup = (TextView)view1.findViewById(0x7f0b00d0);
        a1g.b(viewgroup);
        viewgroup.setText(view.a(a));
        viewgroup = (ImageView)view1.findViewById(0x7f0b00ce);
        MultipleContactsSelector.a(a).a(view, viewgroup);
        return view1;
    }
}
