// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import eti;
import etj;
import eud;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmOtpFragment

public class PaytmOtpActivity extends RiderActivity
{

    public PaytmOtpActivity()
    {
    }

    public static Intent a(Context context, String s1)
    {
        return a(context, s1, false);
    }

    public static Intent a(Context context, String s1, boolean flag)
    {
        return (new Intent(context, com/ubercab/client/feature/payment/paytm/PaytmOtpActivity)).putExtra("uuid", s1).putExtra("resend_otp", flag);
    }

    private void a(eud eud1)
    {
        eud1.a(this);
    }

    private void a(String s1, boolean flag)
    {
        if (a(com/ubercab/client/feature/payment/paytm/PaytmOtpFragment) == null)
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (PaytmOtpFragment.a(s1, flag))), true);
        }
    }

    private eud b(dfp dfp)
    {
        return eti.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        PaytmOtpFragment paytmotpfragment = (PaytmOtpFragment)a(com/ubercab/client/feature/payment/paytm/PaytmOtpFragment);
        if (paytmotpfragment != null)
        {
            paytmotpfragment.a();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        bundle = (PaytmOtpFragment)a(com/ubercab/client/feature/payment/paytm/PaytmOtpFragment);
        if (bundle != null)
        {
            bundle.a(i);
        }
    }

    public final volatile void a(czj czj)
    {
        a((eud)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030103);
        bundle = getIntent().getStringExtra("uuid");
        boolean flag = getIntent().getBooleanExtra("resend_otp", false);
        b().b(true);
        a(bundle, flag);
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
            setResult(0);
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
