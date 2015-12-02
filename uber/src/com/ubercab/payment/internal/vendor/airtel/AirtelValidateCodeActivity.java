// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelSendCodeRequest;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelValidateCodeRequest;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelSendCodeResponse;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelValidateCodeResponse;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import cwm;
import cwt;
import e;
import f;
import gjz;
import gsd;
import gse;
import gsf;
import gsg;
import gss;
import gtc;
import guj;
import gvw;
import gwy;
import gwz;
import hpb;
import hrs;
import hsj;
import java.util.List;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelApi

public class AirtelValidateCodeActivity extends PaymentActivityWithInjection
{

    public chp a;
    public AirtelApi b;
    private ContentLoadingView c;
    private Button d;
    private EditText e;
    private TextView f;
    private String g;
    private PaymentUserInfo h;
    private hsj i;

    public AirtelValidateCodeActivity()
    {
    }

    public static Intent a(Context context, PaymentUserInfo paymentuserinfo)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelValidateCodeActivity);
        context.putExtra("user_info", paymentuserinfo);
        return context;
    }

    static ContentLoadingView a(AirtelValidateCodeActivity airtelvalidatecodeactivity)
    {
        return airtelvalidatecodeactivity.c;
    }

    static String a(AirtelValidateCodeActivity airtelvalidatecodeactivity, String s)
    {
        airtelvalidatecodeactivity.g = s;
        return s;
    }

    private void a(gvw gvw1)
    {
        gvw1.a(this);
    }

    static void b(AirtelValidateCodeActivity airtelvalidatecodeactivity)
    {
        airtelvalidatecodeactivity.k();
    }

    private gvw d()
    {
        return gwy.a().a(gss.a(getApplication())).a(gss.a()).a();
    }

    private void e()
    {
        c.a(false);
        e.setText("");
        g = null;
        AirtelSendCodeRequest airtelsendcoderequest = AirtelSendCodeRequest.create("android", h.getMobileWithCountryCode());
        b.sendCode(airtelsendcoderequest, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final AirtelValidateCodeActivity a;

            private void a(ApiError apierror)
            {
                cwm.a(a, apierror.getErrorMessage());
            }

            private void a(AirtelSendCodeResponse airtelsendcoderesponse)
            {
                AirtelValidateCodeActivity.a(a, airtelsendcoderesponse.getOtpRequestToken());
            }

            public final volatile void a(Object obj)
            {
                a((AirtelSendCodeResponse)obj);
            }

            public final void a(boolean flag)
            {
                AirtelValidateCodeActivity.a(a).a(true);
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = AirtelValidateCodeActivity.this;
                super(activity, class1);
            }
        });
    }

    private void f()
    {
        AirtelValidateCodeRequest airtelvalidatecoderequest = AirtelValidateCodeRequest.create("android", cwt.a(this), h.getMobileWithCountryCode(), e.getText().toString(), g);
        b.validateCode(airtelvalidatecoderequest, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final AirtelValidateCodeActivity a;

            private void a()
            {
                cwm.a(a, gsg.ub__payment_unexpected_error);
            }

            private void a(AirtelValidateCodeResponse airtelvalidatecoderesponse)
            {
                Intent intent = new Intent();
                intent.putExtra("otp_response", airtelvalidatecoderesponse);
                a.setResult(-1, intent);
                a.finish();
            }

            public final volatile void a(Object obj)
            {
                a((AirtelValidateCodeResponse)obj);
            }

            public final void a(boolean flag)
            {
                if (!flag)
                {
                    a.a.a(e.G);
                    AirtelValidateCodeActivity.a(a).a(true);
                    return;
                } else
                {
                    a.a.a(e.H);
                    return;
                }
            }

            public final void b(Object obj)
            {
                a();
            }

            
            {
                a = AirtelValidateCodeActivity.this;
                super(activity, class1);
            }
        });
    }

    private void h()
    {
        setContentView(gse.ub__payment_activity_airtel_otp);
        c = (ContentLoadingView)findViewById(gsd.ub__payment_content_loading);
        d = (Button)findViewById(gsd.ub__payment_button_verify);
        e = (EditText)findViewById(gsd.ub__payment_edittext_otp);
        f = (TextView)findViewById(gsd.ub__payment_textview_mobile);
        f.setText(h.getMobileWithCountryCode());
        e.addTextChangedListener(new hpb() {

            final AirtelValidateCodeActivity a;

            public final void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
            {
                AirtelValidateCodeActivity.b(a);
            }

            
            {
                a = AirtelValidateCodeActivity.this;
                super();
            }
        });
        i = new hsj();
        i.a(e, new guj(1, 0x7fffffff, new hrs(gsg.ub__payment_invalid_mpin_invalid_length)));
        k();
    }

    private void i()
    {
        b().b(true);
        b().a(getString(gsg.ub__payment_verify_mobile));
    }

    private void j()
    {
        h = (PaymentUserInfo)gjz.a(getIntent().getParcelableExtra("user_info"));
    }

    private void k()
    {
        Button button = d;
        boolean flag;
        if (!TextUtils.isEmpty(e.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    protected final volatile void a(Object obj)
    {
        a((gvw)obj);
    }

    protected final Object c()
    {
        return d();
    }

    public void onClickContinue(View view)
    {
        if (!i.a().isEmpty())
        {
            return;
        } else
        {
            a.a(f.F);
            c.a(false);
            f();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j();
        i();
        h();
        if (bundle != null)
        {
            g = bundle.getString("otp_request_token");
            if (g == null)
            {
                e();
            }
            return;
        } else
        {
            e();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(gsf.ub__payment_menu_airtel_validate_code, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            a.a(f.D);
            setResult(0);
            finish();
            return true;
        }
        if (menuitem.getItemId() == gsd.ub__payment_menuitem_resend)
        {
            a.a(f.E);
            e();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onResume()
    {
        super.onResume();
        a.a(e.F);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (g != null)
        {
            bundle.putString("otp_request_token", g);
        }
    }
}
