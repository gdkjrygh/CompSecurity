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
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelLinkAccountRequest;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelAccountResponse;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelValidateCodeResponse;
import com.ubercab.ui.FloatingLabelEditText;
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
import guj;
import gvl;
import gws;
import gwt;
import hrs;
import hsj;
import java.util.List;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelApi

public class AirtelLinkAccountActivity extends PaymentActivityWithInjection
{

    public AirtelApi a;
    public chp b;
    public gsj c;
    private FloatingLabelEditText d;
    private ContentLoadingView e;
    private hsj f;
    private AirtelValidateCodeResponse g;

    public AirtelLinkAccountActivity()
    {
    }

    public static Intent a(Context context, AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelLinkAccountActivity);
        context.putExtra("otp_response", airtelvalidatecoderesponse);
        return context;
    }

    static ContentLoadingView a(AirtelLinkAccountActivity airtellinkaccountactivity)
    {
        return airtellinkaccountactivity.e;
    }

    static void a(AirtelLinkAccountActivity airtellinkaccountactivity, String s)
    {
        airtellinkaccountactivity.a(s);
    }

    private void a(gvl gvl1)
    {
        gvl1.a(this);
    }

    private void a(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("payment_reference_number", s);
        setResult(-1, intent);
        finish();
    }

    private void d()
    {
        g = (AirtelValidateCodeResponse)gjz.a(getIntent().getParcelableExtra("otp_response"));
    }

    private void e()
    {
        setContentView(gse.ub__payment_activity_airtel_link_account);
        e = (ContentLoadingView)findViewById(gsd.ub__payment_content_loading);
        d = (FloatingLabelEditText)findViewById(gsd.ub__payment_airtel_link_account_edit_text_mpin);
        f = new hsj();
        f.a(d, new guj(4, 4, new hrs(gsg.ub__payment_invalid_mpin_invalid_length)));
    }

    private gvl f()
    {
        return gws.a().a(gss.a(getApplication())).a(gss.a()).a();
    }

    private void h()
    {
        AirtelLinkAccountRequest airtellinkaccountrequest = AirtelLinkAccountRequest.create(null, "android", cwt.a(this), (String)c.a(d.i().toString()), g.getAirtelMoneyToken());
        a.linkAccount(airtellinkaccountrequest, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final AirtelLinkAccountActivity a;

            private void a(ApiError apierror)
            {
                cwm.a(a, apierror.getErrorMessage());
                AirtelLinkAccountActivity.a(a).a(true);
            }

            private void a(AirtelAccountResponse airtelaccountresponse)
            {
                AirtelLinkAccountActivity.a(a, airtelaccountresponse.getPaymentReferenceNumber());
            }

            public final volatile void a(Object obj)
            {
                a((AirtelAccountResponse)obj);
            }

            public final void a(boolean flag)
            {
                if (flag)
                {
                    a.b.a(e.D);
                    return;
                } else
                {
                    a.b.a(e.C);
                    AirtelLinkAccountActivity.a(a).a(true);
                    return;
                }
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = AirtelLinkAccountActivity.this;
                super(activity, class1);
            }
        });
    }

    protected final volatile void a(Object obj)
    {
        a((gvl)obj);
    }

    protected final Object c()
    {
        return f();
    }

    public void onClickVerify(View view)
    {
        if (!f.a().isEmpty())
        {
            return;
        } else
        {
            b.a(f.y);
            e.a(false);
            h();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(gsg.ub__payment_airtel);
        b().b(true);
        d();
        e();
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
        b.a(e.B);
    }
}
