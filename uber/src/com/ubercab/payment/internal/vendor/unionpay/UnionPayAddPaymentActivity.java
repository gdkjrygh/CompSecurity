// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import bjw;
import bjy;
import chp;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.payment.internal.activity.AddPaymentActivity;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.network.PaymentApi;
import com.ubercab.payment.internal.network.model.CreateThirdPartyPaymentProfileRequest;
import com.ubercab.payment.internal.ui.CreditCardEditText;
import com.ubercab.payment.internal.ui.CreditCardFieldsView;
import com.ubercab.payment.internal.vendor.unionpay.model.LianLianError;
import com.ubercab.payment.internal.vendor.unionpay.model.LianLianPayload;
import com.ubercab.payment.internal.vendor.unionpay.model.LianLianTokenData;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import e;
import f;
import gkg;
import gpm;
import gpn;
import gpo;
import grs;
import gry;
import gsa;
import gsd;
import gse;
import gsg;
import gsj;
import gsl;
import gtb;
import gtu;
import gtz;
import gua;
import gub;
import guc;
import guj;
import gza;
import gzb;
import hnz;
import hrs;
import hsj;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class UnionPayAddPaymentActivity extends AddPaymentActivity
{

    private static final bjw a = (new bjy()).a(new hnz()).c();
    private chp b;
    private Button c;
    private String d;
    private gtz e;
    private gua f;
    private gub g;
    private CreditCardEditText h;
    private FloatingLabelEditText i;
    private FloatingLabelEditText j;
    private FloatingLabelEditText k;
    private FloatingLabelEditText l;
    private PhoneNumberView m;
    private FloatingLabelEditText n;
    private gsj o;
    private PaymentApi p;
    private ProgressDialog q;
    private hsj r;

    public UnionPayAddPaymentActivity()
    {
    }

    static Intent a(Activity activity)
    {
        return b(activity);
    }

    private void a(int i1, String s)
    {
        if (i1 != 499) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = (LianLianError)a.a(s, com/ubercab/payment/internal/vendor/unionpay/model/LianLianError);
        obj = ((LianLianError) (obj1)).getCode();
        String s1 = ((LianLianError) (obj1)).getMessage();
        obj1 = obj;
        obj = s1;
        break MISSING_BLOCK_LABEL_40;
        obj;
        obj = null;
_L4:
        obj1 = obj;
        obj = null;
          goto _L3
_L2:
        obj = s;
        obj1 = null;
_L3:
        if ("5601".equals(obj1))
        {
            b.a(e.ac);
            a("3");
            return;
        }
        b.a(e.ab);
        if (TextUtils.isEmpty(s))
        {
            obj = getString(gsg.ub__payment_add_failed);
        }
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(gsg.ub__payment_error)).setMessage(((CharSequence) (obj))).setNeutralButton(gsg.ub__payment_ok, null).show();
        return;
        Exception exception;
        exception;
          goto _L4
    }

    static void a(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        unionpayaddpaymentactivity.i();
    }

    static void a(UnionPayAddPaymentActivity unionpayaddpaymentactivity, int i1, String s)
    {
        unionpayaddpaymentactivity.a(i1, s);
    }

    static void a(UnionPayAddPaymentActivity unionpayaddpaymentactivity, PaymentProfile paymentprofile)
    {
        unionpayaddpaymentactivity.b(paymentprofile);
    }

    private void a(LianLianTokenData lianliantokendata)
    {
        lianliantokendata = CollectedData.create(gkg.a("token_type", "lianlian", "token_data", lianliantokendata));
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(499));
        a(((CollectedData) (lianliantokendata)), arraylist);
    }

    private void a(String s)
    {
        d = s;
        r.b(j, f);
        r.b(n, g);
        r.b(i, e);
        byte byte0 = 8;
        if ("3".equals(s))
        {
            byte0 = 0;
            r.a(j, f);
            r.a(n, g);
            r.a(i, e);
        }
        j.setVisibility(byte0);
        n.setVisibility(byte0);
        i.setVisibility(byte0);
        j();
    }

    private static Intent b(Activity activity)
    {
        activity = new Intent(activity, io/card/payment/CardIOActivity);
        activity.putExtra("io.card.payment.requireExpiry", true);
        activity.putExtra("io.card.payment.suppressManual", true);
        return activity;
    }

    static PhoneNumberView b(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        return unionpayaddpaymentactivity.m;
    }

    private void b(LianLianTokenData lianliantokendata)
    {
        lianliantokendata = CreateThirdPartyPaymentProfileRequest.create("lianlian", lianliantokendata);
        q.setMessage(getString(gsg.ub__payment_adding_payment));
        q.show();
        p.create(lianliantokendata, new gtb(this) {

            final UnionPayAddPaymentActivity a;

            private void a(PaymentProfile paymentprofile)
            {
                UnionPayAddPaymentActivity.e(a).a(e.ad);
                UnionPayAddPaymentActivity.f(a).dismiss();
                if (paymentprofile != null)
                {
                    UnionPayAddPaymentActivity.a(a, paymentprofile);
                }
            }

            protected final volatile void a(Object obj)
            {
                a((PaymentProfile)obj);
            }

            protected final void a(RetrofitError retrofiterror)
            {
                int i1;
                UnionPayAddPaymentActivity.f(a).dismiss();
                i1 = 0;
                int j1 = retrofiterror.getResponse().getStatus();
                i1 = j1;
                try
                {
                    retrofiterror = ((ApiError)retrofiterror.getBodyAs(com/ubercab/payment/internal/model/ApiError)).getErrorMessage();
                }
                // Misplaced declaration of an exception variable
                catch (RetrofitError retrofiterror)
                {
                    retrofiterror = null;
                    j1 = i1;
                }
                UnionPayAddPaymentActivity.a(a, j1, retrofiterror);
                return;
            }

            
            {
                a = UnionPayAddPaymentActivity.this;
                super(activity);
            }
        });
    }

    private void b(PaymentProfile paymentprofile)
    {
        startActivityForResult(gsa.a(this, paymentprofile.getTokenType()).c(paymentprofile), 101);
    }

    public static hsj c(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        return unionpayaddpaymentactivity.r;
    }

    public static void d(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        unionpayaddpaymentactivity.j();
    }

    static chp e(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        return unionpayaddpaymentactivity.b;
    }

    static ProgressDialog f(UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        return unionpayaddpaymentactivity.q;
    }

    private void h()
    {
        guc guc1 = new guc(new hrs(gsg.ub__payment_invalid_national_id));
        guj guj1 = new guj(1, 0x7fffffff, new hrs(gsg.ub__payment_invalid_name));
        gpn gpn1 = new gpn(new hrs(gsg.ub__payment_invalid_phone_number), gpo.b);
        guj guj2 = new guj(12, 0x7fffffff, new hrs(gsg.ub__payment_invalid_card_number));
        f = new gua(new hrs(gsg.ub__payment_invalid_card_month));
        g = new gub(new hrs(gsg.ub__payment_invalid_card_year));
        e = new gtz(h, new hrs(gsg.ub__payment_invalid_card_code));
        r = new hsj();
        r.a(l, guc1);
        r.a(k, guj1);
        r.a(m, gpn1);
        r.a(h, guj2);
        l.a(new gza(this, guc1, l));
        k.a(new gza(this, guj1, k));
        h.addTextChangedListener(new gza(this, guj2, h));
        j.a(new gza(this, f, j));
        n.a(new gza(this, g, n));
        i.a(new gza(this, e, i));
        l.setOnFocusChangeListener(new gzb(this, l));
        k.setOnFocusChangeListener(new gzb(this, k));
        h.setOnFocusChangeListener(new gzb(this, h));
        j.setOnFocusChangeListener(new gzb(this, j));
        n.setOnFocusChangeListener(new gzb(this, n));
        i.setOnFocusChangeListener(new gzb(this, i));
        m.a(new gpm() {

            final UnionPayAddPaymentActivity a;

            public final void a(String s)
            {
                UnionPayAddPaymentActivity.d(a);
            }

            public final void a(boolean flag)
            {
                if (!flag)
                {
                    UnionPayAddPaymentActivity.c(a).a(UnionPayAddPaymentActivity.b(a));
                }
            }

            public final boolean a(int i1)
            {
                return false;
            }

            public final void g_()
            {
                UnionPayAddPaymentActivity.c(a).a(UnionPayAddPaymentActivity.b(a));
            }

            
            {
                a = UnionPayAddPaymentActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        Object obj1 = null;
        b.a(f.ai);
        Object obj2 = l.i().toString();
        String s2 = k.i().toString();
        String s3 = m.h();
        String s1 = h.getText().toString().replaceAll("\\s", "");
        Object obj;
        String s;
        byte byte0;
        if ("3".equals(d))
        {
            obj = (new StringBuilder()).append(n.i().toString()).append(j.i().toString()).toString();
            s = i.i().toString();
        } else
        {
            s = null;
            obj = null;
        }
        obj2 = LianLianPayload.createPayload(s2, s1, s, ((String) (obj)), ((String) (obj2)), s3);
        s = obj1;
        if (s1.length() >= 4)
        {
            s = s1.substring(s1.length() - 4);
        }
        obj = LianLianTokenData.createCard(s, d, ((String) (obj)), (String)o.a(a.a(obj2)));
        s = f();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 244
    //                   -2055109037: 285
    //                   96417: 269;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_285;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            b(((LianLianTokenData) (obj)));
            return;

        case 1: // '\001'
            a(((LianLianTokenData) (obj)));
            break;
        }
        break MISSING_BLOCK_LABEL_312;
_L3:
        if (s.equals("add"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("data_collection"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private void j()
    {
        c.setEnabled(r.b().isEmpty());
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 100 && j1 == CardIOActivity.a)
        {
            intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            h.setText(((CreditCard) (intent)).cardNumber);
            if (intent.isExpiryValid())
            {
                j.d(String.format("%02d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryMonth)
                }));
                n.d(String.format("%d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryYear)
                }).substring(2));
            }
            return;
        }
        if (i1 == 101 && j1 == -1)
        {
            a(gtu.a(intent));
            return;
        }
        if (i1 == 500 && j1 == 5002)
        {
            a(intent.getIntExtra("http_status", 0), intent.getStringExtra("http_body"));
            return;
        }
        if (i1 == 500 && j1 == -1)
        {
            b.a(e.ad);
        }
        super.onActivityResult(i1, j1, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(gsg.ub__payment_unionpay);
        setContentView(gse.ub__payment_activity_unionpay_add);
        if (b() != null)
        {
            b().b(true);
        }
        if (b == null)
        {
            b = g().e();
        }
        if (p == null)
        {
            p = (PaymentApi)g().aK().a(com/ubercab/payment/internal/network/PaymentApi);
        }
        if (o == null)
        {
            o = new gsl(getString(gsg.ub__payment_lianlian_key_production));
        }
        q = new ProgressDialog(this);
        q.setIndeterminate(true);
        q.setCancelable(false);
        q.setCanceledOnTouchOutside(false);
        q.setProgress(0);
        l = (FloatingLabelEditText)findViewById(gsd.ub__unionpay_add_edittext_nationalid);
        k = (FloatingLabelEditText)findViewById(gsd.ub__unionpay_add_edittext_name);
        getSystemService("phone");
        m = (PhoneNumberView)findViewById(gsd.ub__unionpay_add_phonenumberview);
        m.a(null, Locale.CHINA.getCountry());
        m.c().setEnabled(false);
        bundle = (CreditCardFieldsView)findViewById(gsd.ub__unionpay_add_creditcardfieldsview);
        bundle.e().setVisibility(8);
        bundle.f().setVisibility(8);
        bundle.g().setOnClickListener(new android.view.View.OnClickListener() {

            final UnionPayAddPaymentActivity a;

            public final void onClick(View view)
            {
                a.startActivityForResult(UnionPayAddPaymentActivity.a(a), 100);
            }

            
            {
                a = UnionPayAddPaymentActivity.this;
                super();
            }
        });
        h = bundle.b();
        h.setHint(gsg.ub__payment_card_number);
        h.a("UnionPay");
        j = bundle.c();
        n = bundle.d();
        i = bundle.a();
        c = (Button)findViewById(gsd.ub__unionpay_add_button_addpayment);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final UnionPayAddPaymentActivity a;

            public final void onClick(View view)
            {
                UnionPayAddPaymentActivity.a(a);
            }

            
            {
                a = UnionPayAddPaymentActivity.this;
                super();
            }
        });
        h();
        a("2");
    }

    protected void onDestroy()
    {
        if (q != null && q.isShowing())
        {
            q.dismiss();
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
        b.a(e.aa);
    }

}
