// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class zzs
{
    static class zza
    {

        public static final boolean zzak;
        private final List zzal = new ArrayList();
        private boolean zzam;

        private long zzx()
        {
            if (zzal.size() == 0)
            {
                return 0L;
            } else
            {
                long l = ((zza)zzal.get(0)).time;
                return ((zza)zzal.get(zzal.size() - 1)).time - l;
            }
        }

        protected void finalize()
            throws Throwable
        {
            if (!zzam)
            {
                zzd("Request on the loose");
                zzs.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public void zza(String s, long l)
        {
            this;
            JVM INSTR monitorenter ;
            if (zzam)
            {
                throw new IllegalStateException("Marker added to finished log");
            }
            break MISSING_BLOCK_LABEL_24;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
            zzal.add(new zza(s, l, SystemClock.elapsedRealtime()));
            this;
            JVM INSTR monitorexit ;
        }

        public void zzd(String s)
        {
            this;
            JVM INSTR monitorenter ;
            long l1;
            zzam = true;
            l1 = zzx();
            if (l1 > 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            long l;
            l = ((zza)zzal.get(0)).time;
            zzs.zzb("(%-4d ms) %s", new Object[] {
                Long.valueOf(l1), s
            });
            s = zzal.iterator();
_L4:
            if (!s.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            zza zza1 = (zza)s.next();
            l1 = zza1.time;
            zzs.zzb("(+%-4d) [%2d] %s", new Object[] {
                Long.valueOf(l1 - l), Long.valueOf(zza1.zzan), zza1.name
            });
            l = l1;
            if (true) goto _L4; else goto _L3
_L3:
            if (true) goto _L1; else goto _L5
_L5:
            s;
            throw s;
        }

        static 
        {
            zzak = zzs.DEBUG;
        }

        zza()
        {
            zzam = false;
        }
    }

    private static class zza.zza
    {

        public final String name;
        public final long time;
        public final long zzan;

        public zza.zza(String s, long l, long l1)
        {
            name = s;
            zzan = l;
            time = l1;
        }
    }


    public static boolean DEBUG;
    public static String TAG;

    public zzs()
    {
    }

    public static transient void zza(String s, Object aobj[])
    {
        if (DEBUG)
        {
            Log.v(TAG, zzd(s, aobj));
        }
    }

    public static transient void zza(Throwable throwable, String s, Object aobj[])
    {
        Log.e(TAG, zzd(s, aobj), throwable);
    }

    public static transient void zzb(String s, Object aobj[])
    {
        Log.d(TAG, zzd(s, aobj));
    }

    public static transient void zzc(String s, Object aobj[])
    {
        Log.e(TAG, zzd(s, aobj));
    }

    private static transient String zzd(String s, Object aobj[])
    {
        int i;
        String s1;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L3:
        if (i >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (aobj[i].getClass().equals(com/google/android/gms/internal/zzs)) goto _L2; else goto _L1
_L1:
        s1 = ((StackTraceElement) (aobj[i])).getClassName();
        s1 = s1.substring(s1.lastIndexOf('.') + 1);
        s1 = s1.substring(s1.lastIndexOf('$') + 1);
        aobj = (new StringBuilder()).append(s1).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
        });
_L2:
        i++;
          goto _L3
        aobj = "<unknown>";
          goto _L4
    }

    static 
    {
        TAG = "Volley";
        DEBUG = Log.isLoggable(TAG, 2);
    }
}
