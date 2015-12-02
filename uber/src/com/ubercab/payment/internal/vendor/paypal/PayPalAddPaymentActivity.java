// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.paypal;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import chp;
import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalService;
import com.ubercab.payment.internal.inject.AddPaymentActivityWithInjection;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import e;
import gsg;
import gst;
import gtc;
import gyp;
import gyq;
import gyr;
import gys;
import gyx;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.paypal:
//            PayPalApi

public class PayPalAddPaymentActivity extends AddPaymentActivityWithInjection
{

    public chp a;
    public PayPalApi b;
    public gyx c;
    private PayPalConfiguration d;
    private ProgressDialog e;

    public PayPalAddPaymentActivity()
    {
    }

    static ProgressDialog a(PayPalAddPaymentActivity paypaladdpaymentactivity)
    {
        return paypaladdpaymentactivity.e;
    }

    private void a(PayPalAuthorization paypalauthorization)
    {
        paypalauthorization = gyp.a(paypalauthorization.a(), gyx.a(this));
        if ("add".equals(f()))
        {
            a(((gyp) (paypalauthorization)));
        } else
        if ("data_collection".equals(f()))
        {
            b(paypalauthorization);
            return;
        }
    }

    static void a(PayPalAddPaymentActivity paypaladdpaymentactivity, PaymentProfile paymentprofile)
    {
        paypaladdpaymentactivity.a(paymentprofile);
    }

    private void a(gyp gyp1)
    {
        e.show();
        b.create(gyp1, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final PayPalAddPaymentActivity a;

            private void a(ApiError apierror)
            {
                PayPalAddPaymentActivity.a(a).dismiss();
                cwm.a(a, apierror.getErrorMessage());
                a.a.a(e.aq);
                a.finish();
            }

            private void a(PaymentProfile paymentprofile)
            {
                PayPalAddPaymentActivity.a(a).dismiss();
                a.a.a(e.as);
                PayPalAddPaymentActivity.a(a, paymentprofile);
            }

            public final volatile void a(Object obj)
            {
                a((PaymentProfile)obj);
            }

            public final void a(RetrofitError retrofiterror)
            {
                PayPalAddPaymentActivity.a(a).dismiss();
                cwm.a(a, gsg.ub__payment_network_error);
                a.a.a(e.ar);
                a.finish();
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = PayPalAddPaymentActivity.this;
                super(activity, class1);
            }
        });
    }

    private void a(gys gys1)
    {
        gys1.a(this);
    }

    private void b(gyp gyp1)
    {
        a(CollectedData.create(gyp1.d()));
    }

    private gys i()
    {
        return gyq.a().a(new gst(getApplication())).a();
    }

    private void j()
    {
        Intent intent = new Intent(this, com/paypal/android/sdk/payments/PayPalFuturePaymentActivity);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", d);
        startActivityForResult(intent, 200);
    }

    private void k()
    {
        Intent intent = new Intent(this, com/paypal/android/sdk/payments/PayPalService);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", d);
        startService(intent);
    }

    protected final volatile void a(Object obj)
    {
        a((gys)obj);
    }

    protected final Object h()
    {
        return i();
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (l == 200 && i1 == -1)
        {
            intent = (PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization");
            if (intent != null)
            {
                a(intent);
            }
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Uri uri = Uri.parse(getResources().getString(gsg.ub__paypal_url_terms));
        Uri uri1 = Uri.parse(getResources().getString(gsg.ub__paypal_url_privacy));
        String s = getResources().getString(gsg.ub__paypal_merchant_name);
        String s1 = getResources().getString(gsg.ub__paypal_client_id_production);
        d = (new PayPalConfiguration()).c(s).a(uri1).b(uri).a("live").b(s1);
        e = new ProgressDialog(this);
        e.setMessage(getString(gsg.ub__payment_adding_paypal));
        e.setIndeterminate(true);
        e.setCancelable(false);
        if (bundle == null)
        {
            k();
            j();
        }
    }

    public void onDestroy()
    {
        stopService(new Intent(this, com/paypal/android/sdk/payments/PayPalService));
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (f().equals("data_collection"))
        {
            a.a(e.at);
        } else
        if (f().equals("add"))
        {
            a.a(e.ap);
            return;
        }
    }
}
