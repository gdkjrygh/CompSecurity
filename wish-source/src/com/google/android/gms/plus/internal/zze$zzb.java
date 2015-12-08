// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zze

static final class zzazc
    implements com.google.android.gms.plus.oadPeopleResult
{

    private final Status zzKr;
    private final String zzayZ;
    private final PersonBuffer zzazc;

    public String getNextPageToken()
    {
        return zzayZ;
    }

    public PersonBuffer getPersonBuffer()
    {
        return zzazc;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public void release()
    {
        if (zzazc != null)
        {
            zzazc.release();
        }
    }

    public (Status status, DataHolder dataholder, String s)
    {
        zzKr = status;
        zzayZ = s;
        if (dataholder != null)
        {
            status = new PersonBuffer(dataholder);
        } else
        {
            status = null;
        }
        zzazc = status;
    }
}
