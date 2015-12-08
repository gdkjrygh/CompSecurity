// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzlh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn

public class zzi extends com.google.android.gms.ads.internal.client.zzo.zza
{

    private final Context mContext;
    private final zzn zzoS;
    private final zzct zzoT;
    private final zzcu zzoU;
    private final zzlh zzoV;
    private final zzlh zzoW;
    private final NativeAdOptionsParcel zzoX;
    private final List zzoY = zzbi();
    private final String zzoZ;
    private final zzeh zzow;
    private final VersionInfoParcel zzpa;
    private WeakReference zzpb;
    private Object zzpc;

    zzi(Context context, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel, zzn zzn1, zzct zzct, zzcu zzcu, 
            zzlh zzlh1, zzlh zzlh2, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzpc = new Object();
        mContext = context;
        zzoZ = s;
        zzow = zzeh;
        zzpa = versioninfoparcel;
        zzoS = zzn1;
        zzoU = zzcu;
        zzoT = zzct;
        zzoV = zzlh1;
        zzoW = zzlh2;
        zzoX = nativeadoptionsparcel;
    }

    static Object zza(zzi zzi1)
    {
        return zzi1.zzpc;
    }

    static WeakReference zza(zzi zzi1, WeakReference weakreference)
    {
        zzi1.zzpb = weakreference;
        return weakreference;
    }

    static zzct zzb(zzi zzi1)
    {
        return zzi1.zzoT;
    }

    private List zzbi()
    {
        ArrayList arraylist = new ArrayList();
        if (zzoU != null)
        {
            arraylist.add("1");
        }
        if (zzoT != null)
        {
            arraylist.add("2");
        }
        if (zzoV.size() > 0)
        {
            arraylist.add("3");
        }
        return arraylist;
    }

    static zzcu zzc(zzi zzi1)
    {
        return zzi1.zzoU;
    }

    static zzlh zzd(zzi zzi1)
    {
        return zzi1.zzoV;
    }

    static zzn zze(zzi zzi1)
    {
        return zzi1.zzoS;
    }

    static zzlh zzf(zzi zzi1)
    {
        return zzi1.zzoW;
    }

    static List zzg(zzi zzi1)
    {
        return zzi1.zzbi();
    }

    static NativeAdOptionsParcel zzh(zzi zzi1)
    {
        return zzi1.zzoX;
    }

    public String getMediationAdapterClassName()
    {
        Object obj1 = zzpc;
        obj1;
        JVM INSTR monitorenter ;
        if (zzpb == null) goto _L2; else goto _L1
_L1:
        Object obj = (com.google.android.gms.ads.internal.zzn)zzpb.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((com.google.android.gms.ads.internal.zzn) (obj)).getMediationAdapterClassName();
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return null;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L3
    }

    public boolean isLoading()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzpb == null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.zzn zzn1 = (com.google.android.gms.ads.internal.zzn)zzpb.get();
        if (zzn1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        boolean flag = zzn1.isLoading();
_L3:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L3
    }

    protected void runOnUiThread(Runnable runnable)
    {
        zzhu.zzHK.post(runnable);
    }

    protected com.google.android.gms.ads.internal.zzn zzbj()
    {
        return new com.google.android.gms.ads.internal.zzn(mContext, AdSizeParcel.zzs(mContext), zzoZ, zzow, zzpa);
    }

    public void zze(AdRequestParcel adrequestparcel)
    {
        runOnUiThread(new Runnable(adrequestparcel) {

            final AdRequestParcel zzpd;
            final zzi zzpe;

            public void run()
            {
                synchronized (zzi.zza(zzpe))
                {
                    com.google.android.gms.ads.internal.zzn zzn1 = zzpe.zzbj();
                    zzi.zza(zzpe, new WeakReference(zzn1));
                    zzn1.zzb(zzi.zzb(zzpe));
                    zzn1.zzb(zzi.zzc(zzpe));
                    zzn1.zza(zzi.zzd(zzpe));
                    zzn1.zza(zzi.zze(zzpe));
                    zzn1.zzb(zzi.zzf(zzpe));
                    zzn1.zza(zzi.zzg(zzpe));
                    zzn1.zzb(zzi.zzh(zzpe));
                    zzn1.zza(zzpd);
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzpe = zzi.this;
                zzpd = adrequestparcel;
                super();
            }
        });
    }
}
