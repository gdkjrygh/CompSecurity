// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import com.gau.go.launcherex.gowidget.weather.scroller.AnimViewScrollGroup;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class b
    implements Runnable
{

    final BillingActivity a;

    b(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    public void run()
    {
        int i = BillingActivity.a(a).getChildCount();
        int j = BillingActivity.b(a);
        BillingActivity.a(a).a((j + 1) % i);
    }
}
