// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzov, zzox

private static abstract class piClient extends piClient
{

    protected Result createFailedResult(Status status)
    {
        return zzaN(status);
    }

    protected com.google.android.gms.panorama.pi.PanoramaResult zzaN(Status status)
    {
        return new zzox(status, null);
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
