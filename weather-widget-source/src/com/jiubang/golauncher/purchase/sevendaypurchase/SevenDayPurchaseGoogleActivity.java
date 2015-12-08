// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.purchase.sevendaypurchase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.gau.go.launcherex.gowidget.statistics.s;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.jiubang.golauncher.a.a.a.c;
import com.jiubang.golauncher.a.a.a.e;
import com.jiubang.golauncher.a.a.a.h;
import java.util.Iterator;
import java.util.List;

public class SevenDayPurchaseGoogleActivity extends FragmentActivity
    implements e
{

    private c a;
    private long b;
    private boolean c;
    private f d;
    private s e;

    public SevenDayPurchaseGoogleActivity()
    {
    }

    private void a(String s1)
    {
        long l = System.currentTimeMillis();
        if (l - b >= 800L)
        {
            if (a != null)
            {
                a.c(s1);
            }
            b = l;
        }
    }

    private boolean a(boolean flag)
    {
        if (!"".equals("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1"))
        {
            if (d.a("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1", flag))
            {
                d.b("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1");
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void a()
    {
    }

    public void a(int i, Throwable throwable)
    {
        finish();
    }

    public void a(Bundle bundle)
    {
        Log.i("wss", "onBillingDialogShow");
    }

    public void a(String s1, int i)
    {
        Log.i("wss", "onBillingResponseCodeReturn");
        Log.i("wss", (new StringBuilder()).append("productId = ").append(s1).toString());
        Log.i("wss", (new StringBuilder()).append("responseCode = ").append(i).toString());
    }

    public void a(String s1, h h)
    {
        Log.i("wss", "onProductPurchased = onProductPurchased0");
        if (a == null)
        {
            return;
        }
        Log.i("wss", "onProductPurchased = onProductPurchased1");
        h = a.e();
        if (!h.isEmpty() && h.size() > 0)
        {
            h = h.iterator();
            do
            {
                if (!h.hasNext())
                {
                    break;
                }
                String s2 = (String)h.next();
                Log.i("wss", (new StringBuilder()).append("SevenDayPurchaseGoogleActivity onProductPurchased \u8D2D\u4E70\u6210\u529F:").append(s2).toString());
                if (a != null && "function_pro_one_week_trial".equals(s2))
                {
                    a(true);
                    e.b();
                    Log.i("wss", "SevenDayPurchaseGoogleActivity onProductPurchased \u8D2D\u4E70\u6210\u529F");
                }
            } while (true);
        }
        Log.i("wss", (new StringBuilder()).append("SevenDayPurchaseGoogleActivity onProductPurchased productId\uFF1A").append(s1).toString());
        finish();
    }

    public void b()
    {
        Object obj;
        if (a == null)
        {
            return;
        }
        Log.i("wss", "onBillingInitialized");
        obj = a.e();
        if (((List) (obj)).isEmpty() || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = (String)((Iterator) (obj)).next();
        Log.i("wss", (new StringBuilder()).append("SevenDayPurchaseGoogleActivity onBillingInitialized \u8D2D\u4E70\uFF1A").append(s1).toString());
        if (a == null || !s1.equals("function_pro_one_week_trial")) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L9:
        if (!flag)
        {
            Log.i("wss", "SevenDayPurchaseGoogleActivity onBillingInitialized \u6CA1\u6709\u8D2D\u4E70");
            a(false);
        } else
        {
            Log.i("wss", "SevenDayPurchaseGoogleActivity onBillingInitialized \u53BB\u9664\u5E7F\u544A");
            a(true);
            e.b();
        }
_L7:
        if (!c && !flag)
        {
            a("function_pro_one_week_trial");
            Log.i("wss", "SevenDayPurchaseGoogleActivity onBillingInitialized \u8D2D\u4E70\u6D41\u7A0B");
            return;
        } else
        {
            Log.i("wss", "SevenDayPurchaseGoogleActivity onBillingInitialized \u9A8C\u8BC1\u6D41\u7A0B");
            finish();
            return;
        }
_L2:
        Log.i("wss", "SevenDayPurchaseGoogleActivity onBillingInitialized \u8D2D\u4E70\u4FE1\u606F\u4E3A\u7A7A");
        flag = false;
          goto _L7
_L4:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        Log.i("wss", "sevent_onActivityResult");
        if (!a.a(i, j, intent))
        {
            super.onActivityResult(i, j, intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = new c(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjMLLCo3hpiezV/bPOi83lz3DktmKGQpvsxjE10fF1h+L62vnazigqi+P6m4NFO+jOFT5RX0VPM9SzM6vCGOo9Xjjuk219queZr9SQUKoytfMTsgrtcI1YGDy9maP1owggij0hxWfaBsP4375zP+R89Pzz0R9Ap2tmLLlfIzRZPwqPcnONlQ/8ZqfdxWwCiOOOLHQJ4k1aN6jUPx8ipKWFxo7ORI0TmqgiJvhsFJuBr6QCqoN2BF6QgOfz6fMac1e+EaeJD3/pzUsuzzvvEnh70aoq+6mqZyZmyJb4840OddTGUHX8z3Qeoa/Dti+YQiXtSO3T2ANuF9pzkyBIAQQLwIDAQAB", this);
        e = s.a(getApplicationContext());
        d = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).e();
        if (getIntent() != null)
        {
            c = getIntent().getBooleanExtra("isfromcheckpay", false);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (a != null)
        {
            a.c();
        }
    }
}
