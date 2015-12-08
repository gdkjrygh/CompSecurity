// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f, aa, z

public class y extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener
{

    private aa b;
    private boolean c;
    private z d;
    private TextView e;
    private TextView f;
    private TextView g;
    private int h;

    public y(Activity activity)
    {
        this(activity, aa.a);
    }

    public y(Activity activity, aa aa1)
    {
        super(activity);
        b = aa.a;
        c = false;
        b = aa1;
        if (b == aa.b)
        {
            setContentView(0x7f030066);
        } else
        {
            setContentView(0x7f030065);
        }
        e = (TextView)findViewById(0x7f090061);
        f = (TextView)findViewById(0x7f090265);
        g = (TextView)findViewById(0x7f090087);
        setOnDismissListener(this);
        g.setOnClickListener(this);
        activity = a.getResources().getDisplayMetrics();
        h = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        a(findViewById(0x7f0900ae), 2, true);
        a(e, 4, true);
    }

    private String d(int i)
    {
        return a.getString(i);
    }

    public void a()
    {
        a(17, 0, 0, h, -2);
    }

    public void a(int i)
    {
        e.setText(d(i));
    }

    public void a(z z1)
    {
        d = z1;
    }

    public void a(String s)
    {
        f.setText(s);
    }

    public void b(int i)
    {
        f.setText(d(i));
    }

    public void c(int i)
    {
        g.setText(d(i));
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            c = true;
            dismiss();
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (d != null)
        {
            d.a(c);
        }
    }
}
