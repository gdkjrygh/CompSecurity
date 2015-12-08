// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmart.android.service.MockComponentResolver;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverServiceImpl

class this._cls0
    implements MockComponentResolver
{

    final SaverServiceImpl this$0;

    public String getMethodFromUri(String s)
    {
        int k = s.lastIndexOf("/");
        if (k != -1)
        {
            int j = s.indexOf("?", k);
            int i = j;
            if (j == -1)
            {
                i = s.length();
            }
            return s.substring(k + 1, i);
        } else
        {
            return null;
        }
    }

    public String getServiceFromUri(String s)
    {
        return "saver";
    }

    ()
    {
        this$0 = SaverServiceImpl.this;
        super();
    }
}
