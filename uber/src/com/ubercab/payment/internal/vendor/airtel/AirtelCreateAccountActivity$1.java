// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelAccountResponse;
import cwm;
import e;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelCreateAccountActivity

final class a extends gtc
{

    final AirtelCreateAccountActivity a;

    private void a(ApiError apierror)
    {
        cwm.a(a, apierror.getErrorMessage());
        a.finish();
    }

    private void a(AirtelAccountResponse airtelaccountresponse)
    {
        AirtelCreateAccountActivity.a(a, airtelaccountresponse.getPaymentReferenceNumber());
    }

    public final void a(Exception exception)
    {
        super.a(exception);
        a.finish();
    }

    public final volatile void a(Object obj)
    {
        a((AirtelAccountResponse)obj);
    }

    public final void a(RetrofitError retrofiterror)
    {
        super.a(retrofiterror);
        a.finish();
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.b.a(e.v);
            return;
        } else
        {
            a.b.a(e.u);
            return;
        }
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    sponse(AirtelCreateAccountActivity airtelcreateaccountactivity, Activity activity, Class class1)
    {
        a = airtelcreateaccountactivity;
        super(activity, class1);
    }
}
