// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzja, zzjb

private static final class u.zzb extends zzja
{

    private final com.google.android.gms.common.api.nit> zzOs;

    public void zzg(int i, int j)
    {
        Status status = new Status(i);
        zzOs.zm(new <init>(status, j));
    }

    public (com.google.android.gms.common.api. )
    {
        zzOs = (com.google.android.gms.common.api.Os)zzu.zzb(, "Result holder must not be null");
    }
}
