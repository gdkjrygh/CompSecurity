// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime.model;

import com.ubercab.realtime.error.Error;

// Referenced classes of package com.ubercab.client.core.realtime.model:
//            PollingResponse

public final class Shape_PollingResponse extends PollingResponse
{

    private Error error;
    private Object response;

    Shape_PollingResponse()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PollingResponse)obj;
            if (((PollingResponse) (obj)).getError() == null ? getError() != null : !((PollingResponse) (obj)).getError().equals(getError()))
            {
                return false;
            }
            if (((PollingResponse) (obj)).getResponse() == null ? getResponse() != null : !((PollingResponse) (obj)).getResponse().equals(getResponse()))
            {
                return false;
            }
        }
        return true;
    }

    public final Error getError()
    {
        return error;
    }

    public final Object getResponse()
    {
        return response;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (error == null)
        {
            i = 0;
        } else
        {
            i = error.hashCode();
        }
        if (response != null)
        {
            j = response.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final PollingResponse setError(Error error1)
    {
        error = error1;
        return this;
    }

    final PollingResponse setResponse(Object obj)
    {
        response = obj;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.realtime.model.PollingResponse<T>{error=")).append(error).append(", response=").append(response).append("}").toString();
    }
}
