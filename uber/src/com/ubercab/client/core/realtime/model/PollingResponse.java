// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime.model;

import com.ubercab.realtime.error.Error;

// Referenced classes of package com.ubercab.client.core.realtime.model:
//            Shape_PollingResponse

public abstract class PollingResponse
{

    public PollingResponse()
    {
    }

    public static PollingResponse create(Error error)
    {
        return (new Shape_PollingResponse()).setError(error);
    }

    public static PollingResponse create(Object obj)
    {
        return (new Shape_PollingResponse()).setResponse(obj);
    }

    public abstract Error getError();

    public abstract Object getResponse();

    public boolean isSuccessful()
    {
        return getResponse() != null;
    }

    abstract PollingResponse setError(Error error);

    abstract PollingResponse setResponse(Object obj);
}
