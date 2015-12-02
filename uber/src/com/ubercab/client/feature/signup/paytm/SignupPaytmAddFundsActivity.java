// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.paytm;

import android.app.Application;
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
import fno;
import fnp;
import fnw;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.signup.paytm:
//            SignupPaytmAddFundsFragment

public class SignupPaytmAddFundsActivity extends RiderActivity
{

    public czq h;

    public SignupPaytmAddFundsActivity()
    {
    }

    public static Intent a(Application application, String s1)
    {
        application = new Intent(application, com/ubercab/client/feature/signup/paytm/SignupPaytmAddFundsActivity);
        application.putExtra("uuid", s1);
        return application;
    }

    private void a(fnw fnw1)
    {
        fnw1.a(this);
    }

    private fnw b(dfp dfp)
    {
        return fno.a().a(new dfe(this)).a(dfp).a(new eqg()).a();
    }

    private void b(String s1)
    {
        if (a(com/ubercab/client/feature/signup/paytm/SignupPaytmAddFundsFragment) == null)
        {
            a(0x7f0e028d, SignupPaytmAddFundsFragment.a(s1), true);
        }
    }

    private void f()
    {
        SignupPaytmAddFundsFragment signuppaytmaddfundsfragment = (SignupPaytmAddFundsFragment)a(com/ubercab/client/feature/signup/paytm/SignupPaytmAddFundsFragment);
        if (signuppaytmaddfundsfragment != null)
        {
            signuppaytmaddfundsfragment.a();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        SignupPaytmAddFundsFragment signuppaytmaddfundsfragment = (SignupPaytmAddFundsFragment)a(com/ubercab/client/feature/signup/paytm/SignupPaytmAddFundsFragment);
        if (signuppaytmaddfundsfragment != null)
        {
            signuppaytmaddfundsfragment.a(i, j, bundle);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fnw)czj);
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
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
