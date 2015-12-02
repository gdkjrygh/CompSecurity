// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dbf;
import dfe;
import dfp;
import fgj;
import fgm;
import fgn;
import gmg;
import gzo;
import gzp;
import gzs;
import gzz;
import haa;
import hab;
import hac;
import ijg;
import ijj;
import java.util.List;

public class AccountPictureActivity extends RiderActivity
    implements gzs, hac
{

    public gmg h;

    public AccountPictureActivity()
    {
    }

    private void C()
    {
        haa haa1 = (new hab(600, 600)).a(getString(0x7f070355)).b(getString(0x7f070356)).a(h.a(dbf.v)).a(gzz.a).a(this).b();
        haa1.a(this);
        a(0x7f0e0099, haa1, true);
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/settings/AccountPictureActivity);
    }

    private void a(fgj fgj1)
    {
        fgj1.a(this);
    }

    private fgj b(dfp dfp)
    {
        return fgm.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(Uri uri)
    {
        setResult(-1, (new Intent()).setData(uri));
        finish();
    }

    public final volatile void a(czj czj)
    {
        a((fgj)czj);
    }

    public final void a(gzo gzo1)
    {
        if (gzo1.b() != gzp.a && gzo1.b() != gzp.e)
        {
            ijg.a(dbf.aw.name()).b(gzo1.getCause(), gzo1.getMessage(), new Object[0]);
        }
    }

    public final void a(List list)
    {
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03002f);
        bundle = b();
        int i1;
        if (h.a(dbf.aK))
        {
            i1 = 0x7f070037;
        } else
        {
            i1 = 0x7f070375;
        }
        bundle.a(getString(i1));
        C();
    }

    public final void b(List list)
    {
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    public final void h()
    {
    }

    public final void i()
    {
    }

    public final void j()
    {
    }

    public final void k()
    {
    }

    public final void l()
    {
    }

    public final void m()
    {
    }

    public final void n()
    {
    }

    public final void o()
    {
    }

    protected void onDestroy()
    {
        super.onDestroy();
        haa haa1 = (haa)a(haa);
        if (haa1 != null)
        {
            haa1.a(null);
        }
    }

    public final void p()
    {
    }

    public final void q()
    {
    }

    public final void r()
    {
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
