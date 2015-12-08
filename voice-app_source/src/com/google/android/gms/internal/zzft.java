// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzm;

// Referenced classes of package com.google.android.gms.internal:
//            zzfx, zzbc, zzhh, zzfw, 
//            zzfr, zzbz, zzbv, zzlk, 
//            zzid, zzfv, zzfu, zzan, 
//            zzef, zzha

public class zzft
{
    public static interface zza
    {

        public abstract void zzb(zzha zzha);
    }


    public zzft()
    {
    }

    public zzhh zza(Context context, com.google.android.gms.ads.internal.zza zza1, zzha.zza zza2, zzan zzan, zzid zzid1, zzef zzef, zza zza3)
    {
        AdResponseParcel adresponseparcel = zza2.zzFs;
        if (!adresponseparcel.zzsp) goto _L2; else goto _L1
_L1:
        if (!(zza1 instanceof zzm)) goto _L4; else goto _L3
_L3:
        context = new zzfx(context, (zzm)zza1, new zzbc(), zza2, zzan, zza3);
_L6:
        context.zzgj();
        return context;
_L4:
        zza2 = (new StringBuilder()).append("Invalid NativeAdManager type. Found: ");
        if (zza1 != null)
        {
            context = zza1.getClass().getName();
        } else
        {
            context = "null";
        }
        throw new IllegalArgumentException(zza2.append(context).append("; Required: NativeAdManager.").toString());
_L2:
        if (adresponseparcel.zzCK)
        {
            context = new zzfw(context, zza2, zzid1, zzef, zza3);
        } else
        if (adresponseparcel.zzCQ)
        {
            context = new zzfr(context, zza2, zzid1, zza3);
        } else
        if (((Boolean)zzbz.zzuj.get()).booleanValue() && zzlk.zzoX() && !zzlk.isAtLeastL() && zzid1.zzaN().zzsn)
        {
            context = new zzfv(context, zza2, zzid1, zza3);
        } else
        {
            context = new zzfu(context, zza2, zzid1, zza3);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
