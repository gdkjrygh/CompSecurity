// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze

private static final class zzUH
    implements com.google.android.gms.cast.licationConnectionResult
{

    private final String zzFE;
    private final Status zzOt;
    private final ApplicationMetadata zzUF;
    private final String zzUG;
    private final boolean zzUH;

    public ApplicationMetadata getApplicationMetadata()
    {
        return zzUF;
    }

    public String getApplicationStatus()
    {
        return zzUG;
    }

    public String getSessionId()
    {
        return zzFE;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public boolean getWasLaunched()
    {
        return zzUH;
    }

    public ta(Status status)
    {
        this(status, null, null, null, false);
    }

    public ta(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        zzOt = status;
        zzUF = applicationmetadata;
        zzUG = s;
        zzFE = s1;
        zzUH = flag;
    }
}
