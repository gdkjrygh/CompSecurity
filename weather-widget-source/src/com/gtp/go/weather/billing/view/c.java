// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.view.View;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.a;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity

class c
    implements android.view.View.OnClickListener
{

    final a a;
    final PayActivity b;

    c(PayActivity payactivity, a a1)
    {
        b = payactivity;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        com.gtp.go.weather.billing.view.PayActivity.a(b, a);
        if (PayActivity.d(b))
        {
            if (!PayActivity.e(b) && PayActivity.f(b) != null)
            {
                com.gtp.go.weather.billing.view.PayActivity.a(b, true);
                PayActivity.f(b).startSetup(b);
            }
            return;
        } else
        {
            PayActivity.g(b);
            return;
        }
    }
}
