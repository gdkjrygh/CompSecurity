// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.contextlogic.wish.api.service.ServerPingService;
import com.contextlogic.wish.user.UserPreferences;

public class InstallReceiver extends BroadcastReceiver
{

    public InstallReceiver()
    {
    }

    private void sendServerPing(String s)
    {
        UserPreferences.setServerPingSent(true);
        (new ServerPingService()).requestService(s, null, null, null);
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        if (intent != null)
        {
            UserPreferences.setAppReferrer(context, intent);
            sendServerPing(intent);
        }
    }
}
