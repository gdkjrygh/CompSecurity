// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;

public class Mock
{

    public Mock()
    {
    }

    public static void registerMocks(String s)
    {
        registerWishListMock(s, "wishlist get error", "mock/wishlist/get_list_error.resp");
    }

    private static void registerWishListMock(String s, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s1, new RequestMatch(s, "api/lists", "GET"), s2);
    }
}
