// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.forceupgrade;

import android.content.Intent;
import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import ecr;
import ecs;
import ecv;

// Referenced classes of package com.ubercab.client.feature.forceupgrade:
//            ForceUpgradeFragment

public class ForceUpgradeActivity extends RiderActivity
{

    public ForceUpgradeActivity()
    {
    }

    private void a(ecv ecv1)
    {
        ecv1.a(this);
    }

    private ecv b(dfp dfp)
    {
        return ecr.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(String s1)
    {
        if (a(com/ubercab/client/feature/forceupgrade/ForceUpgradeFragment) == null)
        {
            a(0x7f0e0138, ForceUpgradeFragment.a(s1), false);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ecv)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03006c);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            b(bundle.getString("forceUpgradeUrl"));
            return;
        } else
        {
            b(((String) (null)));
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
