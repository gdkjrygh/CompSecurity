// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzhq;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm, zzb

public class com.google.android.gms.ads.internal.request.zza
{
    public static interface zza
    {

        public abstract void zza(com.google.android.gms.internal.zzhj.zza zza1);
    }


    public com.google.android.gms.ads.internal.request.zza()
    {
    }

    public zzhq zza(Context context, AdRequestInfoParcel.zza zza1, zzan zzan, zza zza2)
    {
        if (zza1.zzDy.extras.getBundle("sdk_less_server_data") != null)
        {
            context = new zzm(context, zza1, zza2);
        } else
        {
            context = new zzb(context, zza1, zzan, zza2);
        }
        context.zzgo();
        return context;
    }
}
