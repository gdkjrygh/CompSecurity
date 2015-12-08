// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            zzpd

class zzOl
    implements com.google.android.gms.plus.dMomentsResult
{

    final Status zzOl;
    final zzOl zzaHJ;

    public MomentBuffer getMomentBuffer()
    {
        return null;
    }

    public String getNextPageToken()
    {
        return null;
    }

    public Status getStatus()
    {
        return zzOl;
    }

    public String getUpdated()
    {
        return null;
    }

    public void release()
    {
    }

    omentBuffer(omentBuffer omentbuffer, Status status)
    {
        zzaHJ = omentbuffer;
        zzOl = status;
        super();
    }
}
