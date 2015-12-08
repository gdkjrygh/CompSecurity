// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Activity;
import android.content.Context;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.googleplay.Inventory;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            m, n

public class l
    implements com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabSetupFinishedListener, com.gau.go.launcherex.gowidget.googleplay.IabHelper.QueryInventoryFinishedListener
{

    private n a;
    private IabHelper b;
    private ArrayList c;
    private Context d;
    private boolean e;

    public l(Context context)
    {
        d = context;
        c = new ArrayList();
        c.add("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1");
        c.add("go_weather_ex_premium_pack_promotions");
        c.add("go_weather_ex_premium_pack_vip");
        c.add("go_weather_ex_premium_pack_vip_promo");
        c.add("go_weather_ex_premium_pack_theme_vip");
        c.add("go_weather_ex_premium_pack_theme_vip_promo");
    }

    public static void a(Activity activity, String s)
    {
        b b1 = new b(activity);
        b1.b(s);
        b1.b(0x7f08032e);
        b1.d(0x7f08032f);
        b1.a(new m(activity));
        b1.a();
    }

    private void a(ArrayList arraylist)
    {
        e = false;
        if (a != null)
        {
            a.a(arraylist);
        }
    }

    private void c()
    {
        e = false;
        if (a != null)
        {
            a.a();
        }
    }

    public IabHelper a()
    {
        return b;
    }

    public void a(n n1)
    {
label0:
        {
            if (!e)
            {
                e = true;
                a = n1;
                if (w.s(d))
                {
                    break label0;
                }
                c();
            }
            return;
        }
        if (b != null)
        {
            try
            {
                b.dispose();
            }
            // Misplaced declaration of an exception variable
            catch (n n1) { }
        }
        b = new IabHelper(d, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjMLLCo3hpiezV/bPOi83lz3DktmKGQpvsxjE10fF1h+L62vnazigqi+P6m4NFO+jOFT5RX0VPM9SzM6vCGOo9Xjjuk219queZr9SQUKoytfMTsgrtcI1YGDy9maP1owggij0hxWfaBsP4375zP+R89Pzz0R9Ap2tmLLlfIzRZPwqPcnONlQ/8ZqfdxWwCiOOOLHQJ4k1aN6jUPx8ipKWFxo7ORI0TmqgiJvhsFJuBr6QCqoN2BF6QgOfz6fMac1e+EaeJD3/pzUsuzzvvEnh70aoq+6mqZyZmyJb4840OddTGUHX8z3Qeoa/Dti+YQiXtSO3T2ANuF9pzkyBIAQQLwIDAQAB");
        b.enableDebugLogging(true);
        b.startSetup(this);
    }

    public boolean a(String s)
    {
        return c.contains(s);
    }

    public void b()
    {
        if (b != null)
        {
            try
            {
                b.dispose();
            }
            catch (Exception exception) { }
            b = null;
        }
    }

    public void onIabSetupFinished(IabResult iabresult)
    {
        if (!iabresult.isSuccess())
        {
            b.logDebug((new StringBuilder()).append("Problem setting up In-app Billing: ").append(iabresult).toString());
            c();
            return;
        } else
        {
            b.logDebug((new StringBuilder()).append("IAB is fully set up!: ").append(iabresult).toString());
            b.queryInventoryAsync(true, c, this);
            return;
        }
    }

    public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
    {
        if (iabresult.isFailure())
        {
            b.logDebug((new StringBuilder()).append("onQueryInventoryFinished-->result.isFailure\uFF1A").append(iabresult).toString());
            c();
            return;
        }
        iabresult = new ArrayList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (inventory.hasPurchase(s))
            {
                iabresult.add(s);
            }
        } while (true);
        a(iabresult);
    }
}
