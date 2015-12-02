// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.baidu;

import android.content.Intent;
import android.os.Bundle;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.signup.ThirdPartyToken;
import cwm;
import czj;
import dfe;
import dfp;
import dvp;
import dvt;
import dvu;
import dvx;
import l;

// Referenced classes of package com.ubercab.client.core.vendor.baidu:
//            BaiduAuthorizationFragment

public class BaiduAuthorizationActivity extends RiderActivity
{

    public chp h;

    public BaiduAuthorizationActivity()
    {
    }

    private void a(ThirdPartyToken thirdpartytoken)
    {
        Object obj = AnalyticsEvent.create("impression").setName(l.cA).setValue("baidu:success");
        h.a(((AnalyticsEvent) (obj)));
        obj = new Intent();
        ((Intent) (obj)).putExtra("com.ubercab.ACCESS_TOKEN", thirdpartytoken);
        setResult(-1, ((Intent) (obj)));
        finish();
    }

    private void a(dvp dvp1)
    {
        dvp1.a(this);
    }

    private dvp b(dfp dfp)
    {
        return dvt.a().a(dfp).a(new dfe(this)).a();
    }

    private void f()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.cA).setValue("baidu:failure");
        h.a(analyticsevent);
        cwm.a(this, 0x7f070071);
        finish();
    }

    private void g()
    {
        if (a(com/ubercab/client/core/vendor/baidu/BaiduAuthorizationFragment) == null)
        {
            a(0x7f0e00a6, BaiduAuthorizationFragment.a(getString(0x7f0706b3)), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dvp)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030035);
        g();
    }

    public void onBackPressed()
    {
        BaiduAuthorizationFragment baiduauthorizationfragment = (BaiduAuthorizationFragment)a(com/ubercab/client/core/vendor/baidu/BaiduAuthorizationFragment);
        boolean flag;
        if (baiduauthorizationfragment != null && baiduauthorizationfragment.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            super.onBackPressed();
        }
    }

    public void onBaiduTokenEvent(dvx dvx1)
    {
        if (!dvx1.a())
        {
            f();
            return;
        }
        dvx1 = ThirdPartyToken.a("baidu", null, 60000L, getString(0x7f0706b3), dvx1.b());
        if (dvx1.f())
        {
            a(dvx1);
            return;
        } else
        {
            f();
            return;
        }
    }

    public final cic s()
    {
        return l.X;
    }
}
