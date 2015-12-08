// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;

public class Mock
{

    public Mock()
    {
    }

    private static void registerItemMock(String s, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s1, new RequestMatch(s, "cart/items", "POST"), s2);
    }

    public static void registerMocks(String s)
    {
        registerItemMock(s, "add to cart - success", "mock/cart/add_to_cart_success.resp");
    }
}
