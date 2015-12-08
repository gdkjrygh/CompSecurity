// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest, ProxyResponse

public interface ProxyApi
{
    public static interface ProxyResult
        extends Result
    {

        public abstract ProxyResponse getResponse();
    }


    public abstract PendingResult performProxyRequest(GoogleApiClient googleapiclient, ProxyRequest proxyrequest);
}
