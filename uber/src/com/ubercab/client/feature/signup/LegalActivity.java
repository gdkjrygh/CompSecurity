// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.about.WebViewFragment;
import czj;
import dfe;
import dfp;
import dxm;
import dyh;
import fkk;
import fkl;
import fli;
import fmj;

public class LegalActivity extends RiderActivity
{

    public LegalActivity()
    {
    }

    private void a(fli fli1)
    {
        fli1.a(this);
    }

    private fli b(dfp dfp)
    {
        return fkk.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(dxm) == null)
        {
            a(0x7f0e0174, fmj.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fli)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03008a);
        b().b(true);
        f();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0)
            {
                getSupportFragmentManager().popBackStack();
            } else
            {
                finish();
            }
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onSelectWebViewEvent(dyh dyh1)
    {
        if (a(com/ubercab/client/feature/about/WebViewFragment) == null)
        {
            a(0x7f0e0174, WebViewFragment.a(dyh1.a(), dyh1.b()));
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
