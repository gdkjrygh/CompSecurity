// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzis, zzan, zzip

public class zzir
{

    public zzir()
    {
    }

    public zzip zza(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan, VersionInfoParcel versioninfoparcel)
    {
        return zzis.zzb(context, adsizeparcel, flag, flag1, zzan, versioninfoparcel, null);
    }

    public zzip zza(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan, VersionInfoParcel versioninfoparcel, zzd zzd)
    {
        return zzis.zzb(context, adsizeparcel, flag, flag1, zzan, versioninfoparcel, zzd);
    }
}
