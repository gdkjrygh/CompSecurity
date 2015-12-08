// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzlo;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

public class com.google.android.gms.tagmanager.zza
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzzw();
    }


    private static Object zzaOF = new Object();
    private static com.google.android.gms.tagmanager.zza zzaOG;
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzHt;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzLl;
    private volatile long zzaOB;
    private volatile long zzaOC;
    private volatile long zzaOD;
    private zza zzaOE = new zza() {

        final com.google.android.gms.tagmanager.zza zzaOH;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzzw()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.zza.zza(zzaOH));
            }
            catch (IllegalStateException illegalstateexception)
            {
                zzbg.zzaE("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                zzbg.zzaE("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                zzbg.zzaE("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzbg.zzaE("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                zzbg.zzaE("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                zzaOH = com.google.android.gms.tagmanager.zza.this;
                super();
            }
    };
    private final zzlm zzpO;

    private com.google.android.gms.tagmanager.zza(Context context)
    {
        this(context, null, zzlo.zzpN());
    }

    public com.google.android.gms.tagmanager.zza(Context context, zza zza1, zzlm zzlm1)
    {
        zzaOB = 0xdbba0L;
        zzaOC = 30000L;
        mClosed = false;
        zzpO = zzlm1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (zza1 != null)
        {
            zzaOE = zza1;
        }
        zzHt = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.zza zzaOH;

            public void run()
            {
                com.google.android.gms.tagmanager.zza.zzb(zzaOH);
            }

            
            {
                zzaOH = com.google.android.gms.tagmanager.zza.this;
                super();
            }
        });
    }

    static Context zza(com.google.android.gms.tagmanager.zza zza1)
    {
        return zza1.mContext;
    }

    public static com.google.android.gms.tagmanager.zza zzaL(Context context)
    {
        if (zzaOG == null)
        {
            synchronized (zzaOF)
            {
                if (zzaOG == null)
                {
                    zzaOG = new com.google.android.gms.tagmanager.zza(context);
                    zzaOG.start();
                }
            }
        }
        return zzaOG;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        zza1.zzzu();
    }

    private void zzzu()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                zzLl = zzaOE.zzzw();
                Thread.sleep(zzaOB);
            }
            catch (InterruptedException interruptedexception)
            {
                zzbg.zzaD("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void zzzv()
    {
        if (zzpO.currentTimeMillis() - zzaOD < zzaOC)
        {
            return;
        } else
        {
            interrupt();
            zzaOD = zzpO.currentTimeMillis();
            return;
        }
    }

    public void interrupt()
    {
        zzHt.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        zzzv();
        if (zzLl == null)
        {
            return true;
        } else
        {
            return zzLl.isLimitAdTrackingEnabled();
        }
    }

    public void start()
    {
        zzHt.start();
    }

    public String zzzt()
    {
        zzzv();
        if (zzLl == null)
        {
            return null;
        } else
        {
            return zzLl.getId();
        }
    }

}
