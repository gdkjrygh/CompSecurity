// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Notification;
import com.walmartlabs.payment.service.mpay.MobilePayNotificationManager;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            GCMIntentService

class val.notification
    implements com.walmart.android.wmservice.Callback
{

    final GCMIntentService this$0;
    final Notification val$notification;
    final String val$transactionId;

    public void onFailure(int i)
    {
        WLog.d(GCMIntentService.access$000(), "Failed to renew auth");
    }

    public void onSuccess()
    {
        WLog.d(GCMIntentService.access$000(), "Successfully renewed auth");
        MobilePayNotificationManager.get().notifyMobilePay(val$transactionId, GCMIntentService.this, val$notification);
    }

    cationManager()
    {
        this$0 = final_gcmintentservice;
        val$transactionId = s;
        val$notification = Notification.this;
        super();
    }
}
