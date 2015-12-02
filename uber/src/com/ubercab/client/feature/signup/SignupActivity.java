// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.MenuItem;
import cev;
import chp;
import cic;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.ClientSignupResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;
import com.ubercab.client.feature.signup.event.SignupPendingEvent;
import com.ubercab.client.feature.signup.payment.SignupChoosePaymentFragment;
import com.ubercab.client.feature.signup.paytm.SignupPaytmOrCcFragment;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.request.param.Location;
import czj;
import daj;
import dak;
import dal;
import dao;
import dar;
import dbf;
import dbo;
import dce;
import dfe;
import dfp;
import dkn;
import dkr;
import dlh;
import dny;
import doa;
import doy;
import dpg;
import dri;
import dtj;
import dtp;
import duh;
import dul;
import fdp;
import fke;
import fko;
import fkp;
import flr;
import fls;
import flt;
import fly;
import flz;
import fmh;
import fmv;
import fna;
import fnb;
import fnc;
import fnd;
import fne;
import fnf;
import fng;
import fnh;
import gjd;
import gmg;
import gqg;
import gsa;
import hjm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import l;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPaymentFragment, SignupPendingFragment, SignupData, SignupWithAlipayFragment, 
//            ThirdPartyToken, VerifyFacebookProfileFragment, SignupFragment, CompleteSignupActivity, 
//            SignupMissingInfoFragment

public class SignupActivity extends RiderActivity
{

    public dao A;
    icl B;
    public chp h;
    public doy i;
    public cev j;
    public hkr k;
    public hku l;
    public gmg m;
    public hjm n;
    public PayPalConfiguration o;
    public daj p;
    public dpg q;
    public dce r;
    public RiderApplication s;
    public dkn t;
    public dak u;
    public dal v;
    public dkr w;
    public fmh x;
    public fmv y;
    public dri z;

    public SignupActivity()
    {
    }

    public static void a(SignupActivity signupactivity)
    {
        signupactivity.f();
    }

    private void a(SignupData signupdata)
    {
        if (a(com/ubercab/client/feature/signup/SignupPaymentFragment) == null)
        {
            a(0x7f0e04ae, ((android.support.v4.app.Fragment) (SignupPaymentFragment.a(signupdata))));
        }
    }

    private void a(SignupData signupdata, boolean flag)
    {
        if (a(com/ubercab/client/feature/signup/paytm/SignupPaytmOrCcFragment) == null)
        {
            a(0x7f0e04ae, ((android.support.v4.app.Fragment) (SignupPaytmOrCcFragment.a(signupdata, flag))));
        }
    }

    private void a(dlh dlh1)
    {
        String s1;
        if (dlh1.c() != null)
        {
            s1 = dlh1.c();
        } else
        {
            s1 = getString(0x7f070436);
        }
        dtp.a(this, 0, s1);
        dlh1 = AnalyticsEvent.create("impression").setName(l.hh).setValue(dlh1.d());
        h.a(dlh1);
    }

    private void a(fls fls1)
    {
        fls1.a(this);
    }

    private void a(boolean flag)
    {
        Object obj = u.c();
        if (obj != null && ((RiderLocation) (obj)).getUberLatLng() != null)
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
            obj = Location.create(((UberLatLng) (obj)).a(), ((UberLatLng) (obj)).b());
        } else
        {
            obj = null;
        }
        B = i.a(null, ((Location) (obj)), n).a(ico.a()).c(new flr(this, flag));
    }

    private fls b(dfp dfp)
    {
        return fko.a().a(new dfe(this)).a(dfp).a(new flt(this)).a();
    }

    private void b(SignupData signupdata)
    {
        if (a(fly) == null)
        {
            a(0x7f0e04ae, fly.a(signupdata));
        }
    }

    private void b(String s1)
    {
        if (a(com/ubercab/client/feature/signup/SignupPendingFragment) == null)
        {
            a(0x7f0e04ae, SignupPendingFragment.a(s1), true);
        }
    }

    private void c(SignupData signupdata)
    {
        if (a(com/ubercab/client/feature/signup/payment/SignupChoosePaymentFragment) == null)
        {
            a(0x7f0e04ae, SignupChoosePaymentFragment.a(signupdata));
        }
    }

    private void d(SignupData signupdata)
    {
        if (signupdata != null && signupdata.m() != null && a(com/ubercab/client/feature/signup/SignupWithAlipayFragment) == null)
        {
            a(0x7f0e04ae, SignupWithAlipayFragment.a(signupdata), true);
        }
    }

    private void e(SignupData signupdata)
    {
        b(getString(0x7f070435), null);
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (signupdata.h() != null)
        {
            s1 = signupdata.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = signupdata.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        w.a(signupdata.a(), signupdata.b(), signupdata.c(), signupdata.e(), signupdata.f(), s1, signupdata.d(), signupdata.j(), s2, s3, l1);
    }

    private void f()
    {
        u();
        setResult(-1);
        finish();
    }

    private void f(SignupData signupdata)
    {
        String s1 = null;
        b(getString(0x7f070435), null);
        if (signupdata.h() != null)
        {
            s1 = signupdata.h().a();
        }
        w.a(signupdata.a(), signupdata.b(), signupdata.c(), signupdata.e(), signupdata.f(), signupdata.k(), signupdata.l(), s1, signupdata.d());
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/signup/SignupPendingFragment) != null)
        {
            h();
            setResult(0);
            finish();
            return;
        }
        if (getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            getSupportFragmentManager().popBackStack();
            return;
        } else
        {
            String s1 = getString(0x7f0702cd);
            String s2 = getString(0x7f070674);
            dtj.a(this, 1, null, getString(0x7f07007d), s2, s1);
            return;
        }
    }

    private void g(SignupData signupdata)
    {
        b(getString(0x7f070435), null);
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (signupdata.h() != null)
        {
            s1 = signupdata.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = signupdata.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        w.b(signupdata.a(), signupdata.b(), signupdata.c(), signupdata.e(), signupdata.f(), s1, signupdata.d(), signupdata.j(), s2, s3, l1);
    }

    private void h()
    {
        flz flz1 = (flz)getSupportFragmentManager().findFragmentById(0x7f0e04ae);
        if (flz1 != null)
        {
            flz1.a();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        Object obj = (SignupPaymentFragment)a(com/ubercab/client/feature/signup/SignupPaymentFragment);
        if (obj == null || !((SignupPaymentFragment) (obj)).a(i1, j1, bundle))
        {
            if (((obj = (SignupWithAlipayFragment)a(com/ubercab/client/feature/signup/SignupWithAlipayFragment)) == null || !((SignupWithAlipayFragment) (obj)).a(i1, j1, bundle)) && ((obj = (SignupChoosePaymentFragment)a(com/ubercab/client/feature/signup/payment/SignupChoosePaymentFragment)) == null || !((SignupChoosePaymentFragment) (obj)).a(i1, j1, bundle)) && (((obj = (SignupPaytmOrCcFragment)a(com/ubercab/client/feature/signup/paytm/SignupPaytmOrCcFragment)) == null || !((SignupPaytmOrCcFragment) (obj)).a(i1, j1, bundle)) && i1 == 1 && j1 == -1))
            {
                h();
                setResult(0);
                finish();
                return;
            }
        }
    }

    public final volatile void a(czj czj)
    {
        a((fls)czj);
    }

    public final void a(gqg gqg, RetrofitError retrofiterror)
    {
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = new Intent(this, com/paypal/android/sdk/payments/PayPalService);
        bundle.putExtra("com.paypal.android.sdk.paypalConfiguration", o);
        startService(bundle);
        setContentView(0x7f030185);
        if (getIntent().hasExtra("com.ubercab.THIRD_PARTY_PROFILE") && a(com/ubercab/client/feature/signup/VerifyFacebookProfileFragment) == null)
        {
            a(0x7f0e04ae, VerifyFacebookProfileFragment.a((SignupData)getIntent().getParcelableExtra("com.ubercab.THIRD_PARTY_PROFILE")), true);
        } else
        {
            if (getIntent().hasExtra("com.ubercab.ALIPAY_SIGNUP_THIRDPARTY") && a(com/ubercab/client/feature/signup/SignupWithAlipayFragment) == null)
            {
                d((SignupData)getIntent().getParcelableExtra("com.ubercab.ALIPAY_SIGNUP_THIRDPARTY"));
                return;
            }
            if (getSupportFragmentManager().findFragmentById(0x7f0e04ae) == null)
            {
                a(0x7f0e04ae, SignupFragment.b(), true);
                return;
            }
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 2) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR lookupswitch 2: default 40
    //                   -1: 41
    //                   6001: 91;
           goto _L3 _L4 _L5
_L3:
        return;
_L4:
        intent = k.c();
        if (intent != null)
        {
            intent = intent.getUuid();
            if (!TextUtils.isEmpty(intent))
            {
                y.a(intent);
                fdp.b(this);
            }
        }
        setResult(-1);
        finish();
        return;
_L5:
        b(((SignupPendingEvent)intent.getParcelableExtra("extra_pending_signup_data")).a());
        return;
_L2:
        if (i1 == 3 && j1 == -1)
        {
            f((SignupData)intent.getParcelableExtra("extra_signup_data"));
            return;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void onBackPressed()
    {
        g();
    }

    public void onClientSignupResponseEvent(dlh dlh1)
    {
        if (!dlh1.i())
        {
            u();
            a(dlh1);
            h.a(AnalyticsEvent.create("impression").setName(l.hd).setValue(dlh1.f()));
            return;
        }
        v.a(dlh1.e());
        if (m.a(dbf.bZ))
        {
            v.b(true);
            v.j();
        }
        if (dlh1.a())
        {
            u();
            j.c(SignupPendingEvent.b(dlh1.b()));
            return;
        }
        Object obj = (ClientSignupResponse)dlh1.g();
        String s1 = ((ClientSignupResponse) (obj)).getUuid();
        String s2 = ((ClientSignupResponse) (obj)).getToken();
        obj = ((ClientSignupResponse) (obj)).getEmail();
        if (s1 == null || s2 == null || obj == null)
        {
            u();
            a(dlh1);
            h.a(AnalyticsEvent.create("impression").setName(l.hd).setValue(dlh1.f()));
            return;
        }
        RiderApplication.a(this).a(s1, s2, ((String) (obj)));
        h.a(AnalyticsEvent.create("impression").setName(l.hB).setValue(dlh1.f()));
        if (!q.n())
        {
            t.d();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void onDestroy()
    {
        if (B != null)
        {
            B.b();
        }
        stopService(new Intent(this, com/paypal/android/sdk/payments/PayPalService));
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            g();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPaymentTypeSelected(fne fne1)
    {
        gsa gsa1;
        SignupData signupdata;
        Intent intent;
        PaymentUserInfo paymentuserinfo;
        String s1;
        byte byte0;
        gsa1 = fne1.a();
        signupdata = fne1.b();
        intent = CompleteSignupActivity.a(this, signupdata);
        paymentuserinfo = PaymentUserInfo.create();
        if (signupdata != null)
        {
            paymentuserinfo.setEmail(signupdata.a()).setFirstName(signupdata.e()).setLastName(signupdata.f()).setMobile(signupdata.b()).setMobileCountryIso2(signupdata.c());
        }
        s1 = gsa1.a();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 4: default 120
    //                   -1414960566: 224
    //                   -920235116: 190
    //                   3046195: 173
    //                   106444065: 207;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_224;
_L6:
        switch (byte0)
        {
        default:
            startActivityForResult(gsa1.a(intent, getString(0x7f070396), paymentuserinfo), 2);
            return;

        case 0: // '\0'
            if (m.a(dbf.n))
            {
                startActivityForResult(fne1.a().a(intent, getString(0x7f070396), paymentuserinfo), 2);
                return;
            } else
            {
                g(signupdata);
                return;
            }

        case 1: // '\001'
            if (duh.a(m))
            {
                startActivityForResult(fne1.a().a(intent, getString(0x7f070396), paymentuserinfo), 2);
                return;
            } else
            {
                a(signupdata);
                return;
            }

        case 2: // '\002'
            a(signupdata, true);
            return;

        case 3: // '\003'
            startActivityForResult((new Intent(this, com/ubercab/client/feature/payment/alipay/AddAlipayActivity)).putExtra("extra_signup_data", fne1.b()), 3);
            return;
        }
_L4:
        if (s1.equals("cash"))
        {
            byte0 = 0;
        }
          goto _L6
_L3:
        if (s1.equals("braintree"))
        {
            byte0 = 1;
        }
          goto _L6
_L5:
        if (s1.equals("paytm"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s1.equals("alipay"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    public void onPingEvent(dar dar1)
    {
        if (q.n())
        {
            return;
        }
        if (dul.a(dar1.a()))
        {
            j.c(new fnc());
            return;
        } else
        {
            u();
            return;
        }
    }

    public void onSignInSuccessfulEvent(fke fke1)
    {
        Object obj = p.b();
        if (TextUtils.isEmpty(fke1.b()) || TextUtils.isEmpty(fke1.c())) goto _L2; else goto _L1
_L1:
        s.a(fke1.c(), fke1.b(), null);
_L6:
        if (q.n())
        {
            break; /* Loop/switch isn't completed */
        }
        t.d();
        f();
_L4:
        return;
_L2:
        if (obj == null || ((Ping) (obj)).getClient() == null) goto _L4; else goto _L3
_L3:
        Object obj1 = ((Ping) (obj)).getClient();
        fke1 = ((Client) (obj1)).getUuid();
        obj = ((Client) (obj1)).getToken();
        obj1 = ((Client) (obj1)).getEmail();
        s.a(fke1, ((String) (obj)), ((String) (obj1)));
        if (true) goto _L6; else goto _L5
_L5:
        a(true);
        return;
    }

    public void onSignupAlipayEvent(fna fna1)
    {
        d(fna1.a());
    }

    public void onSignupChooseInternationalCreditCard(fnb fnb1)
    {
        a(fnb1.a());
    }

    public void onSignupCompletedEvent(fnc fnc1)
    {
        fnc1 = k.c();
        if (fnc1 != null)
        {
            fnc1 = fnc1.getUuid();
        } else
        {
            fnc1 = null;
        }
        if (!TextUtils.isEmpty(fnc1))
        {
            y.a(fnc1);
            fdp.b(this);
        }
        if (m.a(dbf.A) && A.o())
        {
            A.m();
        }
        if (m.a(dbf.Q))
        {
            fnc1 = m.a(dbf.Q, "name", "");
            x.a(fnc1);
        }
        f();
    }

    public void onSignupMissingInfoEvent(fnd fnd1)
    {
        if (a(com/ubercab/client/feature/signup/SignupMissingInfoFragment) == null)
        {
            a(0x7f0e04ae, SignupMissingInfoFragment.a(fnd1.a()), true);
        }
    }

    public void onSignupPendingConfirmedEvent(fnf fnf)
    {
        setResult(0);
        finish();
    }

    public void onSignupPendingEvent(SignupPendingEvent signuppendingevent)
    {
        b(signuppendingevent.a());
    }

    public void onSignupSkipPaymentEvent(fng fng1)
    {
        e(fng1.a());
    }

    public void onSignupValidatedEvent(fnh fnh1)
    {
        if (m.a(dbf.cN))
        {
            z.a("com.uber.SMS_RECEIVER", gjd.a);
        }
        fnh1 = fnh1.a();
        String s1 = fnh1.c();
        if ((new doa(m)).b(this, r.a(), s1))
        {
            if (m.a(dbf.n))
            {
                fnh1 = CompleteSignupActivity.a(this, fnh1);
                startActivityForResult(gsa.a(this, "cash").a(fnh1, getString(0x7f070396), PaymentUserInfo.create()), 2);
                return;
            } else
            {
                g(fnh1);
                return;
            }
        }
        if (duh.c(m))
        {
            b(fnh1);
            return;
        }
        if (duh.b(m, s1))
        {
            c(fnh1);
            return;
        }
        if (m.a(dbf.V, dbo.b))
        {
            e(fnh1);
            return;
        }
        if (SignupPaytmOrCcFragment.a(s1))
        {
            a(fnh1, false);
            return;
        } else
        {
            a(fnh1);
            return;
        }
    }

    public void onVerifyProfileEvent(dny dny1)
    {
        if (a(com/ubercab/client/feature/signup/VerifyFacebookProfileFragment) == null)
        {
            a(0x7f0e04ae, VerifyFacebookProfileFragment.a(dny1.a()));
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }
}
