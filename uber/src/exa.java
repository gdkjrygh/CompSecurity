// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.pickup.model.GuidedPickupSnap;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class exa
    implements Callback
{

    private final ewz a;
    private final com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Location b;

    exa(ewz ewz1, com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Location location)
    {
        a = ewz1;
        b = location;
    }

    private void a(GuidedPickupSnap guidedpickupsnap, Response response)
    {
        a.a(b, new ewt(guidedpickupsnap, response));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        a.b(b, new ewt(retrofiterror));
    }

    public final void success(Object obj, Response response)
    {
        a((GuidedPickupSnap)obj, response);
    }
}
