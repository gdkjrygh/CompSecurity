// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelCreateAccountRequest;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelAccountResponse;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelValidateCodeResponse;
import com.ubercab.payment.internal.vendor.airtel.ui.MpinFieldsView;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.ui.Button;
import cwm;
import cwt;
import e;
import f;
import gjz;
import gsd;
import gse;
import gsg;
import gsj;
import gss;
import gtc;
import guw;
import gwi;
import gwj;
import java.util.List;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelApi

public class AirtelCreateAccountActivity extends PaymentActivityWithInjection
{

    public AirtelApi a;
    public chp b;
    public gsj c;
    private ContentLoadingView d;
    private Button e;
    private MpinFieldsView f;
    private PaymentUserInfo g;
    private AirtelValidateCodeResponse h;

    public AirtelCreateAccountActivity()
    {
    }

    public static Intent a(Context context, PaymentUserInfo paymentuserinfo, AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelCreateAccountActivity);
        context.putExtra("user_info", paymentuserinfo);
        context.putExtra("otp_response", airtelvalidatecoderesponse);
        return context;
    }

    static MpinFieldsView a(AirtelCreateAccountActivity airtelcreateaccountactivity)
    {
        return airtelcreateaccountactivity.f;
    }

    static void a(AirtelCreateAccountActivity airtelcreateaccountactivity, String s)
    {
        airtelcreateaccountactivity.a(s);
    }

    private void a(guw guw1)
    {
        guw1.a(this);
    }

    private void a(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("payment_reference_number", s);
        setResult(-1, intent);
        finish();
    }

    static void b(AirtelCreateAccountActivity airtelcreateaccountactivity)
    {
        airtelcreateaccountactivity.e();
    }

    private guw d()
    {
        return gwi.a().a(gss.a(getApplication())).a(gss.a()).a();
    }

    private void e()
    {
        d.a(false);
        AirtelCreateAccountRequest airtelcreateaccountrequest = AirtelCreateAccountRequest.create(g.getMobileWithCountryCode(), "android", cwt.a(this), (String)c.a(f.a()), h.getAirtelMoneyToken(), g.getFirstName(), g.getLastName(), f.c(), g.getEmail());
        a.createAccount(airtelcreateaccountrequest, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

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

            
            {
                a = AirtelCreateAccountActivity.this;
                super(activity, class1);
            }
        });
    }

    private void f()
    {
        setTitle(gsg.ub__payment_airtel);
        b().b(true);
    }

    private void h()
    {
        setContentView(gse.ub__payment_activity_airtel_create_account);
        d = (ContentLoadingView)findViewById(gsd.ub__payment_content_loading);
        e = (Button)findViewById(gsd.ub__payment_airtel_create_account_button_complete);
        f = (MpinFieldsView)findViewById(gsd.ub__payment_airtel_create_account_mpin_fields);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final AirtelCreateAccountActivity a;

            public final void onClick(View view)
            {
                if (!AirtelCreateAccountActivity.a(a).b().isEmpty())
                {
                    return;
                } else
                {
                    a.b.a(f.t);
                    AirtelCreateAccountActivity.b(a);
                    return;
                }
            }

            
            {
                a = AirtelCreateAccountActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        g = (PaymentUserInfo)gjz.a(getIntent().getParcelableExtra("user_info"));
        h = (AirtelValidateCodeResponse)gjz.a(getIntent().getParcelableExtra("otp_response"));
    }

    protected final volatile void a(Object obj)
    {
        a((guw)obj);
    }

    protected final Object c()
    {
        return d();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i();
        f();
        h();
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
        b.a(e.t);
    }
}
