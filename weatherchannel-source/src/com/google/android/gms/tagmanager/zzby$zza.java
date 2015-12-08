// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzby, zzaq, zzbg

class zzaMy
    implements zzaMy
{

    final zzby zzaMy;

    public void zza(zzaq zzaq1)
    {
        zzby.zza(zzaMy, zzaq1.zzyO());
    }

    public void zzb(zzaq zzaq1)
    {
        zzby.zza(zzaMy, zzaq1.zzyO());
        zzbg.zzaB((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(zzaq1.zzyO()).toString());
    }

    public void zzc(zzaq zzaq1)
    {
        long l = zzaq1.zzyP();
        if (l == 0L)
        {
            zzby.zza(zzaMy, zzaq1.zzyO(), zzby.zza(zzaMy).currentTimeMillis());
        } else
        if (l + 0xdbba00L < zzby.zza(zzaMy).currentTimeMillis())
        {
            zzby.zza(zzaMy, zzaq1.zzyO());
            zzbg.zzaB((new StringBuilder()).append("Giving up on failed hitId: ").append(zzaq1.zzyO()).toString());
            return;
        }
    }

    (zzby zzby1)
    {
        zzaMy = zzby1;
        super();
    }
}
