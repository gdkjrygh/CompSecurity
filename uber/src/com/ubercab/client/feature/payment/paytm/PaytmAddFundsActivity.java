// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.PaymentProfile;
import czj;
import czq;
import dbf;
import dfe;
import dfp;
import dui;
import eqg;
import esw;
import esx;
import eto;
import gmg;
import java.util.Collection;
import java.util.Collections;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmAddFundsFragment

public class PaytmAddFundsActivity extends RiderActivity
{

    public chp h;
    public czq i;

    public PaytmAddFundsActivity()
    {
    }

    public static Intent a(Context context, gmg gmg1, String s1)
    {
        return b(context, gmg1, s1);
    }

    private void a(eto eto1)
    {
        eto1.a(this);
    }

    private void a(String s1, int j, boolean flag)
    {
        if (a(com/ubercab/client/feature/payment/paytm/PaytmAddFundsFragment) != null)
        {
            return;
        } else
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (PaytmAddFundsFragment.a(s1, j, flag))), true);
            return;
        }
    }

    public static boolean a(PaymentProfile paymentprofile)
    {
        return dui.b(paymentprofile);
    }

    private static Intent b(Context context, gmg gmg1, String s1)
    {
        return c(context, gmg1, s1);
    }

    private eto b(dfp dfp)
    {
        return esw.a().a(new dfe(this)).a(new eqg()).a(dfp).a();
    }

    private static Intent c(Context context, gmg gmg1, String s1)
    {
        if (gmg1.b(dbf.be))
        {
            context = new Intent(context, com/ubercab/client/feature/payment/paytm/PaytmAddFundsActivity);
            context.putExtra("uuid", s1);
            context.putExtra("default_value", 0);
            context.putExtra("show_promo_option", false);
            return context;
        } else
        {
            context = new Intent(context, com/ubercab/client/feature/payment/paytm/v2/PaytmAddFundsActivity);
            context.putExtra("uuid", s1);
            return context;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int j, int k, Bundle bundle)
    {
        super.a(j, k, bundle);
        bundle = (PaytmAddFundsFragment)a(com/ubercab/client/feature/payment/paytm/PaytmAddFundsFragment);
        if (bundle != null)
        {
            bundle.a(j, k);
        }
    }

    public final volatile void a(czj czj)
    {
        a((eto)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030101);
        bundle = getIntent().getStringExtra("uuid");
        int j = getIntent().getIntExtra("default_value", 0);
        boolean flag = getIntent().getBooleanExtra("show_promo_option", false);
        b().b(true);
        a(bundle, j, flag);
    }

    protected final Collection e()
    {
        return Collections.singleton(i);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            h.a(n.jI);
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
