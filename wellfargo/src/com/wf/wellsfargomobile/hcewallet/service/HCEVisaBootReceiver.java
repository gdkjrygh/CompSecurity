// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.visa.cbp.sdk.facade.broadcastreceiver.DeviceBootReceiver;
import com.wf.wellsfargomobile.WFApp;

public class HCEVisaBootReceiver extends BroadcastReceiver
{

    public HCEVisaBootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (WFApp.ah())
        {
            intent = new Intent(context, com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }
}
