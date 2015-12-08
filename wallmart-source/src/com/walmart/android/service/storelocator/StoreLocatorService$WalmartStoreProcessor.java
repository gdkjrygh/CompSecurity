// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storelocator;

import com.walmart.android.data.WalmartStore;
import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.storelocator:
//            StoreLocatorService

private static class <init>
    implements Transformer
{

    private void preProcess(WalmartStore awalmartstore[])
    {
        int j = awalmartstore.length;
        for (int i = 0; i < j; i++)
        {
            WalmartStore walmartstore = awalmartstore[i];
            String s = walmartstore.getDescription();
            if (s == null || s.trim().equals(""))
            {
                walmartstore.setDescription("Walmart");
            }
        }

    }

    public volatile Object transform(Object obj)
    {
        return transform((WalmartStore[])obj);
    }

    public WalmartStore[] transform(WalmartStore awalmartstore[])
    {
        preProcess(awalmartstore);
        return awalmartstore;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
