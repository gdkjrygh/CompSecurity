// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import com.ubercab.client.core.model.Ping;
import dri;
import dul;
import giz;
import gqg;
import gqj;
import gql;
import java.util.concurrent.Semaphore;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationIntentService

final class a extends gql
{

    final Semaphore a;
    final MobileVerificationIntentService b;

    private void a()
    {
        a.release();
    }

    private void a(Ping ping)
    {
        if (dul.r(ping))
        {
            if (!MobileVerificationIntentService.a(b))
            {
                MobileVerificationIntentService.b(b);
            }
            b.i.a("com.uber.SMS_RECEIVER");
        }
        b.d.h();
        a.release();
    }

    public final volatile void a(gqg gqg, gqj gqj, Response response)
    {
        a();
    }

    public final void a(gqg gqg, RetrofitError retrofiterror)
    {
        a.release();
    }

    public final void b(gqg gqg, gqj gqj, Response response)
    {
        a((Ping)gqj);
    }

    (MobileVerificationIntentService mobileverificationintentservice, Semaphore semaphore)
    {
        b = mobileverificationintentservice;
        a = semaphore;
        super();
    }
}
