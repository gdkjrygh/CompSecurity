// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationSearchResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmf extends dmx
{

    private String a;

    public dmf(String s, LocationSearchResponse locationsearchresponse, Response response)
    {
        super(locationsearchresponse, response);
        a = s;
    }

    public dmf(String s, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
