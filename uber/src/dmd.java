// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationSearchResult;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmd extends dmx
{

    private final String a;
    private final String b;

    public dmd(String s, String s1, LocationSearchResult locationsearchresult, Response response)
    {
        super(locationsearchresult, response);
        a = s;
        b = s1;
    }

    public dmd(String s, String s1, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }
}
