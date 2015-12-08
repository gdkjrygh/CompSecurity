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
//            MobilePayManager, MobilePayPreferences

public class MobilePayNotificationManager
{
    public static interface MobilePayPushListener
    {

        public abstract void onMobilePayPush(Transaction transaction);
    }


    private static final String TAG = com/walmartlabs/payment/service/mpay/MobilePayNotificationManager.getSimpleName();
    private static MobilePayNotificationManager sInstance = new MobilePayNotificationManager();
    private MobilePayPushListener mPushListener;

    private MobilePayNotificationManager()
    {
        mPushListener = null;
    }

    public static MobilePayNotificationManager get()
    {
        return sInstance;
    }

    public void notifyMobilePay(final String transactionId, final Context context, final Notification notification)
    {
        WLog.d(TAG, (new StringBuilder()).append("In notifyMobilePay, transactionId = ").append(transactionId).toString());
        MobilePayManager.get().getUserTransaction().addCallback(new CallbackSameThread() {

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
                        WLog.d(MobilePayNotificationManager.TAG, "Returned transaction");
                        if (mPushListener != null)
                        {
                            break label0;
                        }
                        WLog.d(MobilePayNotificationManager.TAG, "No listener registered; saving transaction to disk");
                        MobilePayPreferences.setSavedTransaction(context, (Transaction)result.getData());
                        request = (NotificationManager)context.getSystemService("notification");
                        WLog.d(MobilePayNotificationManager.TAG, "Sending notification");
                        request.notify(transactionId, 0, notification);
                    }
                    return;
                }
                WLog.d(MobilePayNotificationManager.TAG, "Push listener registered");
                mPushListener.onMobilePayPush((Transaction)result.getData());
            }

            
            {
                this$0 = MobilePayNotificationManager.this;
                context = context1;
                transactionId = s;
                notification = notification1;
                super();
            }
        });
    }

    public void registerMobilePayPushListener(MobilePayPushListener mobilepaypushlistener)
    {
        mPushListener = mobilepaypushlistener;
    }

    public void unregisterMobilePayPushListener()
    {
        mPushListener = null;
    }



}
