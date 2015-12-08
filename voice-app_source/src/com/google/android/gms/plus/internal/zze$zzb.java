// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zze

static final class zzaHq
    implements com.google.android.gms.plus.oadPeopleResult
{

    private final Status zzOt;
    private final String zzaHn;
    private final PersonBuffer zzaHq;

    public String getNextPageToken()
    {
        return zzaHn;
    }

    public PersonBuffer getPersonBuffer()
    {
        return zzaHq;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzaHq != null)
        {
            zzaHq.release();
        }
    }

    public (Status status, DataHolder dataholder, String s)
    {
        zzOt = status;
        zzaHn = s;
        if (dataholder != null)
        {
            status = new PersonBuffer(dataholder);
        } else
        {
            status = null;
        }
        zzaHq = status;
    }
}
