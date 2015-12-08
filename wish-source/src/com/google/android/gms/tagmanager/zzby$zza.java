// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzby, zzaq, zzbg

class zzaEk
    implements zzaEk
{

    final zzby zzaEk;

    public void zza(zzaq zzaq1)
    {
        zzby.zza(zzaEk, zzaq1.zzwS());
    }

    public void zzb(zzaq zzaq1)
    {
        zzby.zza(zzaEk, zzaq1.zzwS());
        zzbg.zzam((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(zzaq1.zzwS()).toString());
    }

    public void zzc(zzaq zzaq1)
    {
        long l = zzaq1.zzwT();
        if (l == 0L)
        {
            zzby.zza(zzaEk, zzaq1.zzwS(), zzby.zza(zzaEk).currentTimeMillis());
        } else
        if (l + 0xdbba00L < zzby.zza(zzaEk).currentTimeMillis())
        {
            zzby.zza(zzaEk, zzaq1.zzwS());
            zzbg.zzam((new StringBuilder()).append("Giving up on failed hitId: ").append(zzaq1.zzwS()).toString());
            return;
        }
    }

    (zzby zzby1)
    {
        zzaEk = zzby1;
        super();
    }
}
