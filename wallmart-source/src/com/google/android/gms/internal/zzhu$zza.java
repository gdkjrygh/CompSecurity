// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu

private final class <init> extends BroadcastReceiver
{

    final zzhu zzHN;

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        {
            zzhu.zza(zzHN, true);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            zzhu.zza(zzHN, false);
            return;
        }
    }

    private (zzhu zzhu1)
    {
        zzHN = zzhu1;
        super();
    }

    zzHN(zzhu zzhu1, zzHN zzhn)
    {
        this(zzhu1);
    }
}
