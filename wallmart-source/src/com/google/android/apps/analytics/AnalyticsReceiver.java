// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.analytics:
//            PersistentEventStore

public class AnalyticsReceiver extends BroadcastReceiver
{

    private static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";

    public AnalyticsReceiver()
    {
    }

    static String formatReferrer(String s)
    {
        Object obj = s.split("&");
        s = new HashMap();
        int j = obj.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                String as[];
                if (i < j)
                {
                    as = obj[i].split("=");
                    if (as.length == 2)
                    {
                        break label1;
                    }
                }
                boolean flag1;
                if (s.get("utm_campaign") != null)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (s.get("utm_medium") != null)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (s.get("utm_source") != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (i == 0 || !j || !flag1)
                {
                    Log.w("GoogleAnalyticsTracker", "Badly formatted referrer missing campaign, name or source");
                    return null;
                }
                break label0;
            }
            s.put(as[0], as[1]);
            i++;
        } while (true);
        obj = new String[7][];
        obj[0] = (new String[] {
            "utmcid", (String)s.get("utm_id")
        });
        obj[1] = (new String[] {
            "utmcsr", (String)s.get("utm_source")
        });
        obj[2] = (new String[] {
            "utmgclid", (String)s.get("gclid")
        });
        obj[3] = (new String[] {
            "utmccn", (String)s.get("utm_campaign")
        });
        obj[4] = (new String[] {
            "utmcmd", (String)s.get("utm_medium")
        });
        obj[5] = (new String[] {
            "utmctr", (String)s.get("utm_term")
        });
        obj[6] = (new String[] {
            "utmcct", (String)s.get("utm_content")
        });
        s = new StringBuilder();
        j = 0;
        boolean flag = true;
        while (j < obj.length) 
        {
            boolean flag2 = flag;
            if (obj[j][1] != null)
            {
                String s1 = obj[j][1].replace("+", "%20").replace(" ", "%20");
                if (flag)
                {
                    flag = false;
                } else
                {
                    s.append("|");
                }
                s.append(obj[j][0]).append("=").append(s1);
                flag2 = flag;
            }
            j++;
            flag = flag2;
        }
        return s.toString();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || s == null)
        {
            return;
        }
        intent = formatReferrer(s);
        if (intent != null)
        {
            (new PersistentEventStore(new PersistentEventStore.DataBaseHelper(context))).setReferrer(intent);
            Log.d("GoogleAnalyticsTracker", (new StringBuilder()).append("Stored referrer:").append(intent).toString());
            return;
        } else
        {
            Log.w("GoogleAnalyticsTracker", "Badly formatted referrer, ignored");
            return;
        }
    }
}
