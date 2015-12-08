// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzja, zzjb

private static final class u.zzb extends zzja
{

    private final com.google.android.gms.common.api.er zzOs;

    public void zza(int i, DataHolder dataholder)
    {
        zzOs.zm(new <init>(i, dataholder));
    }

    public (com.google.android.gms.common.api.er er)
    {
        zzOs = (com.google.android.gms.common.api.Os)zzu.zzb(er, "Result holder must not be null");
    }
}
