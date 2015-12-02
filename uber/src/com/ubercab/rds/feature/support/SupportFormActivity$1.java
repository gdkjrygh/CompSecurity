// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import com.ubercab.rds.core.model.SupportNode;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportFormActivity, SupportFormView

final class a
    implements Callback
{

    final SupportFormActivity a;

    private void a(SupportNode supportnode)
    {
        SupportFormActivity.a(a);
        SupportFormActivity.a(a, supportnode);
        a.l.a(SupportFormActivity.b(a));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        SupportFormActivity.c(a);
    }

    public final void success(Object obj, Response response)
    {
        a((SupportNode)obj);
    }

    (SupportFormActivity supportformactivity)
    {
        a = supportformactivity;
        super();
    }
}
