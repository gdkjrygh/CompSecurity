// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.walmartlabs.android.photo.controller.OrderActivity;
import com.walmartlabs.android.photo.gcm.request.PhotoCloudMessage;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;

public class PrintNotificationManager
{

    private static final int NOTIFICATION_COMPLETE = 1002;
    public static final int NOTIFICATION_PROCESSING = 1001;
    private static final int NOTIFICATION_STATUS = 1003;
    private static PrintNotificationManager sInstance;
    private Context mContext;
    private NotificationManager mNotificationManager;
    private android.support.v4.app.NotificationCompat.Builder mProcessingNotificationBuilder;

    private PrintNotificationManager(Context context)
    {
        mContext = context;
        mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
        mProcessingNotificationBuilder = new android.support.v4.app.NotificationCompat.Builder(mContext);
    }

    public static PrintNotificationManager get(Context context)
    {
        com/walmartlabs/android/photo/service/order/PrintNotificationManager;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PrintNotificationManager(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/service/order/PrintNotificationManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private PendingIntent getLaunchMainAppIntent()
    {
        return PendingIntent.getActivity(mContext, 0, AppIntegrationFactory.create(mContext).getNotificationReturnIntent(), 0);
    }

    public Notification getProcessingOrderNotification()
    {
        Object obj = new Intent(mContext, com/walmartlabs/android/photo/controller/OrderActivity);
        int i = (int)System.currentTimeMillis();
        obj = PendingIntent.getActivity(mContext, i, ((Intent) (obj)), 0);
        String s = mContext.getString(com.walmartlabs.android.photo.R.string.photo_processing_order_text);
        return mProcessingNotificationBuilder.setContentTitle(mContext.getString(com.walmartlabs.android.photo.R.string.photo_processing_order_title)).setTicker(mContext.getString(com.walmartlabs.android.photo.R.string.photo_processing_order_ticker)).setOngoing(true).setContentText(s).setSmallIcon(com.walmartlabs.android.photo.R.drawable.photo_ticker_icon).setContentIntent(((PendingIntent) (obj))).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s)).setProgress(100, 0, false).build();
    }

    public void removeProcessingOrderNotification()
    {
        mNotificationManager.cancel(1001);
    }

    public void showOrderDoneNotification(boolean flag)
    {
        Object obj;
        String s;
        String s1;
        if (flag)
        {
            obj = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_sent_ticker);
        } else
        {
            obj = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_failed_ticker);
        }
        if (flag)
        {
            s = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_sent_title);
        } else
        {
            s = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_failed_title);
        }
        if (flag)
        {
            s1 = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_sent_text);
        } else
        {
            s1 = mContext.getString(com.walmartlabs.android.photo.R.string.photo_order_failed_text);
        }
        obj = (new android.support.v4.app.NotificationCompat.Builder(mContext)).setContentTitle(s).setContentText(s1).setSmallIcon(com.walmartlabs.android.photo.R.drawable.photo_ticker_icon).setAutoCancel(true).setTicker(((CharSequence) (obj))).setContentIntent(getLaunchMainAppIntent()).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s1)).build();
        mNotificationManager.notify(1002, ((Notification) (obj)));
    }

    public void showOrderStatusNotification(PhotoCloudMessage photocloudmessage)
    {
        if (photocloudmessage != null)
        {
            String s = photocloudmessage.getTitle();
            String s1 = photocloudmessage.getTitle();
            photocloudmessage = photocloudmessage.getMessage();
            photocloudmessage = (new android.support.v4.app.NotificationCompat.Builder(mContext)).setContentTitle(s1).setContentText(photocloudmessage).setSmallIcon(com.walmartlabs.android.photo.R.drawable.photo_ticker_icon).setAutoCancel(true).setTicker(s).setContentIntent(getLaunchMainAppIntent()).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(photocloudmessage)).build();
            mNotificationManager.notify(1003, photocloudmessage);
        }
    }

    public void updateProcessingProgress(int i, int j)
    {
        mProcessingNotificationBuilder.setProgress(j, i, false);
        mNotificationManager.notify(1001, mProcessingNotificationBuilder.build());
    }
}
