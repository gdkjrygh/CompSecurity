// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzkw;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzh

public class zzi extends com.google.android.gms.ads.internal.client.zzp.zza
{

    private final Context mContext;
    private zzn zzoE;
    private NativeAdOptionsParcel zzoJ;
    private final String zzoL;
    private final VersionInfoParcel zzoM;
    private zzcu zzoP;
    private zzcv zzoQ;
    private zzkw zzoR;
    private zzkw zzoS;
    private final zzef zzoq;

    public zzi(Context context, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoL = s;
        zzoq = zzef;
        zzoM = versioninfoparcel;
        zzoS = new zzkw();
        zzoR = new zzkw();
    }

    public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzoJ = nativeadoptionsparcel;
    }

    public void zza(zzcu zzcu)
    {
        zzoP = zzcu;
    }

    public void zza(zzcv zzcv)
    {
        zzoQ = zzcv;
    }

    public void zza(String s, zzcx zzcx, zzcw zzcw)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            zzoS.put(s, zzcx);
            zzoR.put(s, zzcw);
            return;
        }
    }

    public void zzb(zzn zzn)
    {
        zzoE = zzn;
    }

    public zzo zzbi()
    {
        return new zzh(mContext, zzoL, zzoq, zzoM, zzoE, zzoP, zzoQ, zzoS, zzoR, zzoJ);
    }
}
