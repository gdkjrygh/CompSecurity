// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import com.ubercab.payment.internal.network.model.CheckBalanceResponse;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import cwm;
import gsg;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity, AirtelAddFundsNoPromotionView

final class a extends gtb
{

    final AirtelAddFundsNoPromotionView a;
    final AirtelAddFundsActivity b;

    private void a(CheckBalanceResponse checkbalanceresponse)
    {
        a.a(checkbalanceresponse.getAmount());
        AirtelAddFundsActivity.a(b).a(true);
    }

    protected final volatile void a(Object obj)
    {
        a((CheckBalanceResponse)obj);
    }

    protected final void a(RetrofitError retrofiterror)
    {
        a.a();
        AirtelAddFundsActivity.a(b).a(true);
        cwm.a(b, gsg.ub__payment_add_funds_check_balance_error);
    }

    View(AirtelAddFundsActivity airteladdfundsactivity, Activity activity, AirtelAddFundsNoPromotionView airteladdfundsnopromotionview)
    {
        b = airteladdfundsactivity;
        a = airteladdfundsnopromotionview;
        super(activity);
    }
}
