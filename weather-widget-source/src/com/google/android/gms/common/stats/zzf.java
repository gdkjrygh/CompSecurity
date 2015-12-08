// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Process;
import android.text.TextUtils;

public class zzf
{

    public static String zza(android.os.PowerManager.WakeLock wakelock, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(String.valueOf(Process.myPid() << 32 | System.identityHashCode(wakelock)));
        wakelock = s;
        if (TextUtils.isEmpty(s))
        {
            wakelock = "";
        }
        return stringbuilder.append(wakelock).toString();
    }
}
