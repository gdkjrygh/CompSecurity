// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class zzo
{
    private class zza
        implements Runnable
    {

        final zzo zzaAV;

        public void run()
        {
            synchronized (zzo.zzb(zzaAV))
            {
                Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
                intent.setPackage("com.google.android.gms");
                intent.putStringArrayListExtra("PLACE_IDS", zzo.zzc(zzaAV));
                intent.putStringArrayListExtra("METHOD_NAMES", zzo.zzd(zzaAV));
                zzo.zze(zzaAV).sendBroadcast(intent);
                zzo.zza(zzaAV, null);
                zzo.zzb(zzaAV, null);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private zza()
        {
            zzaAV = zzo.this;
            super();
        }

    }


    private static final String TAG = com/google/android/gms/location/places/internal/zzo.getSimpleName();
    private static final long zzaAQ;
    private static zzo zzaAR;
    private final Context mContext;
    private final Handler mHandler;
    private final Runnable zzaAS;
    private ArrayList zzaAT;
    private ArrayList zzaAU;
    private final Object zzqt;

    private zzo(Context context)
    {
        this((Context)zzu.zzu(context), new Handler(Looper.getMainLooper()));
    }

    zzo(Context context, Handler handler)
    {
        zzaAS = new zza();
        zzqt = new Object();
        zzaAT = null;
        zzaAU = null;
        mContext = context;
        mHandler = handler;
    }

    static ArrayList zza(zzo zzo1, ArrayList arraylist)
    {
        zzo1.zzaAT = arraylist;
        return arraylist;
    }

    public static zzo zzax(Context context)
    {
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorenter ;
        int i;
        zzu.zzu(context);
        i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (zzaAR == null)
        {
            zzaAR = new zzo(context.getApplicationContext());
        }
        context = zzaAR;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static Object zzb(zzo zzo1)
    {
        return zzo1.zzqt;
    }

    static ArrayList zzb(zzo zzo1, ArrayList arraylist)
    {
        zzo1.zzaAU = arraylist;
        return arraylist;
    }

    static ArrayList zzc(zzo zzo1)
    {
        return zzo1.zzaAT;
    }

    static ArrayList zzd(zzo zzo1)
    {
        return zzo1.zzaAU;
    }

    static Context zze(zzo zzo1)
    {
        return zzo1.mContext;
    }

    public void zzA(String s, String s1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzaAT == null)
        {
            zzaAT = new ArrayList();
            zzaAU = new ArrayList();
            mHandler.postDelayed(zzaAS, zzaAQ);
        }
        zzaAT.add(s);
        zzaAU.add(s1);
        if (zzaAT.size() >= 10000)
        {
            if (Log.isLoggable(TAG, 5))
            {
                Log.w(TAG, "Event buffer full, flushing");
            }
            zzaAS.run();
            mHandler.removeCallbacks(zzaAS);
            return;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        zzaAQ = TimeUnit.SECONDS.toMillis(1L);
    }
}
