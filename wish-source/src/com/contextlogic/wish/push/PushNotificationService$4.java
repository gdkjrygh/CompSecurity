// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

static final class val.image
    implements com.contextlogic.wish.api.service.allback
{

    final String val$alert;
    final Context val$context;
    final Bitmap val$image;
    final Notification val$notification;
    final int val$notificationId;
    final Intent val$notificationIntent;

    public void onServiceSucceeded(WishProduct wishproduct)
    {
        if (wishproduct.getImage() != null)
        {
            wishproduct = wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.ssCallback);
        } else
        {
            wishproduct = null;
        }
        PushNotificationService.access$200(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$image, wishproduct, PushNotificationService.access$400(val$context, val$notificationIntent));
    }

    uccessCallback(Context context1, Notification notification1, int i, Intent intent, String s, Bitmap bitmap)
    {
        val$context = context1;
        val$notification = notification1;
        val$notificationId = i;
        val$notificationIntent = intent;
        val$alert = s;
        val$image = bitmap;
        super();
    }
}
