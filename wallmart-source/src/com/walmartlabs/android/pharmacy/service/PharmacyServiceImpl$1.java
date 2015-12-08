// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import android.net.Uri;
import com.walmart.android.service.MockComponentResolver;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmartlabs.android.pharmacy.service:
//            PharmacyServiceImpl

class this._cls0
    implements MockComponentResolver
{

    private final Pattern mPattern;
    final PharmacyServiceImpl this$0;

    public String getMethodFromUri(String s)
    {
        s = mPattern.matcher(s);
        if (s.matches() && s.groupCount() > 1)
        {
            return s.group(2);
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
        this$0 = PharmacyServiceImpl.this;
        super();
        mPattern = Pattern.compile((new StringBuilder()).append("^").append(PharmacyServiceImpl.access$000(PharmacyServiceImpl.this)).append("(.*)/([^/\\?]*).*$").toString());
    }
}
