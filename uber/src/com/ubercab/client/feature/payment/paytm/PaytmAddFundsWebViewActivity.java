// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import eta;
import etb;
import etu;
import eul;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmAddFundsWebViewFragment

public class PaytmAddFundsWebViewActivity extends RiderActivity
{

    public PaytmAddFundsWebViewActivity()
    {
    }

    private static Intent a(Context context, int i, String s1, String s2, String s3)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/paytm/PaytmAddFundsWebViewActivity);
        context.putExtra("source", i);
        context.putExtra("post_data", s3);
        context.putExtra("title", s1);
        context.putExtra("url", s2);
        return context;
    }

    public static Intent a(Context context, String s1, String s2, String s3)
    {
        return a(context, 0, s1, s2, s3);
    }

    private void a(int i, String s1, String s2)
    {
        if (a(com/ubercab/client/feature/payment/paytm/PaytmAddFundsWebViewFragment) == null)
        {
            a(0x7f0e028d, ((android.support.v4.app.Fragment) (PaytmAddFundsWebViewFragment.a(i, s1, s2))), true);
        }
    }

    private void a(etu etu1)
    {
        etu1.a(this);
    }

    public static Intent b(Context context, String s1, String s2, String s3)
    {
        return a(context, 2, s1, s2, s3);
    }

    private etu b(dfp dfp)
    {
        return eta.a().a(new dfe(this)).a(dfp).a();
    }

    public static Intent c(Context context, String s1, String s2, String s3)
    {
        return a(context, 1, s1, s2, s3);
    }

    public static Intent d(Context context, String s1, String s2, String s3)
    {
        return a(context, 2, s1, s2, s3);
    }

    private void f()
    {
        PaytmAddFundsWebViewFragment paytmaddfundswebviewfragment = (PaytmAddFundsWebViewFragment)a(com/ubercab/client/feature/payment/paytm/PaytmAddFundsWebViewFragment);
        if (paytmaddfundswebviewfragment != null)
        {
            paytmaddfundswebviewfragment.b();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((etu)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030102);
        b().b(true);
        b().a(getIntent().getStringExtra("title"));
        a(getIntent().getIntExtra("source", 0), getIntent().getStringExtra("url"), getIntent().getStringExtra("post_data"));
    }

    public void onBackPressed()
    {
        PaytmAddFundsWebViewFragment paytmaddfundswebviewfragment = (PaytmAddFundsWebViewFragment)a(com/ubercab/client/feature/payment/paytm/PaytmAddFundsWebViewFragment);
        if (paytmaddfundswebviewfragment != null && paytmaddfundswebviewfragment.a())
        {
            return;
        } else
        {
            f();
            super.onBackPressed();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            f();
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPaytmAddFundsCompleteEvent(eul eul1)
    {
        Intent intent = new Intent();
        intent.putExtra("error_message", eul1.b());
        byte byte0;
        if (eul1.a())
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        setResult(byte0, intent);
        finish();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
