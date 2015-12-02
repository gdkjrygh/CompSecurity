// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationAutocompleteResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmc extends dmx
{

    private String a;

    public dmc(String s, LocationAutocompleteResponse locationautocompleteresponse, Response response)
    {
        super(locationautocompleteresponse, response);
        a = s;
    }

    public dmc(String s, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
