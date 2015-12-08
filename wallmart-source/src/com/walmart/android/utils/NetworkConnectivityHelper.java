// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.walmartlabs.utils.WLog;

public class NetworkConnectivityHelper
{
    private class NetworkConnectivityChangeReceiver extends BroadcastReceiver
    {

        final NetworkConnectivityHelper this$0;

        public void onReceive(Context context, Intent intent)
        {
            WLog.d(NetworkConnectivityHelper.TAG, (new StringBuilder()).append("Connectivity change: ").append(intent.toString()).append(", extras=").append(intent.getExtras()).toString());
            context = intent.getExtras();
            boolean flag;
            if (context != null)
            {
                context = (NetworkInfo)context.get("networkInfo");
                if (context != null)
                {
                    if (context.getState() == android.net.NetworkInfo.State.CONNECTED)
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
                onConnectivityRestored();
            }
        }

        private NetworkConnectivityChangeReceiver()
        {
            this$0 = NetworkConnectivityHelper.this;
            super();
        }

    }


    private static final String TAG = com/walmart/android/utils/NetworkConnectivityHelper.getSimpleName();
    private BroadcastReceiver mConnectivityChangeReceiver;
    private final Context mContext;
    private Runnable mPostponedJob;

    public NetworkConnectivityHelper(Context context)
    {
        mContext = context;
    }

    public static boolean isConnected(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    private void onConnectivityRestored()
    {
        WLog.i(TAG, "Connectivity was restored, executing postponed job");
        unregisterConnectivityChangeReceiver();
        if (mPostponedJob != null)
        {
            mPostponedJob.run();
        }
        mPostponedJob = null;
    }

    private void registerConnectivityChangeReceiver()
    {
        if (mConnectivityChangeReceiver == null)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            mConnectivityChangeReceiver = new NetworkConnectivityChangeReceiver();
            mContext.registerReceiver(mConnectivityChangeReceiver, intentfilter);
            return;
        } else
        {
            WLog.w(TAG, "A connectivity change receiver is already registered");
            return;
        }
    }

    private void unregisterConnectivityChangeReceiver()
    {
        if (mConnectivityChangeReceiver != null)
        {
            mContext.unregisterReceiver(mConnectivityChangeReceiver);
            mConnectivityChangeReceiver = null;
            return;
        } else
        {
            WLog.w(TAG, "Trying to unregister a inexistent receiver");
            return;
        }
    }

    public void cancel()
    {
        mPostponedJob = null;
        unregisterConnectivityChangeReceiver();
    }

    public void executeWhenConnected(Runnable runnable)
    {
        mPostponedJob = runnable;
        registerConnectivityChangeReceiver();
    }

    public boolean isConnected()
    {
        return isConnected(mContext);
    }



}
