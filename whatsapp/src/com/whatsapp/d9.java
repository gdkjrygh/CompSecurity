// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            du, f7, f1, aka, 
//            _w, iz, fe, l7, 
//            asc, aub, a92

public class d9 extends du
{

    private final int c;
    private String d;
    private final a92 e;
    private EditText f;
    private final String g;
    private final Activity h;
    private fe i;
    private final int j;
    private boolean k;
    private TextView l;
    private final int m;
    private final Context n;
    private final int o;

    public d9(Activity activity, int i1, String s, a92 a92, int j1, int k1, int l1)
    {
        super(activity, 0x7f030061);
        k = true;
        h = activity;
        n = activity.getBaseContext();
        e = a92;
        j = i1;
        o = j1;
        c = k1;
        m = l1;
        g = s;
    }

    static int a(d9 d9_1)
    {
        return d9_1.o;
    }

    static String a(d9 d9_1, String s)
    {
        d9_1.d = s;
        return s;
    }

    static boolean a(d9 d9_1, boolean flag)
    {
        d9_1.k = flag;
        return flag;
    }

    static Activity b(d9 d9_1)
    {
        return d9_1.h;
    }

    static int c(d9 d9_1)
    {
        return d9_1.m;
    }

    static fe d(d9 d9_1)
    {
        return d9_1.i;
    }

    static EditText e(d9 d9_1)
    {
        return d9_1.f;
    }

    static a92 f(d9 d9_1)
    {
        return d9_1.e;
    }

    static TextView g(d9 d9_1)
    {
        return d9_1.l;
    }

    static Context h(d9 d9_1)
    {
        return d9_1.n;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((TextView)findViewById(0x7f0b01bb)).setText(j);
        setTitle(j);
        ((Button)findViewById(0x7f0b01bd)).setOnClickListener(new f7(this));
        ((Button)findViewById(0x7f0b01be)).setOnClickListener(new f1(this));
        l = (TextView)findViewById(0x7f0b01c1);
        f = (EditText)findViewById(0x7f0b01c0);
        if (o > 0)
        {
            l.setVisibility(0);
            f.setFilters(new InputFilter[] {
                new aka(o)
            });
        }
        f.addTextChangedListener(new _w(this));
        iz.a(f);
        bundle = getWindow().getAttributes();
        bundle.width = -1;
        bundle.gravity = 48;
        getWindow().setAttributes(bundle);
        i = new fe(h);
        i.a(new l7(this));
        ((ImageButton)findViewById(0x7f0b01bf)).setOnClickListener(new asc(this));
        setOnCancelListener(new aub(this));
        getWindow().setSoftInputMode(5);
    }

    public void onStart()
    {
        super.onStart();
        String s;
        if (d != null)
        {
            s = d;
        } else
        {
            s = g;
        }
        if (c != 0)
        {
            f.setHint(c);
        }
        f.setText(com.whatsapp.util.c.b(s, n));
        if (s != null)
        {
            f.selectAll();
        }
    }

    public void onStop()
    {
        super.onStop();
        if (k)
        {
            d = f.getText().toString();
        }
    }
}
