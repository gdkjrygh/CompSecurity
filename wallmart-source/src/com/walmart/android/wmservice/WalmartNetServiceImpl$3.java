// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.service.MockComponentResolver;
import com.walmartlabs.utils.WLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class etFastPickupBaseUrl
    implements MockComponentResolver
{

    private final Pattern mPattern;
    final WalmartNetServiceImpl this$0;

    public String getMethodFromUri(String s)
    {
        Matcher matcher = mPattern.matcher(s);
        Object obj = null;
        s = obj;
        if (matcher.matches())
        {
            s = obj;
            if (matcher.groupCount() > 0)
            {
                for (int i = 0; i <= matcher.groupCount(); i++)
                {
                    WLog.d(WalmartNetServiceImpl.access$200(), (new StringBuilder()).append("getMethodFromUri group(").append(i).append(")=").append(matcher.group(i)).toString());
                }

                if (matcher.group(1).equals("orders"))
                {
                    s = matcher.group(1);
                } else
                {
                    s = obj;
                    if (matcher.group(1).equals("user/status"))
                    {
                        return "user";
                    }
                }
            }
        }
        return s;
    }

    public String getServiceFromUri(String s)
    {
        Matcher matcher = mPattern.matcher(s);
        Object obj = null;
        s = obj;
        if (matcher.matches())
        {
            s = obj;
            if (matcher.groupCount() > 0)
            {
                s = "FastPickup";
            }
        }
        return s;
    }

    ()
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
        mPattern = Pattern.compile((new StringBuilder()).append("^").append(WalmartNetServiceImpl.access$100(WalmartNetServiceImpl.this).getFastPickupBaseUrl()).append("/(.*?)$").toString());
    }
}
