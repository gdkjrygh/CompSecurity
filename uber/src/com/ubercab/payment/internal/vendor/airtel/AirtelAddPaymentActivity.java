// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.ubercab.payment.internal.inject.AddPaymentActivityWithInjection;
import com.ubercab.payment.internal.network.PaymentApi;
import com.ubercab.payment.internal.network.model.CreateThirdPartyPaymentProfileRequest;
import com.ubercab.payment.internal.vendor.airtel.model.AirtelTokenData;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.ui.Button;
import cwm;
import e;
import f;
import gkh;
import gsd;
import gse;
import gsg;
import gss;
import gtb;
import gus;
import gwe;
import gwf;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity, AirtelSetupActivity

public class AirtelAddPaymentActivity extends AddPaymentActivityWithInjection
    implements android.view.View.OnClickListener
{

    public chp a;
    public PaymentApi b;
    private PaymentUserInfo c;
    private Button d;
    private ProgressDialog e;

    public AirtelAddPaymentActivity()
    {
    }

    static ProgressDialog a(AirtelAddPaymentActivity airteladdpaymentactivity)
    {
        return airteladdpaymentactivity.e;
    }

    static void a(AirtelAddPaymentActivity airteladdpaymentactivity, PaymentProfile paymentprofile)
    {
        airteladdpaymentactivity.a(paymentprofile);
    }

    static void a(AirtelAddPaymentActivity airteladdpaymentactivity, String s)
    {
        airteladdpaymentactivity.a(s);
    }

    private void a(AirtelTokenData airteltokendata)
    {
        e.show();
        airteltokendata = CreateThirdPartyPaymentProfileRequest.create("airtel_money", airteltokendata);
        b.create(airteltokendata, new gtb(this) {

            final AirtelAddPaymentActivity a;

            private void a(PaymentProfile paymentprofile)
            {
                AirtelAddPaymentActivity.a(a).dismiss();
                if (paymentprofile == null)
                {
                    cwm.a(a, gsg.ub__payment_add_failed);
                    return;
                } else
                {
                    AirtelAddPaymentActivity.a(a, paymentprofile);
                    AirtelAddPaymentActivity.a(a, paymentprofile.getUuid());
                    return;
                }
            }

            protected final void a()
            {
                AirtelAddPaymentActivity.a(a).dismiss();
            }

            public final volatile void a(Object obj)
            {
                a((PaymentProfile)obj);
            }

            public final void a(RetrofitError retrofiterror)
            {
                cwm.a(a, gsg.ub__payment_add_failed);
            }

            
            {
                a = AirtelAddPaymentActivity.this;
                super(activity);
            }
        });
    }

    private void a(gus gus1)
    {
        gus1.a(this);
    }

    private void a(String s)
    {
        startActivity(AirtelAddFundsActivity.a(this, s, true));
    }

    private void a(String s, String s1)
    {
        byte byte0;
        s = AirtelTokenData.create(s, c.getMobileWithCountryCode(), s1);
        s1 = f();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 52
    //                   -2055109037: 91
    //                   96417: 77;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_91;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            a(((AirtelTokenData) (s)));
            return;

        case 1: // '\001'
            b(s);
            break;
        }
        break MISSING_BLOCK_LABEL_116;
_L3:
        if (s1.equals("add"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s1.equals("data_collection"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private void b(AirtelTokenData airteltokendata)
    {
        a(CollectedData.create((new gkh()).a("token_type", "airtel_money").a("token_data", airteltokendata).a()));
    }

    private gus i()
    {
        return gwe.a().a(gss.a(getApplication())).a();
    }

    private void j()
    {
        c = (PaymentUserInfo)getIntent().getParcelableExtra("user_info");
    }

    private void k()
    {
        setContentView(gse.ub__payment_activity_airtel_add);
        setTitle(gsg.ub__payment_airtel);
        if (b() != null)
        {
            b().b(true);
        }
        d = (Button)findViewById(gsd.ub__payment_airtel_add_button_continue);
        d.setOnClickListener(this);
        e = new ProgressDialog(this);
        e.setMessage(getString(gsg.ub__payment_adding_airtel));
        e.setIndeterminate(true);
        e.setCancelable(false);
    }

    private void l()
    {
        if (e() != null && e().getMobileWithCountryCode() == null)
        {
            d.setEnabled(false);
            cwm.a(this, gsg.ub__payment_airtel_add_error_invalid_phone_number);
        }
    }

    private void onClickContinue()
    {
        a.a(f.f);
        startActivityForResult(AirtelSetupActivity.a(this, c), 1000);
    }

    protected final volatile void a(Object obj)
    {
        a((gus)obj);
    }

    protected final Object h()
    {
        return i();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 != 1000 || j1 != -1) goto _L2; else goto _L1
_L1:
        a(intent.getStringExtra("airtel_money_token"), intent.getStringExtra("payment_reference_number"));
_L4:
        super.onActivityResult(i1, j1, intent);
        return;
_L2:
        if (i1 == 500 && j1 == -1 && intent != null && intent.hasExtra("payment_profile_uuid"))
        {
            a(intent.getStringExtra("payment_profile_uuid"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        a.a(f.e);
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        if (view == d)
        {
            onClickContinue();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        byte byte0;
        super.onCreate(bundle);
        j();
        k();
        bundle = f();
        byte0 = -1;
        bundle.hashCode();
        JVM INSTR lookupswitch 2: default 52
    //                   -2055109037: 81
    //                   96417: 95;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 109
    //                   1 122;
           goto _L4 _L5 _L6
_L4:
        l();
        return;
_L2:
        if (bundle.equals("data_collection"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (bundle.equals("add"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        a.a(e.w);
          goto _L4
_L6:
        a.a(e.k);
          goto _L4
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
}
