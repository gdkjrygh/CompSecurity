// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            og, App, iz, a1g, 
//            mk, ContactInfo, ao9

class _y extends ArrayAdapter
{

    private LayoutInflater a;
    final ContactInfo b;
    protected List c;

    public _y(ContactInfo contactinfo, Context context, int i)
    {
        b = contactinfo;
        super(context, i, (List)null);
        a = LayoutInflater.from(context);
        c = new ArrayList();
    }

    public og a(int i)
    {
        return (og)c.get(i);
    }

    public void a(List list)
    {
        c = list;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.size();
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            int j = App.am;
            view1 = view;
            if (view == null)
            {
                view1 = iz.a(a, 0x7f030092, viewgroup, false);
                if (j != 0)
                {
                    view1 = view;
                }
            }
            if (i == getCount() - 1)
            {
                view1.setBackgroundResource(0x7f0205de);
                view1.findViewById(0x7f0b00d7).setVisibility(8);
                if (j == 0)
                {
                    break label0;
                }
            }
            view1.setBackgroundResource(0x7f0205e0);
            view1.findViewById(0x7f0b00d7).setVisibility(0);
        }
        view = a(i);
        viewgroup = (TextView)view1.findViewById(0x7f0b0135);
        TextView textview = (TextView)view1.findViewById(0x7f0b00cf);
        a1g.a(textview);
        viewgroup.setText(com.whatsapp.util.c.b(view.a(b), b));
        textview.setText(mk.b(((og) (view)).a));
        viewgroup = (ImageView)view1.findViewById(0x7f0b01ea);
        ContactInfo.f(b).a(view, viewgroup);
        view1.setTag(view);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
