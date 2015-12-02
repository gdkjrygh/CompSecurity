// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import cwz;
import czj;
import dfe;
import dfp;
import fhk;
import fhl;
import fhw;
import fhx;

public class SendToContactsActivity extends RiderActivity
{

    public SendToContactsActivity()
    {
    }

    private void a(fhw fhw1)
    {
        fhw1.a(this);
    }

    private fhw b(dfp dfp)
    {
        return fhk.a().a(new dfe(this)).a(dfp).a();
    }

    private boolean f()
    {
        cwz.a(this);
        fhx fhx1 = (fhx)a(fhx);
        return fhx1 != null && fhx1.g();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        bundle = (fhx)a(fhx);
        if (bundle != null)
        {
            bundle.a(i, j);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fhw)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030178);
        b().b(true);
        bundle = getIntent().getStringExtra("subject");
        String s1 = getIntent().getStringExtra("body");
        java.util.ArrayList arraylist = getIntent().getStringArrayListExtra("exclude");
        if (a(fhx) == null)
        {
            a(0x7f0e0466, fhx.a(bundle, s1, arraylist), true);
        }
    }

    public void onBackPressed()
    {
        if (f())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c && f())
        {
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
