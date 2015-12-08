// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmart.android.service.wishlist.models.ReceiptModel;
import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListService, ReceiptResponse

class this._cls0
    implements Transformer
{

    final WishListService this$0;

    public ReceiptModel transform(ReceiptResponse receiptresponse)
    {
        return ReceiptModel.from(receiptresponse);
    }

    public volatile Object transform(Object obj)
    {
        return transform((ReceiptResponse)obj);
    }

    l()
    {
        this$0 = WishListService.this;
        super();
    }
}
