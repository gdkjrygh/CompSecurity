// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.google.model.DirectionsResponse;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dwu extends dmx
{

    public dwu(DirectionsResponse directionsresponse, Response response)
    {
        super(directionsresponse, response);
    }

    public dwu(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    public final boolean i()
    {
        return super.i() && ((DirectionsResponse)g()).isSuccess();
    }
}
