// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import chp;
import cic;
import com.google.android.gms.wallet.MaskedWallet;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.core.realtime.model.ParcelableUnpaidBill;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.client.feature.payment.expense.ExpenseInfoActivity;
import com.ubercab.client.feature.payment.paytm.PaytmArrearsFragment;
import com.ubercab.client.feature.promo.PromoFragment;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.internal.model.PaymentEditResult;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import czj;
import czq;
import dal;
import dar;
import dbf;
import dfe;
import dfp;
import dkn;
import dle;
import dmk;
import dne;
import dpg;
import dtp;
import dui;
import duo;
import dwq;
import eou;
import eov;
import epr;
import eps;
import ept;
import epu;
import epv;
import eqg;
import erg;
import erj;
import erm;
import ero;
import erp;
import erq;
import err;
import ers;
import ert;
import erv;
import eyy;
import gjz;
import gmg;
import gqg;
import gqj;
import gsa;
import gtu;
import gzi;
import hkm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l;
import n;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentFragment, EditPaymentProfileActivity, AddPaymentActivity

public class PaymentActivity extends RiderActivity
{

    private MaskedWallet A;
    private Profile B;
    private icl C;
    private icl D;
    private icl E;
    public chp h;
    public hkr i;
    public hku j;
    public gmg k;
    public czq l;
    public PayPalConfiguration m;
    public dpg n;
    public dkn o;
    public eyy p;
    public hkm q;
    public dal r;
    private String s;
    private icl t;
    private String u;
    private RiderTripExpenseInfo v;
    private String w;
    private boolean x;
    private boolean y;
    private ArrayList z;

    public PaymentActivity()
    {
        v = RiderTripExpenseInfo.create();
    }

    public static Intent a(Context context)
    {
        return (new epu(context, "com.ubercab.ACTION_AUTHORIZE_PAYMENT")).a(null).a().putExtra("is_verify_mode", true);
    }

    public static Intent a(Context context, PaymentProfile paymentprofile, Profile profile)
    {
        Object obj = null;
        epu epu1 = new epu(context, "com.ubercab.CHANGE_DEFAULT_PAYMENT");
        if (paymentprofile != null)
        {
            context = paymentprofile.getUuid();
        } else
        {
            context = null;
        }
        paymentprofile = epu1.a(context);
        context = obj;
        if (profile != null)
        {
            context = profile.getUuid();
        }
        return paymentprofile.b(context).a();
    }

    public static Intent a(Context context, TripExpenseInfo tripexpenseinfo, dwq dwq, PaymentProfile paymentprofile, ArrayList arraylist)
    {
        gjz.a(tripexpenseinfo);
        gjz.a(arraylist);
        tripexpenseinfo = (new epu(context, "com.ubercab.ACTION_ARREARS")).a(tripexpenseinfo).a(dwq);
        if (paymentprofile != null)
        {
            context = paymentprofile.getUuid();
        } else
        {
            context = null;
        }
        return tripexpenseinfo.a(context).a(arraylist).a();
    }

    public static Intent a(Context context, TripExpenseInfo tripexpenseinfo, dwq dwq, PaymentProfile paymentprofile, boolean flag, boolean flag1, boolean flag2)
    {
        gjz.a(tripexpenseinfo);
        if (paymentprofile != null)
        {
            paymentprofile = paymentprofile.getUuid();
        } else
        {
            paymentprofile = null;
        }
        return (new epu(context, "com.ubercab.SELECT_PAYMENT")).a(tripexpenseinfo).a(dwq).a(paymentprofile).b(flag).c(flag1).a(flag2).a();
    }

    public static Intent a(Context context, TripExpenseInfo tripexpenseinfo, boolean flag)
    {
        gjz.a(tripexpenseinfo);
        return (new epu(context, "com.ubercab.CHANGE_PAYMENT")).a(tripexpenseinfo).b(flag).a();
    }

    public static Intent a(Context context, dwq dwq, String s1, boolean flag, TripExpenseInfo tripexpenseinfo)
    {
        return (new epu(context, "com.ubercab.MANAGE_PAYMENT")).a(dwq).a(s1).b(flag).a(tripexpenseinfo).a(false).a();
    }

    public static String a(PaymentActivity paymentactivity)
    {
        return paymentactivity.s;
    }

    private void a(Intent intent)
    {
        a(v);
        if (intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
        {
            PaymentFragment paymentfragment = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
            Client client = i.c();
            if (paymentfragment != null && client != null)
            {
                c(client.findPaymentProfileByUuid(intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID")));
            }
            return;
        } else
        {
            b(intent);
            return;
        }
    }

    private void a(RiderTripExpenseInfo ridertripexpenseinfo)
    {
        if (!n.b())
        {
            o.a(ridertripexpenseinfo);
            return;
        } else
        {
            t = q.a(ridertripexpenseinfo.isExpenseTrip(), ridertripexpenseinfo.getCode(), ridertripexpenseinfo.getMemo()).a(ico.a()).a(new epr(this, (byte)0));
            return;
        }
    }

    public static void a(PaymentActivity paymentactivity, Client client, Trip trip, boolean flag, String s1, boolean flag1)
    {
        paymentactivity.a(client, trip, flag, s1, flag1);
    }

    private void a(Client client, Trip trip, boolean flag, String s1, boolean flag1)
    {
        u();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        dtp.a(this, 5007, getString(0x7f07049a), s1, getString(0x7f0702f8));
_L4:
        return;
_L2:
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        a_(s1);
        return;
        if (trip == null || client == null || TextUtils.isEmpty(client.getUuid()))
        {
            setResult(0);
            finish();
            return;
        } else
        {
            b(client.findPaymentProfileByUuid(trip.getPaymentProfileUUID()));
            return;
        }
    }

    private void a(PaymentProfile paymentprofile)
    {
        if (s.equals("com.ubercab.ACTION_ARREARS"))
        {
            d(paymentprofile);
        }
    }

    private void a(ept ept1)
    {
        ept1.a(this);
    }

    private void a(String s1, String s2)
    {
        b(getString(0x7f070064), null);
        o.k(s2, s1);
    }

    private void a(String s1, boolean flag, boolean flag1)
    {
        startActivityForResult(EditPaymentProfileActivity.a(this, s1, flag1).putExtra("is_verify_mode", flag), 5003);
    }

    public static Intent b(Context context)
    {
        return (new epu(context, "com.ubercab.SCAN_CARD")).a(null).a();
    }

    private ept b(dfp dfp)
    {
        return eou.a().a(new dfe(this)).a(new eqg()).a(dfp).a();
    }

    private void b(Intent intent)
    {
        setResult(-1, intent);
        finish();
    }

    private void b(PaymentProfile paymentprofile)
    {
        if (s.equals("com.ubercab.ACTION_ARREARS"))
        {
            a(paymentprofile);
            return;
        }
        if (paymentprofile == null)
        {
            paymentprofile = null;
        } else
        {
            paymentprofile = paymentprofile.getUuid();
        }
        u = paymentprofile;
        b(g());
    }

    private void c(Intent intent)
    {
        if (u != null && !intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
        {
            intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", u);
        }
        intent.putExtra("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(v));
        intent.putExtra("com.ubercab.USE_CREDITS", x);
        intent.putExtra("com.ubercab.USE_POINTS", y);
        if (p.f() && B != null)
        {
            intent.putExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID", B.getUuid());
        }
    }

    private void c(PaymentProfile paymentprofile)
    {
        if (paymentprofile != null)
        {
            b(getString(0x7f070090), null);
            String s1 = dui.a(paymentprofile, this);
            if (!n.o())
            {
                o.a(paymentprofile.getUuid(), false, s1);
                return;
            }
            paymentprofile = paymentprofile.getUuid();
            if (paymentprofile != null)
            {
                D = q.a(paymentprofile, false, s1).a(ico.a()).a(new epv(this, (byte)0));
                return;
            }
        }
    }

    private void d(PaymentProfile paymentprofile)
    {
        if (z.isEmpty() || paymentprofile == null)
        {
            return;
        }
        String s1 = ((ParcelableUnpaidBill)z.get(0)).getUuid();
        String s2 = paymentprofile.getTokenType();
        gsa gsa1 = gsa.a(this, s2);
        if (s2 != null && s2.equals("zaakpay"))
        {
            startActivityForResult((new gzi(this)).a(dui.a(paymentprofile), s1), 5002);
            return;
        }
        if (gsa1 != null && gsa1.r())
        {
            startActivityForResult(gsa1.a(dui.a(paymentprofile), s1), 5002);
            return;
        } else
        {
            a(paymentprofile.getUuid(), s1);
            return;
        }
    }

    private void f()
    {
        startActivityForResult(new Intent(this, com/ubercab/client/feature/payment/AddPaymentActivity), 5001);
    }

    private Intent g()
    {
        Intent intent = new Intent();
        c(intent);
        return intent;
    }

    private void h()
    {
        String s1;
        if (v.isExpenseTrip())
        {
            s1 = getString(0x7f0704a7);
        } else
        {
            s1 = getString(0x7f0704a6);
        }
        b(s1, null);
        a(v);
    }

    private void i()
    {
        Intent intent = new Intent(this, com/paypal/android/sdk/payments/PayPalService);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", m);
        startService(intent);
    }

    private void j()
    {
        stopService(new Intent(this, com/paypal/android/sdk/payments/PayPalService));
    }

    private void k()
    {
        Object obj = i.c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        obj = ((Client) (obj)).findPaymentProfileByUuid(u);
        if (obj == null || !dui.b(((PaymentProfile) (obj))) || k.b(dbf.bf))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a(com/ubercab/client/feature/payment/paytm/PaytmArrearsFragment) != null) goto _L1; else goto _L3
_L3:
        a(0x7f0e028d, PaytmArrearsFragment.a(((PaymentProfile) (obj)).getUuid(), z), true);
        return;
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null) goto _L1; else goto _L4
_L4:
        a(0x7f0e028d, PaymentFragment.a(z, u), true);
        return;
    }

    private void l()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaymentFragment.b(), true);
            return;
        }
    }

    private void m()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaymentFragment.a(u), true);
            return;
        }
    }

    private void n()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaymentFragment.a(v), true);
            return;
        }
    }

    private void o()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaymentFragment.a(u, x), true);
            return;
        }
    }

    private void p()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            boolean flag = getIntent().getBooleanExtra("com.ubercab.SHOW_PROMO", false);
            a(0x7f0e028d, PaymentFragment.a(u, x, y, v, flag), true);
            return;
        }
    }

    private void q()
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaymentFragment.g(), true);
            return;
        }
    }

    private void r()
    {
        PaymentUserInfo paymentuserinfo = PaymentUserInfo.create();
        Object obj = i.c();
        if (obj != null)
        {
            paymentuserinfo.setEmail(((Client) (obj)).getEmail()).setFirstName(((Client) (obj)).getFirstName()).setLastName(((Client) (obj)).getLastName()).setMobile(((Client) (obj)).getMobileDigits()).setMobileCountryIso2(((Client) (obj)).getMobileCountryIso2());
        }
        obj = PaymentAddOptions.create().setCardScanFirst(true);
        startActivityForResult(gsa.a(this, "braintree").a(paymentuserinfo, ((PaymentAddOptions) (obj))), 5008);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        PaytmArrearsFragment paytmarrearsfragment = (PaytmArrearsFragment)a(com/ubercab/client/feature/payment/paytm/PaytmArrearsFragment);
        if (paytmarrearsfragment != null)
        {
            paytmarrearsfragment.a(i1, j1, bundle);
        }
    }

    public final volatile void a(czj czj)
    {
        a((ept)czj);
    }

    public final void a(gqg gqg, Ping ping, Response response)
    {
        boolean flag;
        if (ping != null && ping.getErrorCode() != null && ping.getErrorCode().intValue() == 460)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            super.a(gqg, ping, response);
        }
    }

    public final volatile void a(gqg gqg, gqj gqj, Response response)
    {
        a(gqg, (Ping)gqj, response);
    }

    protected final void b(Bundle bundle)
    {
        byte byte0;
        super.b(bundle);
        i();
        setContentView(0x7f0300ef);
        bundle = getIntent();
        gjz.a(bundle);
        gjz.a(bundle.getAction());
        s = bundle.getAction();
        v = (RiderTripExpenseInfo)bundle.getParcelableExtra("com.ubercab.EXPENSE_INFO");
        x = bundle.getBooleanExtra("com.ubercab.USE_CREDITS", true);
        y = bundle.getBooleanExtra("com.ubercab.USE_POINTS", false);
        z = bundle.getParcelableArrayListExtra("com.ubercab.UNPAID_BILLS");
        A = (MaskedWallet)bundle.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        u = getIntent().getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
        if (p.f())
        {
            B = p.a(getIntent().getStringExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID"));
        }
        bundle = s;
        byte0 = -1;
        bundle.hashCode();
        JVM INSTR lookupswitch 7: default 228
    //                   -1197137663: 361
    //                   -956851128: 291
    //                   -533285754: 347
    //                   -395009795: 305
    //                   -350780328: 277
    //                   280998292: 319
    //                   1982558762: 333;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_361;
_L9:
        switch (byte0)
        {
        default:
            finish();
            return;

        case 0: // '\0'
            l();
            return;

        case 1: // '\001'
            n();
            return;

        case 2: // '\002'
            o();
            return;

        case 3: // '\003'
            p();
            return;

        case 4: // '\004'
            m();
            return;

        case 5: // '\005'
            k();
            return;

        case 6: // '\006'
            q();
            break;
        }
        break MISSING_BLOCK_LABEL_411;
_L6:
        if (bundle.equals("com.ubercab.ACTION_AUTHORIZE_PAYMENT"))
        {
            byte0 = 0;
        }
          goto _L9
_L3:
        if (bundle.equals("com.ubercab.CHANGE_PAYMENT"))
        {
            byte0 = 1;
        }
          goto _L9
_L5:
        if (bundle.equals("com.ubercab.MANAGE_PAYMENT"))
        {
            byte0 = 2;
        }
          goto _L9
_L7:
        if (bundle.equals("com.ubercab.SELECT_PAYMENT"))
        {
            byte0 = 3;
        }
          goto _L9
_L8:
        if (bundle.equals("com.ubercab.CHANGE_DEFAULT_PAYMENT"))
        {
            byte0 = 4;
        }
          goto _L9
_L4:
        if (bundle.equals("com.ubercab.ACTION_ARREARS"))
        {
            byte0 = 5;
        }
          goto _L9
        if (bundle.equals("com.ubercab.SCAN_CARD"))
        {
            byte0 = 6;
        }
          goto _L9
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 5006 || j1 != -1 || intent == null) goto _L2; else goto _L1
_L1:
        r.a(true);
        if (!s.equals("com.ubercab.MANAGE_PAYMENT")) goto _L4; else goto _L3
_L3:
        A = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        if (k.a(dbf.bZ) && r.k())
        {
            intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid());
            PaymentFragment paymentfragment = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
            if (paymentfragment != null)
            {
                paymentfragment.d(com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid());
            }
        }
        setResult(j1, intent);
_L6:
        return;
_L4:
        if (s.equals("com.ubercab.SELECT_PAYMENT"))
        {
            A = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
            u = com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid();
            c(intent);
            b(intent);
            return;
        }
        if (s.equals("com.ubercab.CHANGE_PAYMENT"))
        {
            w = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            c(intent);
            return;
        }
        if (s.equals("com.ubercab.ACTION_ARREARS"))
        {
            w = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 != 5003 && i1 != 5001 || j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k.a(dbf.bZ) && r.k())
        {
            PaymentFragment paymentfragment2 = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
            if (paymentfragment2 != null)
            {
                String s1;
                if (intent == null)
                {
                    s1 = null;
                } else
                {
                    s1 = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
                }
                u = s1;
                paymentfragment2.d(s1);
                if (intent != null)
                {
                    c(intent);
                }
                setResult(j1, intent);
            }
        }
        if (n.n())
        {
            q.a().b(duo.a());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != 5004 || j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        PaymentFragment paymentfragment1 = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
        if (paymentfragment1 != null)
        {
            com.ubercab.payment.model.PaymentProfile paymentprofile = gtu.a(intent);
            Object obj = gtu.b(intent);
            if (obj != null && paymentprofile != null)
            {
                obj = ((PaymentEditResult) (obj)).isSelectedAsPayment();
                if (obj != null && ((Boolean) (obj)).booleanValue())
                {
                    u = paymentprofile.getUuid();
                    paymentfragment1.d(paymentprofile.getUuid());
                    intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", paymentprofile.getUuid());
                    setResult(j1, intent);
                    return;
                }
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (i1 == 5005)
        {
            if (j1 == -1 && intent != null)
            {
                v = (RiderTripExpenseInfo)intent.getParcelableExtra("com.ubercab.EXPENSE_INFO");
                if (intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
                {
                    x = false;
                }
                c(intent);
                if (s.equals("com.ubercab.CHANGE_PAYMENT"))
                {
                    a(intent);
                    return;
                } else
                {
                    b(intent);
                    return;
                }
            } else
            {
                setResult(0, intent);
                return;
            }
        }
        if (i1 == 5002 && j1 == -1)
        {
            finish();
            return;
        }
        if (i1 == 5008 && j1 == -1)
        {
            finish();
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public void onAddExpenseInfoResponseEvent(dle dle)
    {
        u();
    }

    public void onChangePaymentProfileEvent(erg erg1)
    {
        c(erg1.a());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        String s1;
        byte byte0;
        super.onCreateOptionsMenu(menu);
        s1 = s;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR tableswitch -350780328 -350780328: default 36
    //                   -350780328 69;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            getMenuInflater().inflate(0x7f100006, menu);
            // fall through

        case 0: // '\0'
            return true;
        }
_L2:
        if (s1.equals("com.ubercab.ACTION_AUTHORIZE_PAYMENT"))
        {
            byte0 = 0;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onDestroy()
    {
        j();
        super.onDestroy();
    }

    public void onEditPaymentProfileEvent(erj erj1)
    {
        boolean flag3 = true;
        erj1 = dui.a(erj1.a());
        if (TextUtils.equals(erj1.getCardType(), "Cash"))
        {
            return;
        }
        gsa gsa1 = gsa.a(this, erj1.getTokenType());
        boolean flag2;
        if (u != null && u.equals(erj1.getUuid()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (gsa1 != null && gsa1.p())
        {
            Client client = i.c();
            boolean flag;
            boolean flag1;
            if (client != null && client.getPaymentProfiles() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (client.getPaymentProfiles().size() > 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            } else
            {
                flag1 = true;
            }
            if (!k.a(dbf.bZ) || !r.k())
            {
                flag3 = false;
            }
            startActivityForResult(gsa1.a(erj1, PaymentEditOptions.create(flag1, flag3, flag2)), 5004);
            return;
        } else
        {
            flag1 = "com.ubercab.ACTION_AUTHORIZE_PAYMENT".equals(s);
            a(erj1.getUuid(), flag1, flag2);
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0)
            {
                getSupportFragmentManager().popBackStack();
                return true;
            } else
            {
                finish();
                return true;
            }
        }
        if (menuitem.getItemId() == 0x7f0e06b2)
        {
            if (s.equals("com.ubercab.SCAN_CARD"))
            {
                r();
                return true;
            } else
            {
                h.a(n.m);
                f();
                return true;
            }
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        E.b();
        if (t != null)
        {
            t.b();
        }
        if (C != null)
        {
            C.b();
        }
        if (D != null)
        {
            D.b();
        }
    }

    public void onPayBillResponseEvent(dmk dmk1)
    {
        u();
        if (!dmk1.e())
        {
            PaymentFragment paymentfragment = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
            if (paymentfragment != null)
            {
                paymentfragment.h();
            }
            a_(dmk1.a(this));
            return;
        } else
        {
            h.a(l.P);
            finish();
            return;
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!n.n())
        {
            dar1 = dar1.a().getClient().getStatus();
            if ("com.ubercab.SELECT_PAYMENT".equals(s) && !"Looking".equals(dar1))
            {
                setResult(0);
                finish();
                return;
            }
            if ("com.ubercab.CHANGE_PAYMENT".equals(s) && !"WaitingForPickup".equals(dar1) && !"OnTrip".equals(dar1))
            {
                setResult(0);
                finish();
                return;
            }
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        s = bundle.getString("com.ubercab.ACTION");
        u = bundle.getString("com.ubercab.EXTRA_CURRENT_PAYMENT_UUID");
        A = (MaskedWallet)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        v = (RiderTripExpenseInfo)bundle.getParcelable("com.ubercab.EXPENSE_INFO");
        x = bundle.getBoolean("com.ubercab.USE_CREDITS");
        y = bundle.getBoolean("com.ubercab.USE_POINTS");
        z = bundle.getParcelableArrayList("com.ubercab.UNPAID_BILLS");
        if (p != null && p.f())
        {
            B = p.a(bundle.getString("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID"));
        }
    }

    public void onResume()
    {
        super.onResume();
        E = j.f().c(new eps(this, (byte)0));
        if (s.equals("com.ubercab.CHANGE_PAYMENT") && w != null)
        {
            b(getString(0x7f070090), null);
            if (!n.o())
            {
                o.a(w, true, null);
            } else
            {
                C = q.a(w, true, null).a(ico.a()).a(new epv(this, (byte)0));
            }
            w = null;
        } else
        if (s.equals("com.ubercab.ACTION_ARREARS") && w != null && !z.isEmpty())
        {
            String s1 = ((ParcelableUnpaidBill)z.get(0)).getUuid();
            a(w, s1);
            w = null;
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.ACTION", s);
        bundle.putString("com.ubercab.EXTRA_CURRENT_PAYMENT_UUID", u);
        bundle.putParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", A);
        bundle.putParcelable("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(v));
        bundle.putBoolean("com.ubercab.USE_CREDITS", x);
        bundle.putBoolean("com.ubercab.USE_POINTS", y);
        bundle.putParcelableArrayList("com.ubercab.UNPAID_BILLS", z);
        if (B != null)
        {
            bundle.putString("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID", B.getUuid());
        }
    }

    public void onScanCardEvent(ero ero)
    {
        r();
    }

    public void onSelectExpenseInfoEvent(erp erp1)
    {
        startActivityForResult(ExpenseInfoActivity.a(this, v, erp1.a(), erp1.c()), 5005);
        h.a(n.af);
    }

    public void onSelectGoogleWalletEvent(erq erq)
    {
        String s1;
        byte byte0;
        if (s.equals("com.ubercab.SELECT_PAYMENT") && A != null)
        {
            erq = g();
            erq.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", A);
            erq.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid());
            b(erq);
            return;
        }
        erq = new Intent(this, com/ubercab/client/core/vendor/google/GoogleWalletActivity);
        erq.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", A);
        s1 = s;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 140
    //                   -956851128: 185
    //                   -533285754: 213
    //                   -395009795: 227
    //                   280998292: 241
    //                   1982558762: 199;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte0;
        JVM INSTR tableswitch 0 4: default 176
    //                   0 255
    //                   1 255
    //                   2 255
    //                   3 266
    //                   4 277;
           goto _L7 _L8 _L8 _L8 _L9 _L10
_L7:
        startActivityForResult(erq, 5006);
        return;
_L2:
        if (s1.equals("com.ubercab.CHANGE_PAYMENT"))
        {
            byte0 = 0;
        }
          goto _L1
_L6:
        if (s1.equals("com.ubercab.CHANGE_DEFAULT_PAYMENT"))
        {
            byte0 = 1;
        }
          goto _L1
_L3:
        if (s1.equals("com.ubercab.ACTION_ARREARS"))
        {
            byte0 = 2;
        }
          goto _L1
_L4:
        if (s1.equals("com.ubercab.MANAGE_PAYMENT"))
        {
            byte0 = 3;
        }
          goto _L1
_L5:
        if (s1.equals("com.ubercab.SELECT_PAYMENT"))
        {
            byte0 = 4;
        }
          goto _L1
_L8:
        erq.setAction("com.ubercab.ACTION_CREATE_PAYMENT_PROFILE");
          goto _L7
_L9:
        erq.setAction("com.ubercab.ACTION_CHANGE_MASKED_WALLET");
          goto _L7
_L10:
        erq.setAction("com.ubercab.ACTION_LOAD_MASKED_WALLET");
          goto _L7
    }

    public void onSelectPaymentProfileResponseEvent(dne dne1)
    {
        Object obj = null;
        Ping ping = (Ping)dne1.g();
        com.ubercab.client.core.model.Client client;
        Trip trip;
        String s1;
        boolean flag;
        boolean flag1;
        if (ping != null)
        {
            client = ping.getClient();
        } else
        {
            client = null;
        }
        if (ping != null)
        {
            trip = ping.getTrip();
        } else
        {
            trip = null;
        }
        flag1 = dne1.e();
        s1 = dne1.a(this);
        dne1 = obj;
        if (ping != null)
        {
            dne1 = ping.getErrorCode();
        }
        if (dne1 != null && dne1.intValue() == 460)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(client, trip, flag1, s1, flag);
    }

    public void onSelectedPaymentProfileEvent(erm erm1)
    {
        y = erm1.b();
        b(erm1.a());
    }

    public void onSelectedPromoCodeEvent(err err)
    {
        if (a(com/ubercab/client/feature/promo/PromoFragment) == null)
        {
            PromoFragment.d().show(getSupportFragmentManager(), com/ubercab/client/feature/promo/PromoFragment.getName());
        }
    }

    public void onSendExpenseToggledEvent(ers ers1)
    {
        v.setExpenseTrip(ers1.a());
        if (s.equals("com.ubercab.CHANGE_PAYMENT"))
        {
            h();
        }
        setResult(-1, g());
    }

    public void onShowIntlCcArrearsEvent(ert ert)
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) == null)
        {
            a(0x7f0e028d, PaymentFragment.a(z, u));
        }
    }

    public void onUseCreditsToggledEvent(erv erv1)
    {
        x = erv1.a();
        setResult(-1, g());
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
