// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.promo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import eva;
import evb;
import evg;

// Referenced classes of package com.ubercab.client.feature.payment.promo:
//            TripBalancesFragment

public class TripBalancesActivity extends RiderActivity
{

    public TripBalancesActivity()
    {
    }

    private void a(evg evg1)
    {
        evg1.a(this);
    }

    private evg b(dfp dfp)
    {
        return eva.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((evg)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030124);
        b().b(true);
        a(0x7f0e0346, TripBalancesFragment.a(), true);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
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
