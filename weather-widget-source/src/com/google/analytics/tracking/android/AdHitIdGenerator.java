// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            AdMobInfo

class AdHitIdGenerator
{

    private boolean adMobSdkInstalled;

    AdHitIdGenerator()
    {
        boolean flag;
        if (Class.forName("com.google.ads.AdRequest") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            adMobSdkInstalled = flag;
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            adMobSdkInstalled = false;
        }
        return;
    }

    AdHitIdGenerator(boolean flag)
    {
        adMobSdkInstalled = flag;
    }

    int getAdHitId()
    {
        if (!adMobSdkInstalled)
        {
            return 0;
        } else
        {
            return AdMobInfo.getInstance().generateAdHitId();
        }
    }
}
