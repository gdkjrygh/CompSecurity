// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, WearableDataConnection, WearableDataRequest, WearableDataResponse, 
//            Config

final class WearableFunction
{

    private static boolean sendHitFlag = false;

    WearableFunction()
    {
    }

    protected static boolean isHandheldAppStarted()
    {
        boolean flag = false;
        long l;
        try
        {
            l = StaticMethods.getSharedPreferences().getLong("ADMS_Handheld_App_InstallDate", 0L);
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logWarningFormat("Wearable - Error getting install date of handheld app", new Object[0]);
            return false;
        }
        if (l != 0L)
        {
            flag = true;
        }
        return flag;
    }

    protected static byte[] retrieveData(String s, Map map, int i, String s1)
    {
        if (!StaticMethods.isWearableApp()) goto _L2; else goto _L1
_L1:
        map = null;
        s1 = StaticMethods.getSharedContext().getApplicationContext();
        map = s1;
_L4:
        s = (WearableDataResponse.GetResponse)(new WearableDataConnection(map)).send(WearableDataRequest.createGetRequest(s, i));
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return null;
        s1;
        StaticMethods.logErrorFormat("Analytics - Error registering network receiver (%s)", new Object[] {
            s1.getMessage()
        });
        if (true) goto _L4; else goto _L3
_L3:
        return s.getResult();
    }

    protected static boolean sendAnalyticsRequest(String s, String s1, Map map, int i)
    {
        if (!StaticMethods.isWearableApp()) goto _L2; else goto _L1
_L1:
        map = null;
        Context context = StaticMethods.getSharedContext().getApplicationContext();
        map = context;
_L4:
        s = (new WearableDataConnection(map)).send(WearableDataRequest.createPostRequest(s, s1, i));
        if (s == null || !s.isSuccess())
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return true;
        StaticMethods.NullContextException nullcontextexception;
        nullcontextexception;
        StaticMethods.logErrorFormat("Analytics - Error registering network receiver (%s)", new Object[] {
            nullcontextexception.getMessage()
        });
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    protected static void sendGenericRequest(String s, Map map, int i, String s1)
    {
        retrieveData(s, map, i, s1);
    }

    protected static boolean shouldSendHit()
    {
        if (sendHitFlag)
        {
            return true;
        }
        if (Config.getApplicationType() != Config.ApplicationType.APPLICATION_TYPE_WEARABLE)
        {
            sendHitFlag = true;
            return true;
        }
        if (isHandheldAppStarted())
        {
            sendHitFlag = true;
            return true;
        } else
        {
            StaticMethods.logWarningFormat("Analytics - Failed to send the Wearable request, containing app should get launched before Wearable app.", new Object[0]);
            return false;
        }
    }

}
