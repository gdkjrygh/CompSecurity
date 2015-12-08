// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Metadata;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz

private static class zzafA
    implements com.google.android.gms.drive.ource.MetadataResult
{

    private final Status zzOt;
    private final Metadata zzafA;

    public Metadata getMetadata()
    {
        return zzafA;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public adataResult(Status status, Metadata metadata)
    {
        zzOt = status;
        zzafA = metadata;
    }
}
