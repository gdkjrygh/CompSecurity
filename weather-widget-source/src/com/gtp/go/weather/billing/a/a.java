// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.googleplay.Inventory;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.billing.a:
//            b

public class a
    implements com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabSetupFinishedListener, com.gau.go.launcherex.gowidget.googleplay.IabHelper.QueryInventoryFinishedListener
{

    private Context a;
    private IabHelper b;
    private ArrayList c;
    private HashMap d;
    private final List e = new ArrayList();
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private b j;

    public a()
    {
        f = false;
        g = false;
        h = false;
    }

    private void a(String s, boolean flag)
    {
        if (j != null)
        {
            j.a(s, flag);
        }
    }

    private float b()
    {
        float f2;
        if (c != null)
        {
            Iterator iterator = c.iterator();
            float f1 = -1F;
            do
            {
                f2 = f1;
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (Float)d.get(obj);
                if (((Float) (obj)).floatValue() > f1)
                {
                    f1 = ((Float) (obj)).floatValue();
                }
            } while (true);
        } else
        {
            f2 = -1F;
        }
        return f2;
    }

    private Context c()
    {
        return a.getApplicationContext();
    }

    private void d()
    {
        while (h || g) 
        {
            return;
        }
        b.startSetup(this);
        g = true;
    }

    private void e()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
        intent.putExtra("extra_purchase_theme_package_name", i);
        a.sendBroadcast(intent);
    }

    public void a()
    {
        if (h)
        {
            if (f)
            {
                return;
            } else
            {
                f = true;
                b.queryInventoryAsync(true, c, this);
                return;
            }
        } else
        {
            d();
            return;
        }
    }

    public void a(Activity activity)
    {
    }

    public void a(Activity activity, Bundle bundle)
    {
        a = activity;
    }

    public void a(b b1)
    {
        j = b1;
    }

    public void a(String s, Intent intent)
    {
        i = s;
        c = new ArrayList();
        d = new HashMap();
        s = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(c(), i, "inapp_price_key");
        int ai[] = com.gau.go.launcherex.gowidget.weather.globaltheme.a.e(c(), i, "inapp_price_value");
        if (s != null && ai != null && s.length == ai.length)
        {
            for (int k = 0; k < ai.length; k++)
            {
                if (!TextUtils.isEmpty(s[k]) && ai[k] > 0)
                {
                    c.add(s[k]);
                    float f1 = Float.valueOf(ai[k]).floatValue() / 100F;
                    com.gtp.a.a.b.c.a("ThemeIAPPurchaseHelper", (new StringBuilder()).append("priceKeys[i] ").append(s[k]).append(" | priceValue = ").append(f1).toString());
                    d.put(s[k], Float.valueOf(f1));
                }
            }

        }
        if (intent != null)
        {
            s = intent.getStringArrayListExtra("extra_coupon_ids_arraylist");
            if (s != null)
            {
                float f2 = b();
                s = s.iterator();
                do
                {
                    if (!s.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)s.next();
                    int l = intent.getIntExtra(s1, -1);
                    if (l != -1)
                    {
                        com.gau.go.launcherex.gowidget.weather.globaltheme.b.a a1 = new com.gau.go.launcherex.gowidget.weather.globaltheme.b.a();
                        a1.a(s1);
                        a1.a(l);
                        if ((float)l < f2)
                        {
                            e.add(a1);
                        }
                    }
                } while (true);
            }
        }
        b = new IabHelper(a, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjMLLCo3hpiezV/bPOi83lz3DktmKGQpvsxjE10fF1h+L62vnazigqi+P6m4NFO+jOFT5RX0VPM9SzM6vCGOo9Xjjuk219queZr9SQUKoytfMTsgrtcI1YGDy9maP1owggij0hxWfaBsP4375zP+R89Pzz0R9Ap2tmLLlfIzRZPwqPcnONlQ/8ZqfdxWwCiOOOLHQJ4k1aN6jUPx8ipKWFxo7ORI0TmqgiJvhsFJuBr6QCqoN2BF6QgOfz6fMac1e+EaeJD3/pzUsuzzvvEnh70aoq+6mqZyZmyJb4840OddTGUHX8z3Qeoa/Dti+YQiXtSO3T2ANuF9pzkyBIAQQLwIDAQAB");
        b.enableDebugLogging(com.gtp.a.a.b.c.a());
    }

    public void b(Activity activity)
    {
    }

    public void c(Activity activity)
    {
    }

    public void d(Activity activity)
    {
        if (b != null && h)
        {
            b.dispose();
            h = false;
            b = null;
        }
    }

    public void onIabSetupFinished(IabResult iabresult)
    {
        if (!iabresult.isSuccess())
        {
            com.gtp.a.a.b.c.a("ThemeIAPPurchaseHelper", (new StringBuilder()).append("Problem setting up In-app Billing: ").append(iabresult).toString());
            if (iabresult.getResponse() == 3)
            {
                a(i, false);
            }
        } else
        {
            com.gtp.a.a.b.c.a("ThemeIAPPurchaseHelper", (new StringBuilder()).append("IAB is fully set up!: ").append(iabresult).toString());
            h = true;
            a();
        }
        g = false;
    }

    public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
    {
        if (!iabresult.isFailure()) goto _L2; else goto _L1
_L1:
        com.gtp.a.a.b.c.a("ThemeIAPPurchaseHelper", (new StringBuilder()).append("onQueryInventoryFinished-->result.isFailure: ").append(iabresult.getMessage()).toString());
        if (iabresult.getResponse() == 4)
        {
            a(i, false);
        }
_L4:
        f = false;
        return;
_L2:
        iabresult = c.iterator();
        boolean flag = false;
        do
        {
            if (!iabresult.hasNext())
            {
                break;
            }
            boolean flag1 = inventory.hasPurchase((String)iabresult.next());
            flag = flag1;
            if (!flag1)
            {
                continue;
            }
            flag = flag1;
            break;
        } while (true);
        com.gtp.a.a.b.c.a("ThemeIAPPurchaseHelper", (new StringBuilder()).append("onQueryInventoryFinished-->result isPremium\uFF1A").append(flag).toString());
        if (flag)
        {
            a(i, true);
            com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(i, true, c());
            e();
        } else
        {
            a(i, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
