// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, MessageDetailsActivity, iz, ub, 
//            p8, adw

class a3p extends BaseAdapter
{

    final MessageDetailsActivity a;

    private a3p(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
    }

    a3p(MessageDetailsActivity messagedetailsactivity, adw adw)
    {
        this(messagedetailsactivity);
    }

    public int getCount()
    {
        return 1;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
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
                view1 = iz.a(a.getLayoutInflater(), 0x7f030085, viewgroup, false);
                if (j != 0)
                {
                    view1 = view;
                }
            }
            view = ((ub)MessageDetailsActivity.b(a).get(0)).b;
            viewgroup = view1.findViewById(0x7f0b0235);
            if (MessageDetailsActivity.h(a).w == 2 && MessageDetailsActivity.h(a).n == 1)
            {
                viewgroup.setVisibility(0);
                if (j == 0)
                {
                    break label0;
                }
            }
            viewgroup.setVisibility(8);
        }
label1:
        {
            viewgroup = (TextView)view1.findViewById(0x7f0b0237);
            TextView textview;
            TextView textview1;
            TextView textview2;
            if (MessageDetailsActivity.h(a).w == 0)
            {
                i = 0x7f0e0259;
            } else
            {
                i = 0x7f0e025b;
            }
            viewgroup.setText(i);
            viewgroup = (TextView)view1.findViewById(0x7f0b023a);
            textview = (TextView)view1.findViewById(0x7f0b0239);
            textview1 = (TextView)view1.findViewById(0x7f0b0238);
            textview2 = (TextView)view1.findViewById(0x7f0b0236);
            viewgroup.setText(MessageDetailsActivity.a(a, MessageDetailsActivity.h(a).I));
            if (view.a(5) > 0L)
            {
                textview.setText(MessageDetailsActivity.a(a, view.a(5)));
                if (j == 0)
                {
                    break label1;
                }
            }
            textview.setText("\u2014");
        }
label2:
        {
            if (view.a(13) > 0L)
            {
                textview1.setText(MessageDetailsActivity.a(a, view.a(13)));
                if (j == 0)
                {
                    break label2;
                }
            }
            textview1.setText("\u2014");
        }
label3:
        {
            if (view.a(8) > 0L)
            {
                textview2.setText(MessageDetailsActivity.a(a, view.a(8)));
                if (j == 0)
                {
                    break label3;
                }
            }
            textview2.setText("\u2014");
        }
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
