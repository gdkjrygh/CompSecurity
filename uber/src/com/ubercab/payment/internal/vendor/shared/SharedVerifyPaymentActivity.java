// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.InputFilter;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import chp;
import cic;
import cif;
import com.ubercab.payment.internal.activity.VerifyPaymentActivity;
import com.ubercab.payment.internal.network.PaymentProfileClient;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import gry;
import gsa;
import gsd;
import gse;
import gsg;
import gtb;
import hpb;
import retrofit.RetrofitError;

public class SharedVerifyPaymentActivity extends VerifyPaymentActivity
{

    private chp a;
    private EditText b;
    private PaymentProfileClient c;
    private ProgressDialog d;

    public SharedVerifyPaymentActivity()
    {
    }

    static EditText a(SharedVerifyPaymentActivity sharedverifypaymentactivity)
    {
        return sharedverifypaymentactivity.b;
    }

    private void a(cic cic)
    {
        if (cic != null)
        {
            a.a(cic);
        }
    }

    private void a(cif cif)
    {
        if (cif != null)
        {
            a.a(cif);
        }
    }

    static void a(SharedVerifyPaymentActivity sharedverifypaymentactivity, cic cic)
    {
        sharedverifypaymentactivity.a(cic);
    }

    static void a(SharedVerifyPaymentActivity sharedverifypaymentactivity, cif cif)
    {
        sharedverifypaymentactivity.a(cif);
    }

    static void a(SharedVerifyPaymentActivity sharedverifypaymentactivity, PaymentProfile paymentprofile)
    {
        sharedverifypaymentactivity.a(paymentprofile);
    }

    static ProgressDialog b(SharedVerifyPaymentActivity sharedverifypaymentactivity)
    {
        return sharedverifypaymentactivity.d;
    }

    static PaymentProfile c(SharedVerifyPaymentActivity sharedverifypaymentactivity)
    {
        return sharedverifypaymentactivity.c();
    }

    private String m()
    {
        String s = gsa.a(this, c().getTokenType()).b();
        String s1 = c().getDisplayName(getResources());
        return getString(gsg.ub__payment_verify_payment_info_description, new Object[] {
            s, s1
        });
    }

    public final void a(String s)
    {
        d.setMessage(getString(gsg.ub__payment_verifying_code));
        d.show();
        c.a(c(), s, new gtb(this) {

            final SharedVerifyPaymentActivity a;

            public final void a(Object obj)
            {
                SharedVerifyPaymentActivity.b(a).dismiss();
                SharedVerifyPaymentActivity.a(a, a.h());
                a.a(true);
                SharedVerifyPaymentActivity.a(a, SharedVerifyPaymentActivity.c(a));
            }

            public final void a(RetrofitError retrofiterror)
            {
                SharedVerifyPaymentActivity.b(a).dismiss();
                SharedVerifyPaymentActivity.a(a, a.f());
                Toast.makeText(a, a.getString(gsg.ub__payment_verify_code_failure), 1).show();
                a.a(false);
            }

            
            {
                a = SharedVerifyPaymentActivity.this;
                super(activity);
            }
        });
    }

    public void a(boolean flag)
    {
    }

    public cic e()
    {
        return null;
    }

    public cic f()
    {
        return null;
    }

    public cic h()
    {
        return null;
    }

    public cif i()
    {
        return null;
    }

    public int j()
    {
        return -1;
    }

    public final chp k()
    {
        return a;
    }

    protected final void l()
    {
        d.setMessage(getString(gsg.ub__payment_resending_sms));
        d.show();
        c.c(c(), new gtb(this) {

            final SharedVerifyPaymentActivity a;

            private void b()
            {
                SharedVerifyPaymentActivity.b(a).dismiss();
            }

            public final void a(Object obj)
            {
                b();
            }

            public final void a(RetrofitError retrofiterror)
            {
                SharedVerifyPaymentActivity.b(a).dismiss();
                Toast.makeText(a, a.getString(gsg.ub__payment_resend_sms_failure), 1).show();
            }

            
            {
                a = SharedVerifyPaymentActivity.this;
                super(activity);
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(gse.ub__payment_activity_shared_verify);
        if (b() != null)
        {
            b().b(true);
        }
        if (a == null)
        {
            a = g().e();
        }
        if (c == null)
        {
            c = new PaymentProfileClient(g().aK());
        }
        d = new ProgressDialog(this);
        d.setIndeterminate(true);
        d.setCancelable(false);
        d.setCanceledOnTouchOutside(false);
        d.setProgress(0);
        b = (EditText)findViewById(gsd.ub__shared_verify_edittext_code);
        b.addTextChangedListener(new hpb() {

            final SharedVerifyPaymentActivity a;

            public final void afterTextChanged(Editable editable)
            {
                if (editable.length() == a.j())
                {
                    a.a(editable.toString());
                }
            }

            
            {
                a = SharedVerifyPaymentActivity.this;
                super();
            }
        });
        ((TextView)findViewById(gsd.ub__shared_verify_textview_description)).setText(m());
        bundle = (Button)findViewById(gsd.ub__shared_verify_button_verify);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final SharedVerifyPaymentActivity a;

            public final void onClick(View view)
            {
                SharedVerifyPaymentActivity.a(a, a.i());
                a.a(SharedVerifyPaymentActivity.a(a).getText().toString());
            }

            
            {
                a = SharedVerifyPaymentActivity.this;
                super();
            }
        });
        ((Button)findViewById(gsd.ub__shared_verify_button_resendsms)).setOnClickListener(new android.view.View.OnClickListener() {

            final SharedVerifyPaymentActivity a;

            public final void onClick(View view)
            {
                a.l();
            }

            
            {
                a = SharedVerifyPaymentActivity.this;
                super();
            }
        });
        if (j() > 0)
        {
            android.text.InputFilter.LengthFilter lengthfilter = new android.text.InputFilter.LengthFilter(j());
            b.setFilters(new InputFilter[] {
                lengthfilter
            });
            bundle.setVisibility(8);
        }
    }

    protected void onDestroy()
    {
        if (d != null && d.isShowing())
        {
            d.dismiss();
        }
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
        a(e());
    }
}
