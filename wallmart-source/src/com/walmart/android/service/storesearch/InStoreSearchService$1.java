// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storesearch;

import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.storesearch:
//            InStoreSearchService

class this._cls0
    implements Transformer
{

    final InStoreSearchService this$0;

    public volatile Object transform(Object obj)
    {
        return transform((com.walmart.android.data.ult[])obj);
    }

    public com.walmartlabs.ereceipt.service.tem[] transform(com.walmart.android.data.ult ault[])
    {
        return InStoreSearchService.access$000(InStoreSearchService.this, ault);
    }

    ()
    {
        this$0 = InStoreSearchService.this;
        super();
    }
}
