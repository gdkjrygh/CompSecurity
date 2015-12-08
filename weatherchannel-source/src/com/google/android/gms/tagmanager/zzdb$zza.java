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

private final class zzaOn
    implements Runnable
{

    private final long zzMC = System.currentTimeMillis();
    private final String zzaOl;
    private final String zzaOm;
    private final long zzaOn;
    private long zzaOo;
    final zzdb zzaOp;
    private final long zzaxU;

    public void run()
    {
        if (zzaOn > 0L && zzaOo >= zzaOn)
        {
            if (!"0".equals(zzaOm))
            {
                zzdb.zza(zzaOp).remove(zzaOm);
            }
            return;
        }
        zzaOo = zzaOo + 1L;
        if (zzcq())
        {
            long l = System.currentTimeMillis();
            zzdb.zzb(zzaOp).push(DataLayer.mapOf(new Object[] {
                "event", zzaOl, "gtm.timerInterval", String.valueOf(zzaxU), "gtm.timerLimit", String.valueOf(zzaOn), "gtm.timerStartTime", String.valueOf(zzMC), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - zzMC), "gtm.timerEventNumber", String.valueOf(zzaOo), "gtm.triggers", zzaOm
            }));
        }
        zzdb.zzc(zzaOp).postDelayed(this, zzaxU);
    }

    protected boolean zzcq()
    {
        if (zzdb.zzd(zzaOp))
        {
            return zzdb.zze(zzaOp);
        }
        Object obj = (ActivityManager)zzdb.zzf(zzaOp).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaOp).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)zzdb.zzf(zzaOp).getSystemService("power");
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
        zzaOp = zzdb1;
        super();
        zzaOl = s;
        zzaOm = s1;
        zzaxU = l;
        zzaOn = l1;
    }
}
