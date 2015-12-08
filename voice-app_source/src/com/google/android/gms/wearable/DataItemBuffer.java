// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzac;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem

public class DataItemBuffer extends zzf
    implements Result
{

    private final Status zzOt;

    public DataItemBuffer(DataHolder dataholder)
    {
        super(dataholder);
        zzOt = new Status(dataholder.getStatusCode());
    }

    public Status getStatus()
    {
        return zzOt;
    }

    protected Object zzj(int i, int j)
    {
        return zzv(i, j);
    }

    protected String zzni()
    {
        return "path";
    }

    protected DataItem zzv(int i, int j)
    {
        return new zzac(zzWu, i, j);
    }
}
