// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.widget.Toast;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.award.o;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class a extends o
{

    final k a;
    final PayActivity b;

    a(PayActivity payactivity, k k1)
    {
        b = payactivity;
        a = k1;
        super();
    }

    public void a(int i, boolean flag, String s)
    {
        if (PayActivity.a(b).equals(s))
        {
            if (i == 1)
            {
                if (flag)
                {
                    com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(PayActivity.a(b), true, b.getApplicationContext());
                    b.b();
                } else
                {
                    PayActivity.b(b);
                    PayActivity.c(b);
                }
            } else
            {
                Toast.makeText(b.getApplicationContext(), b.getString(0x7f0804b4), 0).show();
            }
        }
        a.a();
    }
}
