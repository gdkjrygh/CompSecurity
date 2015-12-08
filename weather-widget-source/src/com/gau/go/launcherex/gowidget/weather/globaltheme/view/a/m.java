// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.award.o;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            l

class m extends o
{

    final b a;
    final k b;
    final l c;

    m(l l1, b b1, k k1)
    {
        c = l1;
        a = b1;
        b = k1;
        super();
    }

    public void a(int i, boolean flag, String s)
    {
        if (a.x().equals(s))
        {
            if (i == 1)
            {
                if (flag)
                {
                    a.d(true);
                    com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a.x(), true, c.a);
                    com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.l.a(c, a);
                } else
                {
                    com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.l.b(c, a);
                }
            } else
            {
                Toast.makeText(c.a, c.a.getString(0x7f0804b4), 0).show();
            }
        }
        com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.l.a(c);
        b.a();
    }
}
