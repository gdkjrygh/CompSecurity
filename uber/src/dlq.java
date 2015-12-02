// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.FareEstimateResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dlq extends dmx
{

    private long a;

    public dlq(long l, FareEstimateResponse fareestimateresponse, Response response)
    {
        super(fareestimateresponse, response);
        a = l;
    }

    public dlq(long l, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = l;
    }

    public final long a()
    {
        return a;
    }
}
