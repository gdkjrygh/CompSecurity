// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzu

public static class zzaUm
    implements com.google.android.gms.wearable.DeleteDataItemsResult
{

    private final Status zzOt;
    private final int zzaUm;

    public int getNumDeleted()
    {
        return zzaUm;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public aItemsResult(Status status, int i)
    {
        zzOt = status;
        zzaUm = i;
    }
}
