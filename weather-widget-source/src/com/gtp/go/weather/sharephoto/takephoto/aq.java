// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;

public class aq extends b
{

    private ImageView a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView g;
    private int h[];

    public aq(Context context, View view, int ai[])
    {
        super(context, view);
        h = new int[13];
        h = ai;
        a = (ImageView)e.findViewById(0x7f0904fc);
        b = (ImageView)e.findViewById(0x7f0904fd);
        c = (ImageView)e.findViewById(0x7f0904fe);
        d = (ImageView)e.findViewById(0x7f0904ff);
        g = (ImageView)e.findViewById(0x7f090500);
        a.setImageResource(h[10]);
    }

    public void a(WeatherBean weatherbean, u u1)
    {
        int j = u1.g;
        int i;
        if (weatherbean != null)
        {
            i = q.a(weatherbean.l.a(j));
        } else
        {
            i = -10000;
        }
        if (i != -10000)
        {
            int k;
            int l;
            if (i < 0)
            {
                a.setVisibility(0);
            } else
            {
                a.setVisibility(8);
            }
            i = Math.abs(i);
            k = i / 100;
            if (k == 0)
            {
                b.setVisibility(8);
            } else
            {
                b.setImageResource(h[k]);
                b.setVisibility(0);
            }
            l = (i - k * 100) / 10;
            if (l == 0 && k == 0)
            {
                c.setVisibility(8);
            } else
            {
                c.setImageResource(h[l]);
                c.setVisibility(0);
            }
            d.setImageResource(h[i % 10]);
        } else
        {
            a.setVisibility(0);
            b.setVisibility(0);
            b.setImageResource(h[10]);
            c.setVisibility(8);
            d.setVisibility(8);
        }
        if (j == 1)
        {
            g.setImageResource(h[11]);
            return;
        } else
        {
            g.setImageResource(h[12]);
            return;
        }
    }
}
