// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import czq;
import dfe;
import dfp;
import eqg;
import eum;
import eun;
import eus;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.payment.paytm.v2:
//            PaytmAddFundsFragment

public class PaytmAddFundsActivity extends RiderActivity
{

    public czq h;

    public PaytmAddFundsActivity()
    {
    }

    private void a(eus eus1)
    {
        eus1.a(this);
    }

    private eus b(dfp dfp)
    {
        return eum.a().a(new dfe(this)).a(new eqg()).a(dfp).a();
    }

    private void b(String s1)
    {
        if (a(com/ubercab/client/feature/payment/paytm/v2/PaytmAddFundsFragment) == null)
        {
            a(0x7f0e028d, PaytmAddFundsFragment.a(s1), true);
        }
    }

    private void f()
    {
        PaytmAddFundsFragment paytmaddfundsfragment = (PaytmAddFundsFragment)a(com/ubercab/client/feature/payment/paytm/v2/PaytmAddFundsFragment);
        if (paytmaddfundsfragment != null)
        {
            paytmaddfundsfragment.a();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        PaytmAddFundsFragment paytmaddfundsfragment = (PaytmAddFundsFragment)a(com/ubercab/client/feature/payment/paytm/v2/PaytmAddFundsFragment);
        if (paytmaddfundsfragment != null)
        {
            paytmaddfundsfragment.a(i, j, bundle);
        }
    }

    public final volatile void a(czj czj)
    {
        a((eus)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030101);
        b().b(true);
        b(getIntent().getStringExtra("uuid"));
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public void onBackPressed()
    {
        f();
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            f();
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
