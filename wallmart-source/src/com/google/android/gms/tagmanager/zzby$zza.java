// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlm;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzby, zzaq, zzbg

class zzaQS
    implements zzaQS
{

    final zzby zzaQS;

    public void zza(zzaq zzaq1)
    {
        zzby.zza(zzaQS, zzaq1.zzAe());
    }

    public void zzb(zzaq zzaq1)
    {
        zzby.zza(zzaQS, zzaq1.zzAe());
        zzbg.v((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(zzaq1.zzAe()).toString());
    }

    public void zzc(zzaq zzaq1)
    {
        long l = zzaq1.zzAf();
        if (l == 0L)
        {
            zzby.zza(zzaQS, zzaq1.zzAe(), zzby.zza(zzaQS).currentTimeMillis());
        } else
        if (l + 0xdbba00L < zzby.zza(zzaQS).currentTimeMillis())
        {
            zzby.zza(zzaQS, zzaq1.zzAe());
            zzbg.v((new StringBuilder()).append("Giving up on failed hitId: ").append(zzaq1.zzAe()).toString());
            return;
        }
    }

    (zzby zzby1)
    {
        zzaQS = zzby1;
        super();
    }
}
