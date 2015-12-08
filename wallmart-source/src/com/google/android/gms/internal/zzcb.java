// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzca

public class zzcb
{

    public zzcb()
    {
    }

    public zzca zza(zzbz zzbz1)
    {
        if (zzbz1 == null)
        {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!zzbz1.zzdf())
        {
            zzb.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (zzbz1.getContext() == null)
        {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbz1.zzbV()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else
        {
            return new zzca(zzbz1.getContext(), zzbz1.zzbV(), zzbz1.zzdg(), zzbz1.zzdh());
        }
    }
}
