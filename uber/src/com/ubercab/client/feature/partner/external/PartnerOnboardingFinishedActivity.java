// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.partner.external;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import elq;
import elr;
import elv;

// Referenced classes of package com.ubercab.client.feature.partner.external:
//            PartnerOnboardingFinishedFragment

public class PartnerOnboardingFinishedActivity extends RiderActivity
{

    public PartnerOnboardingFinishedActivity()
    {
    }

    private void a(elv elv1)
    {
        elv1.a(this);
    }

    private elv b(dfp dfp)
    {
        return elq.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        a(0x7f0e026f, new PartnerOnboardingFinishedFragment(), true);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((elv)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300e4);
        if (b() != null)
        {
            b().b(true);
            b().a(0x7f070257);
        }
        f();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
