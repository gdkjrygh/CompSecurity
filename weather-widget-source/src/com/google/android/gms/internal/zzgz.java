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
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzha, zzhd, zzgy, 
//            zzhc, zzei, zzlm

public class zzgz extends zzhq
    implements zzha, zzhd
{

    private final Context mContext;
    private final zzhj.zza zzCF;
    private int zzCI;
    private final String zzGh;
    private final zzgy zzGp;
    private final zzhd zzGq;
    private final String zzGr;
    private int zzGs;
    private final Object zzpc = new Object();
    private final String zzyH;

    public zzgz(Context context, String s, String s1, String s2, zzhj.zza zza1, zzgy zzgy1, zzhd zzhd1)
    {
        zzGs = 0;
        zzCI = 3;
        mContext = context;
        zzyH = s;
        zzGh = s1;
        zzGr = s2;
        zzCF = zza1;
        zzGp = zzgy1;
        zzGq = zzhd1;
    }

    static String zza(zzgz zzgz1)
    {
        return zzgz1.zzGr;
    }

    static String zzb(zzgz zzgz1)
    {
        return zzgz1.zzyH;
    }

    static Context zzc(zzgz zzgz1)
    {
        return zzgz1.mContext;
    }

    static String zzd(zzgz zzgz1)
    {
        return zzgz1.zzGh;
    }

    private void zzk(long l)
    {
_L1:
label0:
        {
            synchronized (zzpc)
            {
                if (zzGs == 0)
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

    public void zzJ(int i)
    {
        zzb(zzyH, 0);
    }

    public void zzas(String s)
    {
        synchronized (zzpc)
        {
            zzGs = 1;
            zzpc.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(String s, int i)
    {
        synchronized (zzpc)
        {
            zzGs = 2;
            zzCI = i;
            zzpc.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdG()
    {
        zzhc zzhc1;
        AdRequestParcel adrequestparcel;
        zzei zzei1;
        if (zzGp == null || zzGp.zzfR() == null || zzGp.zzfQ() == null)
        {
            return;
        }
        zzhc1 = zzGp.zzfR();
        zzhc1.zza(this);
        zzhc1.zza(this);
        adrequestparcel = zzCF.zzGL.zzDy;
        zzei1 = zzGp.zzfQ();
        if (!zzei1.isInitialized())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        zza.zzIy.post(new Runnable(zzei1, adrequestparcel) {

            final zzei zzGt;
            final zzgz zzGu;
            final AdRequestParcel zzpd;

            public void run()
            {
                try
                {
                    zzGt.zza(zzpd, com.google.android.gms.internal.zzgz.zza(zzGu));
                    return;
                }
                catch (RemoteException remoteexception1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to load ad from adapter.", remoteexception1);
                }
                zzGu.zzb(com.google.android.gms.internal.zzgz.zzb(zzGu), 0);
            }

            
            {
                zzGu = zzgz.this;
                zzGt = zzei1;
                zzpd = adrequestparcel;
                super();
            }
        });
_L1:
        zzk(zzp.zzbB().elapsedRealtime());
        zzhc1.zza(null);
        zzhc1.zza(null);
        RemoteException remoteexception;
        if (zzGs == 1)
        {
            zzGq.zzas(zzyH);
            return;
        } else
        {
            zzGq.zzb(zzyH, zzCI);
            return;
        }
        try
        {
            zza.zzIy.post(new Runnable(zzei1, adrequestparcel, zzhc1) {

                final zzei zzGt;
                final zzgz zzGu;
                final zzhc zzGv;
                final AdRequestParcel zzpd;

                public void run()
                {
                    try
                    {
                        zzGt.zza(com.google.android.gms.dynamic.zze.zzx(zzgz.zzc(zzGu)), zzpd, zzgz.zzd(zzGu), zzGv, com.google.android.gms.internal.zzgz.zza(zzGu));
                        return;
                    }
                    catch (RemoteException remoteexception1)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Fail to initialize adapter ").append(com.google.android.gms.internal.zzgz.zzb(zzGu)).toString(), remoteexception1);
                    }
                    zzGu.zzb(com.google.android.gms.internal.zzgz.zzb(zzGu), 0);
                }

            
            {
                zzGu = zzgz.this;
                zzGt = zzei1;
                zzpd = adrequestparcel;
                zzGv = zzhc1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to check if adapter is initialized.", remoteexception);
            zzb(zzyH, 0);
        }
          goto _L1
    }

    protected boolean zze(long l)
    {
        l = 20000L - (zzp.zzbB().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzpc.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public void zzfS()
    {
        zzGp.zzfR();
        AdRequestParcel adrequestparcel = zzCF.zzGL.zzDy;
        zzei zzei1 = zzGp.zzfQ();
        try
        {
            zzei1.zza(adrequestparcel, zzGr);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to load ad from adapter.", remoteexception);
        }
        zzb(zzyH, 0);
    }
}
