// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.utils:
//            NetworkConnectivityHelper

private class <init> extends BroadcastReceiver
{

    final NetworkConnectivityHelper this$0;

    public void onReceive(Context context, Intent intent)
    {
        WLog.d(NetworkConnectivityHelper.access$000(), (new StringBuilder()).append("Connectivity change: ").append(intent.toString()).append(", extras=").append(intent.getExtras()).toString());
        context = intent.getExtras();
        boolean flag;
        if (context != null)
        {
            context = (NetworkInfo)context.get("networkInfo");
            if (context != null)
            {
                if (context.getState() == android.net.hangeReceiver)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = isConnected();
            }
        } else
        {
            flag = isConnected();
        }
        if (flag)
        {
            NetworkConnectivityHelper.access$100(NetworkConnectivityHelper.this);
        }
    }

    private ()
    {
        this$0 = NetworkConnectivityHelper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
