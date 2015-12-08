// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotificationManager

private class <init> extends BroadcastReceiver
{

    final SrnRichNotificationManager this$0;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_BACKWARD"))
            {
                String s = intent.getStringExtra("notification.sdk.packagename");
                if (context.getPackageName().equals(s))
                {
                    break label0;
                }
            }
            return;
        }
        context = SrnRichNotificationManager.access$2(SrnRichNotificationManager.this).e();
        context.obj = intent.getExtras();
        SrnRichNotificationManager.access$2(SrnRichNotificationManager.this)._mth0(context);
    }

    private ()
    {
        this$0 = SrnRichNotificationManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
