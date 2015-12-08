// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdb, DataLayer

private final class zzaSH
    implements Runnable
{

    private final long zzOC = System.currentTimeMillis();
    private final long zzaBW;
    private final String zzaSF;
    private final String zzaSG;
    private final long zzaSH;
    private long zzaSI;
    final zzdb zzaSJ;

    public void run()
    {
        if (zzaSH > 0L && zzaSI >= zzaSH)
        {
            if (!"0".equals(zzaSG))
            {
                zzdb.zza(zzaSJ).remove(zzaSG);
            }
            return;
        }
        zzaSI = zzaSI + 1L;
        if (zzcu())
        {
            long l = System.currentTimeMillis();
            zzdb.zzb(zzaSJ).push(DataLayer.mapOf(new Object[] {
                "event", zzaSF, "gtm.timerInterval", String.valueOf(zzaBW), "gtm.timerLimit", String.valueOf(zzaSH), "gtm.timerStartTime", String.valueOf(zzOC), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - zzOC), "gtm.timerEventNumber", String.valueOf(zzaSI), "gtm.triggers", zzaSG
            }));
        }
        zzdb.zzc(zzaSJ).postDelayed(this, zzaBW);
    }

    protected boolean zzcu()
    {
        if (zzdb.zzd(zzaSJ))
        {
            return zzdb.zze(zzaSJ);
        }
        Object obj = (ActivityManager)zzdb.zzf(zzaSJ).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaSJ).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)zzdb.zzf(zzaSJ).getSystemService("power");
        for (obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); ((Iterator) (obj)).hasNext();)
        {
            android.app.anager.RunningAppProcessInfo runningappprocessinfo = (android.app.anager.RunningAppProcessInfo)((Iterator) (obj)).next();
            if (Process.myPid() == runningappprocessinfo.pid && runningappprocessinfo.importance == 100 && !keyguardmanager.inKeyguardRestrictedInputMode() && powermanager.isScreenOn())
            {
                return true;
            }
        }

        return false;
    }

    ssInfo(zzdb zzdb1, String s, String s1, long l, long l1)
    {
        zzaSJ = zzdb1;
        super();
        zzaSF = s;
        zzaSG = s1;
        zzaBW = l;
        zzaSH = l1;
    }
}
