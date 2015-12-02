// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            BroadcastDetails, App, iz, aoz, 
//            k, ao9, og

class a91 extends BaseAdapter
{

    public LayoutInflater a;
    final BroadcastDetails b;

    public a91(BroadcastDetails broadcastdetails, Context context)
    {
        b = broadcastdetails;
        super();
        a = LayoutInflater.from(context);
    }

    public int getCount()
    {
        return com.whatsapp.BroadcastDetails.a(b).length;
    }

    public Object getItem(int i)
    {
        return com.whatsapp.BroadcastDetails.a(b)[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            int l = 0x7f0205c4;
            int i1 = App.am;
            View view1 = view;
            if (view == null)
            {
                view1 = com.whatsapp.iz.a(a, 0x7f030025, viewgroup, false);
                if (i1 != 0)
                {
                    view1 = view;
                }
            }
            view = (ImageView)view1.findViewById(0x7f0b00cf);
            int j;
            if (bg.a(BroadcastDetails.d(b).M, 5) >= 0)
            {
                j = l;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (BroadcastDetails.d(b).M == 4)
            {
                viewgroup = App.ah.a(new a(com.whatsapp.BroadcastDetails.a(b)[i], true, BroadcastDetails.d(b).y.c));
                if (viewgroup != null && bg.a(((c4) (viewgroup)).M, 5) >= 0)
                {
                    j = l;
                } else
                {
                    j = 0x7f0205c8;
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            j = 0x7f0205c5;
        }
        view.setImageResource(j);
        view = App.az.e(com.whatsapp.BroadcastDetails.a(b)[i]);
        viewgroup = (ImageView)view1.findViewById(0x7f0b00ce);
        BroadcastDetails.e(b).a(view, viewgroup);
        viewgroup = (TextView)view1.findViewById(0x7f0b00d0);
        viewgroup.setText(view.a(b));
        viewgroup.setTextColor(b.getResources().getColor(0x7f09000c));
        viewgroup = (TextView)view1.findViewById(0x7f0b00d1);
        if (viewgroup != null)
        {
            viewgroup.setTextColor(b.getResources().getColor(0x7f09001e));
            viewgroup.setText(c.b(((og) (view)).d, b.getBaseContext(), viewgroup.getPaint()));
        }
        view1.setTag(view);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
