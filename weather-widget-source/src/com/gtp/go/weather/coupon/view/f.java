// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            g

public class f extends com.gau.go.launcherex.gowidget.weather.globalview.f
    implements android.view.View.OnClickListener
{

    private TextView b;
    private TextView c;
    private EditText d;
    private TextView e;
    private TextView f;
    private TextView g;
    private int h;
    private g i;

    public f(Activity activity)
    {
        super(activity);
        setContentView(0x7f030051);
        b = (TextView)findViewById(0x7f090236);
        c = (TextView)findViewById(0x7f090237);
        d = (EditText)findViewById(0x7f090238);
        e = (TextView)findViewById(0x7f090239);
        f = (TextView)findViewById(0x7f09023a);
        g = (TextView)findViewById(0x7f09023b);
        e.setOnClickListener(this);
        activity = a.getResources().getDisplayMetrics();
        h = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
    }

    public void a()
    {
        g.setVisibility(8);
    }

    public void a(g g1)
    {
        i = g1;
    }

    public void a(String s)
    {
        g.setVisibility(0);
        g.setText(s);
    }

    public TextView b()
    {
        return e;
    }

    public void b(String s)
    {
        b.setText(s);
    }

    public String c()
    {
        return c.getText().toString();
    }

    public void c(String s)
    {
        if (s != null)
        {
            c.setText(s);
            c.setVisibility(0);
            d.setVisibility(8);
        }
    }

    public void d()
    {
        c.setVisibility(8);
        d.setVisibility(0);
    }

    public void d(String s)
    {
        f.setText(s);
    }

    public String e()
    {
        return d.getText().toString();
    }

    public void f()
    {
        a(17, 0, 0, h, -2);
    }

    public void onClick(View view)
    {
        if (view.equals(e))
        {
            i.a();
        }
    }
}
