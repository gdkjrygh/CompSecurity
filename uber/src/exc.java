// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.pickup.model.GuidedPickupVenue;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class exc
    implements Callback
{

    private final exb a;
    private final String b;

    exc(exb exb1, String s)
    {
        a = exb1;
        b = s;
    }

    private void a(GuidedPickupVenue guidedpickupvenue, Response response)
    {
        if (guidedpickupvenue == null || response == null)
        {
            if (response != null)
            {
                guidedpickupvenue = response.getUrl();
            } else
            {
                guidedpickupvenue = b;
            }
            failure(RetrofitError.unexpectedError(guidedpickupvenue, new NullPointerException((new StringBuilder("Venue or response is null: ")).append(b).toString())));
            return;
        } else
        {
            a.a(b, new ewu(b, guidedpickupvenue, response));
            return;
        }
    }

    public final void failure(RetrofitError retrofiterror)
    {
        RetrofitError retrofiterror1 = retrofiterror;
        if (retrofiterror == null)
        {
            retrofiterror1 = RetrofitError.unexpectedError(b, new NullPointerException((new StringBuilder("Error is null: ")).append(b).toString()));
        }
        a.b(b, new ewu(b, retrofiterror1));
    }

    public final void success(Object obj, Response response)
    {
        a((GuidedPickupVenue)obj, response);
    }
}
