// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Dialog;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class f
    implements Runnable
{

    final BillingActivity a;

    f(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    public void run()
    {
        if (!a.isFinishing())
        {
            BillingActivity.m(a).dismiss();
        }
    }
}
