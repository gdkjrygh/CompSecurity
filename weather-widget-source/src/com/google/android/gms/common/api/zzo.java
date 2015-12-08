// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.api:
//            zzb, Status, Result

public class zzo extends zzb
{

    public zzo(Looper looper)
    {
        super(looper);
    }

    protected Result zzb(Status status)
    {
        return zzd(status);
    }

    protected Status zzd(Status status)
    {
        return status;
    }
}
