// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class a extends Handler
{

    final BillingActivity a;

    a(BillingActivity billingactivity)
    {
        a = billingactivity;
        super();
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            BillingActivity.a(a, null, a.getString(0x7f08033c));
        }
    }
}
