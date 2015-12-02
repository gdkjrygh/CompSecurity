// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationHistoryResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dme extends dmx
{

    private final double a;
    private final double b;

    public dme(double d, double d1, LocationHistoryResponse locationhistoryresponse, Response response)
    {
        super(locationhistoryresponse, response);
        a = d;
        b = d1;
    }

    public dme(double d, double d1, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = d;
        b = d1;
    }

    public final double a()
    {
        return b;
    }

    public final double b()
    {
        return a;
    }
}
