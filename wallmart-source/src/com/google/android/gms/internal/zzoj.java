// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzot, zzoq, zzoi

public class zzoj
{
    public static interface zza
    {

        public abstract void zza(zzoq zzoq1);

        public abstract void zza(zzoq zzoq1, Activity activity);
    }


    private static final zza zzaIm[] = new zza[0];
    private static zzoj zzaIn;
    private final Application zzaIo;
    private zzoq zzaIp;
    private final List zzaIq = new ArrayList();
    private zzot zzaIr;

    private zzoj(Application application)
    {
        zzx.zzv(application);
        zzaIo = application;
    }

    public static zzoj zzaJ(Context context)
    {
        zzx.zzv(context);
        context = (Application)context.getApplicationContext();
        zzx.zzv(context);
        com/google/android/gms/internal/zzoj;
        JVM INSTR monitorenter ;
        if (zzaIn == null)
        {
            zzaIn = new zzoj(context);
        }
        context = zzaIn;
        com/google/android/gms/internal/zzoj;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/internal/zzoj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private zza[] zzxz()
    {
label0:
        {
            zza azza[];
            synchronized (zzaIq)
            {
                if (!zzaIq.isEmpty())
                {
                    break label0;
                }
                azza = zzaIm;
            }
            return azza;
        }
        zza azza1[] = (zza[])zzaIq.toArray(new zza[zzaIq.size()]);
        list;
        JVM INSTR monitorexit ;
        return azza1;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zza zza1)
    {
        zzx.zzv(zza1);
        synchronized (zzaIq)
        {
            zzaIq.remove(zza1);
            zzaIq.add(zza1);
        }
        return;
        zza1;
        list;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public void zzaj(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
        } else
        if (zzxy() != flag)
        {
            if (flag)
            {
                zzaIr = new zzot(this);
                zzaIo.registerActivityLifecycleCallbacks(zzaIr);
                return;
            } else
            {
                zzaIo.unregisterActivityLifecycleCallbacks(zzaIr);
                zzaIr = null;
                return;
            }
        }
    }

    public void zzb(zzoq zzoq1, Activity activity)
    {
        zza azza[];
        boolean flag;
        flag = false;
        zzx.zzv(zzoq1);
        azza = null;
        if (!zzoq1.isMutable()) goto _L2; else goto _L1
_L1:
        if (activity instanceof zzoi)
        {
            ((zzoi)activity).zzb(zzoq1);
        }
        if (zzaIp != null)
        {
            zzoq1.zzhT(zzaIp.zzbp());
            zzoq1.zzdU(zzaIp.zzxT());
        }
        azza = zzxz();
        for (int i = 0; i < azza.length; i++)
        {
            azza[i].zza(zzoq1, activity);
        }

        zzoq1.zzxX();
        if (!TextUtils.isEmpty(zzoq1.zzxT())) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (zzaIp != null && zzaIp.zzbp() == zzoq1.zzbp())
        {
            zzaIp = zzoq1;
            return;
        }
        zzxx();
        zzaIp = zzoq1;
        activity = azza;
        int j = ((flag) ? 1 : 0);
        if (azza == null)
        {
            activity = zzxz();
            j = ((flag) ? 1 : 0);
        }
        while (j < activity.length) 
        {
            activity[j].zza(zzoq1);
            j++;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public zzoq zzxw()
    {
        return zzaIp;
    }

    public void zzxx()
    {
        zzaIp = null;
    }

    public boolean zzxy()
    {
        return zzaIr != null;
    }

}
