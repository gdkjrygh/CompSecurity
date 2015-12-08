// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.utils.StringHasher;
import com.walmart.android.utils.UrlUtils;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class this._cls0
    implements com.walmart.android.service.eFilePrefixGenerator
{

    private final StringHasher mHasher = new StringHasher("SHA-256");
    final WalmartNetServiceImpl this$0;

    public String getCacheFileNamePrefix(HttpUriRequest httpurirequest)
    {
        return mHasher.createHashedString(UrlUtils.getRequestString(httpurirequest));
    }

    ilePrefixGenerator()
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
    }
}
