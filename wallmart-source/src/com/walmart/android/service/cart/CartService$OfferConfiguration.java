// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;


// Referenced classes of package com.walmart.android.service.cart:
//            CartService, ListInfo

public static class listInfo
{

    public final ListInfo listInfo;
    public final String offerId;
    public final int quantity;

    public (String s, int i)
    {
        this(s, i, null);
    }

    public <init>(String s, int i, ListInfo listinfo)
    {
        offerId = s;
        quantity = i;
        listInfo = listinfo;
    }
}
