// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoe;
import com.google.android.gms.internal.zzoh;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            zzb

public class zza extends zzoe
{

    private final zzf zzKa;
    private boolean zzKb;

    public zza(zzf zzf1)
    {
        super(zzf1.zzig(), zzf1.zzid());
        zzKa = zzf1;
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzKb = flag;
    }

    protected void zza(zzob zzob1)
    {
        zzob1 = (zzjb)zzob1.zze(com/google/android/gms/internal/zzjb);
        if (TextUtils.isEmpty(zzob1.getClientId()))
        {
            zzob1.setClientId(zzKa.zziv().zzjd());
        }
        if (zzKb && TextUtils.isEmpty(zzob1.zzhL()))
        {
            com.google.android.gms.analytics.internal.zza zza1 = zzKa.zziu();
            zzob1.zzaT(zza1.zzhQ());
            zzob1.zzG(zza1.zzhM());
        }
    }

    public void zzaN(String s)
    {
        zzx.zzcs(s);
        zzaO(s);
        zzxt().add(new zzb(zzKa, s));
    }

    public void zzaO(String s)
    {
        s = zzb.zzaP(s);
        ListIterator listiterator = zzxt().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((zzoh)listiterator.next()).zzhs()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    zzf zzhp()
    {
        return zzKa;
    }

    public zzob zzhq()
    {
        zzob zzob1 = zzxs().zzxh();
        zzob1.zzb(zzKa.zzil().zziL());
        zzob1.zzb(zzKa.zzim().zzjS());
        zzd(zzob1);
        return zzob1;
    }
}
