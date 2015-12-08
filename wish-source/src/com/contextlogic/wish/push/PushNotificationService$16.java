// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.contextlogic.wish.http.ImageHttpResponseHandler;
import com.samsung.android.sdk.richnotification.SrnAction;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

static final class nit> extends ImageHttpResponseHandler
{

    final SrnAction val$action;
    final String val$alert;
    final Context val$context;
    final Notification val$notification;
    final int val$notificationId;
    final Intent val$notificationIntent;
    final Bitmap val$originalImage;

    public void onFailure(Throwable throwable, Bitmap bitmap)
    {
        PushNotificationService.access$300(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$originalImage, val$action);
    }

    public void onSuccess(Bitmap bitmap)
    {
        PushNotificationService.access$300(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, bitmap, val$action);
    }

    (Context context1, Notification notification1, int i, Intent intent, String s, SrnAction srnaction, Bitmap bitmap)
    {
        val$context = context1;
        val$notification = notification1;
        val$notificationId = i;
        val$notificationIntent = intent;
        val$alert = s;
        val$action = srnaction;
        val$originalImage = bitmap;
        super();
    }
}
