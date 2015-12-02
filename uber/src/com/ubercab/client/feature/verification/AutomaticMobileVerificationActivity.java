// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import gic;
import gid;
import gie;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationWaitFragment

public class AutomaticMobileVerificationActivity extends RiderActivity
{

    public AutomaticMobileVerificationActivity()
    {
    }

    private void a(gic gic1)
    {
        gic1.a(this);
    }

    private gic b(dfp dfp)
    {
        return gid.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gic)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030210);
        b().a(getString(0x7f07064b));
        if (a(com/ubercab/client/feature/verification/MobileVerificationWaitFragment) == null)
        {
            a(0x7f0e02b1, MobileVerificationWaitFragment.a(), true);
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
