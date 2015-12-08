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
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzkw;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzm

public class zzh extends com.google.android.gms.ads.internal.client.zzo.zza
{

    private final Context mContext;
    private final zzn zzoE;
    private final zzcu zzoF;
    private final zzcv zzoG;
    private final zzkw zzoH;
    private final zzkw zzoI;
    private final NativeAdOptionsParcel zzoJ;
    private final List zzoK = zzbg();
    private final String zzoL;
    private final VersionInfoParcel zzoM;
    private final zzef zzoq;

    zzh(Context context, String s, zzef zzef, VersionInfoParcel versioninfoparcel, zzn zzn, zzcu zzcu, zzcv zzcv, 
            zzkw zzkw1, zzkw zzkw2, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        mContext = context;
        zzoL = s;
        zzoq = zzef;
        zzoM = versioninfoparcel;
        zzoE = zzn;
        zzoG = zzcv;
        zzoF = zzcu;
        zzoH = zzkw1;
        zzoI = zzkw2;
        zzoJ = nativeadoptionsparcel;
    }

    static zzcu zza(zzh zzh1)
    {
        return zzh1.zzoF;
    }

    static zzcv zzb(zzh zzh1)
    {
        return zzh1.zzoG;
    }

    private List zzbg()
    {
        ArrayList arraylist = new ArrayList();
        if (zzoG != null)
        {
            arraylist.add("1");
        }
        if (zzoF != null)
        {
            arraylist.add("2");
        }
        if (zzoH.size() > 0)
        {
            arraylist.add("3");
        }
        return arraylist;
    }

    static zzkw zzc(zzh zzh1)
    {
        return zzh1.zzoH;
    }

    static zzn zzd(zzh zzh1)
    {
        return zzh1.zzoE;
    }

    static zzkw zze(zzh zzh1)
    {
        return zzh1.zzoI;
    }

    static List zzf(zzh zzh1)
    {
        return zzh1.zzbg();
    }

    static NativeAdOptionsParcel zzg(zzh zzh1)
    {
        return zzh1.zzoJ;
    }

    protected void runOnUiThread(Runnable runnable)
    {
        zzhl.zzGk.post(runnable);
    }

    protected zzm zzbh()
    {
        return new zzm(mContext, AdSizeParcel.zzs(mContext), zzoL, zzoq, zzoM);
    }

    public void zze(AdRequestParcel adrequestparcel)
    {
        runOnUiThread(new Runnable(adrequestparcel) {

            final AdRequestParcel zzoN;
            final zzh zzoO;

            public void run()
            {
                zzm zzm1 = zzoO.zzbh();
                zzm1.zzb(zzh.zza(zzoO));
                zzm1.zzb(zzh.zzb(zzoO));
                zzm1.zza(zzh.zzc(zzoO));
                zzm1.zza(zzh.zzd(zzoO));
                zzm1.zzb(zzh.zze(zzoO));
                zzm1.zza(zzh.zzf(zzoO));
                zzm1.zzb(zzh.zzg(zzoO));
                zzm1.zza(zzoN);
            }

            
            {
                zzoO = zzh.this;
                zzoN = adrequestparcel;
                super();
            }
        });
    }
}
