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
//            zzdy, zzbz, zzbv, zzdx, 
//            zzeg, zzef, zzea, zzhl, 
//            zzec

public final class zzeb
    implements zzec.zza
{

    private final Context mContext;
    private final VersionInfoParcel zzoM;
    private final zzef zzoq;
    private final AdRequestParcel zzph;
    private final Object zzqt = new Object();
    private final String zzxQ;
    private final long zzxR;
    private final zzdx zzxS;
    private final AdSizeParcel zzxT;
    private zzeg zzxU;
    private int zzxV;

    public zzeb(Context context, String s, zzef zzef1, zzdy zzdy1, zzdx zzdx1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel)
    {
        zzxV = -2;
        mContext = context;
        zzoq = zzef1;
        zzxS = zzdx1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            zzxQ = zzdZ();
        } else
        {
            zzxQ = s;
        }
        if (zzdy1.zzxE != -1L)
        {
            l = zzdy1.zzxE;
        } else
        {
            l = 10000L;
        }
        zzxR = l;
        zzph = adrequestparcel;
        zzxT = adsizeparcel;
        zzoM = versioninfoparcel;
    }

    static zzeg zza(zzeb zzeb1, zzeg zzeg1)
    {
        zzeb1.zzxU = zzeg1;
        return zzeg1;
    }

    static Object zza(zzeb zzeb1)
    {
        return zzeb1.zzqt;
    }

    private void zza(long l, long l1, long l2, long l3)
    {
        do
        {
            if (zzxV != -2)
            {
                return;
            }
            zzb(l, l1, l2, l3);
        } while (true);
    }

    private void zza(zzea zzea1)
    {
        if (((Boolean)zzbz.zzuu.get()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(zzxQ))
        {
            Bundle bundle1 = zzph.zzsh.getBundle(zzxQ);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", zzxS.zzxt);
            zzph.zzsh.putBundle(zzxQ, bundle);
        }
        if (zzoM.zzGI >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        if (zzxT.zzsn)
        {
            zzxU.zza(zze.zzw(mContext), zzph, zzxS.zzxz, zzea1);
            return;
        }
        try
        {
            zzxU.zza(zze.zzw(mContext), zzxT, zzph, zzxS.zzxz, zzea1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzea zzea1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request ad from mediation adapter.", zzea1);
        }
        zzs(5);
        return;
        if (zzxT.zzsn)
        {
            zzxU.zza(zze.zzw(mContext), zzph, zzxS.zzxz, zzxS.zzxs, zzea1);
            return;
        }
        zzxU.zza(zze.zzw(mContext), zzxT, zzph, zzxS.zzxz, zzxS.zzxs, zzea1);
        return;
    }

    static void zza(zzeb zzeb1, zzea zzea1)
    {
        zzeb1.zza(zzea1);
    }

    static int zzb(zzeb zzeb1)
    {
        return zzeb1.zzxV;
    }

    private void zzb(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("Timed out waiting for adapter.");
            zzxV = 3;
            return;
        }
        try
        {
            zzqt.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            zzxV = -1;
        }
    }

    static zzeg zzc(zzeb zzeb1)
    {
        return zzeb1.zzea();
    }

    static zzeg zzd(zzeb zzeb1)
    {
        return zzeb1.zzxU;
    }

    private String zzdZ()
    {
        if (!TextUtils.isEmpty(zzxS.zzxw))
        {
            if (zzoq.zzZ(zzxS.zzxw))
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzeg zzea()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA((new StringBuilder()).append("Instantiating mediation adapter: ").append(zzxQ).toString());
        zzeg zzeg1;
        try
        {
            zzeg1 = zzoq.zzY(zzxQ);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zza((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(zzxQ).toString(), remoteexception);
            return null;
        }
        return zzeg1;
    }

    public void cancel()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzxU != null)
        {
            zzxU.destroy();
        }
_L1:
        zzxV = -1;
        zzqt.notify();
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

    public zzec zzb(long l, long l1)
    {
        Object obj1;
        synchronized (zzqt)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new zzea();
            zzhl.zzGk.post(new Runnable(((zzea) (obj1))) {

                final zzea zzxW;
                final zzeb zzxX;

                public void run()
                {
label0:
                    {
                        synchronized (zzeb.zza(zzxX))
                        {
                            if (com.google.android.gms.internal.zzeb.zzb(zzxX) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    zzeb.zza(zzxX, zzeb.zzc(zzxX));
                    if (zzeb.zzd(zzxX) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    zzxX.zzs(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    zzxW.zza(zzxX);
                    zzeb.zza(zzxX, zzxW);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                zzxX = zzeb.this;
                zzxW = zzea1;
                super();
            }
            });
            zza(l2, zzxR, l, l1);
            obj1 = new zzec(zzxS, zzxU, zzxQ, ((zzea) (obj1)), zzxV);
        }
        return ((zzec) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzs(int i)
    {
        synchronized (zzqt)
        {
            zzxV = i;
            zzqt.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
