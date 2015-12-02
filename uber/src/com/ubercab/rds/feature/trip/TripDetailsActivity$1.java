// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import com.ubercab.rds.core.model.TripSummary;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripDetailsActivity

final class a
    implements Callback
{

    final TripDetailsActivity a;

    private void a(TripSummary tripsummary)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            TripDetailsActivity.a(a);
            TripDetailsActivity.a(a, tripsummary);
            TripDetailsActivity.b(a, TripDetailsActivity.b(a));
            return;
        }
    }

    public final void failure(RetrofitError retrofiterror)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            TripDetailsActivity.c(a);
            TripDetailsActivity.d(a);
            return;
        }
    }

    public final void success(Object obj, Response response)
    {
        a((TripSummary)obj);
    }

    (TripDetailsActivity tripdetailsactivity)
    {
        a = tripdetailsactivity;
        super();
    }
}
