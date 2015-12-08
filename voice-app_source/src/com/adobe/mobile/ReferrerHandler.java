// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, Lifecycle, AnalyticsWorker

final class ReferrerHandler
{

    static final String REFERRER_FIELDS[] = {
        "utm_source", "utm_medium", "utm_term", "utm_content", "utm_campaign", "trackingcode"
    };
    private static boolean _referrerProcessed = true;

    ReferrerHandler()
    {
    }

    protected static boolean getReferrerProcessed()
    {
        return _referrerProcessed;
    }

    public static void processIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        StaticMethods.logWarningFormat("Analytics - Unable to process referrer due to an invalid intent parameter", new Object[0]);
_L4:
        return;
_L2:
        if (!intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
        {
            StaticMethods.logDebugFormat("Analytics - Ignoring referrer due to the intent's action not being handled by analytics", new Object[0]);
            return;
        }
        Bundle bundle;
        try
        {
            bundle = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        bundle.containsKey(null);
        String s = intent.getStringExtra("referrer");
        StaticMethods.logDebugFormat("Analytics - Received referrer information(%s)", new Object[] {
            s
        });
        if (s == null || s.length() == 0)
        {
            StaticMethods.logDebugFormat("Analytics - Ignoring referrer due to the intent's referrer string being empty", new Object[0]);
            return;
        }
        intent = new HashMap();
        String as[] = s.split("&");
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length == 2)
            {
                intent.put(as1[0], as1[1]);
            }
        }

        if (!Lifecycle.lifecycleHasRun)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (!intent.containsKey("utm_source") || !intent.containsKey("utm_campaign")) goto _L4; else goto _L3
_L3:
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(intent) {

            final HashMap val$referrerFields;

            public void run()
            {
                Lifecycle.addReferralDataToSavedLifecycle(referrerFields);
            }

            
            {
                referrerFields = hashmap;
                super();
            }
        });
        AnalyticsWorker.sharedInstance().kickWithReferrerData(intent);
        return;
        android.content.SharedPreferences.Editor editor;
        String as2[];
        int l;
        editor = StaticMethods.getSharedPreferencesEditor();
        as2 = REFERRER_FIELDS;
        l = as2.length;
        int j = 0;
_L6:
        String s1;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        s1 = as2[j];
        if (intent.containsKey(s1) && intent.get(s1) != null)
        {
            editor.putString(s1, intent.get(s1).toString());
        }
        break MISSING_BLOCK_LABEL_301;
        try
        {
            editor.commit();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            StaticMethods.logErrorFormat("Analytics - Error persisting referrer data (%s)", new Object[] {
                intent.getMessage()
            });
        }
        _referrerProcessed = true;
        return;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static void setReferrerProcessed(boolean flag)
    {
        _referrerProcessed = flag;
    }

}
