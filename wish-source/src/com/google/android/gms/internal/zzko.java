// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzky, zzkv, zzkn

public class zzko
{
    public static interface zza
    {

        public abstract void zza(zzkv zzkv1);

        public abstract void zza(zzkv zzkv1, Activity activity);
    }


    private static final zza zzawt[] = new zza[0];
    private static zzko zzawu;
    private final Application zzawv;
    private zzkv zzaww;
    private final List zzawx = new ArrayList();
    private zzky zzawy;

    private zzko(Application application)
    {
        zzv.zzr(application);
        zzawv = application;
    }

    public static zzko zzal(Context context)
    {
        zzv.zzr(context);
        context = (Application)context.getApplicationContext();
        zzv.zzr(context);
        com/google/android/gms/internal/zzko;
        JVM INSTR monitorenter ;
        if (zzawu == null)
        {
            zzawu = new zzko(context);
        }
        context = zzawu;
        com/google/android/gms/internal/zzko;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/internal/zzko;
        JVM INSTR monitorexit ;
        throw context;
    }

    private zza[] zzup()
    {
label0:
        {
            zza azza[];
            synchronized (zzawx)
            {
                if (!zzawx.isEmpty())
                {
                    break label0;
                }
                azza = zzawt;
            }
            return azza;
        }
        zza azza1[] = (zza[])zzawx.toArray(new zza[zzawx.size()]);
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
        zzv.zzr(zza1);
        synchronized (zzawx)
        {
            zzawx.remove(zza1);
            zzawx.add(zza1);
        }
        return;
        zza1;
        list;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public void zzaa(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
        } else
        if (zzuo() != flag)
        {
            if (flag)
            {
                zzawy = new zzky(this);
                zzawv.registerActivityLifecycleCallbacks(zzawy);
                return;
            } else
            {
                zzawv.unregisterActivityLifecycleCallbacks(zzawy);
                zzawy = null;
                return;
            }
        }
    }

    public void zzb(zzkv zzkv1, Activity activity)
    {
        zza azza[];
        boolean flag;
        flag = false;
        zzv.zzr(zzkv1);
        azza = null;
        if (!zzkv1.isMutable()) goto _L2; else goto _L1
_L1:
        if (activity instanceof zzkn)
        {
            ((zzkn)activity).zzb(zzkv1);
        }
        if (zzaww != null)
        {
            zzkv1.zzgJ(zzaww.zzaJ());
            zzkv1.zzdd(zzaww.zzuJ());
        }
        azza = zzup();
        for (int i = 0; i < azza.length; i++)
        {
            azza[i].zza(zzkv1, activity);
        }

        zzkv1.zzuN();
        if (!TextUtils.isEmpty(zzkv1.zzuJ())) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (zzaww != null && zzaww.zzaJ() == zzkv1.zzaJ())
        {
            zzaww = zzkv1;
            return;
        }
        zzun();
        zzaww = zzkv1;
        activity = azza;
        int j = ((flag) ? 1 : 0);
        if (azza == null)
        {
            activity = zzup();
            j = ((flag) ? 1 : 0);
        }
        while (j < activity.length) 
        {
            activity[j].zza(zzkv1);
            j++;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public zzkv zzum()
    {
        return zzaww;
    }

    public void zzun()
    {
        zzaww = null;
    }

    public boolean zzuo()
    {
        return zzawy != null;
    }

}
