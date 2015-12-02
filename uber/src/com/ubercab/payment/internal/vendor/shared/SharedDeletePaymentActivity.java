// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import chp;
import cic;
import com.ubercab.payment.internal.activity.DeletePaymentActivity;
import com.ubercab.payment.internal.network.PaymentProfileClient;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import gry;
import gsg;
import gtb;
import retrofit.RetrofitError;

public class SharedDeletePaymentActivity extends DeletePaymentActivity
{

    private ProgressDialog a;
    private chp b;
    private PaymentProfileClient c;

    public SharedDeletePaymentActivity()
    {
    }

    static PaymentProfile a(SharedDeletePaymentActivity shareddeletepaymentactivity)
    {
        return shareddeletepaymentactivity.c();
    }

    private void a(cic cic)
    {
        if (cic != null)
        {
            b.a(cic);
        }
    }

    static void a(SharedDeletePaymentActivity shareddeletepaymentactivity, cic cic)
    {
        shareddeletepaymentactivity.a(cic);
    }

    static void a(SharedDeletePaymentActivity shareddeletepaymentactivity, PaymentProfile paymentprofile)
    {
        shareddeletepaymentactivity.a(paymentprofile);
    }

    private void f()
    {
        c.b(c(), new gtb(this) {

            final SharedDeletePaymentActivity a;

            public final void a(Object obj)
            {
                SharedDeletePaymentActivity.a(a, a.d());
                SharedDeletePaymentActivity.a(a, SharedDeletePaymentActivity.a(a));
            }

            public final void a(RetrofitError retrofiterror)
            {
                SharedDeletePaymentActivity.a(a, a.e());
                cwm.a(a, a.getString(gsg.ub__payment_delete_failed));
                a.setResult(0);
                a.finish();
            }

            
            {
                a = SharedDeletePaymentActivity.this;
                super(activity);
            }
        });
    }

    public cic d()
    {
        return null;
    }

    public cic e()
    {
        return null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (b == null)
        {
            b = g().e();
        }
        if (c == null)
        {
            c = new PaymentProfileClient(g().aK());
        }
        a = new ProgressDialog(this);
        a.setMessage(getString(gsg.ub__payment_deleting));
        a.setIndeterminate(true);
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
        a.setProgress(0);
        a.show();
        if (bundle == null)
        {
            f();
        }
    }

    protected void onDestroy()
    {
        if (a != null && a.isShowing())
        {
            a.dismiss();
        }
        super.onDestroy();
    }
}
