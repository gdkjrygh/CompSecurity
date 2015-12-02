// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.bankcard;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.braintreegateway.encryption.Braintree;
import com.braintreegateway.encryption.BraintreeEncryptionException;
import com.ubercab.payment.internal.inject.AddPaymentActivityWithInjection;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.BankCardFieldsView;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.creditcard.model.RequestData;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.ui.Button;
import cwm;
import cwz;
import e;
import f;
import gsd;
import gse;
import gsg;
import gsm;
import gst;
import gtc;
import gte;
import gti;
import gxm;
import gxo;
import gxs;
import gxt;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.bankcard:
//            BankCardApi

public class BankCardAddPaymentActivity extends AddPaymentActivityWithInjection
    implements gte
{

    public chp a;
    public BankCardApi b;
    public Braintree c;
    public gsm d;
    private BankCardFieldsView e;
    private Button f;
    private ContentLoadingView g;
    private boolean h;

    public BankCardAddPaymentActivity()
    {
    }

    static void a(BankCardAddPaymentActivity bankcardaddpaymentactivity)
    {
        bankcardaddpaymentactivity.k();
    }

    private void a(RequestData requestdata)
    {
        g.a(false);
        b.addBankCard(requestdata, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final BankCardAddPaymentActivity a;

            private void a(ApiError apierror)
            {
                cwm.a(a, apierror.getErrorMessage());
                a.a.a(e.Q);
            }

            public final void a(Exception exception)
            {
                super.a(exception);
                a.a.a(e.Q);
            }

            public final void a(Object obj)
            {
                a.a.a(e.R);
                a.setResult(-1);
                a.finish();
            }

            public final void a(RetrofitError retrofiterror)
            {
                super.a(retrofiterror);
                a.a.a(e.Q);
            }

            public final void a(boolean flag)
            {
                super.a(flag);
                BankCardAddPaymentActivity.b(a).a(true);
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = BankCardAddPaymentActivity.this;
                super(activity, class1);
            }
        });
    }

    private void a(gxm gxm1)
    {
        gxm1.a(this);
    }

    private void a(String s, String s1)
    {
        (new android.app.AlertDialog.Builder(this)).setMessage(s1).setTitle(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final BankCardAddPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.dismiss();
            }

            
            {
                a = BankCardAddPaymentActivity.this;
                super();
            }
        }).show();
    }

    static ContentLoadingView b(BankCardAddPaymentActivity bankcardaddpaymentactivity)
    {
        return bankcardaddpaymentactivity.g;
    }

    private void b(RequestData requestdata)
    {
        a(CollectedData.create(requestdata.generateDataCollectionParameters()));
    }

    private gxm i()
    {
        return gxs.a().a(new gxo(this)).a(new gst(getApplication())).a();
    }

    private void j()
    {
        b().b(true);
        setTitle(gsg.ub__payment_add_credit_card_v2_title);
        setContentView(gse.ub__payment_activity_bank_card_add);
        e = (BankCardFieldsView)findViewById(gsd.ub__payment_activity_credit_card_v2_add_bank_card_fields);
        f = (Button)findViewById(gsd.ub__payment_activity_credit_card_v2_add_button_connect);
        g = (ContentLoadingView)findViewById(gsd.ub__payment_activity_credit_card_v2_add_content_loading);
        e.a(this);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final BankCardAddPaymentActivity a;

            public final void onClick(View view)
            {
                BankCardAddPaymentActivity.a(a);
            }

            
            {
                a = BankCardAddPaymentActivity.this;
                super();
            }
        });
    }

    private void k()
    {
        String s2 = null;
        if (!e.g())
        {
            return;
        }
        a.a(f.R);
        String s4 = e.b();
        String s5 = e.f();
        String s6 = e.a();
        String s7 = e.e();
        String s8 = e.c();
        String s9 = e.d();
        Object obj;
        String s;
        String s1;
        String s3;
        byte byte0;
        try
        {
            s1 = c.encrypt(s6);
        }
        catch (BraintreeEncryptionException braintreeencryptionexception)
        {
            braintreeencryptionexception = null;
            s = null;
            s1 = null;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            s = c.encrypt(s7);
        }
        catch (BraintreeEncryptionException braintreeencryptionexception1)
        {
            braintreeencryptionexception1 = null;
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj = c.encrypt(s8);
        }
        catch (BraintreeEncryptionException braintreeencryptionexception2)
        {
            braintreeencryptionexception2 = null;
            continue; /* Loop/switch isn't completed */
        }
        s3 = c.encrypt(s9);
        s2 = s3;
_L6:
        obj = RequestData.create(s4, s5, s1, s, ((String) (obj)), s2, d.a(s6), d.a(s7.replaceAll("\\s+", "")), d.a(s8), d.a((new StringBuilder("20")).append(s9).toString()), h, "Personal");
        cwz.b(getApplication(), f);
        s = f();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 252
    //                   -2055109037: 299
    //                   96417: 283;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_299;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            a(((RequestData) (obj)));
            return;

        case 1: // '\001'
            b(((RequestData) (obj)));
            break;
        }
        break MISSING_BLOCK_LABEL_320;
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
        return;
        BraintreeEncryptionException braintreeencryptionexception3;
        braintreeencryptionexception3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void C_()
    {
        a.a(f.T);
        a(getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_expiration_title), getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_expiration_message));
    }

    public final void a()
    {
        a.a(f.U);
        Intent intent = new Intent(this, io/card/payment/CardIOActivity);
        intent.putExtra("io.card.payment.requireExpiry", true);
        intent.putExtra("io.card.payment.suppressManual", true);
        startActivityForResult(intent, 100);
    }

    protected final volatile void a(Object obj)
    {
        a((gxm)obj);
    }

    public final void a(String s)
    {
        a.a(f.S);
        if (gti.b(s) == 4)
        {
            s = getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_security_code_message_four);
        } else
        {
            s = getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_security_code_message_three);
        }
        a(getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_security_code_title), getResources().getString(gsg.ub__payment_add_credit_card_v2_info_dialog_security_code_message_format, new Object[] {
            s
        }));
    }

    public final void a(boolean flag)
    {
        f.setEnabled(flag);
    }

    protected final Object h()
    {
        return i();
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (l == 100)
        {
            if (i1 == CardIOActivity.a)
            {
                a.a(f.W);
                intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
                e.a(((CreditCard) (intent)).cardNumber);
                if (intent.isExpiryValid())
                {
                    e.a(((CreditCard) (intent)).expiryMonth, ((CreditCard) (intent)).expiryYear);
                }
                h = true;
            } else
            if (i1 == CardIOActivity.b)
            {
                a.a(f.V);
                return;
            }
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        a.a(f.Q);
    }

    public void onCreate(Bundle bundle)
    {
        byte byte0;
        super.onCreate(bundle);
        j();
        if (e() != null)
        {
            e.b(e().getMobileCountryIso2());
        }
        bundle = f();
        byte0 = -1;
        bundle.hashCode();
        JVM INSTR lookupswitch 2: default 68
    //                   -2055109037: 108
    //                   96417: 93;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_108;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            a.a(e.P);
            return;

        case 1: // '\001'
            a.a(e.S);
            break;
        }
        break MISSING_BLOCK_LABEL_144;
_L3:
        if (bundle.equals("add"))
        {
            byte0 = 0;
        }
          goto _L4
        if (bundle.equals("data_collection"))
        {
            byte0 = 1;
        }
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

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        h = bundle.getBoolean("allow_scan_card");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("allow_scan_card", h);
    }
}
