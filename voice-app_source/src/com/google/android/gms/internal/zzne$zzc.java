// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzne

private static class  extends 
{

    private final com.google.android.gms.common.api.zm zzOs;
    private final  zzalA;

    public void zzm(Status status)
    {
        if (zzalA != null && status.isSuccess())
        {
            zzalA.zzqR();
        }
        zzOs.zm(status);
    }

    private (com.google.android.gms.common.api. ,  1)
    {
        zzOs = ;
        zzalA = 1;
    }

    (com.google.android.gms.common.api.alA ala,  ,  1)
    {
        this(ala, );
    }
}
