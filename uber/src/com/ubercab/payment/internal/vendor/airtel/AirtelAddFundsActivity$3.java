// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import chp;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelDepositErrorResponse;
import cwm;
import e;
import gsg;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity

final class a extends gtc
{

    final AirtelAddFundsActivity a;

    private void a(AirtelDepositErrorResponse airteldepositerrorresponse)
    {
        AirtelAddFundsActivity.a(a, airteldepositerrorresponse);
    }

    public final void a(Exception exception)
    {
        super.a(exception);
        a.b.a(e.o);
        if (!AirtelAddFundsActivity.c(a))
        {
            AirtelAddFundsActivity.a(a, 0);
        }
    }

    public final void a(Object obj)
    {
        cwm.a(a, gsg.ub__payment_airtel_add_funds_success);
        AirtelAddFundsActivity.a(a, -1);
    }

    public final void a(RetrofitError retrofiterror)
    {
        super.a(retrofiterror);
        a.b.a(e.o);
        if (!AirtelAddFundsActivity.c(a))
        {
            AirtelAddFundsActivity.a(a, 0);
        }
    }

    public final void a(boolean flag)
    {
        AirtelAddFundsActivity.a(a).a(true);
    }

    public final void b(Object obj)
    {
        a((AirtelDepositErrorResponse)obj);
    }

    sitErrorResponse(AirtelAddFundsActivity airteladdfundsactivity, Activity activity, Class class1)
    {
        a = airteladdfundsactivity;
        super(activity, class1);
    }
}
