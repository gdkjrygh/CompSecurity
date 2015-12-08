// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            AudienceManagerWorker, StaticMethods

static final class tException
    implements Callable
{

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public HashMap call()
        throws Exception
    {
        if (!AudienceManagerWorker.access$000()) goto _L2; else goto _L1
_L1:
        String s = StaticMethods.getSharedPreferences().getString("AAMUserProfile", null);
        if (s == null) goto _L2; else goto _L3
_L3:
        int i = s.length();
        if (i <= 0) goto _L2; else goto _L4
_L4:
        AudienceManagerWorker.access$102(StaticMethods.mapFromJson(new JSONObject(s)));
_L5:
        AudienceManagerWorker.access$002(false);
_L2:
        return AudienceManagerWorker.access$100();
        Object obj;
        obj;
        StaticMethods.logWarningFormat("Audience Manager - Problem accessing profile data (%s)", new Object[] {
            ((JSONException) (obj)).getLocalizedMessage()
        });
          goto _L5
        obj;
        StaticMethods.logErrorFormat("Audience Manager - Problem accessing profile data (%s)", new Object[] {
            ((tException) (obj)).getMessage()
        });
          goto _L2
    }

    tException()
    {
    }
}
