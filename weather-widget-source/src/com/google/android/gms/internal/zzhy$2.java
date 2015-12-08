// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzhy, zzr

class zzIh
    implements 
{

    final c zzIh;
    final zzhy zzIi;
    final String zzxv;

    public void zze(zzr zzr1)
    {
        zzb.zzaE((new StringBuilder()).append("Failed to load URL: ").append(zzxv).append("\n").append(zzr1.toString()).toString());
        zzIh.zzb(null);
    }

    c(zzhy zzhy1, String s, c c)
    {
        zzIi = zzhy1;
        zzxv = s;
        zzIh = c;
        super();
    }
}
