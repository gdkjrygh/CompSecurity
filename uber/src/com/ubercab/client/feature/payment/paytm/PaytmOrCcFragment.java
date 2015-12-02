// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.Button;
import czb;
import czj;
import dar;
import dcg;
import dfp;
import djb;
import dkn;
import dlo;
import dpg;
import dui;
import dul;
import eni;
import epx;
import erh;
import erl;
import etg;
import eth;
import etz;
import eua;
import eub;
import gka;
import gki;
import hkj;
import hku;
import ica;
import icl;
import ico;
import java.util.Map;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmOtpActivity

public class PaytmOrCcFragment extends czb
    implements epx
{

    public chp c;
    public Application d;
    public cev e;
    public hku f;
    public hkj g;
    public dpg h;
    public dkn i;
    public String j;
    public String k;
    private icl l;
    private icl m;
    Button mButtonPaytm;

    public PaytmOrCcFragment()
    {
    }

    public static PaytmOrCcFragment a()
    {
        return new PaytmOrCcFragment();
    }

    public static void a(PaytmOrCcFragment paytmorccfragment, boolean flag)
    {
        paytmorccfragment.a(flag);
    }

    private void a(eub eub1)
    {
        eub1.a(this);
    }

    private void a(String s, String s1)
    {
        b(getString(0x7f070052));
        if (!h.e())
        {
            i.c(s, s1);
            return;
        } else
        {
            l = g.b(s, s1).a(ico.a()).a(new eua(this, (byte)0));
            return;
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            mButtonPaytm.setEnabled(false);
            mButtonPaytm.setText(getString(0x7f07036f));
        }
    }

    public static boolean a(Client client)
    {
        return b(client) && client.getMobileCountryIso2().equalsIgnoreCase(dcg.c.a());
    }

    private static boolean b(Client client)
    {
        return client != null && !TextUtils.isEmpty(client.getUuid());
    }

    private eub g()
    {
        return etg.a().a(new djb(this)).a((eni)((AddPaymentActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return g();
    }

    public final volatile void a(czj czj)
    {
        a((eub)czj);
    }

    public final void b()
    {
        c.a(n.cL);
    }

    public final cic f()
    {
        return l.dY;
    }

    public void onClickIntlCreditCard()
    {
        c.a(n.cm);
        e.c(new erh());
    }

    public void onClickPaytm()
    {
        c.a(n.cn);
        a(j, k);
    }

    public void onCreatePaymentProfileResponseEvent(dlo dlo1)
    {
        e();
        if (dlo1.e())
        {
            dlo1 = ((Ping)dlo1.g()).getApiResponse().getData();
            if (dlo1 != null)
            {
                dlo1 = (String)dlo1.get("uuid");
                startActivity(PaytmOtpActivity.a(d, dlo1));
            }
            e.c(new erl());
            return;
        } else
        {
            c(dlo1.a(getActivity()));
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030116, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        m.b();
        if (l != null)
        {
            l.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!h.n())
        {
            if (dul.a(dar1 = dar1.a()))
            {
                dar1 = dar1.getClient();
                j = dar1.getEmail();
                k = dar1.getMobileDigits();
                a(gki.b(dar1.getPaymentProfiles(), new gka() {

                    final PaytmOrCcFragment a;

                    private static boolean a(PaymentProfile paymentprofile)
                    {
                        return dui.b(paymentprofile);
                    }

                    public final boolean apply(Object obj)
                    {
                        return a((PaymentProfile)obj);
                    }

            
            {
                a = PaytmOrCcFragment.this;
                super();
            }
                }));
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        m = f.d().c(new etz(this, (byte)0));
        d().b().a(getString(0x7f070328));
    }
}
