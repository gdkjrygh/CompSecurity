// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzog, zzod, zznv

public class zznw
{
    public static interface zza
    {

        public abstract void zza(zzod zzod1);

        public abstract void zza(zzod zzod1, Activity activity);
    }


    private static final zza zzaEq[] = new zza[0];
    private static zznw zzaEr;
    private final Application zzaEs;
    private zzod zzaEt;
    private final List zzaEu = new ArrayList();
    private zzog zzaEv;

    private zznw(Application application)
    {
        zzu.zzu(application);
        zzaEs = application;
    }

    public static zznw zzaC(Context context)
    {
        zzu.zzu(context);
        context = (Application)context.getApplicationContext();
        zzu.zzu(context);
        com/google/android/gms/internal/zznw;
        JVM INSTR monitorenter ;
        if (zzaEr == null)
        {
            zzaEr = new zznw(context);
        }
        context = zzaEr;
        com/google/android/gms/internal/zznw;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/internal/zznw;
        JVM INSTR monitorexit ;
        throw context;
    }

    private zza[] zzwh()
    {
label0:
        {
            zza azza[];
            synchronized (zzaEu)
            {
                if (!zzaEu.isEmpty())
                {
                    break label0;
                }
                azza = zzaEq;
            }
            return azza;
        }
        zza azza1[] = (zza[])zzaEu.toArray(new zza[zzaEu.size()]);
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
        zzu.zzu(zza1);
        synchronized (zzaEu)
        {
            zzaEu.remove(zza1);
            zzaEu.add(zza1);
        }
        return;
        zza1;
        list;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public void zzaf(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
        } else
        if (zzwg() != flag)
        {
            if (flag)
            {
                zzaEv = new zzog(this);
                zzaEs.registerActivityLifecycleCallbacks(zzaEv);
                return;
            } else
            {
                zzaEs.unregisterActivityLifecycleCallbacks(zzaEv);
                zzaEv = null;
                return;
            }
        }
    }

    public void zzb(zzod zzod1, Activity activity)
    {
        zza azza[];
        boolean flag;
        flag = false;
        zzu.zzu(zzod1);
        azza = null;
        if (!zzod1.isMutable()) goto _L2; else goto _L1
_L1:
        if (activity instanceof zznv)
        {
            ((zznv)activity).zzb(zzod1);
        }
        if (zzaEt != null)
        {
            zzod1.zzhL(zzaEt.zzbn());
            zzod1.zzdJ(zzaEt.zzwB());
        }
        azza = zzwh();
        for (int i = 0; i < azza.length; i++)
        {
            azza[i].zza(zzod1, activity);
        }

        zzod1.zzwF();
        if (!TextUtils.isEmpty(zzod1.zzwB())) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (zzaEt != null && zzaEt.zzbn() == zzod1.zzbn())
        {
            zzaEt = zzod1;
            return;
        }
        zzwf();
        zzaEt = zzod1;
        activity = azza;
        int j = ((flag) ? 1 : 0);
        if (azza == null)
        {
            activity = zzwh();
            j = ((flag) ? 1 : 0);
        }
        while (j < activity.length) 
        {
            activity[j].zza(zzod1);
            j++;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public zzod zzwe()
    {
        return zzaEt;
    }

    public void zzwf()
    {
        zzaEt = null;
    }

    public boolean zzwg()
    {
        return zzaEv != null;
    }

}
