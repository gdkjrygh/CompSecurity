// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.util.UAStringUtil;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUserPreferences, RichPushManager, RichPushInbox

public class RichPushUser
{

    private static final String MODIFY_USER_URL = "api/user/%s/";
    private static final String NEW_USER_URL = "api/user/";
    private static final String PAYLOAD_PASSWORD_KEY = "password";
    private static final String PAYLOAD_USER_ID_KEY = "user_id";
    RichPushUserPreferences preferences;

    RichPushUser()
    {
        preferences = new RichPushUserPreferences(UAirship.shared().getApplicationContext());
    }

    public static boolean isCreated()
    {
        String s = RichPushManager.shared().getRichPushUser().getId();
        String s1 = RichPushManager.shared().getRichPushUser().getPassword();
        return !UAStringUtil.isEmpty(s) && !UAStringUtil.isEmpty(s1);
    }

    static String newUserUrl()
    {
        return (new StringBuilder()).append(UAirship.shared().getAirshipConfigOptions().hostURL).append("api/user/").toString();
    }

    static void updateUserAttributes(String s)
        throws JSONException
    {
        Object obj = new JSONObject(s);
        s = ((JSONObject) (obj)).optString("user_id");
        obj = ((JSONObject) (obj)).optString("password");
        if (!UAStringUtil.isEmpty(s) && !UAStringUtil.isEmpty(((String) (obj))))
        {
            Logger.info((new StringBuilder()).append("Updating user attributes for id: ").append(s).toString());
            RichPushManager.shared().getRichPushUser().preferences.setUserCredentials(s, ((String) (obj)));
            return;
        } else
        {
            Logger.error("Unable to update user. Missing user ID or user token.");
            return;
        }
    }

    public void addApid(String s)
    {
    }

    public HashSet getApids()
    {
        HashSet hashset = new HashSet();
        if (!UAStringUtil.isEmpty(PushManager.shared().getAPID()))
        {
            hashset.add(PushManager.shared().getAPID());
        }
        return hashset;
    }

    public String getId()
    {
        return preferences.getUserId();
    }

    public RichPushInbox getInbox()
    {
        this;
        JVM INSTR monitorenter ;
        RichPushInbox richpushinbox = RichPushInbox.shared();
        this;
        JVM INSTR monitorexit ;
        return richpushinbox;
        Exception exception;
        exception;
        throw exception;
    }

    String getLastMessageRefreshTime()
    {
        return preferences.getLastMessageRefreshTime();
    }

    long getLastUpdateTime()
    {
        return preferences.getLastUpdateTime();
    }

    public String getPassword()
    {
        return preferences.getUserToken();
    }

    public void setApids(HashSet hashset)
    {
    }

    void setLastMessageRefreshTime(String s)
    {
        preferences.setLastMessageRefreshTime(s);
    }

    void setLastUpdateTime(long l)
    {
        preferences.setLastUpdateTime(l);
    }

    String userUrl()
    {
        return String.format((new StringBuilder()).append(UAirship.shared().getAirshipConfigOptions().hostURL).append("api/user/%s/").toString(), new Object[] {
            getId()
        });
    }
}
