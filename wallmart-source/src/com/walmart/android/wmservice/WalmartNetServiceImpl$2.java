// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.service.MockComponentResolver;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class this._cls0
    implements MockComponentResolver
{

    final WalmartNetServiceImpl this$0;

    public String getMethodFromUri(String s)
    {
        if (s.contains("mobile.walmart.com/android/config"))
        {
            return "config";
        } else
        {
            return null;
        }
    }

    public String getServiceFromUri(String s)
    {
        if (s.contains("mobile.walmart.com/android/config"))
        {
            return "app";
        } else
        {
            return null;
        }
    }

    ()
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
    }
}
