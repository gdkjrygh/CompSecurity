// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.squareup.otto.Bus;
import com.urbanairship.actions.ActionUtils;
import com.urbanairship.push.BaseIntentReceiver;
import com.urbanairship.push.PushMessage;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.TextUtils;
import com.walmartlabs.utils.WLog;

public class PushIntentReceiver extends BaseIntentReceiver
{

    private static final String ACTIVITY_ACTIONS[] = {
        "deep_link_action"
    };
    private static final String TAG = "PushIntentReceiver";

    public PushIntentReceiver()
    {
    }

    protected void onBackgroundPushReceived(Context context, PushMessage pushmessage)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onBackgroundPushReceived:\n").append(pushmessage.toString()).toString());
    }

    protected void onChannelRegistrationFailed(Context context)
    {
        WLog.d("PushIntentReceiver", "onChannelRegistrationFailed");
    }

    protected void onChannelRegistrationSucceeded(Context context, String s)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onChannelRegistrationSucceeded: ").append(s).toString());
    }

    protected boolean onNotificationActionOpened(Context context, PushMessage pushmessage, int i, String s, boolean flag)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onNotificationActionOpened:\n").append(pushmessage.toString()).toString());
        return false;
    }

    protected void onNotificationDismissed(Context context, PushMessage pushmessage, int i)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onNotificationDismissed:\n").append(pushmessage.toString()).toString());
    }

    protected boolean onNotificationOpened(Context context, PushMessage pushmessage, int i)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onNotificationOpened:\n").append(pushmessage.toString()).toString());
        if (!ActionUtils.containsRegisteredActions(pushmessage.getPushBundle(), ACTIVITY_ACTIONS))
        {
            pushmessage = new Intent("android.intent.action.VIEW");
            pushmessage.setData(Uri.parse("walmart://home"));
            pushmessage.setClass(context.getApplicationContext(), com/walmart/android/app/main/MainActivity);
            pushmessage.addFlags(0x10000000);
            context.startActivity(pushmessage);
        }
        return true;
    }

    protected void onPushReceived(Context context, PushMessage pushmessage, int i)
    {
        WLog.d("PushIntentReceiver", (new StringBuilder()).append("onPushReceived:\n").append(pushmessage.toString()).toString());
        context = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pushNotificationId");
        context.putString("notificationId", TextUtils.truncate(pushmessage.getAlert(), 60));
        MessageBus.getBus().post(context);
    }

}
