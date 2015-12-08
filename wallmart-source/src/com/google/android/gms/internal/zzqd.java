// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzf;
import com.google.android.gms.common.stats.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzma, zzlz, zzkq, zzlv

public class zzqd
{

    private static boolean DEBUG = false;
    private static String TAG = "WakeLock";
    private final Context mContext;
    private int zzaOA;
    private final android.os.PowerManager.WakeLock zzaOu;
    private WorkSource zzaOv;
    private final int zzaOw;
    private final String zzaOx;
    private boolean zzaOy;
    private int zzaOz;
    private final String zzafS;

    public zzqd(Context context, int i, String s)
    {
        this(context, i, s, null, null);
    }

    public zzqd(Context context, int i, String s, String s1, String s2)
    {
        zzaOy = true;
        zzx.zzh(s, "Wake lock name can NOT be empty");
        zzaOw = i;
        zzafS = s;
        zzaOx = s1;
        mContext = context.getApplicationContext();
        zzaOu = ((PowerManager)context.getSystemService("power")).newWakeLock(i, s);
        if (zzma.zzaq(mContext))
        {
            s = s2;
            if (zzlz.zzcB(s2))
            {
                if (zzd.zzacF && zzkq.isInitialized())
                {
                    Log.e(TAG, (new StringBuilder()).append("callingPackage is not supposed to be empty for wakelock ").append(zzafS).append("!").toString());
                    s = "com.google.android.gms";
                } else
                {
                    s = context.getPackageName();
                }
            }
            zzaOv = zzma.zzj(context, s);
            zzc(zzaOv);
        }
    }

    private void zzen(String s)
    {
        String s1;
        boolean flag;
        flag = zzep(s);
        s1 = zzi(s, flag);
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("Acquire:\n mWakeLockName: ").append(zzafS).append("\n mSecondaryName: ").append(zzaOx).append("\nmReferenceCounted: ").append(zzaOy).append("\nreason: ").append(s).append("\nmOpenEventCount").append(zzaOA).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s1).toString());
        }
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!zzaOy)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        i = zzaOz;
        zzaOz = i + 1;
        if (i == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        if (zzaOy || zzaOA != 0)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        zzh.zzpL().zza(mContext, zzf.zza(zzaOu, s1), 7, zzafS, s1, zzaOw, zzma.zzb(zzaOv));
        zzaOA = zzaOA + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void zzeo(String s)
    {
        String s1;
        boolean flag;
        flag = zzep(s);
        s1 = zzi(s, flag);
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("Release:\n mWakeLockName: ").append(zzafS).append("\n mSecondaryName: ").append(zzaOx).append("\nmReferenceCounted: ").append(zzaOy).append("\nreason: ").append(s).append("\n mOpenEventCount").append(zzaOA).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s1).toString());
        }
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!zzaOy)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        i = zzaOz - 1;
        zzaOz = i;
        if (i == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (zzaOy || zzaOA != 1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        zzh.zzpL().zza(mContext, zzf.zza(zzaOu, s1), 8, zzafS, s1, zzaOw, zzma.zzb(zzaOv));
        zzaOA = zzaOA - 1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private boolean zzep(String s)
    {
        return !TextUtils.isEmpty(s) && !s.equals(zzaOx);
    }

    private String zzi(String s, boolean flag)
    {
        if (zzaOy)
        {
            if (flag)
            {
                return s;
            } else
            {
                return zzaOx;
            }
        } else
        {
            return zzaOx;
        }
    }

    public void acquire(long l)
    {
        if (!zzlv.zzpR() && zzaOy)
        {
            Log.wtf(TAG, (new StringBuilder()).append("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ").append(zzafS).toString());
        }
        zzen(null);
        zzaOu.acquire(l);
    }

    public boolean isHeld()
    {
        return zzaOu.isHeld();
    }

    public void release()
    {
        zzeo(null);
        zzaOu.release();
    }

    public void setReferenceCounted(boolean flag)
    {
        zzaOu.setReferenceCounted(flag);
        zzaOy = flag;
    }

    public void zzc(WorkSource worksource)
    {
        if (zzma.zzaq(mContext) && worksource != null)
        {
            if (zzaOv != null)
            {
                zzaOv.add(worksource);
            } else
            {
                zzaOv = worksource;
            }
            zzaOu.setWorkSource(zzaOv);
        }
    }

}
