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
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzlh;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzi

public class zzj extends com.google.android.gms.ads.internal.client.zzp.zza
{

    private final Context mContext;
    private zzn zzoS;
    private NativeAdOptionsParcel zzoX;
    private final String zzoZ;
    private final zzeh zzow;
    private final VersionInfoParcel zzpa;
    private zzct zzpf;
    private zzcu zzpg;
    private zzlh zzph;
    private zzlh zzpi;

    public zzj(Context context, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoZ = s;
        zzow = zzeh;
        zzpa = versioninfoparcel;
        zzpi = new zzlh();
        zzph = new zzlh();
    }

    public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzoX = nativeadoptionsparcel;
    }

    public void zza(zzct zzct)
    {
        zzpf = zzct;
    }

    public void zza(zzcu zzcu)
    {
        zzpg = zzcu;
    }

    public void zza(String s, zzcw zzcw, zzcv zzcv)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            zzpi.put(s, zzcw);
            zzph.put(s, zzcv);
            return;
        }
    }

    public void zzb(zzn zzn)
    {
        zzoS = zzn;
    }

    public zzo zzbk()
    {
        return new zzi(mContext, zzoZ, zzow, zzpa, zzoS, zzpf, zzpg, zzpi, zzph, zzoX);
    }
}
