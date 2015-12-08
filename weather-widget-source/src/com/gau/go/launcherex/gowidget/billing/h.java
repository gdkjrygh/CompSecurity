// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.gau.go.launcherex.gowidget.statistics.n;
import com.gau.go.launcherex.gowidget.statistics.o;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.view.at;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity, a

class h extends BroadcastReceiver
{

    final BillingActivity a;

    private h(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    h(BillingActivity billingactivity, a a1)
    {
        this(billingactivity);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        context = intent.getAction();
        if (context != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        BillingActivity.d(a);
        BillingActivity.a(a, false);
        if (BillingActivity.e(a).b())
        {
            if (com.gau.go.launcherex.gowidget.billing.BillingActivity.f(a) != 1)
            {
                BillingActivity.h(a).a(new n(BillingActivity.g(a), 0, 0, com.gau.go.launcherex.gowidget.billing.BillingActivity.f(a), 0, 1));
            }
            if (BillingActivity.i(a) != null)
            {
                BillingActivity.i(a).setVisibility(8);
            }
            BillingActivity.j(a);
        }
        if (BillingActivity.k(a) != null)
        {
            BillingActivity.k(a).a(BillingActivity.e(a).c(), BillingActivity.e(a).b());
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION")) goto _L2; else goto _L4
_L4:
        BillingActivity.d(a);
        BillingActivity.a(a, false);
        boolean flag = BillingActivity.e(a).c();
        if (flag)
        {
            BillingActivity.h(a).a(new n(BillingActivity.g(a), 0, 0, com.gau.go.launcherex.gowidget.billing.BillingActivity.f(a), 0, 1));
            if (BillingActivity.k(a) != null)
            {
                BillingActivity.k(a).a(flag, BillingActivity.e(a).b());
                if (BillingActivity.l(a).getVisibility() != 0)
                {
                    BillingActivity.b(a, false);
                    return;
                }
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
