// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class zzo
{
    private class zza
        implements Runnable
    {

        final zzo zzaES;

        public void run()
        {
            synchronized (zzo.zzb(zzaES))
            {
                Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
                intent.setPackage("com.google.android.gms");
                intent.putStringArrayListExtra("PLACE_IDS", zzo.zzc(zzaES));
                intent.putStringArrayListExtra("METHOD_NAMES", zzo.zzd(zzaES));
                intent.putExtra("PACKAGE_NAME", zzo.zze(zzaES).getPackageName());
                intent.putExtra("CLIENT_VERSION", GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                zzo.zze(zzaES).sendBroadcast(intent);
                zzo.zza(zzaES, null);
                zzo.zzb(zzaES, null);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private zza()
        {
            zzaES = zzo.this;
            super();
        }

    }


    private static final String TAG = com/google/android/gms/location/places/internal/zzo.getSimpleName();
    private static final long zzaEN;
    private static zzo zzaEO;
    private final Context mContext;
    private final Handler mHandler;
    private final Runnable zzaEP;
    private ArrayList zzaEQ;
    private ArrayList zzaER;
    private final Object zzpc;

    private zzo(Context context)
    {
        this((Context)zzx.zzv(context), new Handler(Looper.getMainLooper()));
    }

    zzo(Context context, Handler handler)
    {
        zzaEP = new zza();
        zzpc = new Object();
        zzaEQ = null;
        zzaER = null;
        mContext = context;
        mHandler = handler;
    }

    static ArrayList zza(zzo zzo1, ArrayList arraylist)
    {
        zzo1.zzaEQ = arraylist;
        return arraylist;
    }

    public static zzo zzaE(Context context)
    {
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorenter ;
        int i;
        zzx.zzv(context);
        i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (zzaEO == null)
        {
            zzaEO = new zzo(context.getApplicationContext());
        }
        context = zzaEO;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static Object zzb(zzo zzo1)
    {
        return zzo1.zzpc;
    }

    static ArrayList zzb(zzo zzo1, ArrayList arraylist)
    {
        zzo1.zzaER = arraylist;
        return arraylist;
    }

    static ArrayList zzc(zzo zzo1)
    {
        return zzo1.zzaEQ;
    }

    static ArrayList zzd(zzo zzo1)
    {
        return zzo1.zzaER;
    }

    static Context zze(zzo zzo1)
    {
        return zzo1.mContext;
    }

    public void zzC(String s, String s1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzaEQ == null)
        {
            zzaEQ = new ArrayList();
            zzaER = new ArrayList();
            mHandler.postDelayed(zzaEP, zzaEN);
        }
        zzaEQ.add(s);
        zzaER.add(s1);
        if (zzaEQ.size() >= 10000)
        {
            if (Log.isLoggable(TAG, 5))
            {
                Log.w(TAG, "Event buffer full, flushing");
            }
            zzaEP.run();
            mHandler.removeCallbacks(zzaEP);
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
        zzaEN = TimeUnit.SECONDS.toMillis(1L);
    }
}
