// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.content.Intent;
import android.graphics.Bitmap;
import com.contextlogic.wish.http.ImageHttpResponseHandler;

// Referenced classes of package com.contextlogic.wish.push:
//            PushNotificationService

class init> extends ImageHttpResponseHandler
{

    final PushNotificationService this$0;
    final String val$alert;
    final Intent val$intent;

    public void onFailure(Throwable throwable, Bitmap bitmap)
    {
        PushNotificationService.access$000(PushNotificationService.this, val$intent, val$alert, null);
    }

    public void onSuccess(Bitmap bitmap)
    {
        PushNotificationService.access$000(PushNotificationService.this, val$intent, val$alert, bitmap);
    }

    ()
    {
        this$0 = final_pushnotificationservice;
        val$intent = intent1;
        val$alert = String.this;
        super();
    }
}
