// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzck, zzat, zzap, zzcj, 
//            zzcs, zzcr, zzcm, zzfl, 
//            zzco

public final class zzcn
    implements zzco.zza
{

    private final Context mContext;
    private final zzcr zzmv;
    private final AdRequestParcel zznC;
    private final Object zzoe = new Object();
    private final VersionInfoParcel zzoi;
    private final String zzuL;
    private final long zzuM;
    private final zzcj zzuN;
    private final AdSizeParcel zzuO;
    private zzcs zzuP;
    private int zzuQ;

    public zzcn(Context context, String s, zzcr zzcr1, zzck zzck1, zzcj zzcj1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel)
    {
        zzuQ = -2;
        mContext = context;
        zzmv = zzcr1;
        zzuN = zzcj1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            zzuL = zzdb();
        } else
        {
            zzuL = s;
        }
        if (zzck1.zzuB != -1L)
        {
            l = zzck1.zzuB;
        } else
        {
            l = 10000L;
        }
        zzuM = l;
        zznC = adrequestparcel;
        zzuO = adsizeparcel;
        zzoi = versioninfoparcel;
    }

    static zzcs zza(zzcn zzcn1, zzcs zzcs1)
    {
        zzcn1.zzuP = zzcs1;
        return zzcs1;
    }

    static Object zza(zzcn zzcn1)
    {
        return zzcn1.zzoe;
    }

    private void zza(long l, long l1, long l2, long l3)
    {
        do
        {
            if (zzuQ != -2)
            {
                return;
            }
            zzb(l, l1, l2, l3);
        } while (true);
    }

    private void zza(zzcm zzcm1)
    {
        if (((Boolean)zzat.zzrX.get()).booleanValue() && zzuL.equals("com.google.ads.mediation.AdUrlAdapter"))
        {
            Bundle bundle1 = zznC.zzpS.getBundle(zzuL);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", zzuN.zzus);
            zznC.zzpS.putBundle(zzuL, bundle);
        }
        if (zzoi.zzCK >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        if (zzuO.zzpY)
        {
            zzuP.zza(zze.zzt(mContext), zznC, zzuN.zzuy, zzcm1);
            return;
        }
        try
        {
            zzuP.zza(zze.zzt(mContext), zzuO, zznC, zzuN.zzuy, zzcm1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzcm zzcm1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request ad from mediation adapter.", zzcm1);
        }
        zzm(5);
        return;
        if (zzuO.zzpY)
        {
            zzuP.zza(zze.zzt(mContext), zznC, zzuN.zzuy, zzuN.zzur, zzcm1);
            return;
        }
        zzuP.zza(zze.zzt(mContext), zzuO, zznC, zzuN.zzuy, zzuN.zzur, zzcm1);
        return;
    }

    static void zza(zzcn zzcn1, zzcm zzcm1)
    {
        zzcn1.zza(zzcm1);
    }

    static int zzb(zzcn zzcn1)
    {
        return zzcn1.zzuQ;
    }

    private void zzb(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Timed out waiting for adapter.");
            zzuQ = 3;
            return;
        }
        try
        {
            zzoe.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            zzuQ = -1;
        }
    }

    static zzcs zzc(zzcn zzcn1)
    {
        return zzcn1.zzdc();
    }

    static zzcs zzd(zzcn zzcn1)
    {
        return zzcn1.zzuP;
    }

    private String zzdb()
    {
        if (!TextUtils.isEmpty(zzuN.zzuv))
        {
            if (zzmv.zzL(zzuN.zzuv))
            {
                return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
            } else
            {
                return "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        }
        break MISSING_BLOCK_LABEL_44;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzcs zzdc()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal((new StringBuilder()).append("Instantiating mediation adapter: ").append(zzuL).toString());
        zzcs zzcs1;
        try
        {
            zzcs1 = zzmv.zzK(zzuL);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zza((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(zzuL).toString(), remoteexception);
            return null;
        }
        return zzcs1;
    }

    public void cancel()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzuP != null)
        {
            zzuP.destroy();
        }
_L1:
        zzuQ = -1;
        zzoe.notify();
        return;
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public zzco zzb(long l, long l1)
    {
        Object obj1;
        synchronized (zzoe)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new zzcm();
            zzfl.zzCr.post(new Runnable(((zzcm) (obj1))) {

                final zzcm zzuR;
                final zzcn zzuS;

                public void run()
                {
label0:
                    {
                        synchronized (zzcn.zza(zzuS))
                        {
                            if (com.google.android.gms.internal.zzcn.zzb(zzuS) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    zzcn.zza(zzuS, zzcn.zzc(zzuS));
                    if (zzcn.zzd(zzuS) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    zzuS.zzm(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    zzuR.zza(zzuS);
                    zzcn.zza(zzuS, zzuR);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                zzuS = zzcn.this;
                zzuR = zzcm1;
                super();
            }
            });
            zza(l2, zzuM, l, l1);
            obj1 = new zzco(zzuN, zzuP, zzuL, ((zzcm) (obj1)), zzuQ);
        }
        return ((zzco) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzm(int i)
    {
        synchronized (zzoe)
        {
            zzuQ = i;
            zzoe.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
