// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import com.ubercab.rds.core.model.TripSummary;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripReceiptActivity

final class a
    implements Callback
{

    final TripReceiptActivity a;

    private void a(TripSummary tripsummary)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            TripReceiptActivity.a(a, tripsummary);
            TripReceiptActivity.a(a, tripsummary.getId());
            TripReceiptActivity.c(a);
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
            TripReceiptActivity.f(a);
            TripReceiptActivity.g(a);
            return;
        }
    }

    public final void success(Object obj, Response response)
    {
        a((TripSummary)obj);
    }

    (TripReceiptActivity tripreceiptactivity)
    {
        a = tripreceiptactivity;
        super();
    }
}
