// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import android.content.Context;
import com.comscore.applications.EventType;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//            comScore, Core

public class Census
{

    private static Census a = null;
    private static Object c = new Object();
    private String b;

    private Census()
    {
    }

    public static Census getInstance()
    {
        if (a == null)
        {
            synchronized (c)
            {
                if (a == null)
                {
                    a = new Census();
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void notifyStart(Context context, String s, String s1)
    {
        Core core = comScore.getCore();
        core.setAppContext(context);
        if (s != null && s.length() > 0)
        {
            b = s;
        }
        if (s1 != null && s1.length() > 0)
        {
            core.setPublisherSecret(s1, true);
        }
        s = new HashMap();
        s.put("c2", b);
        s.put("name", "start");
        if (core.isSecure())
        {
            context = "https://sb.scorecardresearch.com/p2?";
        } else
        {
            context = "http://b.scorecardresearch.com/p2?";
        }
        core.setPixelURL(context, false);
        core.notify(EventType.START, s, true);
    }

}
