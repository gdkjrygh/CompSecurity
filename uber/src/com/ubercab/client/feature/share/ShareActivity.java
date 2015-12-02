// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czf;
import czj;
import czq;
import dal;
import dbf;
import dbu;
import dfe;
import dfp;
import fho;
import fhp;
import fia;
import fih;
import gmg;
import java.util.Collection;
import java.util.Collections;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.share:
//            ShareFragment, LegacyShareFragment, SendToContactsActivity, ConfirmContactsDialogFragment

public class ShareActivity extends RiderActivity
{

    public chp h;
    public cev i;
    public czf j;
    public gmg k;
    public czq l;
    public dal m;

    public ShareActivity()
    {
    }

    private void a(fia fia1)
    {
        fia1.a(this);
    }

    private fia b(dfp dfp)
    {
        return fho.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/share/ShareFragment) == null)
        {
            a(0x7f0e045d, new ShareFragment(), true);
        }
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/share/LegacyShareFragment) == null)
        {
            a(0x7f0e045d, new LegacyShareFragment(), true);
        }
    }

    private void h()
    {
        Intent intent = new Intent(this, com/ubercab/client/feature/share/SendToContactsActivity);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
label0:
        {
            super.a(i1, j1, bundle);
            if (i1 == 1)
            {
                if (j1 != -1)
                {
                    break label0;
                }
                h.a(n.fe);
                m.c();
                h();
            }
            return;
        }
        h.a(n.fd);
        i.c(new fih());
    }

    public final volatile void a(czj czj)
    {
        a((fia)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030173);
        if (j.z() || k.a(dbf.cH, dbu.a))
        {
            b().a(getString(0x7f0703fa).toUpperCase());
            f();
            return;
        } else
        {
            b().a(getString(0x7f0703e8));
            g();
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    protected void onNewIntent(Intent intent)
    {
label0:
        {
            super.onNewIntent(intent);
            if (intent.getBooleanExtra("com.ubercab.EXTRA_CONFIRM_DIALOG", false))
            {
                setIntent(intent);
                if (m.b() || !k.a(dbf.cI, dbu.b))
                {
                    break label0;
                }
                h.a(l.gx);
                ConfirmContactsDialogFragment.a(this);
            }
            return;
        }
        h();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
