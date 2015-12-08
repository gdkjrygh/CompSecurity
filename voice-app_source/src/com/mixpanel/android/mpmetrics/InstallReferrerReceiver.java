// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            PersistentIdentity

public class InstallReferrerReceiver extends BroadcastReceiver
{

    private static final String LOGTAG = "MixpanelAPI.InstRfrRcvr";
    private final Pattern UTM_CAMPAIGN_PATTERN = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");
    private final Pattern UTM_CONTENT_PATTERN = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
    private final Pattern UTM_MEDIUM_PATTERN = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");
    private final Pattern UTM_SOURCE_PATTERN = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");
    private final Pattern UTM_TERM_PATTERN = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    public InstallReferrerReceiver()
    {
    }

    private String find(Matcher matcher)
    {
        if (!matcher.find())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        matcher = matcher.group(2);
        if (matcher == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        matcher = URLDecoder.decode(matcher, "UTF-8");
        return matcher;
        matcher;
        Log.e("MixpanelAPI.InstRfrRcvr", "Could not decode a parameter into UTF-8");
        return null;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getExtras();
        String s;
        if (intent != null)
        {
            if ((s = intent.getString("referrer")) != null)
            {
                intent = new HashMap();
                intent.put("referrer", s);
                String s1 = find(UTM_SOURCE_PATTERN.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_source", s1);
                }
                s1 = find(UTM_MEDIUM_PATTERN.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_medium", s1);
                }
                s1 = find(UTM_CAMPAIGN_PATTERN.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_campaign", s1);
                }
                s1 = find(UTM_CONTENT_PATTERN.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_content", s1);
                }
                s = find(UTM_TERM_PATTERN.matcher(s));
                if (s != null)
                {
                    intent.put("utm_term", s);
                }
                PersistentIdentity.writeReferrerPrefs(context, "com.mixpanel.android.mpmetrics.ReferralInfo", intent);
                return;
            }
        }
    }
}
