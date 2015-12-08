// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzid;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo

public class zzd
{
    public static interface zza
    {

        public abstract void zzp(String s);
    }

    public static class zzb
        implements zza
    {

        private final zzid zzoA;
        private final com.google.android.gms.internal.zzha.zza zzoz;

        public void zzp(String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (zzoz != null && zzoz.zzFs != null && !TextUtils.isEmpty(zzoz.zzFs.zzCP))
            {
                builder.appendQueryParameter("debugDialog", zzoz.zzFs.zzCP);
            }
            com.google.android.gms.ads.internal.zzo.zzbv().zzc(zzoA.getContext(), zzoA.zzgI().zzGG, builder.toString());
        }

        public zzb(com.google.android.gms.internal.zzha.zza zza1, zzid zzid1)
        {
            zzoz = zza1;
            zzoA = zzid1;
        }
    }


    private zza zzow;
    private boolean zzox;
    private boolean zzoy;

    public zzd()
    {
        zzoy = ((Boolean)zzbz.zztI.get()).booleanValue();
    }

    public zzd(boolean flag)
    {
        zzoy = flag;
    }

    public void recordClick()
    {
        zzox = true;
    }

    public void zza(zza zza1)
    {
        zzow = zza1;
    }

    public boolean zzbd()
    {
        return !zzoy || zzox;
    }

    public void zzo(String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Action was blocked because no click was detected.");
        if (zzow != null)
        {
            zzow.zzp(s);
        }
    }
}
