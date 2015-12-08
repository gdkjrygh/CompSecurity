// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            zzpd

private static abstract class piClient extends com.google.android.gms.plus.zza
{

    public Result createFailedResult(Status status)
    {
        return zzaP(status);
    }

    public com.google.android.gms.plus.oadMomentsResult zzaP(Status status)
    {
        return new com.google.android.gms.plus.Moments.LoadMomentsResult(status) {

            final Status zzOl;
            final zzpd.zza zzaHJ;

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

            
            {
                zzaHJ = zzpd.zza.this;
                zzOl = status;
                super();
            }
        };
    }

    private piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    piClient(GoogleApiClient googleapiclient, piClient piclient)
    {
        this(googleapiclient);
    }
}
