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

private final class zzaFZ
    implements Runnable
{

    private final long zzIG = System.currentTimeMillis();
    private final String zzaFX;
    private final String zzaFY;
    private final long zzaFZ;
    private long zzaGa;
    final zzdb zzaGb;
    private final long zzaqe;

    public void run()
    {
        if (zzaFZ > 0L && zzaGa >= zzaFZ)
        {
            if (!"0".equals(zzaFY))
            {
                zzdb.zza(zzaGb).remove(zzaFY);
            }
            return;
        }
        zzaGa = zzaGa + 1L;
        if (zzbA())
        {
            long l = System.currentTimeMillis();
            zzdb.zzb(zzaGb).push(DataLayer.mapOf(new Object[] {
                "event", zzaFX, "gtm.timerInterval", String.valueOf(zzaqe), "gtm.timerLimit", String.valueOf(zzaFZ), "gtm.timerStartTime", String.valueOf(zzIG), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - zzIG), "gtm.timerEventNumber", String.valueOf(zzaGa), "gtm.triggers", zzaFY
            }));
        }
        zzdb.zzc(zzaGb).postDelayed(this, zzaqe);
    }

    protected boolean zzbA()
    {
        if (zzdb.zzd(zzaGb))
        {
            return zzdb.zze(zzaGb);
        }
        Object obj = (ActivityManager)zzdb.zzf(zzaGb).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaGb).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)zzdb.zzf(zzaGb).getSystemService("power");
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
        zzaGb = zzdb1;
        super();
        zzaFX = s;
        zzaFY = s1;
        zzaqe = l;
        zzaFZ = l1;
    }
}
