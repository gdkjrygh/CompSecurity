// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import cwt;
import hck;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripProblemActivity

final class a
    implements Callback
{

    final TripProblemActivity a;

    private void a(TripSummary tripsummary)
    {
        TripProblemActivity.a(a);
        TripProblemActivity.a(a, tripsummary);
        TripProblemActivity.b(a);
    }

    public final void failure(RetrofitError retrofiterror)
    {
    /* block-local class not found */
    class _cls1 {}

        a.e.supportTerritory("00000000-0000-0000-0000-000000000000", "android", a.d.y(), cwt.a(), "trip", new _cls1());
    }

    public final void success(Object obj, Response response)
    {
        a((TripSummary)obj);
    }

    _cls1(TripProblemActivity tripproblemactivity)
    {
        a = tripproblemactivity;
        super();
    }
}
