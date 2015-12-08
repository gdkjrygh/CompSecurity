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
//            zzal, zzah, zzas, zzap, 
//            zzaq

public class zzam extends zzal
{
    class zza
    {

        private String zznr;
        private boolean zzns;
        final zzam zznt;

        public String getId()
        {
            return zznr;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return zzns;
        }

        public zza(String s, boolean flag)
        {
            zznt = zzam.this;
            super();
            zznr = s;
            zzns = flag;
        }
    }

    private static final class zzb
        implements Runnable
    {

        private Context zznu;

        public void run()
        {
            AdvertisingIdClient advertisingidclient;
            advertisingidclient = new AdvertisingIdClient(zznu);
            advertisingidclient.start();
            com/google/android/gms/internal/zzam;
            JVM INSTR monitorenter ;
            if (zzam.zzZ() != null) goto _L2; else goto _L1
_L1:
            zzam.zza(advertisingidclient);
_L3:
            com/google/android/gms/internal/zzam;
            JVM INSTR monitorexit ;
_L4:
            zzam.zzaa().countDown();
            return;
_L2:
            advertisingidclient.finish();
              goto _L3
            Exception exception;
            exception;
            com/google/android/gms/internal/zzam;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzam.zza(true);
            }
            catch (IOException ioexception) { }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception) { }
              goto _L4
        }

        public zzb(Context context)
        {
            zznu = context.getApplicationContext();
            if (zznu == null)
            {
                zznu = context;
            }
        }
    }


    private static AdvertisingIdClient zznn = null;
    private static CountDownLatch zzno = new CountDownLatch(1);
    private static boolean zznp;
    private boolean zznq;

    protected zzam(Context context, zzap zzap, zzaq zzaq, boolean flag)
    {
        super(context, zzap, zzaq);
        zznq = flag;
    }

    static AdvertisingIdClient zzZ()
    {
        return zznn;
    }

    static AdvertisingIdClient zza(AdvertisingIdClient advertisingidclient)
    {
        zznn = advertisingidclient;
        return advertisingidclient;
    }

    public static zzam zza(String s, Context context, boolean flag)
    {
        zzah zzah1;
        zzah1 = new zzah();
        zza(s, context, ((zzap) (zzah1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorenter ;
        if (zznn == null)
        {
            (new Thread(new zzb(context))).start();
        }
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
_L2:
        return new zzam(context, zzah1, new zzas(239), flag);
        s;
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean zza(boolean flag)
    {
        zznp = flag;
        return flag;
    }

    static CountDownLatch zzaa()
    {
        return zzno;
    }

    zza zzY()
        throws IOException
    {
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzno.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = new zza(null, false);
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        return ((zza) (obj));
        Object obj1;
        obj1;
        obj1 = new zza(null, false);
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        return ((zza) (obj1));
        obj1;
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        throw obj1;
        if (zznn != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = new zza(null, false);
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        return ((zza) (obj1));
        obj1 = zznn.getInfo();
        com/google/android/gms/internal/zzam;
        JVM INSTR monitorexit ;
        return new zza(zzk(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).getId()), ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).isLimitAdTrackingEnabled());
    }

    protected void zzc(Context context)
    {
        super.zzc(context);
        if (zznp || !zznq)
        {
            zza(24, zze(context));
            return;
        }
        String s;
        context = zzY();
        s = context.getId();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        long l;
        if (context.isLimitAdTrackingEnabled())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        try
        {
            zza(28, l);
            zza(26, 5L);
            zza(24, s);
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

}
