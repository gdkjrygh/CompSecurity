// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, CallLogActivity, iz, a1g

class aul extends ArrayAdapter
{

    protected List a;
    final CallLogActivity b;

    public aul(CallLogActivity calllogactivity, Context context, int i)
    {
        b = calllogactivity;
        super(context, i, (List)null);
        a = new ArrayList();
    }

    public c4 a(int i)
    {
        return (c4)a.get(i);
    }

    public void a(List list)
    {
        a = list;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
label0:
        {
            j = App.am;
            view1 = view;
            if (view == null)
            {
                view1 = com.whatsapp.iz.a(b.getLayoutInflater(), 0x7f030027, viewgroup, false);
                if (j != 0)
                {
                    view1 = view;
                }
            }
            view = view1.findViewById(0x7f0b00d7);
            if (i == getCount() - 1)
            {
                view1.setBackgroundResource(0x7f0205de);
                view.setVisibility(8);
                if (j == 0)
                {
                    break label0;
                }
            }
            view1.setBackgroundResource(0x7f0205e0);
            view.setVisibility(0);
        }
        TextView textview2;
label1:
        {
            view = a(i);
            viewgroup = (ImageView)view1.findViewById(0x7f0b00d3);
            TextView textview = (TextView)view1.findViewById(0x7f0b00d5);
            TextView textview1 = (TextView)view1.findViewById(0x7f0b00d6);
            textview2 = (TextView)view1.findViewById(0x7f0b00d4);
            viewgroup.setImageResource(com.whatsapp.CallLogActivity.a(view));
            textview.setText(CallLogActivity.b(view));
            textview1.setText(DateUtils.formatDateTime(b.getBaseContext(), App.q(view), 1));
            if (((c4) (view)).H > 0)
            {
                textview2.setText(DateUtils.formatElapsedTime(((c4) (view)).H));
                textview2.setVisibility(0);
                if (j == 0)
                {
                    break label1;
                }
            }
            if (((c4) (view)).y.b)
            {
                textview2.setText(0x7f0e006d);
                textview2.setVisibility(0);
                if (j == 0)
                {
                    break label1;
                }
            }
            textview2.setVisibility(8);
        }
        com.whatsapp.a1g.a(textview2);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
