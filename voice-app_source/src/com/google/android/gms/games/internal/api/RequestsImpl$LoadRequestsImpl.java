// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class <init> extends com.google.android.gms.games.RequestsImpl
{

    public Result createFailedResult(Status status)
    {
        return zzar(status);
    }

    public com.google.android.gms.games.request.Impl zzar(Status status)
    {
        return new com.google.android.gms.games.request.Requests.LoadRequestsResult(status) {

            final Status zzOl;
            final RequestsImpl.LoadRequestsImpl zzarX;

            public GameRequestBuffer getRequests(int i)
            {
                return new GameRequestBuffer(DataHolder.zzbi(zzOl.getStatusCode()));
            }

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzarX = RequestsImpl.LoadRequestsImpl.this;
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
