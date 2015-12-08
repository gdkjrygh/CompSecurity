// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class <init> extends com.google.android.gms.games.RequestsImpl
{

    public Result createFailedResult(Status status)
    {
        return zzat(status);
    }

    public com.google.android.gms.games.request.Impl zzat(Status status)
    {
        return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(status) {

            final Status zzOl;
            final RequestsImpl.UpdateRequestsImpl zzarZ;

            public Set getRequestIds()
            {
                return null;
            }

            public int getRequestOutcome(String s)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown request ID ").append(s).toString());
            }

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzarZ = RequestsImpl.UpdateRequestsImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.zzOl(GoogleApiClient googleapiclient, _cls1.zzOl zzol)
    {
        this(googleapiclient);
    }
}
