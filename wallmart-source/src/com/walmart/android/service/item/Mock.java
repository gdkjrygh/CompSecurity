// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;

public class Mock
{

    public Mock()
    {
    }

    private static void registerBuyingOptionsMock(String s, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s1, new RequestMatch(s, "product/mobile/buyingOptions/[^/]+", "GET"), s2);
    }

    private static void registerItemMock(String s, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s1, new RequestMatch(s, "product/mobile/api/[^/]+", "GET"), s2);
    }

    public static void registerMocks(String s)
    {
        registerItemMock(s, "regular", "mock/item/pangaea/product/regular.resp");
        registerItemMock(s, "preorder", "mock/item/pangaea/product/preorder.resp");
        registerItemMock(s, "regular oos", "mock/item/pangaea/product/regular_oos.resp");
        registerItemMock(s, "variant", "mock/item/pangaea/product/variant.resp");
        registerItemMock(s, "ppu item", "mock/item/pangaea/product/regular_ppu.resp");
        registerItemMock(s, "variant ppu range", "mock/item/pangaea/product/variant_ppu_range.resp");
        registerItemMock(s, "variant ppu range diff mod", "mock/item/pangaea/product/variant_ppu_range_different_modifiers.resp");
        registerItemMock(s, "conf bundle w variant", "mock/item/pangaea/product/configurable_bundle_with_variant.resp");
        registerItemMock(s, "nonconf bundle", "mock/item/pangaea/product/nonconfigurable_bundle.resp");
        registerItemMock(s, "egiftcard", "mock/item/pangaea/product/electronic_giftcard.resp");
        registerItemMock(s, "variable phys giftcard", "mock/item/pangaea/product/variable_physical_giftcard.resp");
        registerItemMock(s, "phys giftcard", "mock/item/pangaea/product/physical_giftcard.resp");
        registerItemMock(s, "store only", "mock/item/pangaea/product/soi.resp");
        registerItemMock(s, "pure store only", "mock/item/pangaea/product/pure_soi.resp");
        registerItemMock(s, "mp - single (variant)", "mock/item/pangaea/product/single_mp_variant.resp");
        registerItemMock(s, "mp - single oos", "mock/item/pangaea/product/single_mp_oos.resp");
        registerItemMock(s, "mp - single+wm", "mock/item/pangaea/product/single_mp_plus_wm.resp");
        registerItemMock(s, "mp - multiple", "mock/item/pangaea/product/multiple_mp.resp");
        registerItemMock(s, "mp - multiple+wm", "mock/item/pangaea/product/multiple_mp_plus_wm.resp");
        registerBuyingOptionsMock(s, "variant price - ok", "mock/item/pangaea/buyingoptions/buyingoption_ok.resp");
        registerBuyingOptionsMock(s, "variant price - fail", "mock/item/pangaea/buyingoptions/buyingoption_fail.resp");
    }
}
