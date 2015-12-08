// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import java.util.Random;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker

public class AdMobInfo
{

    private static final AdMobInfo INSTANCE = new AdMobInfo();
    private int adHitId;
    private Random random;

    private AdMobInfo()
    {
        random = new Random();
    }

    public static AdMobInfo getInstance()
    {
        return INSTANCE;
    }

    public int generateAdHitId()
    {
        adHitId = random.nextInt();
        return adHitId;
    }

    public int getAdHitId()
    {
        return adHitId;
    }

    public String getJoinId()
    {
        if (adHitId != 0)
        {
            Object obj = GoogleAnalyticsTracker.getInstance();
            String s = ((GoogleAnalyticsTracker) (obj)).getVisitorIdForAds();
            obj = ((GoogleAnalyticsTracker) (obj)).getSessionIdForAds();
            if (s != null && obj != null)
            {
                return String.format("A,%s,%s,%d", new Object[] {
                    s, obj, Integer.valueOf(adHitId)
                });
            }
        }
        return null;
    }

    public void setAdHitId(int i)
    {
        adHitId = i;
    }

}
