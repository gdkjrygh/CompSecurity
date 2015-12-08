// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;

// Referenced classes of package com.google.android.gms.internal:
//            zzgd, zzhq, zzge, zzbc, 
//            zzfy, zzby, zzbu, zzlv, 
//            zzip, zzgc, zzgb, zzan, 
//            zzeh, zzcd, zzhj

public class zzga
{
    public static interface zza
    {

        public abstract void zzb(zzhj zzhj);
    }


    public zzga()
    {
    }

    public zzhq zza(Context context, com.google.android.gms.ads.internal.zza zza1, zzhj.zza zza2, zzan zzan, zzip zzip1, zzeh zzeh, zza zza3, 
            zzcd zzcd)
    {
        AdResponseParcel adresponseparcel = zza2.zzGM;
        if (adresponseparcel.zzDX)
        {
            context = new zzgd(context, zza2, zzip1, zzeh, zza3, zzcd);
        } else
        if (adresponseparcel.zzsJ)
        {
            if (zza1 instanceof zzn)
            {
                context = new zzge(context, (zzn)zza1, new zzbc(), zza2, zzan, zza3);
            } else
            {
                zza2 = (new StringBuilder()).append("Invalid NativeAdManager type. Found: ");
                if (zza1 != null)
                {
                    context = zza1.getClass().getName();
                } else
                {
                    context = "null";
                }
                throw new IllegalArgumentException(zza2.append(context).append("; Required: NativeAdManager.").toString());
            }
        } else
        if (adresponseparcel.zzEd)
        {
            context = new zzfy(context, zza2, zzip1, zza3);
        } else
        if (((Boolean)zzby.zzuM.get()).booleanValue() && zzlv.zzpV() && !zzlv.isAtLeastL() && zzip1.zzaN().zzsH)
        {
            context = new zzgc(context, zza2, zzip1, zza3);
        } else
        {
            context = new zzgb(context, zza2, zzip1, zza3);
        }
        zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(context.getClass().getName()).toString());
        context.zzgo();
        return context;
    }
}
