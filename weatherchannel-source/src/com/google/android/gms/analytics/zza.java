// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznr;
import com.google.android.gms.internal.zznu;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            zzb

public class zza extends zznr
{

    private final zzf zzIa;
    private boolean zzIb;

    public zza(zzf zzf1)
    {
        super(zzf1.zzhS(), zzf1.zzhP());
        zzIa = zzf1;
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzIb = flag;
    }

    protected void zza(zzno zzno1)
    {
        zzno1 = (zzip)zzno1.zze(com/google/android/gms/internal/zzip);
        if (TextUtils.isEmpty(zzno1.getClientId()))
        {
            zzno1.setClientId(zzIa.zzih().zziP());
        }
        if (zzIb && TextUtils.isEmpty(zzno1.zzhx()))
        {
            com.google.android.gms.analytics.internal.zza zza1 = zzIa.zzig();
            zzno1.zzaO(zza1.zzhC());
            zzno1.zzE(zza1.zzhy());
        }
    }

    public void zzaI(String s)
    {
        zzu.zzcj(s);
        zzaJ(s);
        zzwb().add(new zzb(zzIa, s));
    }

    public void zzaJ(String s)
    {
        s = zzb.zzaK(s);
        ListIterator listiterator = zzwb().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((zznu)listiterator.next()).zzhe()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    zzf zzhb()
    {
        return zzIa;
    }

    public zzno zzhc()
    {
        zzno zzno1 = zzwa().zzvP();
        zzno1.zzb(zzIa.zzhX().zzix());
        zzno1.zzb(zzIa.zzhY().zzjE());
        zzd(zzno1);
        return zzno1;
    }
}
