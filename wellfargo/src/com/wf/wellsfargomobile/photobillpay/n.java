// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            c, t, o, PhotoBillPayScanActivity, 
//            a

class n extends BroadcastReceiver
{

    final PhotoBillPayScanActivity a;

    n(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        a = photobillpayscanactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = c.b(intent);
        switch (t.a[context.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.runOnUiThread(new o(this));
            break;
        }
        com.wf.wellsfargomobile.photobillpay.a.b("timeout_error");
        PhotoBillPayScanActivity.a(a, a.getResources().getString(0x7f0800c3));
    }
}
