// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f, e, c, d

public class b extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private e b;
    private boolean c;
    private c d;
    private d e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private CheckBox k;
    private TextView l;
    private boolean m;
    private boolean n;
    private int o;

    public b(Activity activity)
    {
        this(activity, e.a);
    }

    public b(Activity activity, e e1)
    {
        super(activity);
        b = e.a;
        c = false;
        m = false;
        n = false;
        b = e1;
        if (b == e.b)
        {
            setContentView(0x7f03005a);
        } else
        if (b == e.c)
        {
            setContentView(0x7f03005b);
        } else
        {
            setContentView(0x7f030059);
        }
        activity = a.getResources().getDisplayMetrics();
        o = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        activity = getWindow().getAttributes();
        activity.width = o;
        activity.height = -2;
        f = (TextView)findViewById(0x7f090061);
        g = (TextView)findViewById(0x7f090265);
        h = (TextView)findViewById(0x7f090269);
        i = (TextView)findViewById(0x7f090268);
        j = findViewById(0x7f090266);
        j.setVisibility(8);
        k = (CheckBox)findViewById(0x7f090264);
        k.setChecked(false);
        l = (TextView)findViewById(0x7f090267);
        setOnDismissListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        k.setOnCheckedChangeListener(this);
        j.setOnClickListener(this);
        a(findViewById(0x7f0900ae), 2, true);
        a(f, 4, true);
    }

    private String f(int i1)
    {
        return a.getString(i1);
    }

    public void a()
    {
        a(17, 0, 0, o, -2);
    }

    public void a(int i1)
    {
        f.setBackgroundColor(i1);
    }

    public void a(c c1)
    {
        d = c1;
    }

    public void a(d d1)
    {
        e = d1;
    }

    public void a(String s)
    {
        f.setText(s);
    }

    public void a(boolean flag)
    {
        m = flag;
        if (m)
        {
            j.setVisibility(0);
            return;
        } else
        {
            j.setVisibility(8);
            return;
        }
    }

    public void b(int i1)
    {
        f.setText(f(i1));
    }

    public void b(String s)
    {
        g.setText(s);
    }

    public void b(boolean flag)
    {
        n = flag;
        k.setChecked(n);
    }

    public void c(int i1)
    {
        g.setText(f(i1));
    }

    public void d(int i1)
    {
        h.setText(f(i1));
    }

    public void e(int i1)
    {
        i.setText(f(i1));
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.equals(k))
        {
            n = flag;
        }
    }

    public void onClick(View view)
    {
        if (view.equals(h))
        {
            c = true;
            dismiss();
        } else
        {
            if (view.equals(i))
            {
                c = false;
                dismiss();
                return;
            }
            if (view.equals(j))
            {
                k.toggle();
                return;
            }
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (d != null)
        {
            d.a(c);
        }
        if (e != null)
        {
            e.a(c, n);
        }
    }
}
