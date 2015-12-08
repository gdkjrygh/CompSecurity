// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.kahuna.sdk.IKahuna;
import com.kahuna.sdk.Kahuna;
import java.util.Map;

// Referenced classes of package com.weather.commons.analytics:
//            KahunaEvents

static class 
{

    public void setUserAttributes(Map map)
    {
        Kahuna.getInstance().setUserAttributes(map);
    }

    public void trackEvent(String s)
    {
        Kahuna.getInstance().trackEvent(s);
    }

    ()
    {
    }
}
