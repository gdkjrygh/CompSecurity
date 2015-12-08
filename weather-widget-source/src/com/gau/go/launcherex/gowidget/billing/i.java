// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            g, BillingActivity, k

class i extends BaseAdapter
{

    final BillingActivity a;
    private ArrayList b;

    public i(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
        b = new ArrayList();
        a();
    }

    private void a()
    {
        g g1 = new g(a, null);
        g1.a = 0x7f0205f0;
        g1.b = 0x7f080361;
        g1.c = 0x7f080365;
        g1.d = 0;
        g1.e = 0;
        g1.f = 0;
        b.add(g1);
        g1 = new g(a, null);
        g1.a = 0x7f0205f1;
        g1.b = 0x7f080362;
        g1.c = 0x7f080366;
        g1.d = 0;
        g1.e = 0;
        g1.f = 0;
        b.add(g1);
        g1 = new g(a, null);
        g1.a = 0x7f0205f2;
        g1.b = 0x7f080363;
        g1.c = 0x7f080367;
        g1.e = 0;
        g1.f = 0;
        b.add(g1);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int j)
    {
        return b.get(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        g g1;
label0:
        {
            if (view == null)
            {
                view = BillingActivity.n(a).inflate(0x7f03011c, null);
                viewgroup = new k(a, null);
                viewgroup.a = (ImageView)view.findViewById(0x7f090553);
                viewgroup.b = (TextView)view.findViewById(0x7f090554);
                viewgroup.c = (TextView)view.findViewById(0x7f090556);
                viewgroup.d = (TextView)view.findViewById(0x7f090555);
                viewgroup.e = (ImageView)view.findViewById(0x7f090557);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (k)view.getTag();
            }
            g1 = (g)b.get(j);
            if (g1 != null)
            {
                ((k) (viewgroup)).a.setImageResource(g1.a);
                ((k) (viewgroup)).b.setText(g1.b);
                if (g1.c != 0)
                {
                    ((k) (viewgroup)).c.setVisibility(0);
                    ((k) (viewgroup)).c.setText(g1.c);
                } else
                {
                    ((k) (viewgroup)).c.setVisibility(8);
                }
                if (g1.e != 0)
                {
                    ((k) (viewgroup)).e.setVisibility(0);
                    ((k) (viewgroup)).e.setImageResource(g1.e);
                } else
                {
                    ((k) (viewgroup)).e.setVisibility(8);
                }
                if (g1.d == 0)
                {
                    break label0;
                }
                ((k) (viewgroup)).d.setText(g1.d);
                ((k) (viewgroup)).d.setCompoundDrawablesWithIntrinsicBounds(0, 0, g1.f, 0);
            }
            return view;
        }
        ((k) (viewgroup)).d.setText("");
        ((k) (viewgroup)).d.setCompoundDrawablesWithIntrinsicBounds(0, 0, g1.f, 0);
        return view;
    }
}
