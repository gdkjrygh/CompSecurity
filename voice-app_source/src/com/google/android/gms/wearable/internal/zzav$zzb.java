// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzav

public static class zzacR
    implements com.google.android.gms.wearable.i.SendMessageResult
{

    private final Status zzOt;
    private final int zzacR;

    public int getRequestId()
    {
        return zzacR;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public sageResult(Status status, int i)
    {
        zzOt = status;
        zzacR = i;
    }
}
