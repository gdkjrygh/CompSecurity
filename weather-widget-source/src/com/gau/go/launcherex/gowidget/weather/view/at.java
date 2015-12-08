// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;

public class at extends b
{

    public ImageButton a;
    public View b;
    public View c;
    public View d;
    private View g;
    private View h;
    private View i;
    private TextView j;
    private View k;
    private TextView l;
    private View m;
    private View n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private TextView v;
    private View w;

    public at(Context context, View view)
    {
        super(context, view);
        g = e.findViewById(0x7f0900e4);
        h = e.findViewById(0x7f0900f3);
        i = e.findViewById(0x7f0900fb);
        j = (TextView)e.findViewById(0x7f0900e5);
        k = e.findViewById(0x7f0900e6);
        l = (TextView)e.findViewById(0x7f0900ec);
        m = e.findViewById(0x7f0900ed);
        n = e.findViewById(0x7f0900f5);
        o = (ImageView)e.findViewById(0x7f0900f4);
        p = (ImageView)e.findViewById(0x7f0900eb);
        q = (ImageView)e.findViewById(0x7f0900f2);
        r = (ImageView)e.findViewById(0x7f0900fa);
        s = (ImageView)e.findViewById(0x7f0900e9);
        t = (ImageView)e.findViewById(0x7f0900f0);
        u = (ImageView)e.findViewById(0x7f0900f8);
        v = (TextView)e.findViewById(0x7f0900fc);
        w = e.findViewById(0x7f0900fd);
        a = (ImageButton)e.findViewById(0x7f0900e3);
        b = e.findViewById(0x7f0900e7);
        c = e.findViewById(0x7f0900ee);
        d = e.findViewById(0x7f0900f6);
    }

    private void c(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            g.setVisibility(0);
            h.setVisibility(8);
            i.setVisibility(8);
            return;

        case 1: // '\001'
            g.setVisibility(8);
            h.setVisibility(0);
            i.setVisibility(8);
            return;

        case 2: // '\002'
            g.setVisibility(8);
            break;
        }
        h.setVisibility(8);
        i.setVisibility(0);
    }

    public void a()
    {
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
        b.setOnClickListener(onclicklistener);
        c.setOnClickListener(onclicklistener);
        d.setOnClickListener(onclicklistener);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020609, 0);
            k.setVisibility(0);
            n.setVisibility(0);
            l.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f02060d, 0);
            m.setVisibility(0);
            o.setImageResource(0x7f02060a);
            p.setVisibility(0);
            q.setVisibility(0);
            r.setVisibility(0);
            s.setVisibility(0);
            t.setVisibility(0);
            u.setVisibility(0);
            return;
        } else
        {
            j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020607, 0);
            k.setVisibility(8);
            n.setVisibility(8);
            l.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f02060c, 0);
            m.setVisibility(8);
            o.setImageResource(0x7f020608);
            p.setVisibility(8);
            q.setVisibility(8);
            r.setVisibility(8);
            s.setVisibility(0);
            t.setVisibility(0);
            u.setVisibility(0);
            return;
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            c(2);
            if (flag1)
            {
                v.setText(0x7f08035d);
                w.setVisibility(0);
                return;
            } else
            {
                v.setText(0x7f08035e);
                w.setVisibility(8);
                return;
            }
        }
        if (flag1)
        {
            c(1);
            return;
        } else
        {
            c(0);
            return;
        }
    }
}
