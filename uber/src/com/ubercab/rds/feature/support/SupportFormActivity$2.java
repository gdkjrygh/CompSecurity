// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import com.ubercab.rds.core.model.SupportTicketResponse;
import cwm;
import hbo;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportFormActivity, SupportFormView

final class a
    implements Callback
{

    final SupportFormActivity a;

    private void a(SupportTicketResponse supportticketresponse)
    {
        SupportFormActivity.d(a);
        SupportFormActivity.e(a);
        SupportFormActivity.a(a, supportticketresponse.getMessage());
        if (!a.isFinishing() && SupportFormActivity.f(a))
        {
            SupportFormActivity.g(a);
        }
    }

    public final void failure(RetrofitError retrofiterror)
    {
        SupportFormActivity.e(a);
        cwm.a(a, a.getString(hbo.ub__rds__error));
        SupportFormActivity.h(a);
        a.l.b();
    }

    public final void success(Object obj, Response response)
    {
        a((SupportTicketResponse)obj);
    }

    (SupportFormActivity supportformactivity)
    {
        a = supportformactivity;
        super();
    }
}
