// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Profile;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dns extends dmt
{

    public dns(Profile profile, Response response)
    {
        super(profile, response);
    }

    public dns(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    public final Profile a()
    {
        return (Profile)g();
    }
}
