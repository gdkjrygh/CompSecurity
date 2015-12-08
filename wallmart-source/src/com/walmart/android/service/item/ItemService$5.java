// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.item:
//            ItemService, ReturnPolicyResponse

class this._cls0
    implements Transformer
{

    final ItemService this$0;

    public volatile Object transform(Object obj)
    {
        return transform((ReturnPolicyResponse)obj);
    }

    public String transform(ReturnPolicyResponse returnpolicyresponse)
    {
        return returnpolicyresponse.htmlString;
    }

    sponse()
    {
        this$0 = ItemService.this;
        super();
    }
}
