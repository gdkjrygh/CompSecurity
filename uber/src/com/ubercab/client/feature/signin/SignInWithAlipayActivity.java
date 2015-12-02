// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.client.feature.signup.ThirdPartyToken;
import cwm;
import czj;
import dfe;
import dfp;
import dkn;
import dld;
import dul;
import fjm;
import fjn;
import fka;

public class SignInWithAlipayActivity extends RiderActivity
{

    public dkn h;

    public SignInWithAlipayActivity()
    {
    }

    public static Intent a(Context context, ThirdPartyToken thirdpartytoken)
    {
        return (new Intent(context, com/ubercab/client/feature/signin/SignInWithAlipayActivity)).putExtra("com.ubercab.ACCESS_TOKEN", thirdpartytoken);
    }

    private void a(SignupData signupdata)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.SIGNUP_DATA", signupdata);
        setResult(-1, intent);
        finish();
    }

    private void a(fka fka1)
    {
        fka1.a(this);
    }

    private fka b(dfp dfp)
    {
        return fjm.a().a(dfp).a(new dfe(this)).a();
    }

    private void f()
    {
        setResult(1001);
        finish();
    }

    private void g()
    {
        cwm.a(this, 0x7f070082);
        finish();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fka)czj);
    }

    protected final void b(Bundle bundle)
    {
label0:
        {
            super.b(bundle);
            if (bundle == null)
            {
                bundle = (ThirdPartyToken)getIntent().getParcelableExtra("com.ubercab.ACCESS_TOKEN");
                if (bundle == null)
                {
                    break label0;
                }
                h.a(bundle.e(), bundle.d(), bundle.a(), bundle.c());
            }
            b(getString(0x7f070434), null);
            return;
        }
        g();
    }

    public void onThirdPartyLoginResonseEvent(dld dld1)
    {
        if (!dld1.e())
        {
            g();
            return;
        }
        dld1 = (Ping)dld1.g();
        if (dul.a(dld1) || dld1.getThirdPartyConnected())
        {
            f();
            return;
        }
        if (dld1.getSignupFieldsRequired() != null)
        {
            a(SignupData.a(dld1.getSignupFieldsRequired()));
            return;
        } else
        {
            g();
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
