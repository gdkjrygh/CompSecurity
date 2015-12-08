// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.service.mpay:
//            MobilePayNotificationManager, MobilePayPreferences

class val.notification extends CallbackSameThread
{

    final MobilePayNotificationManager this$0;
    final Context val$context;
    final Notification val$notification;
    final String val$transactionId;

    public void onResultSameThread(Request request, Result result)
    {
label0:
        {
            if (result.successful() && result.hasData() && !((Transaction)result.getData()).clientSeen)
            {
                WLog.d(MobilePayNotificationManager.access$000(), "Returned transaction");
                if (MobilePayNotificationManager.access$100(MobilePayNotificationManager.this) != null)
                {
                    break label0;
                }
                WLog.d(MobilePayNotificationManager.access$000(), "No listener registered; saving transaction to disk");
                MobilePayPreferences.setSavedTransaction(val$context, (Transaction)result.getData());
                request = (NotificationManager)val$context.getSystemService("notification");
                WLog.d(MobilePayNotificationManager.access$000(), "Sending notification");
                request.notify(val$transactionId, 0, val$notification);
            }
            return;
        }
        WLog.d(MobilePayNotificationManager.access$000(), "Push listener registered");
        MobilePayNotificationManager.access$100(MobilePayNotificationManager.this).onMobilePayPush((Transaction)result.getData());
    }

    bilePayPushListener()
    {
        this$0 = final_mobilepaynotificationmanager;
        val$context = context1;
        val$transactionId = s;
        val$notification = Notification.this;
        super();
    }
}
