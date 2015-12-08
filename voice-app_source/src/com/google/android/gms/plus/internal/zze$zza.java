// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zze

static final class zzaHp
    implements com.google.android.gms.plus.LoadMomentsResult
{

    private final Status zzOt;
    private final String zzaHn;
    private final String zzaHo;
    private final MomentBuffer zzaHp;

    public MomentBuffer getMomentBuffer()
    {
        return zzaHp;
    }

    public String getNextPageToken()
    {
        return zzaHn;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public String getUpdated()
    {
        return zzaHo;
    }

    public void release()
    {
        if (zzaHp != null)
        {
            zzaHp.release();
        }
    }

    public (Status status, DataHolder dataholder, String s, String s1)
    {
        zzOt = status;
        zzaHn = s;
        zzaHo = s1;
        if (dataholder != null)
        {
            status = new MomentBuffer(dataholder);
        } else
        {
            status = null;
        }
        zzaHp = status;
    }
}
