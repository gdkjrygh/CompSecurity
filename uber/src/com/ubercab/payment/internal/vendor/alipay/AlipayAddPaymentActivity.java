// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.alipay;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import bjw;
import bjy;
import com.ubercab.payment.internal.activity.AddPaymentActivity;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.network.PaymentApi;
import com.ubercab.payment.internal.network.model.CreateThirdPartyPaymentProfileRequest;
import com.ubercab.payment.internal.vendor.alipay.model.AlipayTokenData;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.TextView;
import cwz;
import gkg;
import grs;
import gry;
import gsa;
import gsd;
import gse;
import gsg;
import gtc;
import gtu;
import hnz;
import hpb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlipayAddPaymentActivity extends AddPaymentActivity
{

    private static final bjw a = (new bjy()).a(new hnz()).c();
    private Button b;
    private FloatingLabelEditText c;
    private FloatingLabelEditText d;
    private PaymentApi e;
    private ProgressDialog f;
    private TextView g;
    private TextView h;

    public AlipayAddPaymentActivity()
    {
    }

    static void a(AlipayAddPaymentActivity alipayaddpaymentactivity)
    {
        alipayaddpaymentactivity.l();
    }

    static void a(AlipayAddPaymentActivity alipayaddpaymentactivity, PaymentProfile paymentprofile)
    {
        alipayaddpaymentactivity.b(paymentprofile);
    }

    private boolean a(FloatingLabelEditText floatinglabeledittext)
    {
        boolean flag = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", 2).matcher(floatinglabeledittext.i()).matches();
        Object obj;
        if (flag)
        {
            obj = null;
        } else
        {
            obj = getString(gsg.ub__payment_invalid_email);
        }
        floatinglabeledittext.a(((CharSequence) (obj)));
        return flag;
    }

    private static boolean a(String s)
    {
        return s != null && s.contains("@");
    }

    static void b(AlipayAddPaymentActivity alipayaddpaymentactivity)
    {
        alipayaddpaymentactivity.j();
    }

    private void b(PaymentProfile paymentprofile)
    {
        startActivityForResult(gsa.a(this, paymentprofile.getTokenType()).c(paymentprofile), 100);
    }

    private void b(String s)
    {
        a(CollectedData.create(gkg.a("token_type", "alipay", "token_data", s)));
    }

    private boolean b(FloatingLabelEditText floatinglabeledittext)
    {
        boolean flag = Pattern.compile("^1\\d{10}$", 2).matcher(floatinglabeledittext.i()).matches();
        Object obj;
        if (flag)
        {
            obj = null;
        } else
        {
            obj = getString(gsg.ub__payment_invalid_phone_number);
        }
        floatinglabeledittext.a(((CharSequence) (obj)));
        return flag;
    }

    static void c(AlipayAddPaymentActivity alipayaddpaymentactivity)
    {
        alipayaddpaymentactivity.k();
    }

    private void c(String s)
    {
        s = CreateThirdPartyPaymentProfileRequest.create("alipay", s);
        f.show();
        e.create(s, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final AlipayAddPaymentActivity a;

            private void a(ApiError apierror)
            {
                String s1 = apierror.getErrorMessage();
                apierror = s1;
                if (TextUtils.isEmpty(s1))
                {
                    apierror = a.getString(gsg.ub__payment_add_failed);
                }
                (new android.app.AlertDialog.Builder(a)).setTitle(a.getString(gsg.ub__payment_error)).setMessage(apierror).setNeutralButton(gsg.ub__payment_ok, null).show();
            }

            private void a(PaymentProfile paymentprofile)
            {
                if (paymentprofile != null)
                {
                    AlipayAddPaymentActivity.a(a, paymentprofile);
                }
            }

            public final volatile void a(Object obj)
            {
                a((PaymentProfile)obj);
            }

            public final void a(boolean flag)
            {
                AlipayAddPaymentActivity.d(a).dismiss();
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super(activity, class1);
            }
        });
    }

    static ProgressDialog d(AlipayAddPaymentActivity alipayaddpaymentactivity)
    {
        return alipayaddpaymentactivity.f;
    }

    private void h()
    {
        setContentView(gse.ub__payment_activity_alipay_add);
        f = new ProgressDialog(this);
        f.setIndeterminate(true);
        f.setCancelable(false);
        f.setCanceledOnTouchOutside(false);
        f.setProgress(0);
        f.setMessage(getString(gsg.ub__payment_adding_payment));
        c = (FloatingLabelEditText)findViewById(gsd.ub__alipay_add_edittext_email_or_phone);
        c.a(new hpb() {

            final AlipayAddPaymentActivity a;

            public final void afterTextChanged(Editable editable)
            {
                AlipayAddPaymentActivity.a(a);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super();
            }
        });
        d = (FloatingLabelEditText)findViewById(gsd.ub__alipay_add_edittext_phone);
        d.a(new hpb() {

            final AlipayAddPaymentActivity a;

            public final void afterTextChanged(Editable editable)
            {
                AlipayAddPaymentActivity.a(a);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super();
            }
        });
        b = (Button)findViewById(gsd.ub__alipay_add_button_submit);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final AlipayAddPaymentActivity a;

            public final void onClick(View view)
            {
                AlipayAddPaymentActivity.b(a);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super();
            }
        });
        h = (TextView)findViewById(gsd.ub__alipay_add_textview_tos_agreement);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final AlipayAddPaymentActivity a;

            public final void onClick(View view)
            {
                AlipayAddPaymentActivity.c(a);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super();
            }
        });
        g = (TextView)findViewById(gsd.ub__alipay_add_textview_terms);
        g.setPaintFlags(g.getPaintFlags() | 8);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final AlipayAddPaymentActivity a;

            public final void onClick(View view)
            {
                AlipayAddPaymentActivity.c(a);
            }

            
            {
                a = AlipayAddPaymentActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        if (e == null)
        {
            e = (PaymentApi)g().aK().a(com/ubercab/payment/internal/network/PaymentApi);
        }
    }

    private void j()
    {
        String s;
        String s1;
        byte byte0;
        if (!m())
        {
            return;
        }
        s1 = c.i().toString().trim();
        if (a(s1))
        {
            s = d.i().toString().trim();
        } else
        {
            s = s1;
        }
        s = a.a(AlipayTokenData.create(s1, s));
        s1 = f();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 96
    //                   -2055109037: 145
    //                   96417: 130;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 120
    //                   0 160
    //                   1 168;
           goto _L4 _L5 _L6
_L4:
        cwz.a(this);
        return;
_L3:
        if (s1.equals("add"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s1.equals("data_collection"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        c(s);
          goto _L4
_L6:
        b(s);
          goto _L4
    }

    private void k()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://www.uber.com/alipay/terms"));
        startActivity(intent);
    }

    private void l()
    {
        boolean flag1 = true;
        boolean flag = true;
        String s = c.i().toString();
        if (a(s))
        {
            String s1 = d.i().toString();
            Button button1 = b;
            if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
            {
                flag = false;
            }
            button1.setEnabled(flag);
            c.c(getString(gsg.ub__payment_email));
            d.setVisibility(0);
            return;
        }
        Button button = b;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        c.c(getString(gsg.ub__payment_alipay_email_or_phone));
        d.setVisibility(8);
    }

    private boolean m()
    {
        if (a(c.i().toString()))
        {
            boolean flag = a(c);
            boolean flag1 = b(d);
            return flag && flag1;
        } else
        {
            return b(c);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 100 && j1 == -1)
        {
            a(gtu.a(intent));
            return;
        } else
        {
            super.onActivityResult(i1, j1, intent);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(gsg.ub__payment_alipay);
        h();
        i();
        if (b() != null)
        {
            b().b(true);
        }
        l();
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
