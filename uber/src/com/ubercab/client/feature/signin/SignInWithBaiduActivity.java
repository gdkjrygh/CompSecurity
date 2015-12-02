// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
import fjo;
import fjp;
import fkc;

public class SignInWithBaiduActivity extends RiderActivity
{

    public dkn h;

    public SignInWithBaiduActivity()
    {
    }

    public static Intent a(Context context, ThirdPartyToken thirdpartytoken)
    {
        return (new Intent(context, com/ubercab/client/feature/signin/SignInWithBaiduActivity)).putExtra("com.ubercab.ACCESS_TOKEN", thirdpartytoken);
    }

    private void a(SignupData signupdata)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.SIGNUP_DATA", signupdata);
        setResult(-1, intent);
        finish();
    }

    private void a(fkc fkc1)
    {
        fkc1.a(this);
    }

    private fkc b(dfp dfp)
    {
        return fjo.a().a(dfp).a(new dfe(this)).a();
    }

    private void b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            cwm.a(this, s1);
        } else
        {
            cwm.a(this, 0x7f070082);
        }
        finish();
    }

    private void f()
    {
        setResult(1001);
        finish();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fkc)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        if (bundle == null)
        {
            bundle = (ThirdPartyToken)getIntent().getParcelableExtra("com.ubercab.ACCESS_TOKEN");
            if (bundle != null)
            {
                h.a(bundle.e(), bundle.d(), bundle.a(), bundle.c());
            } else
            {
                b(((String) (null)));
            }
        }
        b(getString(0x7f070434), null);
    }

    public void onThirdPartyLoginResonseEvent(dld dld1)
    {
        if (!dld1.e())
        {
            b(dld1.f());
            return;
        }
        Ping ping = (Ping)dld1.g();
        if (dul.a(ping) || ping.getThirdPartyConnected())
        {
            f();
            return;
        }
        if (ping.getSignupFieldsRequired() != null)
        {
            a(SignupData.a(ping.getSignupFieldsRequired()));
            return;
        } else
        {
            b(dld1.f());
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
