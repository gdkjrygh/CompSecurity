// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            i, a

class k
{

    final i a;
    private View b;
    private TextView c;
    private CheckBox d;
    private a e;

    k(i j)
    {
        a = j;
        super();
        b = j.a.getLayoutInflater().inflate(0x7f03005f, null);
        c = (TextView)b.findViewById(0x7f090222);
        d = (CheckBox)b.findViewById(0x7f090223);
    }

    static View a(k k1)
    {
        return k1.b;
    }

    private void b()
    {
        c.setText(e.a);
        d.setChecked(e.b);
    }

    public void a()
    {
        a a1 = e;
        boolean flag;
        if (!e.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.b = flag;
        b();
    }

    void a(int j)
    {
        e = (a)i.a(a).get(j);
        b();
    }
}
