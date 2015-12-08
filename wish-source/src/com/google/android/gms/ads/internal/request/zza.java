// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzk;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl, zzb

public class com.google.android.gms.ads.internal.request.zza
{
    public static interface zza
    {

        public abstract void zza(com.google.android.gms.internal.zzfa.zza zza1);
    }


    public com.google.android.gms.ads.internal.request.zza()
    {
    }

    public zzfh zza(Context context, AdRequestInfoParcel.zza zza1, zzk zzk, zza zza2)
    {
        if (((Boolean)zzat.zzrX.get()).booleanValue() && zza1.zzyW.extras.getBundle("sdk_less_server_data") != null)
        {
            context = new zzl(context, zza1, zza2);
        } else
        {
            context = new zzb(context, zza1, zzk, zza2);
        }
        context.zzeX();
        return context;
    }
}
