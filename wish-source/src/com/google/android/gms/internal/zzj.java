// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzi, zze, zzp, zzm, 
//            zzn

public class zzj extends zzi
{
    class zza
    {

        private String zzlI;
        private boolean zzlJ;
        final zzj zzlK;

        public String getId()
        {
            return zzlI;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return zzlJ;
        }

        public zza(String s, boolean flag)
        {
            zzlK = zzj.this;
            super();
            zzlI = s;
            zzlJ = flag;
        }
    }

    private static final class zzb
        implements Runnable
    {

        private Context zzlL;

        public void run()
        {
            AdvertisingIdClient advertisingidclient;
            advertisingidclient = new AdvertisingIdClient(zzlL);
            advertisingidclient.start();
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorenter ;
            if (zzj.zzA() != null) goto _L2; else goto _L1
_L1:
            zzj.zza(advertisingidclient);
_L3:
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorexit ;
_L4:
            zzj.zzB().countDown();
            return;
_L2:
            advertisingidclient.finish();
              goto _L3
            Exception exception;
            exception;
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzj.zza(true);
            }
            catch (IOException ioexception) { }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception) { }
              goto _L4
        }

        public zzb(Context context)
        {
            zzlL = context.getApplicationContext();
            if (zzlL == null)
            {
                zzlL = context;
            }
        }
    }


    private static AdvertisingIdClient zzlE = null;
    private static CountDownLatch zzlF = new CountDownLatch(1);
    private static boolean zzlG;
    private boolean zzlH;

    protected zzj(Context context, zzm zzm, zzn zzn, boolean flag)
    {
        super(context, zzm, zzn);
        zzlH = flag;
    }

    static AdvertisingIdClient zzA()
    {
        return zzlE;
    }

    static CountDownLatch zzB()
    {
        return zzlF;
    }

    static AdvertisingIdClient zza(AdvertisingIdClient advertisingidclient)
    {
        zzlE = advertisingidclient;
        return advertisingidclient;
    }

    public static zzj zza(String s, Context context, boolean flag)
    {
        zze zze1;
        zze1 = new zze();
        zza(s, context, ((zzm) (zze1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        if (zzlE == null)
        {
            (new Thread(new zzb(context))).start();
        }
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
_L2:
        return new zzj(context, zze1, new zzp(239), flag);
        s;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean zza(boolean flag)
    {
        zzlG = flag;
        return flag;
    }

    protected void zzb(Context context)
    {
        super.zzb(context);
        if (zzlG || !zzlH)
        {
            zza(24, zzd(context));
            return;
        }
        context = zzz();
        long l;
        if (context.isLimitAdTrackingEnabled())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        zza(28, l);
        context = context.getId();
        if (context != null)
        {
            try
            {
                zza(26, 5L);
                zza(24, context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return;
    }

    zza zzz()
        throws IOException
    {
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzlF.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((zza) (obj));
        Object obj1;
        obj1;
        obj1 = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((zza) (obj1));
        obj1;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (zzlE != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((zza) (obj1));
        obj1 = zzlE.getInfo();
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return new zza(zzb(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).getId()), ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).isLimitAdTrackingEnabled());
    }

}
