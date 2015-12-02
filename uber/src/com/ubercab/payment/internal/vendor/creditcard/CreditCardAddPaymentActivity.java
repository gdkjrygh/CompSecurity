// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.creditcard;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.braintreegateway.encryption.Braintree;
import com.braintreegateway.encryption.BraintreeEncryptionException;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.payment.internal.inject.AddPaymentActivityWithInjection;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.CreditCardEditText;
import com.ubercab.payment.internal.ui.CreditCardFieldsView;
import com.ubercab.payment.internal.vendor.creditcard.model.RequestData;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import cwm;
import cwz;
import e;
import gmg;
import gsd;
import gse;
import gsg;
import gsm;
import gsn;
import gst;
import gtc;
import gue;
import gyg;
import gyi;
import gyn;
import gyo;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.creditcard:
//            CreditCardApi

public final class CreditCardAddPaymentActivity extends AddPaymentActivityWithInjection
{

    public chp a;
    public CreditCardApi b;
    public Braintree c;
    public gmg d;
    public gsm e;
    gue f;
    private Button g;
    private CreditCardFieldsView h;
    private ProgressDialog i;
    private boolean j;

    public CreditCardAddPaymentActivity()
    {
    }

    private static Intent a(Activity activity)
    {
        activity = new Intent(activity, io/card/payment/CardIOActivity);
        activity.putExtra("io.card.payment.requireExpiry", true);
        activity.putExtra("io.card.payment.suppressManual", true);
        return activity;
    }

    static void a(CreditCardAddPaymentActivity creditcardaddpaymentactivity)
    {
        creditcardaddpaymentactivity.j();
    }

    private void a(RequestData requestdata)
    {
        i.show();
        b.addCreditCard(requestdata, new gtc(com/ubercab/payment/internal/model/ApiError) {

            final CreditCardAddPaymentActivity a;

            private void a(ApiError apierror)
            {
                if (a.isFinishing())
                {
                    return;
                } else
                {
                    CreditCardAddPaymentActivity.c(a).dismiss();
                    cwm.a(a, apierror.getErrorMessage());
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
                    CreditCardAddPaymentActivity.c(a).dismiss();
                    cwm.a(a, gsg.ub__payment_unexpected_error);
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
                    CreditCardAddPaymentActivity.c(a).dismiss();
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
                    CreditCardAddPaymentActivity.c(a).dismiss();
                    cwm.a(a, gsg.ub__payment_network_error);
                    return;
                }
            }

            public final void a(boolean flag)
            {
                chp chp1 = a.a;
                e e1;
                if (flag)
                {
                    e1 = e.X;
                } else
                {
                    e1 = e.W;
                }
                chp1.a(e1);
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = CreditCardAddPaymentActivity.this;
                super(class1);
            }
        });
    }

    private void a(gyg gyg1)
    {
        gyg1.a(this);
    }

    static void b(CreditCardAddPaymentActivity creditcardaddpaymentactivity)
    {
        creditcardaddpaymentactivity.k();
    }

    private void b(RequestData requestdata)
    {
        a(CollectedData.create(requestdata.generateDataCollectionParameters()));
    }

    static ProgressDialog c(CreditCardAddPaymentActivity creditcardaddpaymentactivity)
    {
        return creditcardaddpaymentactivity.i;
    }

    private gyg i()
    {
        return gyn.a().a(new gst(getApplication())).a(new gyi(this)).a();
    }

    private void j()
    {
        String s2 = null;
        if (f.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        s4 = h.f().a();
        s5 = h.e().i().toString();
        s6 = h.a().i().toString();
        s7 = h.b().getText().toString();
        s8 = h.c().i().toString();
        s9 = h.d().i().toString();
        String s1 = c.encrypt(s6);
        String s = c.encrypt(s7);
        Object obj = c.encrypt(s8);
        String s3 = c.encrypt(s9);
        s2 = s3;
_L4:
        obj = RequestData.create(s4, s5, s1, s, ((String) (obj)), s2, e.a(s6), e.a(s7.replaceAll("\\s+", "")), e.a(s8), e.a((new StringBuilder("20")).append(s9).toString()), j, "Personal");
        cwz.b(getApplication(), g);
        if ("add".equals(f()))
        {
            a(((RequestData) (obj)));
            return;
        }
        if ("data_collection".equals(f()))
        {
            b(((RequestData) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        BraintreeEncryptionException braintreeencryptionexception;
        braintreeencryptionexception;
        braintreeencryptionexception = null;
        s = null;
        s1 = null;
          goto _L4
        braintreeencryptionexception;
        braintreeencryptionexception = null;
        s = null;
          goto _L4
        braintreeencryptionexception;
        braintreeencryptionexception = null;
          goto _L4
        BraintreeEncryptionException braintreeencryptionexception1;
        braintreeencryptionexception1;
          goto _L4
    }

    private void k()
    {
        startActivityForResult(a(this), 100);
    }

    protected final volatile void a(Object obj)
    {
        a((gyg)obj);
    }

    protected final Object h()
    {
        return i();
    }

    public final void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (l == 100 && i1 == CardIOActivity.a)
        {
            intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            h.b().setText(((CreditCard) (intent)).cardNumber);
            if (intent.isExpiryValid())
            {
                h.c().d(String.format("%d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryMonth)
                }));
                h.d().d(String.format("%d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryYear)
                }).substring(2));
            }
            j = true;
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(gsg.ub__payment_add_credit_card);
        b().b(true);
        setContentView(gse.ub__payment_activity_credit_card_add);
        h = (CreditCardFieldsView)findViewById(gsd.ub__payment_creditcardfieldsview);
        g = (Button)findViewById(gsd.ub__payment_button_add_payment);
        if (bundle != null)
        {
            j = bundle.getBoolean("extra_using_cardio");
        }
        if (f == null)
        {
            getResources();
            f = new gue(h);
        }
        if (e() != null)
        {
            h.f().a(e().getMobileCountryIso2());
        }
        if (f().equals("data_collection"))
        {
            a.a(e.au);
            g.setText(c());
        } else
        if (f().equals("add"))
        {
            a.a(e.a);
        }
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final CreditCardAddPaymentActivity a;

            public final void onClick(View view)
            {
                CreditCardAddPaymentActivity.a(a);
            }

            
            {
                a = CreditCardAddPaymentActivity.this;
                super();
            }
        });
        if (d() != null && d().isCardScanFirst())
        {
            h.g().setVisibility(0);
            a.a(e.b);
        } else
        if (d.a(gsn.f))
        {
            h.g().setVisibility(8);
        }
        h.g().setOnClickListener(new android.view.View.OnClickListener() {

            final CreditCardAddPaymentActivity a;

            public final void onClick(View view)
            {
                CreditCardAddPaymentActivity.b(a);
            }

            
            {
                a = CreditCardAddPaymentActivity.this;
                super();
            }
        });
        if (d() != null && d().isCardScanFirst())
        {
            k();
        }
        i = new ProgressDialog(this);
        i.setMessage(getString(gsg.ub__payment_adding_credit_card));
        i.setIndeterminate(true);
        i.setCancelable(false);
    }

    protected final void onDestroy()
    {
        super.onDestroy();
        if (i != null && i.isShowing())
        {
            i.dismiss();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
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

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_using_cardio", j);
    }
}
