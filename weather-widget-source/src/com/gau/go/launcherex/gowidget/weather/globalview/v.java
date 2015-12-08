// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            t, a, x

class v
{

    final t a;
    private View b;
    private TextView c;
    private RadioButton d;
    private a e;

    v(t t1)
    {
        a = t1;
        super();
        b = t1.a.getLayoutInflater().inflate(0x7f030064, null);
        c = (TextView)b.findViewById(0x7f090222);
        d = (RadioButton)b.findViewById(0x7f090223);
    }

    static View a(v v1)
    {
        return v1.b;
    }

    private void b()
    {
        c.setText(e.a);
        d.setChecked(e.b);
    }

    public void a()
    {
        Iterator iterator = t.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (!a1.b)
            {
                continue;
            }
            a1.b = false;
            break;
        } while (true);
        e.b = true;
        t.b(a).notifyDataSetChanged();
        t.a(a, true);
        a.dismiss();
    }

    void a(int i)
    {
        e = (a)t.a(a).get(i);
        b();
    }
}
