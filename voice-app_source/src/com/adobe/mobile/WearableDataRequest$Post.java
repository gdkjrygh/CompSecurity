// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.wearable.DataMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            WearableDataRequest, RequestHandler

static class body extends WearableDataRequest
{

    private static final Object _userAgentMutex = new Object();
    private static String userAgent = null;
    protected String body;
    protected String url;

    protected static String getDefaultAcceptLanguage(Context context)
    {
        if (context != null)
        {
            if ((context = context.getResources()) != null && (context = context.getConfiguration()) != null && (context = ((Configuration) (context)).locale) != null)
            {
                return context.toString().replace('_', '-');
            }
        }
        return null;
    }

    protected static String getDefaultUserAgent(Context context)
    {
        synchronized (_userAgentMutex)
        {
            if (userAgent == null)
            {
                userAgent = (new StringBuilder()).append("Mozilla/5.0 (Linux; U; Android ").append(android.os..Post.userAgent).append("; ").append(getDefaultAcceptLanguage(context)).append("; ").append(Build.MODEL).append(" Build/").append(Build.ID).append(")").toString();
            }
            context = userAgent;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    protected DataMap getDataMap()
    {
        DataMap datamap = new DataMap();
        datamap.putString("ID", uuid);
        datamap.putString("Type", "POST");
        datamap.putString("URL", url);
        datamap.putString("Body", body);
        return datamap;
    }

    protected String getURL()
    {
        return url;
    }

    protected DataMap handle(Context context)
    {
        DataMap datamap = new DataMap();
        HashMap hashmap = new HashMap();
        hashmap.put("Accept-Language", getDefaultAcceptLanguage(context));
        hashmap.put("User-Agent", getDefaultUserAgent(context));
        datamap.putBoolean("Result", RequestHandler.sendAnalyticsRequest(url, body, hashmap, timeOut));
        datamap.putString("ID", uuid);
        datamap.putString("Type", "POST");
        return datamap;
    }


    protected (DataMap datamap)
    {
        url = datamap.getString("URL");
        body = datamap.getString("Body");
        uuid = datamap.getString("ID");
    }

    protected tString(String s, String s1, int i)
    {
        super(i);
        url = s;
        body = s1;
    }
}
