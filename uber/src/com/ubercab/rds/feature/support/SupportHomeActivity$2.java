// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import com.ubercab.rds.core.model.TripHistory;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportHomeActivity

final class a
    implements Callback
{

    final SupportHomeActivity a;

    private void a(TripHistory triphistory)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            SupportHomeActivity.a(a, triphistory);
            SupportHomeActivity.b(a);
            return;
        }
    }

    public final void failure(RetrofitError retrofiterror)
    {
        SupportHomeActivity.d(a);
    }

    public final void success(Object obj, Response response)
    {
        a((TripHistory)obj);
    }

    (SupportHomeActivity supporthomeactivity)
    {
        a = supporthomeactivity;
        super();
    }
}
