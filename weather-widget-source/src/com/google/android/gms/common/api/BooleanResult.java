// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, Status

public class BooleanResult
    implements Result
{

    private final Status zzQA;
    private final boolean zzYW;

    public BooleanResult(Status status, boolean flag)
    {
        zzQA = (Status)zzx.zzb(status, "Status must not be null");
        zzYW = flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof BooleanResult))
            {
                return false;
            }
            obj = (BooleanResult)obj;
            if (!zzQA.equals(((BooleanResult) (obj)).zzQA) || zzYW != ((BooleanResult) (obj)).zzYW)
            {
                return false;
            }
        }
        return true;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public boolean getValue()
    {
        return zzYW;
    }

    public final int hashCode()
    {
        int j = zzQA.hashCode();
        int i;
        if (zzYW)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + (j + 527) * 31;
    }
}
