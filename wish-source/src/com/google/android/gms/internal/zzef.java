// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zza;

// Referenced classes of package com.google.android.gms.internal:
//            zzej, zzz, zzfh, zzei, 
//            zzed, zzat, zzap, zzic, 
//            zzgd, zzeh, zzeg, zzk, 
//            zzcr, zzfa

public class zzef
{
    public static interface zza
    {

        public abstract void zza(zzfa zzfa);
    }


    public zzef()
    {
    }

    public zzfh zza(Context context, com.google.android.gms.ads.internal.zza zza1, zzfa.zza zza2, zzk zzk, zzgd zzgd1, zzcr zzcr, zza zza3)
    {
        AdResponseParcel adresponseparcel = zza2.zzBz;
        if (adresponseparcel.zzqa)
        {
            context = new zzej(context, zza1, new zzz(), zza2, zzk, zza3);
        } else
        if (adresponseparcel.zzzt)
        {
            context = new zzei(context, zza2, zzgd1, zzcr, zza3);
        } else
        if (adresponseparcel.zzzz)
        {
            context = new zzed(context, zza2, zzgd1, zza3);
        } else
        if (((Boolean)zzat.zzrN.get()).booleanValue() && zzic.zznj() && !zzic.zznk() && zzgd1.zzah().zzpY)
        {
            context = new zzeh(context, zza2, zzgd1, zza3);
        } else
        {
            context = new zzeg(context, zza2, zzgd1, zza3);
        }
        context.zzeX();
        return context;
    }
}
