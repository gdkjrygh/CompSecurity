// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.net.Uri;
import com.walmart.android.service.MockComponentResolver;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptServiceImpl

class this._cls0
    implements MockComponentResolver
{

    private final Pattern mPattern;
    final EReceiptServiceImpl this$0;

    public String getMethodFromUri(String s)
    {
        s = mPattern.matcher(s);
        if (s.matches() && s.groupCount() > 1)
        {
            return s.group(2).replaceAll(Uri.encode("/"), "-").replaceAll("/", "-");
        } else
        {
            return null;
        }
    }

    public String getServiceFromUri(String s)
    {
        s = mPattern.matcher(s);
        if (s.matches() && s.groupCount() > 0)
        {
            return s.group(1).replaceAll(Uri.encode("/"), "-").replaceAll("/", "-");
        } else
        {
            return null;
        }
    }

    ()
    {
        this$0 = EReceiptServiceImpl.this;
        super();
        mPattern = Pattern.compile((new StringBuilder()).append("^").append(EReceiptServiceImpl.access$000(EReceiptServiceImpl.this)).append("/api").append("/(.*?)/([^\\?]*).*$").toString());
    }
}
