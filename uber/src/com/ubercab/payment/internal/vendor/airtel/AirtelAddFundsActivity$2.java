// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelCheckBonusResponse;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity

final class a extends gtb
{

    final AirtelAddFundsActivity a;

    private void a(AirtelCheckBonusResponse airtelcheckbonusresponse)
    {
        AirtelAddFundsActivity.a(a, Boolean.valueOf(airtelcheckbonusresponse.getEligibleForBonus()));
        AirtelAddFundsActivity.b(a);
        AirtelAddFundsActivity.a(a).a(true);
    }

    protected final volatile void a(Object obj)
    {
        a((AirtelCheckBonusResponse)obj);
    }

    protected final void a(RetrofitError retrofiterror)
    {
        AirtelAddFundsActivity.a(a, Boolean.valueOf(false));
        AirtelAddFundsActivity.b(a);
        AirtelAddFundsActivity.a(a).a(true);
    }

    kBonusResponse(AirtelAddFundsActivity airteladdfundsactivity, Activity activity)
    {
        a = airteladdfundsactivity;
        super(activity);
    }
}
