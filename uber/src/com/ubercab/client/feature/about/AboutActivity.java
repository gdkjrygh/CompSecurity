// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import czq;
import dfe;
import dfp;
import dxh;
import dxm;
import dxr;
import dxs;
import dye;
import dyf;
import dyg;
import dyh;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.about:
//            AboutFragment, OtherFragment, WebViewFragment

public class AboutActivity extends RiderActivity
{

    public czq h;

    public AboutActivity()
    {
    }

    private void a(dxh dxh1)
    {
        dxh1.a(this);
    }

    private dxh b(dfp dfp)
    {
        return dxr.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/about/AboutFragment) == null)
        {
            a(0x7f0e0081, AboutFragment.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dxh)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030026);
        f();
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c && getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            getSupportFragmentManager().popBackStack();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onSelectLegalEvent(dye dye)
    {
        if (a(dxm) == null)
        {
            a(0x7f0e0081, dxm.a());
        }
    }

    public void onSelectOtherEvent(dyf dyf)
    {
        if (a(com/ubercab/client/feature/about/OtherFragment) == null)
        {
            a(0x7f0e0081, OtherFragment.a());
        }
    }

    public void onSelectPdfEvent(dyg dyg1)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dyg1.a())));
    }

    public void onSelectWebViewEvent(dyh dyh1)
    {
        if (a(com/ubercab/client/feature/about/WebViewFragment) == null)
        {
            a(0x7f0e0081, WebViewFragment.a(dyh1.a(), dyh1.b(), dyh1.c()));
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
