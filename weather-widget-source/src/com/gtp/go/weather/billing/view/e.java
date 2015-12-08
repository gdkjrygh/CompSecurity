// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.view.View;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.statistics.w;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class e
    implements android.view.View.OnClickListener
{

    final PayActivity a;

    e(PayActivity payactivity)
    {
        a = payactivity;
        super();
    }

    public void onClick(View view)
    {
        PayActivity.a(a, null);
        if (PayActivity.d(a))
        {
            if (PayActivity.h(a).equals("1"))
            {
                PayActivity.i(a);
                PayActivity.j(a);
            } else
            if (w.s(a.getApplicationContext()))
            {
                PayActivity.i(a);
                if (!PayActivity.e(a) && PayActivity.f(a) != null)
                {
                    PayActivity.a(a, true);
                    PayActivity.f(a).startSetup(a);
                    return;
                }
            } else
            {
                PayActivity.a(a, a.getString(0x7f080331), true, false);
                return;
            }
            return;
        } else
        {
            PayActivity.g(a);
            return;
        }
    }
}
