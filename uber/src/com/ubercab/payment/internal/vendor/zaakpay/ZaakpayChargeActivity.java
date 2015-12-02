// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.ubercab.payment.internal.activity.ChargePaymentActivity;
import com.ubercab.payment.internal.model.GatewayInfo;
import com.ubercab.payment.internal.vendor.zaakpay.model.ChargeBillErrorContainer;
import com.ubercab.payment.internal.vendor.zaakpay.model.ChargeBillRequestData;
import cwm;
import grs;
import gry;
import gsg;
import gsm;
import gtc;
import gzg;
import gzh;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay:
//            ZaakpayApi, ZaakpayWebViewActivity

public class ZaakpayChargeActivity extends ChargePaymentActivity
    implements gzh
{

    private ProgressDialog a;
    private gsm b;
    private gzg c;
    private ZaakpayApi d;

    public ZaakpayChargeActivity()
    {
    }

    static gzg a(ZaakpayChargeActivity zaakpaychargeactivity)
    {
        return zaakpaychargeactivity.c;
    }

    public final void a()
    {
        finish();
    }

    public final void a(CharSequence charsequence)
    {
        charsequence = GatewayInfo.create(b.a(charsequence.toString()));
        a = ProgressDialog.show(this, null, getString(gsg.ub__payment_loading), true);
        d.chargeBill(d(), ChargeBillRequestData.create(c(), charsequence), new gtc(com/ubercab/payment/internal/vendor/zaakpay/model/ChargeBillErrorContainer) {

            final ZaakpayChargeActivity a;

            private void a(ChargeBillErrorContainer chargebillerrorcontainer)
            {
                if (a.isFinishing())
                {
                    return;
                }
                if ("cvv_entry_required".equals(chargebillerrorcontainer.getError()))
                {
                    ZaakpayChargeActivity.a(a).a();
                    return;
                }
                if ("web_auth_required".equals(chargebillerrorcontainer.getError()))
                {
                    a.startActivityForResult(ZaakpayWebViewActivity.a(a, chargebillerrorcontainer.getErrorObj()), 1000);
                    return;
                } else
                {
                    cwm.a(a, chargebillerrorcontainer.getError());
                    a.finish();
                    return;
                }
            }

            public final void a(Exception exception)
            {
                if (a.isFinishing())
                {
                    return;
                } else
                {
                    cwm.a(a, gsg.ub__payment_unexpected_error);
                    a.finish();
                    return;
                }
            }

            public final void a(Object obj)
            {
                if (a.isFinishing())
                {
                    return;
                } else
                {
                    a.setResult(-1);
                    a.finish();
                    return;
                }
            }

            public final void a(RetrofitError retrofiterror)
            {
                if (a.isFinishing())
                {
                    return;
                } else
                {
                    cwm.a(a, gsg.ub__payment_network_error);
                    a.finish();
                    return;
                }
            }

            public final void b(Object obj)
            {
                a((ChargeBillErrorContainer)obj);
            }

            
            {
                a = ZaakpayChargeActivity.this;
                super(class1);
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1000)
        {
            setResult(j);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (d == null)
        {
            d = (ZaakpayApi)g().aK().a(com/ubercab/payment/internal/vendor/zaakpay/ZaakpayApi);
        }
        b = new gsm(getString(gsg.ub__payment_zaakpay_key_production), "RSA/ECB/PKCS1Padding");
        c = new gzg(this, g().e(), gsg.ub__payment_enter_cvv);
        c.a(this);
        c.a();
    }
}
