// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.PaymentProfile;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.vendor.alipay.model.AlipayCredentials;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.client.feature.payment.paytm.PaytmOrCcFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Profile;
import czj;
import czq;
import dbf;
import dfe;
import dfp;
import dkn;
import dlo;
import duh;
import dul;
import eni;
import enp;
import enq;
import enw;
import eoc;
import eod;
import epx;
import eqg;
import erh;
import erl;
import erq;
import eyy;
import gmg;
import gsa;
import hkr;
import hoc;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l;

// Referenced classes of package com.ubercab.client.feature.payment:
//            AddPaymentFragment, ChoosePaymentFragment

public class AddPaymentActivity extends RiderActivity
    implements enq, enw
{

    private static final long p;
    public chp h;
    public cev i;
    public hkr j;
    public gmg k;
    public czq l;
    public dkn m;
    public eyy n;
    public hoc o;
    private Profile q;

    public AddPaymentActivity()
    {
    }

    public static Intent a(Context context, Profile profile)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/AddPaymentActivity);
        context.putExtra("com.ubercab.client.feature.payment.ADD_SHOW_GOOGLE_WALLET", true);
        if (profile != null)
        {
            context.putExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID", profile.getUuid());
        }
        return context;
    }

    private static String a(Ping ping)
    {
        if (dul.a(ping) && ping.getApiResponse() != null)
        {
            ping = ping.getApiResponse().getData();
            if (ping != null && ping.containsKey("uuid"))
            {
                return String.valueOf(ping.get("uuid"));
            }
        }
        return null;
    }

    private void a(AlipayCredentials alipaycredentials)
    {
        b(getString(0x7f07004f), null);
        m.b(alipaycredentials.getAccountId(), alipaycredentials.getMobile());
    }

    private void a(eni eni1)
    {
        eni1.a(this);
    }

    private void a(boolean flag)
    {
        if (a(com/ubercab/client/feature/payment/AddPaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (AddPaymentFragment.c(flag))), true);
            return;
        }
    }

    private com.ubercab.rider.realtime.model.PaymentProfile b(String s1)
    {
        Object obj = null;
        Client client = j.c();
        if (client != null)
        {
            s1 = client.findPaymentProfileByUuid(s1);
            obj = s1;
            if (s1 == null)
            {
                obj = client.getLastSelectedPaymentProfile();
            }
        }
        return ((com.ubercab.rider.realtime.model.PaymentProfile) (obj));
    }

    private eni b(dfp dfp)
    {
        return eoc.n().a(new dfe(this)).a(new eqg()).a(dfp).a();
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/payment/ChoosePaymentFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, ChoosePaymentFragment.a(), true);
            return;
        }
    }

    private void h()
    {
        if (a(enp) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, enp.a(), true);
            return;
        }
    }

    private void i()
    {
        if (a(com/ubercab/client/feature/payment/paytm/PaytmOrCcFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, PaytmOrCcFragment.a(), true);
            return;
        }
    }

    private void j()
    {
        epx epx1 = (epx)a(com/ubercab/client/feature/payment/AddPaymentFragment);
        if (epx1 != null)
        {
            epx1.b();
        }
        epx1 = (epx)a(com/ubercab/client/feature/payment/paytm/PaytmOrCcFragment);
        if (epx1 != null)
        {
            epx1.b();
        }
        epx1 = (epx)a(enp);
        if (epx1 != null)
        {
            epx1.b();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eni)czj);
    }

    public final void a(gsa gsa1)
    {
        byte byte0;
        gsa1 = gsa1.a();
        byte0 = -1;
        gsa1.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -1414960566: 101
    //                   -920235116: 73
    //                   106444065: 87;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_101;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            a(false);
            return;

        case 1: // '\001'
            i();
            return;

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_126;
_L3:
        if (gsa1.equals("braintree"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (gsa1.equals("paytm"))
        {
            byte0 = 1;
        }
          goto _L5
        if (gsa1.equals("alipay"))
        {
            byte0 = 2;
        }
          goto _L5
        if (k.a(dbf.z))
        {
            o.a(com/ubercab/client/feature/payment/alipay/AlipayVerificationCodeReceiver, p);
        }
        startActivityForResult(new Intent(this, com/ubercab/client/feature/payment/alipay/AddAlipayActivity), 600);
        return;
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        if (n.f())
        {
            q = n.a(getIntent().getStringExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID"));
        }
        setContentView(0x7f0300f0);
        b().b(true);
        Client client = j.c();
        if (client != null)
        {
            bundle = client.getMobileCountryIso2();
        } else
        {
            bundle = "";
        }
        if (duh.c(k))
        {
            h();
            return;
        }
        if (duh.a(k, bundle))
        {
            g();
            return;
        }
        if (PaytmOrCcFragment.a(client))
        {
            i();
            return;
        } else
        {
            a(getIntent().getBooleanExtra("com.ubercab.client.feature.payment.ADD_SHOW_GOOGLE_WALLET", false));
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    public final void f()
    {
        setResult(-1);
        finish();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 600 && j1 == -1)
        {
            a((AlipayCredentials)intent.getParcelableExtra("alipay_credentials"));
        } else
        if (i1 == 700 && j1 == -1)
        {
            intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", PaymentProfile.GOOGLE_WALLET.getUuid());
            setResult(-1, intent);
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        j();
        super.onBackPressed();
    }

    public void onChooseInternationalCreditCardEvent(erh erh)
    {
        a(false);
    }

    public void onCreatePaymentProfileResponseEvent(dlo dlo1)
    {
        u();
        if (dlo1.e())
        {
            dlo1 = a((Ping)dlo1.g());
            i.c(new erl(dlo1));
            return;
        } else
        {
            h.a(l.dN);
            a_(dlo1.a(this));
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            j();
            setResult(0);
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPaymentProfileAddedEvent(erl erl1)
    {
        Intent intent = new Intent();
        erl1 = b(erl1.a());
        if (erl1 != null)
        {
            intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", erl1.getUuid());
            if (n.f() && q != null)
            {
                intent.putExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID", q.getUuid());
            }
        }
        h.a(l.dO);
        setResult(-1, intent);
        finish();
    }

    public void onSelectGoogleWalletEvent(erq erq)
    {
        erq = new Intent(this, com/ubercab/client/core/vendor/google/GoogleWalletActivity);
        erq.setAction("com.ubercab.ACTION_LOAD_MASKED_WALLET");
        startActivityForResult(erq, 700);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }

    static 
    {
        p = TimeUnit.MINUTES.toMillis(30L);
    }
}
