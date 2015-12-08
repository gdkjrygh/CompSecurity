// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzy;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEvent

public class DataEventBuffer extends zzf
    implements Result
{

    private final Status zzQA;

    public DataEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
        zzQA = new Status(dataholder.getStatusCode());
    }

    public Status getStatus()
    {
        return zzQA;
    }

    protected Object zzk(int i, int j)
    {
        return zzv(i, j);
    }

    protected String zznW()
    {
        return "path";
    }

    protected DataEvent zzv(int i, int j)
    {
        return new zzy(zzYX, i, j);
    }
}
