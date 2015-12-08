// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import java.util.TimerTask;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            PhotoBillPayScanActivity, c

class s extends TimerTask
{

    final PhotoBillPayScanActivity a;

    s(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        a = photobillpayscanactivity;
        super();
    }

    public void run()
    {
        if (PhotoBillPayScanActivity.c(a) && !PhotoBillPayScanActivity.d(a))
        {
            PhotoBillPayScanActivity.a(a, false);
            Intent intent = new Intent("action_photo_scan_event");
            c.a.a(intent);
            LocalBroadcastManager.getInstance(a.getApplicationContext()).sendBroadcastSync(intent);
        }
    }
}
