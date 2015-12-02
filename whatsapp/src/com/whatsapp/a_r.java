// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.whatsapp.contact.e;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App

class a_r extends ArrayAdapter
{

    private final LayoutInflater a;
    private final List b;

    public a_r(Context context, int i, List list)
    {
        super(context, i, list);
        a = LayoutInflater.from(context);
        b = list;
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        return Math.max(1, super.getCount());
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            if (b.isEmpty())
            {
                view = a.inflate(0x7f03008a, viewgroup, false);
                ((TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00e2);
                view.setTag(Integer.valueOf(2));
                view.setClickable(false);
                return view;
            }
            if (view != null)
            {
                view1 = view;
                if (((Integer)(Integer)view.getTag()).intValue() == 1)
                {
                    break label0;
                }
            }
            view1 = a.inflate(0x7f030036, viewgroup, false);
            if (App.am != 0)
            {
                view1 = view;
            }
        }
        view = (TextView)view1.findViewById(0x7f0b0135);
        viewgroup = (TextView)view1.findViewById(0x7f0b0136);
        e e1 = (e)getItem(i);
        view.setText(e1.c());
        viewgroup.setText(e1.a());
        view1.setTag(Integer.valueOf(2));
        view = getContext().getResources();
        if (i % 2 == 0)
        {
            i = 0x7f090030;
        } else
        {
            i = 0x7f090031;
        }
        view1.setBackgroundColor(view.getColor(i));
        return view1;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }
}
