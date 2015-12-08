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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzea, zzdz, zzei, zzeh, 
//            zzec, zzhu, zzee

public final class zzed
    implements zzee.zza
{

    private final Context mContext;
    private final NativeAdOptionsParcel zzoX;
    private final List zzoY;
    private final zzeh zzow;
    private final VersionInfoParcel zzpa;
    private final Object zzpc = new Object();
    private final AdRequestParcel zzpz;
    private final String zzyH;
    private final long zzyI;
    private final zzdz zzyJ;
    private final AdSizeParcel zzyK;
    private zzei zzyL;
    private int zzyM;
    private final boolean zzyf;

    public zzed(Context context, String s, zzeh zzeh1, zzea zzea1, zzdz zzdz1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel, boolean flag, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        zzyM = -2;
        mContext = context;
        zzow = zzeh1;
        zzyJ = zzdz1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            zzyH = zzdQ();
        } else
        {
            zzyH = s;
        }
        if (zzea1.zzyv != -1L)
        {
            l = zzea1.zzyv;
        } else
        {
            l = 10000L;
        }
        zzyI = l;
        zzpz = adrequestparcel;
        zzyK = adsizeparcel;
        zzpa = versioninfoparcel;
        zzyf = flag;
        zzoX = nativeadoptionsparcel;
        zzoY = list;
    }

    static zzei zza(zzed zzed1, zzei zzei1)
    {
        zzed1.zzyL = zzei1;
        return zzei1;
    }

    static Object zza(zzed zzed1)
    {
        return zzed1.zzpc;
    }

    private void zza(long l, long l1, long l2, long l3)
    {
        do
        {
            if (zzyM != -2)
            {
                return;
            }
            zzb(l, l1, l2, l3);
        } while (true);
    }

    private void zza(zzec zzec1)
    {
        if ("com.google.ads.mediation.AdUrlAdapter".equals(zzyH))
        {
            Bundle bundle1 = zzpz.zzsA.getBundle(zzyH);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", zzyJ.zzyl);
            zzpz.zzsA.putBundle(zzyH, bundle);
        }
        if (zzpa.zzIB >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (zzyK.zzsH)
        {
            zzyL.zza(zze.zzx(mContext), zzpz, zzyJ.zzyr, zzec1);
            return;
        }
        try
        {
            zzyL.zza(zze.zzx(mContext), zzyK, zzpz, zzyJ.zzyr, zzec1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzec zzec1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request ad from mediation adapter.", zzec1);
        }
        zzq(5);
        return;
        if (zzyf)
        {
            zzyL.zza(zze.zzx(mContext), zzpz, zzyJ.zzyr, zzyJ.zzyk, zzec1, zzoX, zzoY);
            return;
        }
        if (zzyK.zzsH)
        {
            zzyL.zza(zze.zzx(mContext), zzpz, zzyJ.zzyr, zzyJ.zzyk, zzec1);
            return;
        }
        zzyL.zza(zze.zzx(mContext), zzyK, zzpz, zzyJ.zzyr, zzyJ.zzyk, zzec1);
        return;
    }

    static void zza(zzed zzed1, zzec zzec1)
    {
        zzed1.zza(zzec1);
    }

    static int zzb(zzed zzed1)
    {
        return zzed1.zzyM;
    }

    private void zzb(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Timed out waiting for adapter.");
            zzyM = 3;
            return;
        }
        try
        {
            zzpc.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            zzyM = -1;
        }
    }

    static zzei zzc(zzed zzed1)
    {
        return zzed1.zzdR();
    }

    static zzei zzd(zzed zzed1)
    {
        return zzed1.zzyL;
    }

    private String zzdQ()
    {
        if (!TextUtils.isEmpty(zzyJ.zzyo))
        {
            if (zzow.zzac(zzyJ.zzyo))
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzei zzdR()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD((new StringBuilder()).append("Instantiating mediation adapter: ").append(zzyH).toString());
        zzei zzei1;
        try
        {
            zzei1 = zzow.zzab(zzyH);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zza((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(zzyH).toString(), remoteexception);
            return null;
        }
        return zzei1;
    }

    public void cancel()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzyL != null)
        {
            zzyL.destroy();
        }
_L1:
        zzyM = -1;
        zzpc.notify();
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

    public zzee zza(long l, long l1)
    {
        Object obj1;
        synchronized (zzpc)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new zzec();
            zzhu.zzHK.post(new Runnable(((zzec) (obj1))) {

                final zzec zzyN;
                final zzed zzyO;

                public void run()
                {
label0:
                    {
                        synchronized (zzed.zza(zzyO))
                        {
                            if (com.google.android.gms.internal.zzed.zzb(zzyO) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    zzed.zza(zzyO, zzed.zzc(zzyO));
                    if (zzed.zzd(zzyO) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    zzyO.zzq(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    zzyN.zza(zzyO);
                    zzed.zza(zzyO, zzyN);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                zzyO = zzed.this;
                zzyN = zzec1;
                super();
            }
            });
            zza(l2, zzyI, l, l1);
            obj1 = new zzee(zzyJ, zzyL, zzyH, ((zzec) (obj1)), zzyM);
        }
        return ((zzee) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzq(int i)
    {
        synchronized (zzpc)
        {
            zzyM = i;
            zzpc.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
