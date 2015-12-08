// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class zze
    implements Releasable, Result
{

    protected final Status zzQA;
    protected final DataHolder zzYX;

    protected zze(DataHolder dataholder)
    {
        this(dataholder, new Status(dataholder.getStatusCode()));
    }

    protected zze(DataHolder dataholder, Status status)
    {
        zzQA = status;
        zzYX = dataholder;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public void release()
    {
        if (zzYX != null)
        {
            zzYX.close();
        }
    }
}
