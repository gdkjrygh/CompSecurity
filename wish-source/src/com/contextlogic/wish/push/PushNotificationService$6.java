// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

static final class val.image
    implements com.contextlogic.wish.api.service.sCallback
{

    final String val$alert;
    final Context val$context;
    final Bitmap val$image;
    final Notification val$notification;
    final int val$notificationId;
    final Intent val$notificationIntent;

    public void onServiceSucceeded(ArrayList arraylist, boolean flag, int i, WishCredit wishcredit, String s, String s1, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
            String s2)
    {
        if (arraylist.size() > 0)
        {
            PushNotificationService.access$200(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$image, ((WishProduct)arraylist.get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.image), PushNotificationService.access$500(val$context, val$notificationIntent));
            return;
        } else
        {
            PushNotificationService.access$300(val$context, val$notification, val$notificationId, val$notificationIntent, val$alert, val$image, PushNotificationService.access$500(val$context, val$notificationIntent));
            return;
        }
    }

    c(Context context1, Notification notification1, int i, Intent intent, String s, Bitmap bitmap)
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
