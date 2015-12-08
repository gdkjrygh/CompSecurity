// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.util.Comparator;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct, WishProductExtraImage

class this._cls0
    implements Comparator
{

    final WishProduct this$0;

    public int compare(WishProductExtraImage wishproductextraimage, WishProductExtraImage wishproductextraimage1)
    {
        return wishproductextraimage.getSequenceId() - wishproductextraimage1.getSequenceId();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WishProductExtraImage)obj, (WishProductExtraImage)obj1);
    }

    raImage()
    {
        this$0 = WishProduct.this;
        super();
    }
}
