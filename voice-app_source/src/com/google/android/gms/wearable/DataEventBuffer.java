// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzw;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEvent

public class DataEventBuffer extends zzf
    implements Result
{

    private final Status zzOt;

    public DataEventBuffer(DataHolder dataholder)
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
        return zzu(i, j);
    }

    protected String zzni()
    {
        return "path";
    }

    protected DataEvent zzu(int i, int j)
    {
        return new zzw(zzWu, i, j);
    }
}
