// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.analytic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.gau.go.a.f.d;
import com.gau.go.a.f.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.google.analytics.tracking.android.AnalyticsReceiver;
import com.jiubang.commerce.utils.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.jiubang.ggheart.analytic:
//            c, b

public class ReferrerInfoReceiver extends BroadcastReceiver
{

    public ReferrerInfoReceiver()
    {
    }

    private String a(Context context, String s)
    {
        StringBuilder stringbuilder = new StringBuilder(20);
        stringbuilder.append("45").append("||");
        stringbuilder.append(d.f(context)).append("||");
        stringbuilder.append(e.a(System.currentTimeMillis())).append("||");
        stringbuilder.append("441").append("||");
        stringbuilder.append(s).append("||");
        stringbuilder.append("k001").append("||");
        stringbuilder.append("1").append("||");
        stringbuilder.append(d.b(context)).append("||");
        stringbuilder.append(w.f(context)).append("||");
        stringbuilder.append(w.e(context)).append("||");
        stringbuilder.append(b.b(context, "com.gau.go.launcherex.gowidget.weatherwidget")).append("||");
        stringbuilder.append("").append("||");
        stringbuilder.append("").append("||");
        stringbuilder.append("").append("||");
        stringbuilder.append(w.d(context)).append("||");
        stringbuilder.append(com.gau.go.a.e.b(context)).append("||");
        stringbuilder.append("").append("||");
        stringbuilder.append("").append("||");
        stringbuilder.append(w.w(context));
        return stringbuilder.toString();
    }

    static String a(ReferrerInfoReceiver referrerinforeceiver, Context context, String s)
    {
        return referrerinforeceiver.a(context, s);
    }

    private String a(String s)
    {
        Object obj = s;
        if (s != null)
        {
            String as[] = s.split("&");
            obj = s;
            if (as != null)
            {
                obj = s;
                if (as.length >= 2)
                {
                    obj = new HashMap();
                    int j = as.length;
                    for (int i = 0; i < j; i++)
                    {
                        String as1[] = as[i].split("=");
                        if (as1 != null && as1.length >= 2)
                        {
                            ((HashMap) (obj)).put(as1[0], as1[1]);
                        }
                    }

                    Iterator iterator = ((HashMap) (obj)).keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        String s1 = (String)iterator.next();
                        if (s1.contains("gokey_"))
                        {
                            s = a(s, (new StringBuilder()).append(s1).append("=").append((String)((HashMap) (obj)).get(s1)).toString(), "&");
                        }
                    } while (true);
                    obj = s;
                }
            }
        }
        return ((String) (obj));
    }

    private String a(String s, String s1, String s2)
    {
        String s3;
        if (s == null || s1 == null || s2 == null)
        {
            s3 = "";
        } else
        {
            int i = s.indexOf(s1);
            s3 = s;
            if (i != -1)
            {
                if (i != 0)
                {
                    s1 = (new StringBuilder()).append(s2).append(s1).toString();
                    i = s.indexOf(s1);
                    s3 = s;
                    if (i != -1)
                    {
                        return (new StringBuilder()).append(s.substring(0, i)).append(s.substring(s1.length() + i)).toString();
                    }
                } else
                {
                    return (new StringBuilder()).append(s.substring(0, i)).append(s.substring(i + s1.length() + s2.length())).toString();
                }
            }
        }
        return s3;
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        if (intent == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj = intent.getStringExtra("referrer");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        (new c(this, "ga_thread", context, ((String) (obj)))).start();
        String s = a(((String) (obj)));
        intent.putExtra("referrer", s);
        Log.e("ReferrerInfoReceiver", (new StringBuilder()).append("filterGa:").append(s).toString());
        Log.i("ReferrerInfoReceiver", (new StringBuilder()).append("Referrer Info: ").append(((String) (obj))).toString());
        b.c(context);
        obj = new AnalyticsReceiver();
        Log.i("ReferrerInfoReceiver", "Pass intent to AnalyticsReceiver");
        ((AnalyticsReceiver) (obj)).onReceive(context, intent);
        return;
        context;
        Log.e("ReferrerInfoReceiver", "AnalyticsReceiver Error", context);
        return;
        context = (new StringBuilder()).append("Invalid intent: ");
        if (intent != null)
        {
            intent = intent.getAction();
        }
        Log.i("ReferrerInfoReceiver", context.append(intent).toString());
        return;
    }
}
