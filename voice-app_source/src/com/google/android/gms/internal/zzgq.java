// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh, zzgr, zzgu, zzgp, 
//            zzgt, zzeg, zzlb

public class zzgq extends zzhh
    implements zzgr, zzgu
{

    private final Context mContext;
    private final zzha.zza zzBs;
    private int zzBv;
    private final String zzEO;
    private final zzgp zzEV;
    private final zzgu zzEW;
    private final String zzEX;
    private int zzEY;
    private final Object zzqt = new Object();
    private final String zzxQ;

    public zzgq(Context context, String s, String s1, String s2, zzha.zza zza1, zzgp zzgp1, zzgu zzgu1)
    {
        zzEY = 0;
        zzBv = 3;
        mContext = context;
        zzxQ = s;
        zzEO = s1;
        zzEX = s2;
        zzBs = zza1;
        zzEV = zzgp1;
        zzEW = zzgu1;
    }

    static String zza(zzgq zzgq1)
    {
        return zzgq1.zzEX;
    }

    static String zzb(zzgq zzgq1)
    {
        return zzgq1.zzxQ;
    }

    static Context zzc(zzgq zzgq1)
    {
        return zzgq1.mContext;
    }

    static String zzd(zzgq zzgq1)
    {
        return zzgq1.zzEO;
    }

    private void zzk(long l)
    {
_L1:
label0:
        {
            synchronized (zzqt)
            {
                if (zzEY == 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (zze(l))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public void onStop()
    {
    }

    public void zzI(int i)
    {
        zzb(zzxQ, 0);
    }

    public void zzap(String s)
    {
        synchronized (zzqt)
        {
            zzEY = 1;
            zzqt.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(String s, int i)
    {
        synchronized (zzqt)
        {
            zzEY = 2;
            zzBv = i;
            zzqt.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdP()
    {
        zzgt zzgt1;
        AdRequestParcel adrequestparcel;
        zzeg zzeg1;
        if (zzEV == null || zzEV.zzfN() == null || zzEV.zzfM() == null)
        {
            return;
        }
        zzgt1 = zzEV.zzfN();
        zzgt1.zza(this);
        zzgt1.zza(this);
        adrequestparcel = zzBs.zzFr.zzCm;
        zzeg1 = zzEV.zzfM();
        if (!zzeg1.isInitialized())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        zza.zzGF.post(new Runnable(zzeg1, adrequestparcel) {

            final zzeg zzEZ;
            final zzgq zzFa;
            final AdRequestParcel zzoN;

            public void run()
            {
                try
                {
                    zzEZ.zza(zzoN, com.google.android.gms.internal.zzgq.zza(zzFa));
                    return;
                }
                catch (RemoteException remoteexception1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to load ad from adapter.", remoteexception1);
                }
                zzFa.zzb(com.google.android.gms.internal.zzgq.zzb(zzFa), 0);
            }

            
            {
                zzFa = zzgq.this;
                zzEZ = zzeg1;
                zzoN = adrequestparcel;
                super();
            }
        });
_L1:
        zzk(zzo.zzbz().elapsedRealtime());
        zzgt1.zza(null);
        zzgt1.zza(null);
        RemoteException remoteexception;
        if (zzEY == 1)
        {
            zzEW.zzap(zzxQ);
            return;
        } else
        {
            zzEW.zzb(zzxQ, zzBv);
            return;
        }
        try
        {
            zza.zzGF.post(new Runnable(zzeg1, adrequestparcel, zzgt1) {

                final zzeg zzEZ;
                final zzgq zzFa;
                final zzgt zzFb;
                final AdRequestParcel zzoN;

                public void run()
                {
                    try
                    {
                        zzEZ.zza(com.google.android.gms.dynamic.zze.zzw(zzgq.zzc(zzFa)), zzoN, zzgq.zzd(zzFa), zzFb, com.google.android.gms.internal.zzgq.zza(zzFa));
                        return;
                    }
                    catch (RemoteException remoteexception1)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Fail to initialize adapter ").append(com.google.android.gms.internal.zzgq.zzb(zzFa)).toString(), remoteexception1);
                    }
                    zzFa.zzb(com.google.android.gms.internal.zzgq.zzb(zzFa), 0);
                }

            
            {
                zzFa = zzgq.this;
                zzEZ = zzeg1;
                zzoN = adrequestparcel;
                zzFb = zzgt1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to check if adapter is initialized.", remoteexception);
            zzb(zzxQ, 0);
        }
          goto _L1
    }

    protected boolean zze(long l)
    {
        l = 20000L - (zzo.zzbz().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzqt.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public void zzfO()
    {
        zzEV.zzfN();
        AdRequestParcel adrequestparcel = zzBs.zzFr.zzCm;
        zzeg zzeg1 = zzEV.zzfM();
        try
        {
            zzeg1.zza(adrequestparcel, zzEX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to load ad from adapter.", remoteexception);
        }
        zzb(zzxQ, 0);
    }
}
