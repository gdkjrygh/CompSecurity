// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzw

public static class zzban
    implements com.google.android.gms.wearable.DeleteDataItemsResult
{

    private final Status zzQA;
    private final int zzban;

    public int getNumDeleted()
    {
        return zzban;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public aItemsResult(Status status, int i)
    {
        zzQA = status;
        zzban = i;
    }
}
