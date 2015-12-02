// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.ubercab.payment.internal.inject.ChargePaymentActivityWithInjection;
import com.ubercab.payment.internal.network.model.CheckBalanceResponse;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelChargeBillRequest;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelChargeBillErrorResponse;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import gsg;
import gss;
import gtc;
import guu;
import gwg;
import gwh;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity, AirtelApi

public class AirtelChargePaymentActivity extends ChargePaymentActivityWithInjection
{

    public AirtelApi a;
    private ProgressDialog b;

    public AirtelChargePaymentActivity()
    {
    }

    static ProgressDialog a(AirtelChargePaymentActivity airtelchargepaymentactivity)
    {
        return airtelchargepaymentactivity.b;
    }

    private void a(int i)
    {
        setResult(i);
        finish();
    }

    private void a(CheckBalanceResponse checkbalanceresponse)
    {
        if (checkbalanceresponse == null)
        {
            a(0);
            return;
        }
        if (checkbalanceresponse.getAmount() > 0.0D)
        {
            startActivityForResult(AirtelAddFundsActivity.a(this, c().getUuid(), checkbalanceresponse.getAmount()), 1000);
            return;
        } else
        {
            a(0);
            return;
        }
    }

    static void a(AirtelChargePaymentActivity airtelchargepaymentactivity, int i)
    {
        airtelchargepaymentactivity.a(i);
    }

    static void a(AirtelChargePaymentActivity airtelchargepaymentactivity, AirtelChargeBillErrorResponse airtelchargebillerrorresponse)
    {
        airtelchargepaymentactivity.a(airtelchargebillerrorresponse);
    }

    private void a(AirtelChargeBillErrorResponse airtelchargebillerrorresponse)
    {
        String s;
        byte byte0;
        s = airtelchargebillerrorresponse.getError();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch -1779966514 -1779966514: default 28
    //                   -1779966514 64;
           goto _L1 _L2
_L2:
        if (s.equals("add_funds_required"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            cwm.a(this, getString(gsg.ub__payment_charge_error));
            finish();
            return;

        case 0: // '\0'
            a(airtelchargebillerrorresponse.getErrorObj());
            break;
        }
        return;
    }

    private void a(guu guu1)
    {
        guu1.a(this);
    }

    private guu f()
    {
        return gwg.a().a(gss.a(getApplication())).a(gss.a()).a();
    }

    private void h()
    {
        a.chargeBill(d(), AirtelChargeBillRequest.create(c().getUuid()), new gtc(this, com/ubercab/payment/internal/vendor/airtel/model/response/AirtelChargeBillErrorResponse) {

            final AirtelChargePaymentActivity a;

            private void a(AirtelChargeBillErrorResponse airtelchargebillerrorresponse)
            {
                AirtelChargePaymentActivity.a(a, airtelchargebillerrorresponse);
            }

            public final void a(Exception exception)
            {
                super.a(exception);
                AirtelChargePaymentActivity.a(a, 0);
            }

            public final void a(Object obj)
            {
                AirtelChargePaymentActivity.a(a, -1);
            }

            public final void a(RetrofitError retrofiterror)
            {
                super.a(retrofiterror);
                AirtelChargePaymentActivity.a(a, 0);
            }

            public final void a(boolean flag)
            {
                super.a(flag);
                if (AirtelChargePaymentActivity.a(a) != null)
                {
                    AirtelChargePaymentActivity.a(a).dismiss();
                }
            }

            public final void b(Object obj)
            {
                a((AirtelChargeBillErrorResponse)obj);
            }

            
            {
                a = AirtelChargePaymentActivity.this;
                super(activity, class1);
            }
        });
    }

    protected final volatile void a(Object obj)
    {
        a((guu)obj);
    }

    protected final Object e()
    {
        return f();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1000 && j == -1)
        {
            h();
            return;
        } else
        {
            a(0);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = ProgressDialog.show(this, getString(gsg.ub__payment_charge), getString(gsg.ub__payment_charge_now), true);
        h();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (b != null)
        {
            b.dismiss();
        }
    }
}
