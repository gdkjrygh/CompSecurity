// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

private static class zzqO extends Handler
{

    private final Context zzqO;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 53;
           goto _L1 _L2
_L1:
        Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Don't know how to handle this message: ").append(message.what).toString());
_L4:
        return;
_L2:
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzqO);
        if (GooglePlayServicesUtil.isUserRecoverableError(i))
        {
            GooglePlayServicesUtil.zzb(i, zzqO);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (Context context)
    {
        Looper looper;
        if (Looper.myLooper() == null)
        {
            looper = Looper.getMainLooper();
        } else
        {
            looper = Looper.myLooper();
        }
        super(looper);
        zzqO = context.getApplicationContext();
    }
}
