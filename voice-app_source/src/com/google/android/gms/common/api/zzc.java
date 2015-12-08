// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class zzc
    implements Releasable, Result
{

    protected final Status zzOt;
    protected final DataHolder zzWu;

    protected zzc(DataHolder dataholder)
    {
        this(dataholder, new Status(dataholder.getStatusCode()));
    }

    protected zzc(DataHolder dataholder, Status status)
    {
        zzOt = status;
        zzWu = dataholder;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzWu != null)
        {
            zzWu.close();
        }
    }
}
