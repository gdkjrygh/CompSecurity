// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzhl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza

public class zzn
{

    private final zza zzpg;
    private AdRequestParcel zzph;
    private boolean zzpi;
    private boolean zzpj;
    private long zzpk;
    private final Runnable zzx;

    public zzn(zza zza1)
    {
    /* block-local class not found */
    class zza {}

        this(zza1, new zza(zzhl.zzGk));
    }

    zzn(zza zza1, zza zza2)
    {
        zzpi = false;
        zzpj = false;
        zzpk = 0L;
        zzpg = zza2;
        zzx = new _cls1(new WeakReference(zza1));
    }

    static AdRequestParcel zza(zzn zzn1)
    {
        return zzn1.zzph;
    }

    static boolean zza(zzn zzn1, boolean flag)
    {
        zzn1.zzpi = flag;
        return flag;
    }

    public void cancel()
    {
        zzpi = false;
        zzpg.removeCallbacks(zzx);
    }

    public void pause()
    {
        zzpj = true;
        if (zzpi)
        {
            zzpg.removeCallbacks(zzx);
        }
    }

    public void resume()
    {
        zzpj = false;
        if (zzpi)
        {
            zzpi = false;
            zza(zzph, zzpk);
        }
    }

    public void zza(AdRequestParcel adrequestparcel, long l)
    {
        if (zzpi)
        {
            zzb.zzaC("An ad refresh is already scheduled.");
        } else
        {
            zzph = adrequestparcel;
            zzpi = true;
            zzpk = l;
            if (!zzpj)
            {
                zzb.zzaA((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                zzpg.postDelayed(zzx, l);
                return;
            }
        }
    }

    public boolean zzbp()
    {
        return zzpi;
    }

    public void zzf(AdRequestParcel adrequestparcel)
    {
        zza(adrequestparcel, 60000L);
    }

    /* member class not found */
    class _cls1 {}

}
