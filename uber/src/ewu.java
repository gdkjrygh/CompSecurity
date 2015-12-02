// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.pickup.model.GuidedPickupVenue;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class ewu extends dmx
{

    private final String a;

    public ewu(String s, GuidedPickupVenue guidedpickupvenue, Response response)
    {
        super(guidedpickupvenue, response);
        a = s;
    }

    public ewu(String s, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
