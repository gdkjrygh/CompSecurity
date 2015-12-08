// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.comscore.applications.EventType;
import java.net.URLDecoder;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils:
//            CSLog

public class InstallReferrerReceiver extends BroadcastReceiver
{

    public static final String CS_NONE = "CS_NONE";
    public static final String CS_REFERRER_PREF_KEY = "CS_REFERRER_PREF_KEY";
    public static final String REFERRER_LABEL = "ns_ap_referrer";
    private static final String a = "InstallReferrerReceiver";

    public InstallReferrerReceiver()
    {
    }

    private void a(String s, Context context)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("CS_REFERRER_PREF_KEY", s);
        context.commit();
        CSLog.d("InstallReferrerReceiver", "Stored data");
    }

    public static HashMap retrieveReferrerLabels(Context context)
    {
        Object obj = PreferenceManager.getDefaultSharedPreferences(context);
        if (((SharedPreferences) (obj)).contains("CS_REFERRER_PREF_KEY"))
        {
            context = ((SharedPreferences) (obj)).edit();
            obj = ((SharedPreferences) (obj)).getString("CS_REFERRER_PREF_KEY", "CS_NONE");
            CSLog.d(comScore.getAppName().toString(), (new StringBuilder()).append("referrer was set as: '").append(((String) (obj))).append("'").toString());
            context.remove("CS_REFERRER_PREF_KEY");
            context.commit();
            if (obj != null && ((String) (obj)).length() > 0 && !((String) (obj)).equals("CS_NONE"))
            {
                return splitReferrer(((String) (obj)));
            }
        }
        return null;
    }

    public static HashMap splitReferrer(String s)
    {
        HashMap hashmap = new HashMap();
        if (s != null && s.length() > 0)
        {
            s = s.split("&");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = s[i];
                int k = s1.indexOf("=");
                if (k >= 0)
                {
                    hashmap.put(s1.substring(0, k), s1.substring(k + 1));
                } else
                {
                    hashmap.put("ns_ap_referrer", s1);
                }
                i++;
            }
            if (hashmap.size() > 0 && !hashmap.containsKey("ns_ap_referrer"))
            {
                hashmap.put("ns_ap_referrer", "1");
            }
        }
        return hashmap;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        String s1;
        String s2;
        CSLog.d("InstallReferrerReceiver", "onReceive()");
        s2 = "CS_NONE";
        s1 = s2;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s1 = s2;
        s = s2;
        if (!intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s = s2;
        intent = intent.getStringExtra("referrer");
        s1 = s2;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s = s2;
        s1 = URLDecoder.decode(intent, "UTF-8");
        s = s1;
        try
        {
            context.getSharedPreferences("referrer", 0).edit().putString("referrer", s1).commit();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            CSLog.e("InstallReferrerReceiver", (new StringBuilder()).append("onReceive()").append(intent.getMessage()).toString());
            s1 = s;
        }
label0:
        {
            CSLog.d("InstallReferrerReceiver", (new StringBuilder()).append("Received referrer: '").append(s1).append("'").toString());
            if (s1 != "CS_NONE")
            {
                intent = comScore.getCore();
                if (intent == null || intent.getAppContext() == null || intent.getColdStartCount() <= 0)
                {
                    break label0;
                }
                intent.notify(EventType.HIDDEN, splitReferrer(s1), true);
            }
            return;
        }
        a(s1, context);
        return;
    }
}
