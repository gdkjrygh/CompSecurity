// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.util.UAMathUtil;
import com.urbanairship.util.UAStringUtil;

public class PushMessage
{

    public static final String EXTRA_ACTIONS = "com.urbanairship.actions";
    public static final String EXTRA_ALERT = "com.urbanairship.push.ALERT";
    public static final String EXTRA_CATEGORY = "com.urbanairship.category";
    public static final String EXTRA_EXPIRATION = "com.urbanairship.push.EXPIRATION";
    public static final String EXTRA_INTERACTIVE_ACTIONS = "com.urbanairship.interactive_actions";
    public static final String EXTRA_INTERACTIVE_TYPE = "com.urbanairship.interactive_type";
    public static final String EXTRA_LOCAL_ONLY = "com.urbanairship.local_only";
    static final String EXTRA_PING = "com.urbanairship.push.PING";
    public static final String EXTRA_PRIORITY = "com.urbanairship.priority";
    public static final String EXTRA_PUBLIC_NOTIFICATION = "com.urbanairship.public_notification";
    public static final String EXTRA_PUSH_ID = "com.urbanairship.push.CANONICAL_PUSH_ID";
    public static final String EXTRA_SEND_ID = "com.urbanairship.push.PUSH_ID";
    public static final String EXTRA_STRING_EXTRA = "com.urbanairship.push.STRING_EXTRA";
    public static final String EXTRA_STYLE = "com.urbanairship.style";
    public static final String EXTRA_SUMMARY = "com.urbanairship.summary";
    public static final String EXTRA_TITLE = "com.urbanairship.title";
    public static final String EXTRA_VISIBILITY = "com.urbanairship.visibility";
    public static final String EXTRA_WEARABLE = "com.urbanairship.wearable";
    static final int MAX_PRIORITY = 2;
    static final int MAX_VISIBILITY = 1;
    static final int MIN_PRIORITY = -2;
    static final int MIN_VISIBILITY = -1;
    static final int VISIBILITY_PUBLIC = 1;
    private Bundle pushBundle;

    public PushMessage(Bundle bundle)
    {
        pushBundle = bundle;
    }

    public String getActionsPayload()
    {
        return pushBundle.getString("com.urbanairship.actions");
    }

    public String getAlert()
    {
        return pushBundle.getString("com.urbanairship.push.ALERT");
    }

    public String getCanonicalPushId()
    {
        return pushBundle.getString("com.urbanairship.push.CANONICAL_PUSH_ID");
    }

    public String getCategory()
    {
        return pushBundle.getString("com.urbanairship.category");
    }

    public String getInteractiveActionsPayload()
    {
        return pushBundle.getString("com.urbanairship.interactive_actions");
    }

    public String getInteractiveNotificationType()
    {
        return pushBundle.getString("com.urbanairship.interactive_type");
    }

    public int getPriority()
    {
        int i;
        try
        {
            i = UAMathUtil.constrain(Integer.parseInt(pushBundle.getString("com.urbanairship.priority")), -2, 2);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0;
        }
        return i;
    }

    public String getPublicNotificationPayload()
    {
        return pushBundle.getString("com.urbanairship.public_notification");
    }

    public Bundle getPushBundle()
    {
        return new Bundle(pushBundle);
    }

    public String getRichPushMessageId()
    {
        return pushBundle.getString("_uamid");
    }

    public String getSendId()
    {
        return pushBundle.getString("com.urbanairship.push.PUSH_ID");
    }

    public String getStylePayload()
    {
        return pushBundle.getString("com.urbanairship.style");
    }

    public String getSummary()
    {
        return pushBundle.getString("com.urbanairship.summary");
    }

    public String getTitle()
    {
        return pushBundle.getString("com.urbanairship.title");
    }

    public int getVisibility()
    {
        int i;
        try
        {
            i = UAMathUtil.constrain(Integer.parseInt(pushBundle.getString("com.urbanairship.visibility")), -1, 1);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 1;
        }
        return i;
    }

    public String getWearablePayload()
    {
        return pushBundle.getString("com.urbanairship.wearable");
    }

    boolean isExpired()
    {
        String s;
        s = pushBundle.getString("com.urbanairship.push.EXPIRATION");
        if (UAStringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Logger.debug((new StringBuilder()).append("Notification expiration time is \"").append(s).append("\"").toString());
        long l;
        long l1;
        l = Long.parseLong(s);
        l1 = System.currentTimeMillis();
        if (l * 1000L < l1)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_93;
        NumberFormatException numberformatexception;
        numberformatexception;
        Logger.debug((new StringBuilder()).append("Ignoring malformed expiration time: ").append(numberformatexception.getMessage()).toString());
        return false;
    }

    public boolean isLocalOnly()
    {
        return Boolean.parseBoolean(pushBundle.getString("com.urbanairship.local_only"));
    }

    boolean isPing()
    {
        return pushBundle.get("com.urbanairship.push.PING") != null;
    }

    public String toString()
    {
        return pushBundle.toString();
    }
}
