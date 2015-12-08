// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

static final class val.image
    implements com.contextlogic.wish.api.service.ack
{

    final String val$alert;
    final Context val$context;
    final Bitmap val$image;
    final Notification val$notification;
    final int val$notificationId;
    final Intent val$notificationIntent;

    public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
    {
        if (wishcart != null && wishcart.getItems().size() > 0)
        {
            PushNotificationService.access$200(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$image, ((WishCartItem)wishcart.getItems().get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.image), PushNotificationService.access$600(val$context, val$notificationIntent));
            return;
        } else
        {
            PushNotificationService.access$300(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$image, PushNotificationService.access$600(val$context, val$notificationIntent));
            return;
        }
    }

    ssCallback(Context context1, Notification notification1, int i, Intent intent, String s, Bitmap bitmap)
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
