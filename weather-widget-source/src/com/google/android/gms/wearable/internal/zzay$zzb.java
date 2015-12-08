// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzay

public static class zzagq
    implements com.google.android.gms.wearable.i.SendMessageResult
{

    private final Status zzQA;
    private final int zzagq;

    public int getRequestId()
    {
        return zzagq;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public sageResult(Status status, int i)
    {
        zzQA = status;
        zzagq = i;
    }
}
