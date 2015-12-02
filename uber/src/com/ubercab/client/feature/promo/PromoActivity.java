// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo;

import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import czq;
import dfe;
import dfp;
import fai;
import faj;
import fam;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.promo:
//            PromoFragment

public class PromoActivity extends RiderActivity
{

    public czq h;

    public PromoActivity()
    {
    }

    private void a(fam fam1)
    {
        fam1.a(this);
    }

    private fam b(dfp dfp)
    {
        return fai.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/promo/PromoFragment) == null)
        {
            a(0x7f0e03f1, new PromoFragment(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        if (i == 1321 && j == -1)
        {
            bundle = (PromoFragment)a(com/ubercab/client/feature/promo/PromoFragment);
            if (bundle != null)
            {
                bundle.a(true);
            }
        }
    }

    public final volatile void a(czj czj)
    {
        a((fam)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030159);
        f();
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
