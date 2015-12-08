// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.content.SharedPreferences;
import com.devicecollector.DataCollection;
import java.util.UUID;

// Referenced classes of package com.devicecollector.collectors:
//            AbstractAsyncCollectorTask, CollectorEnum, CollectorStatusListener

public class UserCookieCollectorTask extends AbstractAsyncCollectorTask
{

    private static String COOKIE_ID = "kaptcha_id";

    public UserCookieCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, long l)
    {
        super(activity, collectorstatuslistener, datacollection, CollectorEnum.USER_COOKIE, l);
    }

    private String getUserCookieFromPreferences(String s)
    {
        debug("getting the cookie[%s] from the cloud user preferences:", new Object[] {
            s
        });
        String s1 = activity.getSharedPreferences("dc_prefs", 0).getString(COOKIE_ID, null);
        debug("Found this [%s]:[%s] in user preferences", new Object[] {
            s, s1
        });
        return s1;
    }

    private void setUserCookieInPreferences(String s, String s1)
    {
        debug("Setting this [%s]:[%s] in user preferences", new Object[] {
            s, s1
        });
        android.content.SharedPreferences.Editor editor = activity.getSharedPreferences("dc_prefs", 0).edit();
        editor.putString(s, s1);
        editor.commit();
        debug("user preference setting complete.", new Object[0]);
    }

    public void collectUserCookie()
    {
        String s1 = getUserCookieFromPreferences(COOKIE_ID);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString().replace("-", "");
            setUserCookieInPreferences(COOKIE_ID, s);
        }
        dc.addMobileData(com.devicecollector.DataCollection.PostElement.USER_COOKIE, s);
    }

    protected void run()
    {
        collectUserCookie();
    }

}
