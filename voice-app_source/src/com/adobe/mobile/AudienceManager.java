// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            AudienceManagerWorker, StaticMethods

public final class AudienceManager
{
    public static interface AudienceManagerCallback
    {

        public abstract void call(Object obj);
    }


    public AudienceManager()
    {
    }

    public static String getDpid()
    {
        return AudienceManagerWorker.GetDpid();
    }

    public static String getDpuuid()
    {
        return AudienceManagerWorker.GetDpuuid();
    }

    public static HashMap getVisitorProfile()
    {
        return AudienceManagerWorker.GetVisitorProfile();
    }

    public static void reset()
    {
        AudienceManagerWorker.Reset();
    }

    public static void setDpidAndDpuuid(String s, String s1)
    {
        AudienceManagerWorker.SetDpidAndDpuuid(s, s1);
    }

    public static void signalWithData(Map map, AudienceManagerCallback audiencemanagercallback)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Audience Manager - Method signalWithData is not available for Wearable", new Object[0]);
            return;
        } else
        {
            AudienceManagerWorker.SubmitSignal(map, audiencemanagercallback);
            return;
        }
    }
}
