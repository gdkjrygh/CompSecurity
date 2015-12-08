// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import com.gau.go.launcherex.gowidget.googleplay.IabException;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.Inventory;
import com.jiubang.core.c.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            p

class q extends a
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    protected volatile Object a(Object aobj[])
    {
        return a((IabHelper[])aobj);
    }

    protected transient ArrayList a(IabHelper aiabhelper[])
    {
        IabHelper iabhelper;
        Object obj;
        com.gau.go.launcherex.gowidget.weather.d.p.a(a).logDebug("IAB AsyncPurchaseTask!: ");
        iabhelper = aiabhelper[0];
        obj = new ArrayList();
        ((ArrayList) (obj)).add("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1");
        ((ArrayList) (obj)).add("go_weather_ex_premium_pack_promotions");
        ((ArrayList) (obj)).add("go_weather_ex_premium_pack_theme_vip");
        ((ArrayList) (obj)).add("go_weather_ex_premium_pack_theme_vip_promo");
        ((ArrayList) (obj)).add("go_weather_ex_premium_pack_vip");
        ((ArrayList) (obj)).add("go_weather_ex_premium_pack_vip_promo");
        aiabhelper = new ArrayList();
        if (!iabhelper.isDisposed())
        {
            Inventory inventory = iabhelper.queryInventory(true, ((java.util.List) (obj)));
            com.gau.go.launcherex.gowidget.weather.d.p.a(a).logDebug("QueryInventory finish");
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                com.gau.go.launcherex.gowidget.weather.d.p.a(a).logDebug((new StringBuilder()).append("itemSku : ").append(s).toString());
                if (inventory.getPurchase(s) != null)
                {
                    iabhelper.logDebug((new StringBuilder()).append(s).append(" is Pay").toString());
                    aiabhelper.add(s);
                }
            } while (true);
        } else
        {
            aiabhelper = null;
        }
        break MISSING_BLOCK_LABEL_243;
        aiabhelper;
        aiabhelper.printStackTrace();
        iabhelper.logDebug((new StringBuilder()).append("queryInventory\uFF1A").append(aiabhelper.getResult()).toString());
        return null;
        return aiabhelper;
        aiabhelper;
        aiabhelper.printStackTrace();
        iabhelper.logDebug("queryInventory\uFF1AIllegalStateException");
        return null;
    }

    protected volatile void a(Object obj)
    {
        a((ArrayList)obj);
    }

    protected void a(ArrayList arraylist)
    {
        super.a(arraylist);
        if (com.gau.go.launcherex.gowidget.weather.d.p.a(a) != null)
        {
            com.gau.go.launcherex.gowidget.weather.d.p.a(a).dispose();
            if (arraylist != null)
            {
                com.gau.go.launcherex.gowidget.weather.d.p.a(a, arraylist);
                p.b(a, arraylist);
                p.c(a, arraylist);
            }
        }
        com.gau.go.launcherex.gowidget.weather.d.p.a(a, false);
    }
}
