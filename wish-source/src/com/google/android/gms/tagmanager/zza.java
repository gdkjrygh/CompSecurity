// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class com.google.android.gms.tagmanager.zza
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzwk();
    }


    private static Object zzaBX = new Object();
    private static com.google.android.gms.tagmanager.zza zzaBY;
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzCg;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzFp;
    private volatile long zzaBT;
    private volatile long zzaBU;
    private volatile long zzaBV;
    private zza zzaBW = new zza() {

        final com.google.android.gms.tagmanager.zza zzaBZ;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzwk()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.zza.zza(zzaBZ));
            }
            catch (IllegalStateException illegalstateexception)
            {
                zzbg.zzan("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                zzbg.zzan("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                zzbg.zzan("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzbg.zzan("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                zzbg.zzan("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                zzaBZ = com.google.android.gms.tagmanager.zza.this;
                super();
            }
    };
    private final zzht zznR;

    private com.google.android.gms.tagmanager.zza(Context context)
    {
        this(context, null, zzhv.zznc());
    }

    com.google.android.gms.tagmanager.zza(Context context, zza zza1, zzht zzht1)
    {
        zzaBT = 0xdbba0L;
        zzaBU = 30000L;
        mClosed = false;
        zznR = zzht1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (zza1 != null)
        {
            zzaBW = zza1;
        }
        zzCg = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.zza zzaBZ;

            public void run()
            {
                com.google.android.gms.tagmanager.zza.zzb(zzaBZ);
            }

            
            {
                zzaBZ = com.google.android.gms.tagmanager.zza.this;
                super();
            }
        });
    }

    static Context zza(com.google.android.gms.tagmanager.zza zza1)
    {
        return zza1.mContext;
    }

    static com.google.android.gms.tagmanager.zza zzan(Context context)
    {
        if (zzaBY == null)
        {
            synchronized (zzaBX)
            {
                if (zzaBY == null)
                {
                    zzaBY = new com.google.android.gms.tagmanager.zza(context);
                    zzaBY.start();
                }
            }
        }
        return zzaBY;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        zza1.zzwi();
    }

    private void zzwi()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                zzFp = zzaBW.zzwk();
                Thread.sleep(zzaBT);
            }
            catch (InterruptedException interruptedexception)
            {
                zzbg.zzal("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void zzwj()
    {
        if (zznR.currentTimeMillis() - zzaBV < zzaBU)
        {
            return;
        } else
        {
            interrupt();
            zzaBV = zznR.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        zzCg.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        zzwj();
        if (zzFp == null)
        {
            return true;
        } else
        {
            return zzFp.isLimitAdTrackingEnabled();
        }
    }

    void start()
    {
        zzCg.start();
    }

    public String zzwh()
    {
        zzwj();
        if (zzFp == null)
        {
            return null;
        } else
        {
            return zzFp.getId();
        }
    }

}
