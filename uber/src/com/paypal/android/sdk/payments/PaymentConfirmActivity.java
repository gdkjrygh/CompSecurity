// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import bqn;
import bqo;
import bqp;
import bsv;
import bsx;
import btm;
import bun;
import buq;
import buw;
import bux;
import buz;
import bvc;
import bvd;
import bvh;
import bvo;
import bvp;
import bwb;
import bwq;
import bzv;
import cag;
import cah;
import cai;
import caj;
import cak;
import cal;
import cam;
import can;
import cbn;
import cbp;
import cbr;
import cbs;
import cbt;
import cbu;
import cbv;
import cbw;
import ccm;
import ccw;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.ca;
import com.paypal.android.sdk.g;
import htl;
import io.card.payment.CreditCard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalPayment, bA, PayPalService, PayPalConfiguration, 
//            LoginActivity, PayPalPaymentDetails, ShippingAddress

public final class PaymentConfirmActivity extends Activity
{

    private static final String a = com/paypal/android/sdk/payments/PaymentConfirmActivity.getSimpleName();
    private cbv b;
    private bA c;
    private boolean d;
    private boolean e;
    private bvh f;
    private cag g;
    private cbw h;
    private CreditCard i;
    private PayPalService j;
    private final ServiceConnection k = new can(this);
    private boolean l;

    public PaymentConfirmActivity()
    {
    }

    private static ca a(PayPalPayment paypalpayment)
    {
        return new ca(new BigDecimal(btm.a(paypalpayment.b().doubleValue(), paypalpayment.e()).trim()), paypalpayment.e());
    }

    public static PayPalService a(PaymentConfirmActivity paymentconfirmactivity, PayPalService paypalservice)
    {
        paymentconfirmactivity.j = paypalservice;
        return paypalservice;
    }

    public static String a()
    {
        return a;
    }

    private void a(int i1)
    {
        setResult(i1, new Intent());
    }

    public static void a(Activity activity, cbw cbw1, PayPalConfiguration paypalconfiguration)
    {
        a(activity, cbw1, null, paypalconfiguration, false);
    }

    static void a(Activity activity, cbw cbw1, CreditCard creditcard, PayPalConfiguration paypalconfiguration, boolean flag)
    {
        Intent intent = new Intent(activity, com/paypal/android/sdk/payments/PaymentConfirmActivity);
        intent.putExtras(activity.getIntent());
        intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND", cbw1);
        intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD", creditcard);
        intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID", flag);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", paypalconfiguration);
        activity.startActivityForResult(intent, 2);
    }

    private void a(Bundle bundle)
    {
        String s = bundle.getString("authAccount");
        String s1 = bundle.getString("authtoken");
        String s2 = bundle.getString("scope");
        long l1 = bundle.getLong("valid_until");
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s3 = (String)iterator.next();
            Object obj = bundle.get(s3);
            if (obj == null)
            {
                String.format("%s:null", new Object[] {
                    s3
                });
            } else
            {
                String.format("%s:%s (%s)", new Object[] {
                    s3, obj.toString(), obj.getClass().getName()
                });
            }
        }

        bundle = new bI(s1, s2, l1, false);
        if (j == null)
        {
            b = new cbv(s, bundle);
            return;
        } else
        {
            a(s, ((bI) (bundle)));
            return;
        }
    }

    public static void a(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.g();
    }

    public static void a(PaymentConfirmActivity paymentconfirmactivity, bwb bwb)
    {
        paymentconfirmactivity.c = new bA(bwb, paymentconfirmactivity.g.a().m());
        paymentconfirmactivity.getIntent().putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO", paymentconfirmactivity.c);
        paymentconfirmactivity.b();
        paymentconfirmactivity.j();
    }

    public static void a(PaymentConfirmActivity paymentconfirmactivity, List list, int i1)
    {
        paymentconfirmactivity.g.b().a(i1);
        paymentconfirmactivity.f.a(paymentconfirmactivity, (bvc)list.get(i1));
    }

    private void a(String s)
    {
        f.a(s);
    }

    private void a(String s, bI bi)
    {
        j.c().d = s;
        a(s);
        j.c().h = bi;
        if (h != cbw.a)
        {
            f.b(true);
        }
    }

    private void a(boolean flag)
    {
        (new StringBuilder()).append(a).append(".doLogin");
        if (ccw.a(this, j))
        {
            Object obj;
            if (flag)
            {
                obj = bqo.b;
            } else
            {
                obj = bqo.a;
            }
            new bqn();
            obj = bqn.a(j.d().k(), ((bqo) (obj)), bqp.a, j.b().d().e());
            (new StringBuilder("startActivityForResult(")).append(obj).append(", 2)");
            Log.w("paypal.sdk", (new StringBuilder("requesting ")).append(((Intent) (obj)).getStringExtra("response_type")).append(" with scope={").append(((Intent) (obj)).getStringExtra("scope")).append("} from Authenticator.").toString());
            startActivityForResult(((Intent) (obj)), 2);
            return;
        } else
        {
            LoginActivity.a(this, j.q(), false, flag, "https://uri.paypal.com/services/payments/basic", j.d());
            return;
        }
    }

    private static Map b(PayPalPayment paypalpayment)
    {
        if (paypalpayment != null)
        {
            HashMap hashmap = new HashMap();
            PayPalPaymentDetails paypalpaymentdetails = paypalpayment.g();
            if (paypalpaymentdetails != null)
            {
                if (paypalpaymentdetails.c() != null)
                {
                    hashmap.put("shipping", btm.a(paypalpaymentdetails.c().doubleValue(), paypalpayment.e()));
                }
                if (paypalpaymentdetails.b() != null)
                {
                    hashmap.put("subtotal", btm.a(paypalpaymentdetails.b().doubleValue(), paypalpayment.e()));
                }
                if (paypalpaymentdetails.d() != null)
                {
                    hashmap.put("tax", btm.a(paypalpaymentdetails.d().doubleValue(), paypalpayment.e()));
                }
            }
            if (!hashmap.isEmpty())
            {
                return hashmap;
            }
        }
        return null;
    }

    private void b()
    {
        if (c != null)
        {
            Object obj = null;
            if (c.b() != null)
            {
                obj = c.b().a();
            }
            int i1 = c.h();
            obj = bvo.a(((org.json.JSONObject) (obj)), c.a(), c.i());
            if (((ArrayList) (obj)).size() > 0)
            {
                f.f().setVisibility(0);
                f.f().setClickable(true);
                f.a(getApplicationContext(), (bvo)((ArrayList) (obj)).get(i1));
                bvp bvp1 = new bvp(this, ((ArrayList) (obj)), i1);
                (new ListView(this)).setAdapter(bvp1);
                f.d(new cbp(this, bvp1, ((ArrayList) (obj))));
            } else
            {
                f.f().setClickable(false);
                f.f().setVisibility(8);
            }
            i1 = c.g();
            obj = bvc.a(c.c(), c.d());
            if (((ArrayList) (obj)).size() > 0)
            {
                f.e().setVisibility(0);
                f.e().setClickable(true);
                f.a(getApplicationContext(), (bvc)((ArrayList) (obj)).get(i1));
                bvd bvd1 = new bvd(this, ((ArrayList) (obj)), i1);
                (new ListView(this)).setAdapter(bvd1);
                f.c(new cbn(this, bvd1, ((ArrayList) (obj))));
            } else
            {
                f.e().setClickable(false);
                f.e().setVisibility(8);
            }
            f.b(true);
        }
    }

    public static void b(PaymentConfirmActivity paymentconfirmactivity)
    {
        (new StringBuilder()).append(a).append(".postBindSetup()");
        boolean flag;
        if (paymentconfirmactivity.h.equals(cbw.a))
        {
            android.text.SpannableString spannablestring = bwq.b(paymentconfirmactivity.j.d().a());
            paymentconfirmactivity.f.a(spannablestring);
        } else
        {
            paymentconfirmactivity.f.a(null);
        }
        if (paymentconfirmactivity.b != null)
        {
            paymentconfirmactivity.a(paymentconfirmactivity.b.a, paymentconfirmactivity.b.b);
            paymentconfirmactivity.b = null;
        }
        if (paymentconfirmactivity.getIntent().getBooleanExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID", false))
        {
            paymentconfirmactivity.j.c().a();
        }
        flag = paymentconfirmactivity.e();
        if (!paymentconfirmactivity.d)
        {
            paymentconfirmactivity.d = true;
            paymentconfirmactivity.j.a(buw.g);
        }
        paymentconfirmactivity.f();
        paymentconfirmactivity.j.b(new cbr(paymentconfirmactivity));
        if (cbw.a == paymentconfirmactivity.h && !flag && paymentconfirmactivity.c == null)
        {
            paymentconfirmactivity.i();
        }
    }

    public static void b(PaymentConfirmActivity paymentconfirmactivity, List list, int i1)
    {
        paymentconfirmactivity.g.b().b(i1);
        paymentconfirmactivity.f.a(paymentconfirmactivity, (bvo)list.get(i1));
    }

    public static PayPalService c(PaymentConfirmActivity paymentconfirmactivity)
    {
        return paymentconfirmactivity.j;
    }

    private void c()
    {
        if (j.c().h != null && !j.c().h.a())
        {
            j.c().h = null;
            j.c().d = null;
        }
    }

    public static cag d(PaymentConfirmActivity paymentconfirmactivity)
    {
        return paymentconfirmactivity.g;
    }

    private void d()
    {
        l = bindService(ccm.b(this), k, 1);
    }

    public static void e(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.c();
    }

    private boolean e()
    {
        if (h.equals(cbw.a) && !j.j() && !e)
        {
            e = true;
            a(false);
            return true;
        } else
        {
            return false;
        }
    }

    private void f()
    {
        PayPalPayment paypalpayment = g.a();
        Object obj1 = bun.a();
        obj1 = btm.a(Locale.getDefault(), ((bun) (obj1)).c().a(), paypalpayment.b().doubleValue(), paypalpayment.e());
        f.a(paypalpayment.c(), ((String) (obj1)));
        if (h == cbw.a)
        {
            f.a(true);
            a(j.r());
        } else
        if (h == cbw.b || h == cbw.c)
        {
            f.a(false);
            Object obj;
            String s;
            String s1;
            int i1;
            int j1;
            if (h == cbw.b)
            {
                s = bF.a(i.getRedactedCardNumber());
                i1 = i.expiryMonth;
                j1 = i.expiryYear;
                obj = i.getCardType();
            } else
            {
                obj = j.s();
                s = ((bF) (obj)).d();
                i1 = ((bF) (obj)).f();
                j1 = ((bF) (obj)).g();
                obj = bwq.a(((bF) (obj)));
            }
            s1 = String.format(Locale.getDefault(), "%02d / %04d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
            f.a(s, bwq.a(this, ((htl) (obj))), s1);
        } else
        {
            Log.wtf(a, (new StringBuilder("Unknown payment type: ")).append(h.toString()).toString());
            ccm.a(this, "The payment is not a valid type. Please try again.", 3);
        }
        ccm.a(f.d(), j.e());
    }

    public static void f(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.j();
    }

    public static cbw g(PaymentConfirmActivity paymentconfirmactivity)
    {
        return paymentconfirmactivity.h;
    }

    private void g()
    {
        cal.a[h.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 45
    //                   2 64
    //                   3 64;
           goto _L1 _L2 _L3 _L3
_L1:
        boolean flag = true;
_L5:
        if (!flag)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_121;
_L2:
        if (!e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j.i())
        {
            break; /* Loop/switch isn't completed */
        }
        showDialog(2);
        (new StringBuilder("token is expired, get new one. AccessToken: ")).append(j.c().c);
        j.a(h(), true);
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
        showDialog(2);
        if (g == null || g.a() == null || g.b() == null)
        {
            onBackPressed();
            return;
        }
        PayPalPayment paypalpayment = g.a();
        Object obj = a(paypalpayment);
        Object obj1 = b(paypalpayment);
        Object obj2 = paypalpayment.c();
        boolean flag1 = j.d().j();
        switch (cal.a[h.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            obj1 = g.b();
            obj2 = j;
            String s = ((bA) (obj1)).e();
            String s1 = ((bA) (obj1)).f();
            if (((bA) (obj1)).k())
            {
                obj = ((bA) (obj1)).m();
            } else
            {
                obj = null;
            }
            if (((bA) (obj1)).j())
            {
                obj1 = ((bA) (obj1)).l();
            } else
            {
                obj1 = null;
            }
            ((PayPalService) (obj2)).a(flag1, s, s1, ((org.json.JSONObject) (obj)), ((org.json.JSONObject) (obj1)), paypalpayment.f());
            return;

        case 2: // '\002'
            bF bf = j.s();
            String s2 = j.a(bf.a());
            j.a(j.c().b(), bf.e(), ((ca) (obj)), ((Map) (obj1)), paypalpayment.h(), ((String) (obj2)), flag1, s2, paypalpayment.f(), paypalpayment.d().toString(), paypalpayment.i(), paypalpayment.j(), paypalpayment.k());
            return;

        case 3: // '\003'
            j.a(j.c().b(), i.getCardType().toString().toLowerCase(Locale.US), i.cardNumber, i.cvv, i.expiryMonth, i.expiryYear, ((ca) (obj)), ((Map) (obj1)), paypalpayment.h(), ((String) (obj2)), flag1, paypalpayment.f(), paypalpayment.d().toString(), paypalpayment.i(), paypalpayment.j(), paypalpayment.k());
            return;
        }
    }

    private bzv h()
    {
        return new cak(this);
    }

    public static bzv h(PaymentConfirmActivity paymentconfirmactivity)
    {
        return paymentconfirmactivity.h();
    }

    public static bvh i(PaymentConfirmActivity paymentconfirmactivity)
    {
        return paymentconfirmactivity.f;
    }

    private void i()
    {
        if (j != null && j.c().h != null)
        {
            showDialog(2);
            PayPalPayment paypalpayment = g.a();
            ca ca1 = a(paypalpayment);
            Map map = b(paypalpayment);
            String s = paypalpayment.c();
            j.d().j();
            j.a(ca1, map, paypalpayment.h(), s, paypalpayment.f(), paypalpayment.d().toString(), paypalpayment.l(), paypalpayment.i(), paypalpayment.j(), paypalpayment.k());
            a(j.r());
        }
    }

    private void j()
    {
        try
        {
            dismissDialog(2);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    public static void j(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.a(true);
    }

    public static void k(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.i();
    }

    public static void l(PaymentConfirmActivity paymentconfirmactivity)
    {
        paymentconfirmactivity.g();
    }

    public final void finish()
    {
        super.finish();
        (new StringBuilder()).append(a).append(".finish");
    }

    protected final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        (new StringBuilder()).append(a).append(".onActivityResult(requestCode:").append(i1).append(", resultCode:").append(j1).append(", data:").append(intent).append(")");
        i1;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 105
    //                   2 147;
           goto _L1 _L2 _L3
_L1:
        Log.e(a, (new StringBuilder("unhandled requestCode ")).append(i1).toString());
_L5:
        return;
_L2:
        if (j1 == -1)
        {
            if (f != null)
            {
                f.b(false);
            }
            if (j != null)
            {
                i();
                return;
            }
        } else
        {
            a(j1);
            finish();
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (j1 == -1)
        {
            f.b(true);
            a(intent.getExtras());
            if (j != null)
            {
                i();
                return;
            }
        } else
        {
            a(j1);
            finish();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onBackPressed()
    {
        j.a(buw.i);
        c();
        super.onBackPressed();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(a).append(".onCreate");
        d();
        if (bundle == null)
        {
            if (!ccm.a(this))
            {
                finish();
            }
            d = false;
        } else
        {
            d = bundle.getBoolean("pageTrackingSent");
            e = bundle.getBoolean("isLoginActivityStarted");
        }
        if (getIntent().getExtras() == null)
        {
            onBackPressed();
        } else
        {
            h = (cbw)getIntent().getSerializableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND");
            i = (CreditCard)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD");
            g = new cag(getIntent());
            bwq.b(this);
            bwq.a(this);
            boolean flag;
            if (h == cbw.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = new bvh(this, flag);
            setContentView(f.a());
            ccm.a(this, f.b(), buz.A);
            f.b(new cah(this));
            f.a(new cam(this));
            if (cbw.a == h)
            {
                c = (bA)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO");
                b();
                return;
            }
        }
    }

    protected final Dialog onCreateDialog(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return ccm.a(this, buz.bq, bundle);

        case 2: // '\002'
            return ccm.a(this, buz.aE, buz.bp);

        case 3: // '\003'
            return ccm.a(this, buz.an, bundle, i1);

        case 4: // '\004'
            return ccm.a(this, buz.aM, bundle, new cbs(this));

        case 5: // '\005'
            bux.a(buz.bf);
            break;
        }
        if (bundle != null && bwq.d(bundle.getString("BUNDLE_ERROR_CODE")))
        {
            String s = bundle.getString("BUNDLE_ERROR_CODE");
            bundle = buz.bh;
            s = bux.a(s);
            buz buz2 = buz.aR;
            buz buz4 = buz.f;
            cbt cbt1 = new cbt(this);
            cbu cbu1 = new cbu(this);
            return (new android.app.AlertDialog.Builder(this)).setIcon(0x1080027).setTitle(bux.a(bundle)).setMessage(s).setPositiveButton(bux.a(buz2), cbt1).setNegativeButton(bux.a(buz4), cbu1).create();
        } else
        {
            bundle = buz.bh;
            buz buz1 = buz.bf;
            buz buz3 = buz.aR;
            buz buz5 = buz.f;
            cai cai1 = new cai(this);
            caj caj1 = new caj(this);
            return (new android.app.AlertDialog.Builder(this)).setIcon(0x1080027).setTitle(bux.a(bundle)).setMessage(bux.a(buz1)).setPositiveButton(bux.a(buz3), cai1).setNegativeButton(bux.a(buz5), caj1).create();
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(a).append(".onDestroy");
        if (j != null)
        {
            j.m();
        }
        if (l)
        {
            unbindService(k);
            l = false;
        }
        super.onDestroy();
    }

    protected final void onRestart()
    {
        super.onRestart();
        d();
    }

    protected final void onResume()
    {
        super.onResume();
        (new StringBuilder()).append(a).append(".onResume");
        if (j != null)
        {
            f();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pageTrackingSent", d);
        bundle.putBoolean("isLoginActivityStarted", e);
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        (new StringBuilder()).append(a).append(".onWindowFocusChanged");
        f.c();
    }

}
