// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzw

public static class zzbam
    implements com.google.android.gms.wearable.DataItemResult
{

    private final Status zzQA;
    private final DataItem zzbam;

    public DataItem getDataItem()
    {
        return zzbam;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public esult(Status status, DataItem dataitem)
    {
        zzQA = status;
        zzbam = dataitem;
    }
}
