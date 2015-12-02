// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import cwm;
import e;
import f;
import gsd;
import gse;
import gsg;
import gst;
import gul;
import gum;
import gvy;
import gvz;

public class Airtel2faActivity extends PaymentActivityWithInjection
{

    public chp a;
    private ProgressBar b;
    private WebView c;
    private String d;
    private String e;
    private Uri f;

    public Airtel2faActivity()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/airtel/Airtel2faActivity);
        context.putExtra("authorization_url", s);
        context.putExtra("response_url", s1);
        return context;
    }

    public static ProgressBar a(Airtel2faActivity airtel2faactivity)
    {
        return airtel2faactivity.b;
    }

    private void a(int i)
    {
        i;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 64
    //                   0 51
    //                   1 38;
           goto _L1 _L2 _L3 _L4
_L1:
        setResult(i);
        finish();
        return;
_L4:
        a.a(e.s);
        continue; /* Loop/switch isn't completed */
_L3:
        a.a(e.r);
        continue; /* Loop/switch isn't completed */
_L2:
        a.a(f.s);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void a(Airtel2faActivity airtel2faactivity, int i)
    {
        airtel2faactivity.a(i);
    }

    private void a(gul gul1)
    {
        gul1.a(this);
    }

    private void d()
    {
        c.getSettings().setJavaScriptEnabled(true);
        c.setWebViewClient(new gum(this, f));
        if (d != null)
        {
            c.loadUrl(d);
            return;
        } else
        {
            cwm.a(this, gsg.ub__payment_error_loading_url);
            a(0);
            return;
        }
    }

    private void e()
    {
        d = getIntent().getStringExtra("authorization_url");
        e = getIntent().getStringExtra("response_url");
    }

    private void f()
    {
        setContentView(gse.ub__payment_activity_airtel_2fa);
        b().b(true);
        b().a(getString(gsg.ub__payment_authorise));
        b = (ProgressBar)findViewById(gsd.ub__payment_ub__payment_activity_airtel_2fa_progressbar);
        c = (WebView)findViewById(gsd.ub__payment_ub__payment_activity_airtel_2fa_webview);
    }

    private gul h()
    {
        return gvy.a().a(new gst(getApplication())).a();
    }

    protected final volatile void a(Object obj)
    {
        a((gul)obj);
    }

    protected final Object c()
    {
        return h();
    }

    public void onBackPressed()
    {
        if (c.canGoBack())
        {
            c.goBack();
            return;
        } else
        {
            setResult(-1);
            a.a(f.s);
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e();
        f();
        try
        {
            f = Uri.parse(e);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            a(0);
            return;
        }
        d();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        c.removeAllViews();
        c.destroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            a(-1);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
