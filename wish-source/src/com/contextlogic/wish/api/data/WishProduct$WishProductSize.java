// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.Serializable;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct

private class orderingValue
    implements Serializable
{

    private static final long serialVersionUID = 0x62aa7c1f435e261bL;
    public String ordering;
    public Double orderingValue;
    public String size;
    final WishProduct this$0;

    public (String s, String s1)
    {
        this$0 = WishProduct.this;
        super();
        size = s;
        ordering = s1;
        try
        {
            orderingValue = Double.valueOf(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WishProduct wishproduct)
        {
            return;
        }
    }
}
