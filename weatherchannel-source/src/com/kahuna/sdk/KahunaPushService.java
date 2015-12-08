// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            GCMBaseIntentService, KahunaCommon, Kahuna, IKahuna, 
//            PushNotificationsManager, GCMRegistrationManager

public class KahunaPushService extends GCMBaseIntentService
{

    public KahunaPushService()
    {
        super(new String[] {
            KahunaCommon.senderId
        });
    }

    protected void onError(Context context, String s)
    {
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("onError recieved errorId: ").append(s).toString());
        }
    }

    protected void onMessage(Context context, Intent intent)
    {
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "onMessage recieved a push event.");
        }
        if (!Kahuna.getInstance().getIsPushEnabled())
        {
            Log.d("Kahuna", "Received Kahuna push, but Push is not enabled. Aborting the notification!");
            return;
        } else
        {
            PushNotificationsManager.handlePushMessageRecieved(context, intent.getExtras());
            return;
        }
    }

    protected boolean onRecoverableError(Context context, String s)
    {
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("onRecoverableError recieved errorId: ").append(s).toString());
        }
        return super.onRecoverableError(context, s);
    }

    protected void onRegistered(Context context, String s)
    {
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("onRegistered recieved Push Token: ").append(s).toString());
        }
        GCMRegistrationManager.handlePushTokenReceived(s);
    }

    protected void onUnregistered(Context context, String s)
    {
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("onUnregistered recieved to remove Push Token: ").append(s).toString());
        }
        GCMRegistrationManager.handleDisablePush();
    }
}
