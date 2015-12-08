// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzhq;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, AdResponseParcel

public final class zzc
{
    public static interface zza
    {

        public abstract void zzb(AdResponseParcel adresponseparcel);
    }

    static interface zzb
    {

        public abstract boolean zzd(AdRequestInfoParcel adrequestinfoparcel);
    }


    public static zzhq zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        return zza(context, adrequestinfoparcel, zza1, new zzb(context) {

            final Context zzrn;

            public boolean zzd(AdRequestInfoParcel adrequestinfoparcel1)
            {
                return adrequestinfoparcel1.zzqb.zzIC || GooglePlayServicesUtil.zzag(zzrn) && !((Boolean)zzby.zzuw.get()).booleanValue();
            }

            
            {
                zzrn = context;
                super();
            }
        });
    }

    static zzhq zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1, zzb zzb1)
    {
        if (zzb1.zzd(adrequestinfoparcel))
        {
            return zzb(context, adrequestinfoparcel, zza1);
        } else
        {
            return zzc(context, adrequestinfoparcel, zza1);
        }
    }

    private static zzhq zzb(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fetching ad response from local ad request service.");
        context = new zzd.zza(context, adrequestinfoparcel, zza1);
        context.zzgn();
        return context;
    }

    private static zzhq zzc(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fetching ad response from remote ad request service.");
        if (!zzk.zzcE().zzR(context))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new zzd.zzb(context, adrequestinfoparcel, zza1);
        }
    }
}
