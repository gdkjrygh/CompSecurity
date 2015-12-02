// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.paytm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.PaymentProfile;
import czj;
import dfe;
import dfp;
import dui;
import fnu;
import fnv;
import foc;
import fod;
import java.util.List;

public class SignupPaytmOtpActivity extends RiderActivity
{

    public SignupPaytmOtpActivity()
    {
    }

    public static Intent a(Context context, String s1)
    {
        context = new Intent(context, com/ubercab/client/feature/signup/paytm/SignupPaytmOtpActivity);
        context.putExtra("uuid", s1);
        return context;
    }

    private void a(foc foc1)
    {
        foc1.a(this);
    }

    public static boolean a(List list)
    {
        return list != null && !list.isEmpty() && dui.b((PaymentProfile)list.get(0));
    }

    private foc b(dfp dfp)
    {
        return fnu.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(String s1)
    {
        if (a(fod) == null)
        {
            a(0x7f0e028d, fod.a(s1), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((foc)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030103);
        b(getIntent().getStringExtra("uuid"));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
